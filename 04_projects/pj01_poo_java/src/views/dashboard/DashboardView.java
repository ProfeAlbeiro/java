package views.dashboard;

import java.util.Scanner;

public class DashboardView {
    
    private int menu;
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
                
                case 1:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ GESTIÓN DE ROLES -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 2:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|---------------------- GESTIÓN DE USUARIOS ------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 0:
                    System.out.println("|----- ¡Sesión Cerrada! ...");
                    System.out.println("|-------------------------------------------------------------------|");        
                    break;
                default:
                    System.out.println("|----- ¡Opción No Válida!");
                    System.out.println("|-------------------------------------------------------------------|");
            }
            
        } while (menu != 0);
        
    }
    
}