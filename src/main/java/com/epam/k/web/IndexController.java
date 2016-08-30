package com.epam.k.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    public String view() {
        return "Hello world!!!";
    }
}