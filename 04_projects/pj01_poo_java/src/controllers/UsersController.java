package controllers;

import models.RolModel;
import models.UserModel;
import views.modules.users.UsersMainView;
import java.util.ArrayList;

public class UsersController {
    
    private UsersMainView usersMainView;
    private ArrayList<UserModel> users = new ArrayList<>();
    
    public void usersMenu() {        
        usersMainView = new UsersMainView();        
    }
    
    public void addUser(UserModel user){
        users.add(user);
    }
    
    public ArrayList<UserModel> getUsers(){
        return users;
    }
    
    public UserModel searchUserById(int id){
        for(UserModel user : users){
            if (user.getUserId() == id) {
                return user;
            }
        }
        return null;
    }
    
    public boolean updateUser(int id, String name, String lastName, String email, String pass, boolean state, RolModel rol){
        UserModel user = searchUserById(id);
        if (user != null) {
            user.setUserName(name);
            user.setUserLastName(lastName);
            user.setUserEmail(email);
            user.setUserPass(pass);
            user.setUserState(state);
            user.setUserState(state);
            user.setRolModel(rol);
            return true;
        }
        return false;
    }
    
    public boolean deleteUser(int id){
        return users.removeIf(user -> user.getUserId() == id);
    }
    
}