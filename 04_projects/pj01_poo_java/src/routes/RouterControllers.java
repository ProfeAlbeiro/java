package routes;

import controllers.RolesController;

public class RouterControllers {

    private RolesController rolesController;
    
    public RouterControllers() {
        
        rolesController = new RolesController();
        rolesController.rolesMenu();
        
    }
    
}