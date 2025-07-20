package views;

import java.util.Scanner;

public class RegisterView {

    private Scanner sc = new Scanner(System.in);

    public String pedirNombre() {
        System.out.println("|-------------------------------------|");
        System.out.println("|------------ REGISTRARSE ------------|");
        System.out.println("|-------------------------------------|");
        System.out.print("|- Nombres: ");
        return sc.nextLine();
    }

    public String pedirApellido() {
        System.out.print("|- Apellidos: ");
        return sc.nextLine();
    }

    public String pedirEmail() {
        System.out.print("|- Email: ");
        return sc.nextLine();
    }

    public String pedirContrasena() {
        System.out.print("|- Contraseña: ");
        return sc.nextLine();
    }
}