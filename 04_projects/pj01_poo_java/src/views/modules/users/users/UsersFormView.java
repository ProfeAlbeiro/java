package views.modules.users.users;

import java.util.Scanner;

public class UsersFormView {
    
    Scanner sc = new Scanner(System.in);
    
    public int getUserId(){
        System.out.print("|----- Id:     ");
        return sc.nextInt();
    }
    
    public String getUserName() {
        System.out.print("|----- Nombre: ");
        return sc.next();
    }
    
    public String getUserLastName(){
        System.out.print("|----- Apellidos: ");
        return sc.next();
    }
    
}