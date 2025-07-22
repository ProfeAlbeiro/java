package controllers;

import models.Rol;
import models.User;
import views.LoginView;

public class Login {
    
    private LoginView loginView;

    public Login() {
        
        // Crear objetos: Vista, roles y usuarios
        loginView = new LoginView();
        Roles roles = new Roles();
        Users users = new Users();
        
        // Crear rol y usuario de prueba para autenticación
        Rol rolAdmin = new Rol(1, "admin");
        roles.addRol(rolAdmin);
        User admin = new User(1,"Albeiro","Ramos","admin@correo.com","12345",true,rolAdmin);
        users.addUser(admin);

        // Solicita credenciales desde la vista
        String email = loginView.pedirEmail();
        String password = loginView.pedirContrasena();
        System.out.println("|-------------------------------------------------------|\n");

        // Validación básica (en proyecto real sería con base de datos)
        if (email.equals(admin.getUserEmail()) && password.equals(admin.getUserPass())) {
//            System.out.println("¡Bienvenido " + admin.getFullName() + "!");
            Dashboard dashboard = new Dashboard();            
        } else {
            System.out.println("Credenciales incorrectas\n");
        }
    }
}
