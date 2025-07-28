package controllers;

import views.roles.admin.AdminView;

public class Dashboard {    
    
    private AdminView dashboardView;
    
    public Dashboard(){        
    }

    public Dashboard(Roles roles, Users users) {        
        dashboardView = new AdminView(roles,users);
        dashboardView.menuDashboard();
    }
}