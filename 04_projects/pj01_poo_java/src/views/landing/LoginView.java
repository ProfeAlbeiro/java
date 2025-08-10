package views.landing;

import java.util.Scanner;

public class LoginView {
    
    private Scanner sc = new Scanner(System.in);
    
    public LoginView() {
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|------------------------- INICIAR SESIÓN --------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
    }
    
    public String getEmail(){
        System.out.print("|----- Usuario    : ");
        return sc.nextLine();
    }
    
    public String getPass() {
        System.out.print("|----- Contraseña : ");
        return sc.nextLine();
    }
    
}