package views.modules.roles;

import java.util.Scanner;

public class RolCreateView {
    
    private Scanner sc = new Scanner(System.in);
    
    public String getRolId() {        
        System.out.print("|----- Id  : ");
        return sc.nextLine();
    }

    public String getRolName() {
        System.out.print("|----- Rol : ");
        return sc.nextLine();
    }
    
}
