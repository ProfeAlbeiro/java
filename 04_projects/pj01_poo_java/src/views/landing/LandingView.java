package views.landing;

import controllers.LoginController;
import java.util.Scanner;

public class LandingView {
    
    private int menu;
    private Scanner sc = new Scanner(System.in);
    
    public LandingView() {
        
        do {
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|----------------------------- EMPRESA -----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Iniciar Sesi�n");
            System.out.println("    2. Registrarse");
            System.out.println("    0. Salir");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opci�n : ");
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");
            
            switch (menu) {
                case 1:
                    LoginController login = new LoginController();
                    break;
                case 2:                    
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|--------------------------- REGISTRARSE ---------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 0:
                    System.out.println("|----- �Hasta Pronto! ...");
                    System.out.println("|-------------------------------------------------------------------|");        
                    break;
                default:
                    System.out.println("|----- �Opci�n No V�lida!");
                    System.out.println("|-------------------------------------------------------------------|");                    
            }
            
        } while (menu != 0);
    }
    
}