package views;

import java.util.Scanner;

public class LoginView {
    // Crear objeto para ingreso de datos
    private Scanner sc = new Scanner(System.in);

    public String pedirEmail() {
        System.out.println("\n|-------------------------------------------------------------------|");
        System.out.println("|------------------------------ LOGIN ------------------------------|");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.print("|- Usuario: ");
        return sc.nextLine();
    }

    public String pedirContrasena() {
        System.out.print("|- Contraseña: ");        
        return sc.nextLine();
    }
}
