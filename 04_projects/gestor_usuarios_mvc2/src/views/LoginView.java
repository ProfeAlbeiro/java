package views;

import java.util.Scanner;

public class LoginView {

    private Scanner scanner = new Scanner(System.in);

    public String pedirEmail() {
        System.out.print("Ingrese su correo electrónico: ");
        return scanner.nextLine();
    }

    public String pedirContrasena() {
        System.out.print("Ingrese su contraseña: ");
        return scanner.nextLine();
    }
}
