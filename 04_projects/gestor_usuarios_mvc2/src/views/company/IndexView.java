package views.company;

import routes.Router;

import java.util.Scanner;

public class IndexView {
    
    private Router router;
    
    public void menuEmpresa(){
        
        int menuEmp;
        String controller = "";
        Scanner sc = new Scanner(System.in);
        
        do {
            
            // Muestra el Men� para iniciar sesi�n o registrarse
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|----------------------------- EMPRESA -----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("| 1. Iniciar Sesi�n");
            System.out.println("| 2. Registrarse");
            System.out.println("| 0. Salir");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|- Seleccione una opci�n: ");
            menuEmp = sc.nextInt();
            sc.nextLine();
            System.out.println("|-------------------------------------------------------------------|");

            // Seg�n la opci�n, crea un objeto a partir del controlador
            switch (menuEmp) {
                case 1:
                    router = new Router("Login");
                    break;
                case 2:
                    router = new Router("Register");
                    break;
                case 0:
                    System.out.println("|- �Hasta Pronto! ...");
                    System.out.println("|-------------------------------------------------------------------|");        
                    break;
                default:
                    System.out.println("|- �Opci�n No V�lida!");
                    System.out.println("|-------------------------------------------------------------------|");                    
            }            
        } while (menuEmp != 0);
    }
}
