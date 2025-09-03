package views.dashboard;

import controllers.RolesController;
import controllers.UsersController;
import views.modules.roles.RolesView;
import views.modules.users.UsersView;
import java.util.Scanner;

public class DashboardView {
    
    private int menu;
    private RolesController roles = new RolesController();
    private UsersController users = new UsersController();
    private RolesView rolesView;
    private UsersView usersView;
    private Scanner sc = new Scanner(System.in);

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
                    RolesController rolesManage = new RolesController();
                    rolesManage.rolesMenu(roles);
                }
                case 2 -> {
                    usersView = new UsersView(roles, users);
                    usersView.usersMenuView();
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