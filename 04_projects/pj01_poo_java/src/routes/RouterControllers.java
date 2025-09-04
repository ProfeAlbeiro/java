package routes;

import controllers.LandingController;

public class RouterControllers {

    private LandingController landingController;
    
    public RouterControllers() {
        
        landingController = new LandingController();
        landingController.landingMenu();
        
    }
    
}