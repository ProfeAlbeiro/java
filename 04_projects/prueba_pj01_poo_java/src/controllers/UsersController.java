package controllers;

import views.modules.users.UsersView;

public class UsersController {
    
    private UsersView usersView;

    public void usersMenu() {
        
        usersView = new UsersView();
        usersView.UsersMenuView();
        
    }
    
}