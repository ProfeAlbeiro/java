package views;

import controllers.Login;
import controllers.Register;

import java.util.Scanner;

public class IndexView {
    public void menuEmpresa(){
        
        // Variable para la opción y objeto para ingreso de datos
        int menuEmp; 
        Scanner sc = new Scanner(System.in);
        
        // Muestra el Menú para iniciar sesión o registrarse
        System.out.println("|-------------------------------------|");
        System.out.println("|-------------- EMPRESA --------------|");
        System.out.println("|-------------------------------------|");
        System.out.println("| 1. Iniciar Sesión");
        System.out.println("| 2. Registrarse");
        System.out.println("| 3. Salir");
        System.out.println("|-------------------------------------|");
        System.out.print("| Seleccione una opción: ");
        menuEmp = sc.nextInt();
        sc.nextLine();        
        System.out.println("|-------------------------------------|\n"); 
        
        // Según la opción, crea un objeto a partir del controlador
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
                System.out.println("Opción No Válida\n");
                menuEmp = 0;
        }
        
    }
}
