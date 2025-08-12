package views.modules.roles;

import java.util.Scanner;

public class RolCreateView {
    
    private Scanner sc = new Scanner(System.in);
    
    public int getRolId() {        
        System.out.print("|----- Id  : ");
        return sc.nextInt();
    }

    public String getRolName() {
        System.out.print("|----- Rol : ");
        return sc.nextLine();
    }
    
}
