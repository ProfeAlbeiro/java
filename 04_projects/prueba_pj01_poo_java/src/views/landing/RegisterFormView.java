package views.landing;

import java.util.Scanner;

public class RegisterFormView {
    
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
        System.out.print("|----- Contrase�a: ");
        return sc.next();
    }
    
    public String getUserPassConfirm(){
        System.out.print("|----- Confirmaci�n: ");
        return sc.next();
    }
    
}