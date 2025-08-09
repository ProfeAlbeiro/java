package controllers;

import models.Rol;
import java.util.ArrayList;
import views.RolesView;

public class RolController {
    private RolesView rolesView;
    private ArrayList<Rol> roles = new ArrayList<>();
    // Mostrar el Menú de Roles
    public RolController(){
        rolesView = new RolesView();
        rolesView.menuRoles();
    }
    // Registrar Rol
    public void addRol(Rol rol){
        roles.add(rol);
    }
    
}
