package controllers;

import views.landing.LoginView;

public class LoginController {    
    
    private LoginView loginView;
    private String email, pass;
    
    public LoginController() {

        loginView = new LoginView();
        
        email = loginView.getEmail();
        pass = loginView.getPass();
        
        System.out.println("|-------------------------------------------------------------------|");
        if (email.equals("admin@correo.com") && pass.equals("12345")) {
            System.out.println("Voy al Dashboard");
        } else {
            System.out.println("Me devuelvo al Landing");
        }
        
    }
    
}