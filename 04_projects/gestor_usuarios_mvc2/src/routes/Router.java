package routes;

import controllers.Landing;
import controllers.Login;
import controllers.Register;
import controllers.Dashboard;
import controllers.Roles;
import controllers.Users;

public class Router {
    private String controller;
    private Roles roles;
    private Users users;
    
    public Router(){
        Landing landing = new Landing();
    }
    
    public Router(String controller){
        this.controller = controller;
        routerController();
    }
    
    public Router(String controller, Roles roles, Users users){
        this.controller = controller;
        this.roles = roles;
        this.users = users;
        routerController();
    }
    
    public String getController(){        
        return controller;
    }
    
    public void routerController(){
        if (getController().equals("Login")) {
            Login login = new Login();
        } else if(getController().equals("Register")){
            Register register = new Register();
            register.registrarUsuario();
        } else if(getController().equals("Dashboard")){
            Dashboard dashboard = new Dashboard(roles, users);
        }
    }
}
