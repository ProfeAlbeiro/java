package views.modules.users;

import controllers.RolesController;
import controllers.UsersController;
import models.RolModel;
import models.UserModel;
import java.util.Scanner;

public class UsersView {

    private int menu, rolId, userId;
    private String userName, userLastName, userEmail, userPass;
    private boolean userState;    
    private UsersFormView usersFormView = new UsersFormView();
    private RolesController roles = new RolesController();
    private UsersController users = new UsersController();
    private RolModel rol = new RolModel();
    private UserModel user;
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
                    userId = users.getUsers().size() + 1;
                    userName = usersFormView.getUserName();
                    userLastName = usersFormView.getUserLastName();
                    userEmail = usersFormView.getUserEmail();
                    userPass = usersFormView.getUserPass();
                    userState = usersFormView.getUserState();
                    rolId = usersFormView.getUserRolId();
                    rol = roles.searchRolById(rolId);
                    System.out.println("|-------------------------------------------------------------------|");
                    if (rol != null) {
                        user = new UserModel(userId, userName, userLastName, userEmail, userPass, userState, rol);
                        users.addUser(user);
                        System.out.println("|----- ¡Usuario creado!");
                    } else {
                        System.out.println("|----- ¡Rol No Encontrado!");
                    }
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 2 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|------------------------ LISTAR USUARIOS --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    for (UserModel getUser : users.getUsers()){
                        System.out.println("|----- " + getUser);
                    }
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 3 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|----------------------- CONSULTAR USUARIO -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    userId = usersFormView.getUserId();
                    System.out.println("|-------------------------------------------------------------------|");
                    if (users.searchUserById(userId) != null) {
                        user = users.searchUserById(userId);
                        System.out.println("|----- " + user);
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