package views.modules.roles;

import java.util.Scanner;

public class RolesFormView {

    Scanner sc = new Scanner(System.in);    

    public int getRolId() {
        System.out.print("|----- Rol Id: ");
        return sc.nextInt();
    }
    
    public String getRolName() {
        System.out.print("|----- Nombre: ");
        return sc.next();
    }
    
}