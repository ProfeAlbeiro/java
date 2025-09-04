package views.dashboard;

import controllers.RolesController;
import controllers.UsersController;
import java.util.Scanner;

public class DashboardView {
    
    private int menu;
    private RolesController roles = new RolesController();
    private UsersController users = new UsersController();
    private Scanner sc = new Scanner(System.in);
    
    public DashboardView(){        
    }
    
    public DashboardView(RolesController roles){
        this.roles = roles;
    }
    public void dashboardMenuView() {
        
        do {            
            
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|---------------------------- DASHBOARD ----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Gestión de Roles");
            System.out.println("    2. Gestión de Usuarios");
            System.out.println("    0. Cerrar Sesión");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opción : ");
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");
            
            switch (menu) {
                
                case 1 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ GESTIÓN DE ROLES -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    RolesController rolesManage = new RolesController();
                    rolesManage.rolesMenu(roles);
                }
                case 2 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|---------------------- GESTIÓN DE USUARIOS ------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");                    
                    users.usersMenu();
                }
                case 0 -> {
                    System.out.println("|----- ¡Sesión Cerrada! ...");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                default -> {
                    System.out.println("|----- ¡Opción No Válida!");
                    System.out.println("|-------------------------------------------------------------------|");
                }
            }
            
        } while (menu != 0);
        
    }
    
}