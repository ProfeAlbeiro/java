package views.modules.roles;

import java.util.Scanner;

public class RolesView {
    
    private int menu;
    private Scanner sc = new Scanner(System.in);

    public RolesView() {
        
        do {
            
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------ GESTIÓN DE ROLES -------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrar Rol");
            System.out.println("    2. Listar Roles");
            System.out.println("    3. Actualizar Rol");
            System.out.println("    4. Eliminar Rol");
            System.out.println("    0. Cerrar Sesión");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opción : ");
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");
            
            switch (menu) {
                
                case 1:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------- REGISTRAR ROL ---------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    RolCreateView rol = new RolCreateView();
                    String rolId = rol.getRolId();
                    String rolName = rol.getRolName();                    
                    break;
                case 2:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------- LISTAR ROLES ----------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 3:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------- ACTUALIZAR ROL --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 4:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- ELIMINAR ROL ---------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 0:
                    System.out.println("|----- ¡Sesión Cerrada! ...");
                    System.out.println("|-------------------------------------------------------------------|");        
                    break;
                default:
                    System.out.println("|----- ¡Opción No Válida!");
                    System.out.println("|-------------------------------------------------------------------|");
                    
            }
            
        } while (menu != 0);
        
    }
    
}