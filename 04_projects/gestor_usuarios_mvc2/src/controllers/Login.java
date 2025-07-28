package controllers;

import models.Rol;
import models.User;
import routes.Router;
import views.company.LoginView;

public class Login {
    
    private Router router;
    private LoginView loginView;
    private Roles roles;
    private Users users;

    public Login() {
        
        loginView = new LoginView(); 
        roles = new Roles();
        users = new Users();
        
        // Crear rol y usuario de prueba para autenticación
        Rol rolAdmin = new Rol(1, "admin");
        roles.addRol(rolAdmin);
        User admin = new User(1,"Albeiro","Ramos","admin@correo.com","12345",true,rolAdmin);
        users.addUser(admin);

        // Solicita credenciales desde la vista
        String email = loginView.pedirEmail();
        String password = loginView.pedirContrasena();        

        // Validación básica (en proyecto real sería con base de datos)
        if (email.equals(admin.getUserEmail()) && password.equals(admin.getUserPass())) {
            System.out.println("|-------------------------------------------------------------------|");
            router = new Router("Dashboard", roles, users);
        } else {
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|- Credenciales incorrectas");            
            System.out.println("|-------------------------------------------------------------------|");
        }
    }
    
}
