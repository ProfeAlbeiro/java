package views.modules.users;

import models.RolModel;
import java.util.Scanner;

public class UsersMenuView {

    private int menu;
    private Scanner sc = new Scanner(System.in);

    public UsersMenuView() {

        do {

            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|---------------------------- USUARIOS -----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrar Usuario");
            System.out.println("    2. Listar Usuarios");
            System.out.println("    3. Consultar Usuario");
            System.out.println("    4. Actualizar Usuario");
            System.out.println("    5. Eliminar Usuario");
            System.out.println("    0. Volver");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opción : ");
            menu = sc.nextInt();
            System.out.println("|-------------------------------------------------------------------|");

            switch (menu) {

                case 1:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- REGISTRAR USUARIO -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 2:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ LISTAR USUARIOS --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 3:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- CONSULTAR USUARIO -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 4:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- ACTUALIZAR USUARIO ------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 5:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ ELIMINAR USUARIO -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("|----- ¡Opción No válida!");
                    System.out.println("|-------------------------------------------------------------------|");

            }

        } while (menu != 0);

    }

}