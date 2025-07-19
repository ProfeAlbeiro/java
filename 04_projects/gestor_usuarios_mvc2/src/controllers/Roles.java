package controllers;

import models.Rol;

import java.util.ArrayList;

public class Roles {
    
    // Listas los Roles y Usuarios
    private ArrayList<Rol> roles = new ArrayList<>();
        
    // Roles: Registrar
    public void addRol(Rol rol){
        roles.add(rol);
    }    
    // Roles: Obtener todos
    public ArrayList<Rol> getRoles(){
        return roles;
    }
    // Roles: Obtener uno
    public Rol searchRolById(int id){
        for (Rol r : roles) {
            if (r.getRolId() == id) {
                return r;
            }
        }
        return null;
    }    
    // Roles: Actualizar
    public boolean updateRol(int id, String newName){
        Rol rol = searchRolById(id);
        if (rol != null) {
            rol.setRolName(newName);
            return true;
        }
        return false;
    }
    // Roles: Eliminar
    public boolean deleteRol(int id){
        return roles.removeIf(r -> r.getRolId() == id);
    }    
}
