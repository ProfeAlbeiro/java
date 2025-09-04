package views.modules.users;

import java.util.Scanner;

public class UsersFormView {
    
    Scanner sc = new Scanner(System.in);
  
    public int getUserId(){
        System.out.print("|----- Usuario Id: ");
        return sc.nextInt();
    }
    
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
    
    public boolean getUserState(){
        System.out.print("|----- Estado (true = activo / false = inactivo): ");
        return sc.nextBoolean();
    }
    
    public int getUserRolId(){
        System.out.print("|----- Rol Id: ");
        return sc.nextInt();
    }
    
}