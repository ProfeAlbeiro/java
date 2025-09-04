package controllers;

import views.modules.roles.RolesView;

public class RolesController {
    
    private RolesView rolesView;

    public void rolesMenu() {
        
        rolesView = new RolesView();
        rolesView.rolesMenuView();
        
    }
    
}