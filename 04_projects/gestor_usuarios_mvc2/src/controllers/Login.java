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
        
        // Crear rol y usuario de prueba para autenticaci�n
        Rol rolAdmin = new Rol(1, "admin");
        roles.addRol(rolAdmin);
        User admin = new User(1,"Albeiro","Ramos","admin@correo.com","12345",true,rolAdmin);
        users.addUser(admin);

        // Solicita credenciales desde la vista
        String email = loginView.pedirEmail();
        String password = loginView.pedirContrasena();        

        // Validaci�n b�sica (en proyecto real ser�a con base de datos)
        if (email.equals(admin.getUserEmail()) && password.equals(admin.getUserPass())) {
            System.out.println("|-------------------------------------------------------------------|");
            Dashboard dashboard = new Dashboard(roles,users);            
        } else {
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|- Credenciales incorrectas");            
            System.out.println("|-------------------------------------------------------------------|");
        }
    }
}
