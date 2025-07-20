package controllers;

import views.DashboardView;

public class Dashboard {    
    
    
    private DashboardView dashboardView;

    public Dashboard() {
        dashboardView = new DashboardView();        
        dashboardView.menuDashboard();
    }
}