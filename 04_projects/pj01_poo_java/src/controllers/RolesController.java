package controllers;

import models.RolModel;
import views.modules.roles.RolesView;
import java.util.ArrayList;

public class RolesController {
    
    private RolesView rolesView;
    private ArrayList<RolModel> roles = new ArrayList<>();

    public RolesController() {        
        rolesView = new RolesView();        
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