package views.modules.users.users;

import models.RolModel;
import models.UserModel;
import models.CustomerModel;
import models.SellerModel;
import views.modules.users.users.UsersFormView;
import controllers.UsersController;
import java.util.Scanner;

public class UsersMenuView {

    private int menu, userId;
    private String userName, userLastName, userEmail, userPass;
    private boolean userState;
    private UsersFormView usersFormView = new UsersFormView();
    private RolModel rol = new RolModel();
    private UserModel user = new UserModel();
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
                    System.out.println("|----- ¡Opción No Válida!");
                    System.out.println("|-------------------------------------------------------------------|");

            }

        } while (menu != 0);

    }

}