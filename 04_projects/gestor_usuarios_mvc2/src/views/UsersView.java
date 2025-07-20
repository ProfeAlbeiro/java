package views;

import controllers.Users;
import models.User;
import models.Rol;
import java.util.Scanner;

public class UsersView {
    private Scanner sc = new Scanner(System.in);
    private Users users;
    
    public UsersView(){        
    }
    
    public UsersView(Users users) {
        this.users = users;
    }

    public void menuUsuarios() {
        int menuUs;
        do {
            System.out.println("\n--- Gestión de Usuarios ---");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Actualizar Usuario");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");
            menuUs = sc.nextInt();
            sc.nextLine();

            switch (menuUs) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Password: ");
                    String pass = sc.nextLine();
                    System.out.print("Estado (true/false): ");
                    boolean estado = sc.nextBoolean();
                    sc.nextLine();
                    Rol rol = new Rol(1, "Usuario"); // Temporal
                    users.addUser(new User(id, nombre, apellido, email, pass, estado, rol));
                    break;
                case 2:
                    for (User u : users.getUsers()) {
                        System.out.println(u);
                    }
                    break;
                case 3:
                    System.out.print("ID del usuario a eliminar: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    if (users.deleteUser(deleteId)) {
                        System.out.println("Eliminado con éxito");
                    } else {
                        System.out.println("Usuario no encontrado");
                    }
                    break;
                case 4:
                    System.out.print("ID del usuario a actualizar: ");
                    int updId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String newName = sc.nextLine();
                    System.out.print("Nuevo apellido: ");
                    String newLast = sc.nextLine();
                    System.out.print("Nuevo email: ");
                    String newEmail = sc.nextLine();
                    System.out.print("Nuevo pass: ");
                    String newPass = sc.nextLine();
                    System.out.print("Nuevo estado (true/false): ");
                    boolean newEstado = sc.nextBoolean();
                    sc.nextLine();
                    Rol newRol = new Rol(1, "Usuario"); // Temporal
                    if (users.updateUser(updId, newName, newLast, newEmail, newPass, newEstado, newRol)) {
                        System.out.println("Actualizado correctamente");
                    } else {
                        System.out.println("Usuario no encontrado");
                    }
                    break;
            }
        } while (menuUs != 0);
    }
}