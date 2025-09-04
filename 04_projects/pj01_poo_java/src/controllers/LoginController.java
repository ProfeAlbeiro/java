package controllers;

import views.landing.LoginFormView;

public class LoginController {
    
    private String email, pass;
    private LoginFormView loginView;
    private DashboardController dashboard;
    
    public void loginForm(){        
        
        loginView = new LoginFormView();
        
        email = loginView.getUserEmail();
        pass = loginView.getUserPass();
        
        if (email.equals("admin@correo.com") && pass.equals("12345")) {
            System.out.println("|-------------------------------------------------------------------|");            
            dashboard = new DashboardController();
            dashboard.dashboardMenu();
            System.out.println("|-------------------------------------------------------------------|");            
        } else {
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|----- ¡Credenciales Incorrectas!");            
            System.out.println("|-------------------------------------------------------------------|");
        }       
        
    }
    
}