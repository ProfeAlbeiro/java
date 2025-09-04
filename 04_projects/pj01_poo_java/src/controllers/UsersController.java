package controllers;

import models.RolModel;
import models.UserModel;
import views.modules.users.UsersView;
import views.modules.users.UsersFormView;
import java.util.ArrayList;

public class UsersController {
    
    private int rolId, userId;
    private String userName, userLastName, userEmail, userPass;
    private RolModel rol;
    private UserModel user;
    private boolean userState;
    private UsersView usersView;
    private UsersFormView usersFormView = new UsersFormView();
    private ArrayList<UserModel> users = new ArrayList<>();    

    public void usersMenu(RolesController roles, UsersController users) {        
        usersView = new UsersView(roles, users);
        usersView.usersMenuView();        
    }
    
    public String addUser(){
        userId = users.size() + 1;
        userName = usersFormView.getUserName();
        userLastName = usersFormView.getUserLastName();
        userEmail = usersFormView.getUserEmail();
        userPass = usersFormView.getUserPass();
        users.add(user);
        return "|----- ¡Usuario Creado!";
    }
    
}