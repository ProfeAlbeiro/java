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
    private UsersView usersView;
    private ArrayList<UserModel> users = new ArrayList<>();    

    public void usersMenu(RolesController roles, UsersController users) {        
        usersView = new UsersView(roles, users);
        usersView.usersMenuView();        
    }
    
}