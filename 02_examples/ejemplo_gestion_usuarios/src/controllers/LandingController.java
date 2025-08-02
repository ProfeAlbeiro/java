package controllers;

import views.LandingView;

public class LandingController {    
    
    private LandingView landingView;
    
    public LandingController(){
        landingView = new LandingView();
        landingView.menuLanding();
    }
}