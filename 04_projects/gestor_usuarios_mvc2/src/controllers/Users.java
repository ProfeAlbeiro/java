package controllers;

import models.Rol;
import models.User;
import views.UsersView;
import java.util.ArrayList;

public class Users {
    
    // Mostrar la Vista y Lista de Usuarios
    private UsersView usersView;
    private ArrayList<User> users = new ArrayList<>();    
    
    // Vista de Usuarios
    public void indexUsers(){
        usersView = new UsersView();
        usersView.menuUsuarios();
    }
    
    // Registrar Usuario 
    public void addUser(User user){
        users.add(user);
    }
    // Obtener todos los usuarios
    public ArrayList<User> getUsers(){
        return users;
    }
    // Obtener usuario
    public User searchUserById(int id){
        for (User u : users) {
            if (u.getUserId() == id) {
                return u;
            }
        }        
        return null;
    }
    // Actualizar usuario
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
    // Eliminar usuario
    public boolean deleteUser(int id) {
        return users.removeIf(u -> u.getUserId() == id);
    }    
}
