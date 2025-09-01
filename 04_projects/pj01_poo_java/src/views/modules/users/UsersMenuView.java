package views.modules.users;

import models.RolModel;
import models.UserModel;
import controllers.UsersController;
import java.util.Scanner;

public class UsersMenuView {

    private int menu, rolId, userId;
    private String userName, userLastName, userEmail, userPass;
    private boolean userState;
    private UsersFormView usersFormView = new UsersFormView();
    private UsersController users = new UsersController();
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
            System.out.print("|----- Seleccione una opci�n : ");
            menu = sc.nextInt();
            System.out.println("|-------------------------------------------------------------------|");

            switch (menu) {

                case 1 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- REGISTRAR USUARIO -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    userId = users.getUsers().size() + 1;
                    userName = usersFormView.getUserName();
                    userLastName = usersFormView.getUserLastName();
                    userEmail = usersFormView.getUserEmail();
                    userPass = usersFormView.getUserPass();
                    userState = usersFormView.getUserState();
                }
                case 2 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ LISTAR USUARIOS --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 3 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- CONSULTAR USUARIO -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 4 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- ACTUALIZAR USUARIO ------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 5 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ ELIMINAR USUARIO -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 0 -> {
                }
                default -> {
                    System.out.println("|----- �Opci�n No v�lida!");
                    System.out.println("|-------------------------------------------------------------------|");
                }

            }

        } while (menu != 0);

    }

}