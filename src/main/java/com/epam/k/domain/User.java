package com.epam.k.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

@JsonIgnoreProperties({"passwordHash"})
public class User extends Document implements UserDetails {

    private static final Logger logger = LoggerFactory.getLogger(User.class);

    @Override
    @SuppressWarnings("unchecked")
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return fillRoles(get("authorities", Collection.class), getUsername());
    }

    @Override
    public String getPassword() {
        return getString("passwordHash");
    }

    @Override
    public String getUsername() {
        return getString("username");
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    private static Set<Role> fillRoles(Collection<Object> authorities, String username) {
        EnumSet<Role> roles = EnumSet.noneOf(Role.class);
        if (authorities != null) {
            authorities.forEach(role -> {
                if (role instanceof String)
                    roles.add(Role.valueOf(role.toString()));
                else if (role instanceof Role)
                    roles.add((Role) role);
            });
        }

        if (roles.isEmpty()) {
            logger.error("No authorities for {}", username);
        }

        return roles;
    }
}