package views.roles.admin;

import java.util.Scanner;
import controllers.Users;
import controllers.Roles;
import controllers.Logout;

public class AdminView {
    
    private Scanner sc = new Scanner(System.in);    
    private Roles roles = new Roles();
    private Users users = new Users();
    
    public AdminView(){        
    }
    
    public AdminView(Roles roles, Users users){
        this.roles = roles;
        this.users = users;        
    }
    
    public void menuDashboard(){
        
        int menuDash;
        
        do {
            System.out.println("\n�Bienvenido " + users.searchUserById(1).getFullName()+ "!");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------------------------- DASHBOARD ----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|- 1. Gesti�n de Roles");
            System.out.println("|- 2. Gesti�n de Usuarios");
            System.out.println("|- 0. Cerrar Sesi�n");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|- Seleccione una opci�n: ");
            menuDash = sc.nextInt();
            System.out.println("|-------------------------------------------------------------------|");

            switch (menuDash) {
                case 1:                    
                    Roles rolesManage = new Roles();
                    rolesManage.indexRoles(roles);
                    break;
                case 2:
                    Users usersManage = new Users();
                    usersManage.indexUsers(roles, users);
                    break;
                case 0:
                    Logout logout = new Logout();                    
                    break;
                default:                    
                    System.out.println("|- �Opci�n NO V�lida!");
                    System.out.println("|-------------------------------------------------------------------|");
            }
        } while (menuDash != 0);
    }
}
