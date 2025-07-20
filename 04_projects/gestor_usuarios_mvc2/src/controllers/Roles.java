package controllers;

import models.Rol;

import java.util.ArrayList;

public class Roles {
    
    // Lista de Roles
    private ArrayList<Rol> roles = new ArrayList<>();
        
    // Registrar Rol
    public void addRol(Rol rol){
        roles.add(rol);
    }    
    // Obtener todos lo roles
    public ArrayList<Rol> getRoles(){
        return roles;
    }
    // Obtener un rol
    public Rol searchRolById(int id){
        for (Rol r : roles) {
            if (r.getRolId() == id) {
                return r;
            }
        }
        return null;
    }    
    // Actualizar rol
    public boolean updateRol(int id, String newName){
        Rol rol = searchRolById(id);
        if (rol != null) {
            rol.setRolName(newName);
            return true;
        }
        return false;
    }
    // Eliminar rol
    public boolean deleteRol(int id){
        return roles.removeIf(r -> r.getRolId() == id);
    }    
}
