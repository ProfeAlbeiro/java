package controllers;

import models.Rol;
import models.User;
import java.util.ArrayList;

public class UserController {
    private ArrayList<Rol> roles = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    
    public void addRol(Rol rol){
        roles.add(rol);
    }
    
    public void addUser(User user){
        users.add(user);
    }
    
    public ArrayList<User> getUsers(){
        return users;
    }
    
    public ArrayList<Rol> getRoles(){
        return roles;
    }
    
    public User authenticateUser(String email, String password){
        for (User u : users) {
            if (u.getUserEmail().equalsIgnoreCase(email) && u.getUserPass().equals(password) ) {
                return u;
            }
        }
        return null;
    }    
    
}
