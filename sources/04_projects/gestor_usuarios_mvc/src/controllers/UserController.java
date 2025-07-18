package controllers;

import models.Rol;
import models.User;
import java.util.ArrayList;

public class UserController {
    
    // Listas los Roles y Usuarios
    private ArrayList<Rol> roles = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
        
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
    // Usuarios: Registrar    
    public void addUser(User user){
        users.add(user);
    }
    // Usuarios: Obtener todos
    public ArrayList<User> getUsers(){
        return users;
    }
    // Usuarios: Obtener uno
    public User searchUserById(int id){
        for (User u : users) {
            if (u.getUserId() == id) {
                return u;
            }
        }        
        return null;
    }
    // Usuarios: Actualizar
    public boolean updateUser(int id, String newName, String newLastName, String newEmail, String newPass, boolean newState, Rol newRol) {
        User user = searchUserById(id);
        if (user != null) {
            user.setUserName(newName);
            user.setUserLastName(newLastName);
            user.setUserEmail(newEmail);
            user.setUserPass(newPass);
            user.setUserState(newState);
            user.setRol(newRol);
            return true;
        }
        return false;
    }
    // Usuarios: Eliminar
    public boolean deleteUser(int id) {
        return users.removeIf(u -> u.getUserId() == id);
    }
    // Usuarios: Ingreso por contraseña
    public User authenticateUser(String email, String password){
        for (User u : users) {
            if (u.getUserEmail().equalsIgnoreCase(email) && u.getUserPass().equals(password) ) {
                return u;
            }
        }
        return null;
    }
}
