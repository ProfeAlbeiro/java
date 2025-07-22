package views;

import controllers.Users;
import controllers.Roles;
import models.User;
import models.Rol;
import java.util.Scanner;

public class UsersView {
    private Scanner sc = new Scanner(System.in);
    private Users users;
    private Roles roles;
    
    public UsersView(){        
    }
    
    public UsersView(Roles roles, Users users) {
        this.users = users;        
        this.roles = roles;
    }

    public void menuUsuarios() {
        
        int menuUs, rolId, userId;
        String name, lastname, email, pass;
        boolean state;
        do {
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|---------------------- GESTIÓN DE USUARIOS ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|- 1. Agregar Usuario");
            System.out.println("|- 2. Listar Usuarios");
            System.out.println("|- 3. Actualizar Usuario");
            System.out.println("|- 4. Eliminar Usuario");
            System.out.println("|- 0. Volver");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|- Seleccione una opción: ");
            menuUs = sc.nextInt();
            sc.nextLine();
            System.out.println("|-------------------------------------------------------------------|");

            switch (menuUs) {
                case 1:
                    System.out.print("|- ID: ");
                    userId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("|- Nombre: ");
                    name = sc.nextLine();
                    System.out.print("|- Apellido: ");
                    lastname = sc.nextLine();
                    System.out.print("|- Email: ");
                    email = sc.nextLine();
                    System.out.print("|- Contraseña: ");
                    pass = sc.nextLine();                    
                    System.out.print("|- Estado (true = activo / false = inactivo): ");
                    state = sc.nextBoolean();
                    System.out.print("|- ID Rol: ");
                    rolId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("|-------------------------------------------------------------------|");
                    Rol rol = roles.searchRolById(rolId);
                    if (rol != null) {
                        User newUser = new User(userId,name,lastname,email,pass,state,rol);
                        users.addUser(newUser);
                        System.out.println("|- ¡Usuario Creado!");
                    } else {
                        System.out.println("|- ¡Rol No Encontrado!");
                    }
                    break;
                case 2:
                    System.out.println("|- Lista de Usuarios: ");
                    for (User u : users.getUsers()) {
                        System.out.println("|- " + u);
                    }
                    break;
                case 3:
                    System.out.print("|- ID de Usuario a Actualizar: ");
                    userId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("|- Nuevo Nombre: ");
                    name = sc.nextLine();
                    System.out.print("|- Nuevo Apellido: ");
                    lastname = sc.nextLine();
                    System.out.print("|- Nuevo Email: ");
                    email = sc.nextLine();
                    System.out.print("|- Nuevo Contraseña: ");
                    pass = sc.nextLine();                    
                    System.out.print("|- Nuevo Estado (true = activo / false = inactivo): ");
                    state = sc.nextBoolean();
                    System.out.print("|- Nuevo ID Rol: ");
                    rolId = sc.nextInt();
                    sc.nextLine();
                    Rol rolUpdate = roles.searchRolById(rolId);
                    System.out.println("|-------------------------------------------------------------------|");
                    if (rolUpdate != null) {
                        if (users.updateUser(rolId, name, lastname, email, pass, state, rolUpdate)) {
                            System.out.println("|- ¡Usuario Actualizado!");
                        } else {
                            System.out.println("|- ¡Usuario No Encontrado!");
                        }
                    } else {
                        System.out.println("|- ¡Rol No Encontrado!");
                    }
                    break;
                case 4:
                    System.out.print("|- ID del Usuario a Eliminar: ");
                    userId = sc.nextInt();
                    if (users.deleteUser(userId)) {
                        System.out.println("|- ¡Usuario Eliminado!");
                    } else {
                        System.out.println("|- ¡Usuario No Encontrado!");
                    }
                    break;
            }
            System.out.println("|-------------------------------------------------------------------|");
        } while (menuUs != 0);
    }
}