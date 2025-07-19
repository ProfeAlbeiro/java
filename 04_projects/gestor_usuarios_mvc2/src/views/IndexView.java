package views;

import controllers.Login;

import java.util.Scanner;

public class IndexView {
    public void menuEmpresa(){
        int option;              
        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("|-------------------------------------|");
            System.out.println("|-------------- EMPRESA --------------|");
            System.out.println("|-------------------------------------|");
            System.out.println("| 1. Iniciar Sesi�n");
            System.out.println("| 2. Registrarse");
            System.out.println("| 3. Salir");
            System.out.println("|-------------------------------------|");
            System.out.print("| Seleccione una opci�n: ");
            option = sc.nextInt();
            sc.nextLine();        
            System.out.println("|-------------------------------------|\n"); 
            
            switch (option) {
                case 1:                    
                    Login login = new Login();
                    login.iniciarSesion();
                    break;
                case 2:
                    System.out.println("Opci�n de Registro");
                    break;
                case 3:
                    System.out.println("Hasta Pronto ... \n");
                    break;
                default:
                    System.out.println("Opci�n No V�lida\n");
                    option = 0;
            }
        } while (option == 0);        
        
    }
}
