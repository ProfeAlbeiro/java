package controllers;

import models.RolModel;
import views.modules.roles.RolesView;
import views.modules.roles.RolesFormView;
import java.util.ArrayList;

public class RolesController {
    
    private int rolId;
    private String rolName;
    private RolModel rol;
    private RolesView rolesView;    
    private RolesFormView rolesFormView = new RolesFormView();
    private ArrayList<RolModel> roles = new ArrayList<>();
    
    public void rolesMenu() {
        rolesView = new RolesView();
        rolesView.rolesMenuView();
    }
    
    public void addRol(){
        rolId = roles.size() + 1;
        rolName = rolesFormView.getRolName();
        rol = new RolModel(rolId, rolName);
        roles.add(rol);
    }

    public void getRoles(){
        for(RolModel getRol : roles){
            System.out.println("|----- " + getRol);
        }        
    }

    public RolModel searchRolById(){
        rolId = rolesFormView.getRolId();
        for (RolModel getRol : roles) {
            if (getRol.getRolId() == rolId) {
                return getRol;
            }
        }
        return null;
    }
    
    public boolean updateRol(){        
        rolId = rolesFormView.getRolId();        
        for (RolModel getRol : roles){
            if (getRol.getRolId() == rolId) {
                rolName = rolesFormView.getRolName();
                getRol.setRolName(rolName);
                return true;
            }
        }
        return false;
    }

    public boolean deleteRol(){
        rolId = rolesFormView.getRolId();
        if (roles.removeIf(getRol -> getRol.getRolId() == rolId)) {
            return true;
        } else {
            return false;
        }
    }

}