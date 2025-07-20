package views;

import controllers.Login;
import controllers.Register;

import java.util.Scanner;

public class IndexView {
    public void menuEmpresa(){
        
        // Variable para la opci�n y objeto para ingreso de datos
        int menuEmp; 
        Scanner sc = new Scanner(System.in);
        
        // Muestra el Men� para iniciar sesi�n o registrarse
        System.out.println("|-------------------------------------|");
        System.out.println("|-------------- EMPRESA --------------|");
        System.out.println("|-------------------------------------|");
        System.out.println("| 1. Iniciar Sesi�n");
        System.out.println("| 2. Registrarse");
        System.out.println("| 3. Salir");
        System.out.println("|-------------------------------------|");
        System.out.print("| Seleccione una opci�n: ");
        menuEmp = sc.nextInt();
        sc.nextLine();        
        System.out.println("|-------------------------------------|\n"); 
        
        // Seg�n la opci�n, crea un objeto a partir del controlador
        switch (menuEmp) {
            case 1:                    
                Login login = new Login();                
                break;
            case 2:
                Register register = new Register();
                register.registrarUsuario();
                break;
            case 3:
                System.out.println("Hasta Pronto ... \n");
                break;
            default:
                System.out.println("Opci�n No V�lida\n");
                menuEmp = 0;
        }
        
    }
}
