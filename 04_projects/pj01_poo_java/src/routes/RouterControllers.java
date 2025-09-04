package routes;

import controllers.RegisterController;

public class RouterControllers {

    private RegisterController registerController;
    
    public RouterControllers() {
        
        registerController = new RegisterController();
        registerController.registerMenu();
        
    }
    
}