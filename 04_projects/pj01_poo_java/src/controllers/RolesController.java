package controllers;

import models.RolModel;
import views.modules.roles.RolesView;
import views.modules.roles.RolesFormView;
import java.util.ArrayList;

public class RolesController {
    
    private int rolId;
    private String rolName;
    private ArrayList<RolModel> rolesList = new ArrayList<>();    
    private RolModel rol;
    private RolesView rolesView;
    private RolesFormView rolesFormView = new RolesFormView();
    
    public void rolesMenu(RolesController roles) {
        rolesView = new RolesView(roles);
        rolesView.rolesMenuView();
    }
    
    public String addRol(){
        rolId = rolesList.size() + 1;
        rolName = rolesFormView.getRolName();
        rol = new RolModel(rolId, rolName);
        rolesList.add(rol);        
        return "|----- ¡Rol Creado!";
    }

    public void getRoles(){
        for(RolModel getRol : rolesList){
            System.out.println("|----- " + getRol);
        }        
    }

    public String searchRolById(){
        rolId = rolesFormView.getRolId();
        for (RolModel getRol : rolesList) {
            if (getRol.getRolId() == rolId) {
                return "|----- " + getRol.toString();
            }
        }
        return "|----- ¡Rol No Encontrado!";
    }
    
    public String updateRol(){
        rolId = rolesFormView.getRolId();
        for (RolModel getRol : rolesList){
            if (getRol.getRolId() == rolId) {
                rolName = rolesFormView.getRolName();
                getRol.setRolName(rolName);
                return "|----- ¡Rol Actualizado!";
            }
        }
        return "|----- ¡Rol No Encontrado!";
    }

    public String deleteRol(){
        rolId = rolesFormView.getRolId();
        if (rolesList.removeIf(getRol -> getRol.getRolId() == rolId)) {
            return "|----- ¡Rol Eliminado!";            
        } else {
            return "|----- ¡Rol No Encontrado!";
        }
    }

}