package views;

import models.Rol;
import models.User;
import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        int menu;
        Scanner ent = new Scanner(System.in);
        
        System.out.println("----------- MEN� -----------");
        System.out.println("1. Iniciar Sesi�n");
        System.out.println("2. Crear Rol");
        System.out.println("3. Crear Usuario");
        System.out.print("Digite una opci�n: ");
        menu = ent.nextInt();
        
        switch (menu) {
            case 1:
                // Usuario: Constructor de 2 par�metros
                User userLogin = new User("pepito@pepito.com", "12345");                
                System.out.println("El Usuario es: " + userLogin.getUser_email());
                System.out.println("Su contrase�a es: " + userLogin.getUser_pass());
                break;
            case 2:
                // Rol: Con m�todos setter y getter
                Rol rol = new Rol();
                rol.setRol_id(1);
                rol.setRol_name("admin");
                System.out.println("Rol Id: " + rol.getRol_id());
                System.out.println("Rol Nombre: " + rol.getRol_name());
                break;
            case 3:
                // Usuario: Constructor de 7 par�metros
                User user = new User(1,5,"Pepito","Perez","pepito@pepito.com", "12345", true);
                System.out.println("Rol Id: " + user.getRol_id());
                System.out.println("Usuario Id: " + user.getUser_id());
                System.out.println("Usuario Nombre: " + user.getUser_name());
                System.out.println("Usuario Apellido: " + user.getUser_lastname());
                System.out.println("Usuario Email: " + user.getUser_email());
                System.out.println("Usuario Contrase�a: " + user.getUser_pass());
                System.out.println("Usuario Activo?: " + user.getUser_state());
                break;
            default:
                System.out.println("Opci�n no v�lida");;
        }
    }    
}
