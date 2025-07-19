package controllers;

import models.Rol;
import models.User;
import views.LoginView;

public class Login {

    public void iniciarSesion() {
        LoginView loginView = new LoginView();
        Roles rolesAdd = new Roles();
        Users usersAdd = new Users();

        // Solicita credenciales desde la vista
        String email = loginView.pedirEmail();
        String password = loginView.pedirContrasena();

        // Crear roles y usuarios de prueba para autenticaci�n
        Rol adminRol = new Rol(1, "admin");
        rolesAdd.addRol(adminRol);
        User admin = new User(1,"Albeiro","Ramos","admin@correo.com","12345",true,adminRol);
        usersAdd.addUser(admin);

        // Validaci�n b�sica (en proyecto real ser�a con base de datos)
        if (email.equals(admin.getUserEmail()) && password.equals(admin.getUserPass())) {
            System.out.println("\n? �Bienvenido " + admin.getUserName() + " " + admin.getUserLastName() + "!");
        } else {
            System.out.println("\n? Credenciales incorrectas. Intenta nuevamente.");
        }
    }
}
