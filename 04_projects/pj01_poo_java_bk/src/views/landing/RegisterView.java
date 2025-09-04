package views.landing;

import java.util.Scanner;

public class RegisterView {
    
    Scanner sc = new Scanner(System.in);
    
    
    public String getUserName(){
        System.out.print("|----- Nombre: ");
        return sc.next();
    }
    
    public String getUserLastName(){
        System.out.print("|----- Apellido: ");
        return sc.next();
    }
    
    public String getUserEmail(){
        System.out.print("|----- Correo: ");
        return sc.next();
    }
    
    public String getUserPass(){
        System.out.print("|----- Contraseña: ");
        return sc.next();
    }
    
    public String getUserPassConfirm(){
        System.out.print("|----- Confirmación: ");
        return sc.next();
    }
    
}