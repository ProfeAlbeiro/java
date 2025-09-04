package views.landing;

import controllers.RegisterController;
import controllers.LoginController;
import java.util.Scanner;

public class LandingView {

    private int menu;
    private RegisterController register;
    private LoginController login;
    private Scanner sc = new Scanner(System.in);

    public void landingMenuView() {

        do {

            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|----------------------------- EMPRESA -----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrarse");
            System.out.println("    2. Iniciar Sesi�n");
            System.out.println("    0. Salir");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opci�n: ");
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");

            switch (menu) {

                case 1 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- REGISTRARSE ----------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    register = new RegisterController();
                    register.registerForm();
                }
                case 2 -> {                    
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------- INICIAR SESI�N --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    login = new LoginController();
                    login.loginForm();
                }
                case 0 -> {
                    System.out.println("|----- �Hasta Pronto! ...");
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