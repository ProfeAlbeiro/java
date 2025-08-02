package controllers;

import views.RolesView;

public class RolController {
    private RolesView rolesView;
    public RolController(){
        rolesView = new RolesView();
        rolesView.menuRoles();
    }
}
