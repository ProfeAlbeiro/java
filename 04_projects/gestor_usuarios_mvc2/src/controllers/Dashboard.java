package controllers;

import views.DashboardView;

public class Dashboard {    
    
    private DashboardView dashboardView;    

    public Dashboard(Roles roles, Users users) {        
        dashboardView = new DashboardView();
        dashboardView.menuDashboard(roles,users);
    }
}