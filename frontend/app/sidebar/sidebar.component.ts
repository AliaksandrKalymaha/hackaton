import { Component } from '@angular/core';

declare var UUI: any;
//declare var $:any;

@Component({
    selector: 'sidebar',
    templateUrl: 'app/sidebar/sidebar.template.html'
    
})

export class SidebarComponent {

    constructor() {
        
     }

    doSomthing(value: any) {
        
    }

    ngAfterViewInit() {
        UUI.Sidebar.init({open: true, animate: true});
    }
}