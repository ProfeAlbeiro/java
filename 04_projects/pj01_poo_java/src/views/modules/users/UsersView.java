package views.modules.users;

import models.RolModel;
import models.UserModel;
import controllers.RolesController;
import controllers.UsersController;
import java.util.Scanner;

public class UsersView {

    private int menu;
    private RolModel rol = new RolModel();
    private UserModel user = new UserModel();
    private RolesController roles = new RolesController();
    private UsersController users = new UsersController();
    private Scanner sc = new Scanner(System.in);
    
    public UsersView(){        
    }
    
    public UsersView(RolesController roles, UsersController users){
        this.roles = roles;
        this.users = users;
    }
    
    public void usersMenuView() {

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

                case 1 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- REGISTRAR USUARIO -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    RolModel rolFound = roles.searchRolById();
                    System.out.println("|-------------------------------------------------------------------|");
                    if (rolFound != null) {
                        users.addUser(rolFound);
                        System.out.println("|-------------------------------------------------------------------|");
                        System.out.println("|----- ¡Usuario Creado!");
                    } else {
                        System.out.println("|----- ¡Rol No Encontrado!");
                    }
                    System.out.println("|-------------------------------------------------------------------|");                    
                }
                case 2 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ LISTAR USUARIOS --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    users.getUsers();
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 3 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- CONSULTAR USUARIO -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    UserModel userFound = users.searchUserById();
                    System.out.println("|-------------------------------------------------------------------|");
                    if (userFound != null) {
                        System.out.println("|----- " + userFound.toString());
                    } else {
                        System.out.println("|----- ¡Usuario No Encontrado!");
                    }
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
                    System.out.println("|----- ¡Opción No Válida!");
                    System.out.println("|-------------------------------------------------------------------|");
                }

            }

        } while (menu != 0);

    }

}