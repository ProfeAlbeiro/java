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
            System.out.println("    1. Gesti�n de Roles");
            System.out.println("    2. Gesti�n de Usuarios");
            System.out.println("    0. Cerrar Sesi�n");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opci�n : ");
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");
            
            switch (menu) {
                
                case 1 -> {
                    rolesView = new RolesView(roles);
                    rolesView.rolesMenuView();
                }
                case 2 -> {
                    usersView = new UsersView(roles, users);
                    usersView.usersMenuView();
                }
                case 0 -> {
                    System.out.println("|----- �Sesi�n Cerrada! ...");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                default -> {
                    System.out.println("|----- �Opci�n No V�lida!");
                    System.out.println("|-------------------------------------------------------------------|");
                }
            }
            
        } while (menu != 0);
        
    }
    
}