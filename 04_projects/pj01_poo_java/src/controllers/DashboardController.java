package controllers;

import views.dashboard.DashboardView;

public class DashboardController {
    
    private DashboardView dashboardView;

    public void dashboardMenu() {
        
        dashboardView = new DashboardView();
        dashboardView.dashboardMenuView();
        
    }
    
}