package routes;

import controllers.DashboardController;

public class RouterControllers {

    private DashboardController dashboardController;
    
    public RouterControllers() {
        
        dashboardController = new DashboardController();
        dashboardController.dashboardMenu();
        
    }
    
}