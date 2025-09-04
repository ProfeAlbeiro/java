package controllers;

import models.Rol;
import models.User;
import views.company.RegisterView;

import java.util.ArrayList;
import java.util.List;

public class Register {

    // Lista para usuarios registrados (���OJO!!! Contrastar con controlador Users)
    private static List<User> users = new ArrayList<>();

    public void registrarUsuario() {
        
        RegisterView vistaRegistro = new RegisterView();        
        Rol rol = new Rol();

        // Solicita los datos del nuevo usuario
        int id = users.size() + 1;
        String nombre = vistaRegistro.pedirNombre();
        String apellido = vistaRegistro.pedirApellido();
        String correo = vistaRegistro.pedirEmail();
        String contrasena = vistaRegistro.pedirContrasena();
        boolean estado = true;
        System.out.println("|-------------------------------------|\n"); 

        // Crea el usuario
        User nuevoUsuario = new User(id, nombre, apellido, correo, contrasena, estado, rol);        
        users.add(nuevoUsuario);
        
        // Mensaje de usuario registrado
        System.out.println("Usuario registrado exitosamente.\n");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Correo: " + correo);
    }

//    // M�todo �til para listar usuarios registrados (opcional)
//    public void listarUsuarios() {
//        System.out.println("Usuarios registrados:");
//        for (User user : users) {
//            System.out.println(user.getUserId() + " - " + user.getUserName() + " " + user.getUserLastName());
//        }
//    }
//
//    // M�todo �til para validar login (usado m�s adelante si deseas)
//    public static List<User> getUsuariosRegistrados() {
//        return users;
//    }
}