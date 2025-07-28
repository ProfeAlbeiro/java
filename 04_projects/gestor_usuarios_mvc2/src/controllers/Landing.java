package controllers;

import views.company.IndexView;

public class Landing {    
    
    private IndexView landingView;
    
    public Landing(){
        landingView = new IndexView();
        landingView.menuEmpresa();
    }
    
}
