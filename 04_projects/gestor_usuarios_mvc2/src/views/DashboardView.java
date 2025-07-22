package views;

import java.util.Scanner;
import controllers.Users;
import controllers.Roles;
import controllers.Logout;

public class DashboardView {
    
    private Scanner sc = new Scanner(System.in);
     
    public void menuDashboard(){
    
        int menuDash;
        
        do {
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|---------------------- DASHBOARD ----------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|- 1. Gestión de Roles");
            System.out.println("|- 2. Gestión de Usuarios");
            System.out.println("|- 0. Cerrar Sesión");
            System.out.println("|-------------------------------------------------------|");
            System.out.print("|- Seleccione una opción: ");
            menuDash = sc.nextInt();
            System.out.println("|-------------------------------------------------------|\n");

            switch (menuDash) {
                case 1:                    
                    Roles rolesManage = new Roles();
                    rolesManage.indexRoles();
                    break;
                case 2:
                    Users usersManage = new Users();
                    usersManage.indexUsers();                    
                    break;
                case 0:
                    Logout logout = new Logout();                    
                    break;
                default:
                    System.out.println("|- ¡Opción NO Válida!");
            }
        } while (menuDash != 0);
    }
}
