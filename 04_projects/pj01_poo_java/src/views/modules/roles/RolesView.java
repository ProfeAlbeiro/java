package views.modules.roles;

import models.RolModel;
import controllers.RolesController;
import java.util.Scanner;

public class RolesView {
    
    private int menu, rolId;
    private String rolName;
    private RolesFormView rolesFormView = new RolesFormView();
    private RolesController roles = new RolesController();
    private RolModel rol = new RolModel();
    private Scanner sc = new Scanner(System.in);
    
    public RolesView(){        
    }
    
    public RolesView(RolesController roles){
        this.roles = roles;
    }
    
    public void rolesMenuView() {        
        
        do {
            
            System.out.println("\n|-------------------------------------------------------------------|");
            System.out.println("|------------------------ GESTIÓN DE ROLES -------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("    1. Registrar Rol");
            System.out.println("    2. Listar Roles");
            System.out.println("    3. Consultar Rol");
            System.out.println("    4. Actualizar Rol");
            System.out.println("    5. Eliminar Rol");
            System.out.println("    0. Volver");
            System.out.println("|-------------------------------------------------------------------|");
            System.out.print("|----- Seleccione una opción : ");
            menu = sc.nextInt();            
            System.out.println("|-------------------------------------------------------------------|");
            
            switch (menu) {

                case 1 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- REGISTRAR ROL --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");                    
                    rolId = roles.getRoles().size() + 1;
                    rolName = rolesFormView.getRolName();
                    roles.addRol(new RolModel(rolId, rolName));
                    System.out.println("|-------------------------------------------------------------------|");
                    System.out.println("|----- ¡Rol creado!");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 2 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- LISTAR ROLES ---------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    for (RolModel getRol : roles.getRoles()) {
                        System.out.println("|-- " + getRol);
                    }
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 3 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- CONSULTAR ROL --------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    rolId = rolesFormView.getRolId();                    
                    System.out.println("|-------------------------------------------------------------------|");
                    if (roles.searchRolById(rolId) != null) {
                        rol = roles.searchRolById(rolId);
                        System.out.println("|-----      " + rol);                                            
                    } else {
                        System.out.println("|---- ¡Rol No Encontrado!");
                    }                    
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 4 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- ACTUALIZAR ROL -------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    rolId = rolesFormView.getRolId();
                    if (roles.searchRolById(rolId) != null) {
                        rolName = rolesFormView.getRolName();
                        System.out.println("|-------------------------------------------------------------------|");
                        roles.updateRol(rolId, rolName);
                        System.out.println("|---- ¡Rol Actualizado!");
                    } else {
                        System.out.println("|-------------------------------------------------------------------|");
                        System.out.println("|---- ¡Rol No Encontrado!");
                    }
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 5 -> {
                    System.out.println("\n|-------------------------------------------------------------------|");
                    System.out.println("|-------------------------- ELIMINAR ROL ---------------------------|");
                    System.out.println("|-------------------------------------------------------------------|");
                    rolId = rolesFormView.getRolId();
                    System.out.println("|-------------------------------------------------------------------|");
                    if (roles.deleteRol(rolId)) {
                        System.out.println("|---- ¡Rol Eliminado!");
                    } else {
                        System.out.println("|---- ¡Rol No Encontrado!");
                    }
                    System.out.println("|-------------------------------------------------------------------|");
                }
                case 0 -> {}
                default -> {
                    System.out.println("|----- ¡Opción No Válida!");
                    System.out.println("|-------------------------------------------------------------------|");
                }
                    
            }
            
        } while (menu != 0);
        
    }
    
}