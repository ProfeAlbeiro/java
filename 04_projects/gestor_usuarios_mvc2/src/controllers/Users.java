package controllers;

import models.Rol;
import models.User;
import java.util.ArrayList;

public class Users {
    
    private ArrayList<User> users = new ArrayList<>();        
    
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
}
