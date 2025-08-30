package views.modules.users.sellers;

import java.util.Scanner;

public class SellersMenuView {

    private int menu;
    private Scanner sc = new Scanner(System.in);

    public SellersMenuView() {

        do {

            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|--------------------------- VENDEDORES ----------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrar Vendedor");
            System.out.println("    2. Listar Vendedores");
            System.out.println("    3. Consultar Vendedor");
            System.out.println("    4. Actualizar Vendedor");
            System.out.println("    5. Eliminar Vendedor");
            System.out.println("    0. Volver");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opción : ");
            menu = sc.nextInt();
            System.out.println("|-------------------------------------------------------------------|");

            switch (menu) {

                case 1:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|---------------------- REGISTRAR VENDEDOR -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 2:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- LISTAR VENDEDORES -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 3:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|---------------------- CONSULTAR VENDEDOR -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 4:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|---------------------- ACTUALIZAR VENDEDOR ------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    break;
                case 5:
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- ELIMINAR VENDEDOR -------------------------|");
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