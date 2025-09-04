package views.landing;

import java.util.Scanner;

public class LoginView {
    
    Scanner sc = new Scanner(System.in);    

    public String getUserEmail() {
        System.out.print("|----- Email: ");
        return sc.next();
    }
    
    public String getUserPass() {
        System.out.print("|----- Contraseña: ");
        return sc.next();
    }
    
}