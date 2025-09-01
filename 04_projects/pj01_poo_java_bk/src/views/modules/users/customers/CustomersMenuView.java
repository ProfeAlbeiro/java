package views.modules.users.customers;

import java.util.Scanner;

public class CustomersMenuView {

    private int menu;
    private Scanner sc = new Scanner(System.in);

    public CustomersMenuView() {

        do {

            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|---------------------------- CLIENTES -----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrar Cliente");
            System.out.println("    2. Listar Clientes");
            System.out.println("    3. Consultar Cliente");
            System.out.println("    4. Actualizar Cliente");
            System.out.println("    5. Eliminar Cliente");
            System.out.println("    0. Volver");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opción : ");
            menu = sc.nextInt();
            System.out.println("|-------------------------------------------------------------------|");

            switch (menu) {

                case 1:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- REGISTRAR CLIENTE -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 2:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ LISTAR CLIENTES --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 3:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- CONSULTAR CLIENTE -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 4:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- ACTUALIZAR CLIENTE ------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 5:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ ELIMINAR CLIENTE -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("|----- ¡Opción No Válida!");
                    System.out.println("|-------------------------------------------------------------------|");

            }

        } while (menu != 0);

    }

}