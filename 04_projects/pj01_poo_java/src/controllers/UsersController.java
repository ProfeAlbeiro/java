package controllers;

import models.RolModel;
import models.UserModel;
import views.modules.users.UsersView;
import views.modules.users.UsersFormView;
import java.util.ArrayList;

public class UsersController {
    
    private int rolId, userId;
    private String userName, userLastName, userEmail, userPass;
    private boolean userState;
    private RolModel rol;
    private RolesController roles = new RolesController();
    private UserModel user;    
    private UsersView usersView;
    private UsersFormView usersFormView = new UsersFormView();    
    private ArrayList<UserModel> users = new ArrayList<>();
    
    public void usersMenu(RolesController roles, UsersController users) {        
        usersView = new UsersView(roles, users);
        usersView.usersMenuView();        
    }
    
    public void addUser(RolModel rol){
        userId = users.size() + 1;
        userName = usersFormView.getUserName();
        userLastName = usersFormView.getUserLastName();
        userEmail = usersFormView.getUserEmail();
        userPass = usersFormView.getUserPass();
        userState = usersFormView.getUserState();        
        user = new UserModel(userId, userName, userLastName, userEmail, userPass, userState, rol);
        users.add(user);
    }
    
    public void getUsers(){
        for(UserModel getUser : users){
            System.out.println("|----- " + getUser);
        }        
    }
}