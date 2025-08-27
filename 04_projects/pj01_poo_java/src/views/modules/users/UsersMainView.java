package views.modules.users;

import java.util.Scanner;

public class UsersMainView {
    
    private int menu;
    private Scanner sc = new Scanner(System.in);

    public UsersMainView() {

        do {

            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|---------------------- GESTI�N DE USUARIOS ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Usuarios");
            System.out.println("    2. Clientes");            
            System.out.println("    0. Cerrar Sesi�n");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opci�n : ");
            menu = sc.nextInt();
            System.out.println("|-------------------------------------------------------------------|");

            switch (menu) {

                case 1:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|---------------------------- USUARIOS -----------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 2:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|---------------------------- CLIENTES -----------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 0:
                    System.out.println("|----- �Sesi�n Cerrada! ...");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                default:
                    System.out.println("|----- �Opci�n No V�lida!");
                    System.out.println("|-------------------------------------------------------------------|");

            }

        } while (menu != 0);

    }
    
}