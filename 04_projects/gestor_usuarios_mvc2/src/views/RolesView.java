package views;

import models.Rol;
import controllers.Roles;

import java.util.Scanner;

public class RolesView {
    private Scanner sc = new Scanner(System.in);
    private Roles roles = new Roles();    
    
    public RolesView(){        
    }
    
    public RolesView(Roles roles) {
        this.roles = roles;
    }

    public void menuRoles() {
        
        int menuRol, rolId;
        String name, newName;
        
        do {
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|------------------ GESTIÓN DE ROLES -------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|- 1. Registrar Rol");
            System.out.println("|- 2. Listar Roles");
            System.out.println("|- 3. Actualizar Rol");
            System.out.println("|- 4. Eliminar Rol");
            System.out.println("|- 0. Volver");
            System.out.println("|-------------------------------------------------------|");
            System.out.print("|- Seleccione una opción: ");
            menuRol = sc.nextInt();
            sc.nextLine();
            System.out.println("|-------------------------------------------------------|");

            switch (menuRol) {
                case 1:
                    System.out.print("|- ID: ");
                    rolId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("|- Nombre: ");
                    name = sc.nextLine();
                    roles.addRol(new Rol(rolId,name));
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|- ¡Rol creado!");                    
                    break;
                case 2:
                    for (Rol r : roles.getRoles()) {
                        System.out.println("|- " + r);
                    }
                    break;
                case 3:
                    System.out.print("|- ID del Rol a Actualizar: ");
                    rolId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("|- Nuevo Nombre: ");
                    newName = sc.nextLine();
                    if (roles.updateRol(rolId, newName)) {
                        System.out.println("|- ¡Rol Actualizado!");
                    } else {
                        System.out.println("|- ¡Rol No Encontrado!");
                    }
                    break;
                case 4:
                    System.out.print("|- ID del Rol a Eliminar: ");
                    rolId = sc.nextInt();
                    if (roles.deleteRol(rolId)) {
                        System.out.println("|- ¡Rol Eliminado!");
                    } else {
                        System.out.println("|- ¡Rol No Encontrado!");
                    }
                    break;                
            }
            System.out.println("|-------------------------------------------------------|\n");
        } while (menuRol != 0);
    }
}