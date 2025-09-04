package controllers;

import views.landing.LoginView;

public class LoginController {
    
    private String email, pass;
    private LoginView loginView;    
    
    public void landingMenu(){        
        
        loginView = new LoginView();
        
        email = loginView.getUserEmail();
        pass = loginView.getUserPass();
        
    }
    
}