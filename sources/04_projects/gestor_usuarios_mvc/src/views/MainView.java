package views;

import controllers.UserController;
import models.Rol;
import models.User;

import java.util.Scanner;

public class MainView {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserController controller = new UserController();
        
        // Crear roles y usuarios de prueba para autenticación
        Rol adminRol = new Rol(1, "admin");
        controller.addRol(adminRol);
        User admin = new User(1,"Albeiro","Ramos","admin@correo.com","12345",true,adminRol);
        controller.addUser(admin);
        
        // Menú Autenticación
        System.out.println("|-------------- Login --------------|\n");
        System.out.print("| Usuario: ");
        String email = scanner.nextLine();
        System.out.print("| Contraseña: ");
        String pass = scanner.nextLine();
        System.out.println("\n|-----------------------------------|\n");
        
        User authenticateUser = controller.authenticateUser(email, pass);
        
        if (authenticateUser != null) {
            System.out.println("\nBienvenido " + authenticateUser.getFullName());
            mostrarMenu(scanner, controller);
        } else {
            System.out.println("Correo o contraseña incorrectos");
        }
        
        scanner.close();
        
    }
    
    // Menú Principal
    public static void mostrarMenu(Scanner scanner, UserController controller){
        int option, rolId, userId;
        String name, lastname, email, pass;
        boolean state;
        
        do {
            System.out.println("\n|---------- MENÚ PRINCIPAL ---------|\n");
            System.out.println("| 1. Crear Rol");
            System.out.println("| 2. Listar Roles");
            System.out.println("| 3. Actualizar Rol");
            System.out.println("| 4. Eliminar Rol");
            System.out.println("| 5. Crear Usuario");
            System.out.println("| 6. Listar Usuarios");
            System.out.println("| 7. Actualizar Usuario");
            System.out.println("| 8. Eliminar Usuario");
            System.out.println("| 9. Salir");
            System.out.print("\n| Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n|-----------------------------------|\n");
            
            switch (option) {
                case 1:
                    System.out.print("ID: ");
                    rolId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    name = scanner.nextLine();
                    controller.addRol(new Rol(rolId,name));
                    System.out.println("\nRol creado");
                    break;
                case 2:
                    System.out.println("Lista de Roles: ");
                    for (Rol r : controller.getRoles()) {
                        System.out.println(r);
                    }
                    break;
                case 3:
                    System.out.print("ID del Rol a Actualizar: ");
                    rolId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    String newName = scanner.nextLine();
                    if (controller.updateRol(rolId, newName)) {
                        System.out.println("\nRol Actualizado");
                    } else {
                        System.out.println("\nRol No Encontrado");
                    }
                    break;
                case 4:
                    System.out.print("ID del Rol a Eliminar: ");
                    rolId = scanner.nextInt();
                    if (controller.deleteRol(rolId)) {
                        System.out.println("\nRol Eliminado");
                    } else {
                        System.out.println("\nRol No Encontrado");
                    }
                    break;
                case 5:
                    System.out.print("ID: ");
                    userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    name = scanner.nextLine();
                    System.out.print("Apellido: ");
                    lastname = scanner.nextLine();
                    System.out.print("Email: ");
                    email = scanner.nextLine();
                    System.out.print("Contraseña: ");
                    pass = scanner.nextLine();
                    System.out.print("Estado (true = activo / false = inactivo): ");
                    state = scanner.nextBoolean();
                    System.out.print("ID Rol: ");
                    rolId = scanner.nextInt();
                    scanner.nextLine();
                    Rol rol = controller.searchRolById(rolId);
                    if (rol != null) {
                        User newUser = new User(userId,name,lastname,email,pass,state,rol);
                        controller.addUser(newUser);
                        System.out.println("\nUsuario Creado");
                    } else {
                        System.out.println("\nRol No Encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Lista de Usuarios: ");
                    for (User u : controller.getUsers()) {
                        System.out.println(u);
                    }
                    break;
                case 7:
                    System.out.print("ID de Usuario a Actualizar: ");
                    userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    name = scanner.nextLine();
                    System.out.print("Nuevo Apellido: ");
                    lastname = scanner.nextLine();
                    System.out.print("Nuevo Email: ");
                    email = scanner.nextLine();
                    System.out.print("Nuevo Contraseña: ");
                    pass = scanner.nextLine();
                    System.out.print("Nuevo Estado (true = activo / false = inactivo): ");
                    state = scanner.nextBoolean();
                    System.out.print("Nuevo ID Rol: ");
                    rolId = scanner.nextInt();
                    scanner.nextLine();
                    Rol rolUpdate = controller.searchRolById(rolId);
                    if (rolUpdate != null) {
                        if (controller.updateUser(rolId, name, lastname, email, pass, state, rolUpdate)) {
                            System.out.println("\nUsuario Actualizado");
                        } else {
                            System.out.println("\nUsuario No Encontrado");
                        }
                    } else {
                        System.out.println("\nRol No Encontrado");
                    }
                    break;
                case 8:
                    System.out.print("ID del Usuario a Eliminar: ");
                    userId = scanner.nextInt();
                    if (controller.deleteUser(userId)) {
                        System.out.println("\nUsuario Eliminado");
                    } else {
                        System.out.println("\nUsuario No Encontrado");
                    }
                    break;
                case 9:
                    System.out.println("Hasta Pronto ... ");
                    break;
                default:
                    System.out.println("Opción No Válida");
            }
            
        } while (option != 9);
        
    }    
}
