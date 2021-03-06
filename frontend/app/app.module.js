"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var platform_browser_1 = require('@angular/platform-browser');
var forms_1 = require('@angular/forms');
var http_1 = require('@angular/http');
var app_component_1 = require('./app.component');
var sidebar_component_1 = require('./sidebar/sidebar.component');
var header_component_1 = require('./header/header.component');
var profile_component_1 = require('./profile/profile.component');
var oauth_service_1 = require("angular2-oauth2/oauth-service");
var vacation_cart_component_1 = require("./feed/vacation/vacation-cart.component");
var window_service_1 = require("./registration/window.service");
var main_footer_component_1 = require("./footer/main-footer.component");
var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        core_1.NgModule({
            imports: [
                platform_browser_1.BrowserModule,
                forms_1.FormsModule,
                http_1.HttpModule,
                app_component_1.routing
            ],
            declarations: [app_component_1.AppComponent, vacation_cart_component_1.VacationCartComponent, sidebar_component_1.SidebarComponent, header_component_1.HeaderComponent, profile_component_1.ProfileComponent, main_footer_component_1.FooterComponent],
            bootstrap: [app_component_1.AppComponent],
            providers: [oauth_service_1.OAuthService, window_service_1.WindowService, app_component_1.appRoutingProviders]
        }), 
        __metadata('design:paramtypes', [])
    ], AppModule);
    return AppModule;
}());
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map