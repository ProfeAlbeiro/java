package views;

import java.util.Scanner;
import controllers.Users;
import controllers.Roles;
import controllers.Logout;

public class DashboardView {
    
    private Scanner sc = new Scanner(System.in);
     
    public void menuDashboard(){
        int opcion;
        
        do {
            System.out.println("|-------------------------------------|");
            System.out.println("|------------- DASHBOARD -------------|");
            System.out.println("|-------------------------------------|");            
            System.out.println("|- 1. Gestión de Usuarios");
            System.out.println("|- 2. Gestión de Roles");
            System.out.println("|- 0. Cerrar Sesión");
            System.out.print("|- Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Users usersManage = new Users();
                    break;
                case 2:
                    Roles rolesManage = new Roles();
                    break;
                case 0:
                    Logout logout = new Logout();                    
                    break;
                default:
                    System.out.println("Opción NO Válida.");
            }
        } while (opcion != 0);
    }
}
