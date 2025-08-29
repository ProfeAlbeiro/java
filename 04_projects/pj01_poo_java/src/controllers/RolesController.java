package controllers;

import models.RolModel;
import views.modules.roles.RolesMenuView;
import java.util.ArrayList;

public class RolesController {
    
    private RolesMenuView rolesMenuView;
    private ArrayList<RolModel> roles = new ArrayList<>();
    
    public RolesController() {
    }
    
    public void rolesMenu() {        
        rolesMenuView = new RolesMenuView();        
    }
    
    public void addRol(RolModel rol){
        roles.add(rol);
    }    
    
    public ArrayList<RolModel> getRoles(){
        return roles;
    }
    
    public RolModel searchRolById(int id){
        for (RolModel rol : roles) {
            if (rol.getRolId() == id) {
                return rol;
            }
        }
        return null;
    }    
    
    public boolean updateRol(int id, String newName){
        RolModel rol = searchRolById(id);
        if (rol != null) {
            rol.setRolName(newName);
            return true;
        }
        return false;
    }
    
    public boolean deleteRol(int id){
        return roles.removeIf(r -> r.getRolId() == id);
    }
    
}