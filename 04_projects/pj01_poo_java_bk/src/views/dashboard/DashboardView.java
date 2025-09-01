package views.dashboard;

import views.modules.roles.RolesMenuView;
import views.modules.users.UsersMainView;
import java.util.Scanner;

public class DashboardView {
    
    private int menu;
    private RolesMenuView rolesMenuView;
    private UsersMainView usersMainMenu;
    private Scanner sc = new Scanner(System.in);

    public DashboardView() {
        
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
                
                case 1 -> rolesMenuView = new RolesMenuView();
                case 2 -> usersMainMenu = new UsersMainView();
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