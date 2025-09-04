package views.modules.roles;

import controllers.RolesController;
import java.util.Scanner;

public class RolesView {
    
    private int menu;
    String rolFound;
    private RolesController roles = new RolesController();
    private Scanner sc = new Scanner(System.in);

    public void rolesMenuView() {
        
        do {
            
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------ GESTI�N DE ROLES -------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrar Rol");
            System.out.println("    2. Listar Roles");
            System.out.println("    3. Consultar Rol");
            System.out.println("    4. Actualizar Rol");
            System.out.println("    5. Eliminar Rol");
            System.out.println("    0. Volver");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opci�n : ");
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");
            
            switch (menu) {

                case 1 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- REGISTRAR ROL --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");                    
                    roles.addRol();
                    System.out.println("|-------------------------------------------------------------------|");
                    System.out.println("|----- �Rol Creado!");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 2 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- LISTAR ROLES ---------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    roles.getRoles();
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 3 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- CONSULTAR ROL --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    rolFound = roles.searchRolById();
                    System.out.println("|-------------------------------------------------------------------|");
                    System.out.println(rolFound);
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 4 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- ACTUALIZAR ROL -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");                    
                    rolFound = roles.updateRol();                    
                    System.out.println("|-------------------------------------------------------------------|");
                    System.out.println(rolFound);
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 5 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- ELIMINAR ROL ---------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    rolFound = roles.deleteRol();
                    System.out.println("|-------------------------------------------------------------------|");
                    System.out.println(rolFound);
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 0 -> {
                }
                default -> {
                    System.out.println("|----- �Opci�n No V�lida!");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                    
            }
            
        } while (menu != 0);
        
    }
    
}