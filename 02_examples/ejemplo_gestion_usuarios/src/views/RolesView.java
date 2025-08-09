package views;
import models.Rol;
import java.util.Scanner;
public class RolesView {    
    private Scanner sc = new Scanner(System.in);    
    public void menuRoles(){ 
        int menuRoles, rolId;
        String rolName;
        do {            
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------- GESTIÓN ROLES ---------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|- 1. Registrar Rol");
            System.out.println("|- 2. Listar Roles");
            System.out.println("|- 3. Actualizar Rol");
            System.out.println("|- 4. Eliminar Rol");
            System.out.println("|- 0. Volver");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|- Seleccione una opción: ");
            menuRoles = sc.nextInt();
            System.out.println("|-------------------------------------------------------------------|");            
            switch (menuRoles) {
                case 1:
                    System.out.println("|- Registrar Rol -|");
                    System.out.print("|- Id: ");
                    rolId = sc.nextInt();
                    System.out.print("|- Rol: ");
                    rolName = sc.next();
                    sc.nextLine();
                    // 1. Por métodos setter y getter
//                    Rol rol = new Rol();
//                    rol.setRolId(rolId);
//                    rol.setRolName(rolName);
//                    System.out.println("|- Id Registrado: " + rol.getRolId());
//                    System.out.println("|- Nombre Registrado: " + rol.getRolName());
//                    System.out.println("|-------------------------------------------------------------------|");            
                    // 2. Por el Constructor
                    Rol rol = new Rol(rolId,rolName);
                    System.out.println("|- Id Registrado: " + rol.getRolId());
                    System.out.println("|- Nombre Registrado: " + rol.getRolName());
                    
                    break;
                case 2:
                    System.out.println("|- Listar Roles -|");
                    break;
                case 3:
                    System.out.println("|- Actualizar Rol -|");
                    break;
                case 4:
                    System.out.println("|- Eliminar Rol -|");
                    break;
                case 0:                    
                    break;
                default:
                    System.out.println("|- ¡Opción NO Válida!");
                    System.out.println("|-------------------------------------------------------------------|");
            }            
        } while (menuRoles != 0);
    }    
}
