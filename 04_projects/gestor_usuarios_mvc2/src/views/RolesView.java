package views;

import models.Rol;
import controllers.Roles;
import java.util.ArrayList;
import java.util.Scanner;

public class RolesView {
    private Scanner sc = new Scanner(System.in);
    private Roles roles = new Roles();    
    
    public RolesView(){        
    }
    
//    public RolesView(Roles roles) {
//        this.roles = roles;
//    }

    public void menuRoles() {
        int rolId, userId;
        String name, lastname, email, pass;
        boolean state;
        int menuRol;
        do {
            System.out.println("|-------------------------------------|");
            System.out.println("|--------- GESTIÓN DE ROLES ----------|");
            System.out.println("|-------------------------------------|");            
            System.out.println("|- 1. Registrar Rol");
            System.out.println("|- 2. Listar Roles");
            System.out.println("|- 3. Eliminar Rol");
            System.out.println("|- 4. Actualizar Rol");
            System.out.println("|- 0. Volver");
            System.out.print("|- Seleccione una opción: ");
            menuRol = sc.nextInt();
            sc.nextLine();
            System.out.println("|-------------------------------------|\n");            

            switch (menuRol) {
                case 1:
                    System.out.print("ID: ");
                    rolId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    name = sc.nextLine();
                    roles.addRol(new Rol(rolId,name));
                    System.out.println("\nRol creado");
                    break;
                case 2:
                    for (Rol r : roles.getRoles()) {
                        System.out.println(r);
                    }
                    break;
                case 3:
                    System.out.print("ID del rol a eliminar: ");
                    int deletId = sc.nextInt();
                    sc.nextLine();
                    if (roles.deleteRol(deletId)) {
                        System.out.println("Rol eliminado");
                    } else {
                        System.out.println("Rol no encontrado");
                    }
                    break;
                case 4:
                    System.out.print("ID del rol a actualizar: ");
                    int updId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String newName = sc.nextLine();
                    if (roles.updateRol(updId, newName)) {
                        System.out.println("Rol actualizado");
                    } else {
                        System.out.println("Rol no encontrado");
                    }
                    break;
            }
        } while (menuRol != 0);
    }
}