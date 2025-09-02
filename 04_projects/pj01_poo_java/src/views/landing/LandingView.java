package views.landing;

import java.util.Scanner;

public class LandingView {

    private int menu;
    private Scanner sc = new Scanner(System.in);

    public void landingMenuView() {

        do {

            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|----------------------------- EMPRESA -----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Iniciar Sesión");
            System.out.println("    2. Registrarse");
            System.out.println("    0. Salir");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opción: ");
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");

            switch (menu) {

                case 1:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------- INICIAR SESIÓN --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 2:                    
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|--------------------------- REGISTRARSE ---------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 0:
                    System.out.println("|----- ¡Hasta Pronto! ...");
                    System.out.println("|-------------------------------------------------------------------|");        
                    break;
                default:
                    System.out.println("|----- ¡Opción No Válida!");
                    System.out.println("|-------------------------------------------------------------------|");

            }

        } while (menu != 0);

    }

}