package views.modules.users;

import views.modules.users.users.UsersMenuView;
import views.modules.users.customers.CustomersMenuView;
import java.util.Scanner;

public class UsersMainView {
    
    private int menu;
    private UsersMenuView usersMenuView;
    private CustomersMenuView customersMenuView;
    private Scanner sc = new Scanner(System.in);

    public UsersMainView() {

        do {

            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|---------------------- GESTIÓN DE USUARIOS ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Usuarios");
            System.out.println("    2. Clientes");            
            System.out.println("    0. Cerrar Sesión");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opción : ");
            menu = sc.nextInt();
            System.out.println("|-------------------------------------------------------------------|");

            switch (menu) {

                case 1 -> usersMenuView = new UsersMenuView();
                case 2 -> customersMenuView = new CustomersMenuView();
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