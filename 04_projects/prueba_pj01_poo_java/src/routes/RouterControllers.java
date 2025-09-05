package routes;

import controllers.UsersController;

public class RouterControllers {

    private UsersController usersController;
    
    public RouterControllers() {
        
        usersController = new UsersController();
        usersController.usersMenu();
        
    }
    
}