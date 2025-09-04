package controllers;

import views.landing.RegisterView;

public class RegisterController {
    
    private String name, lastname, email, pass, passConfirm;
    private RegisterView registerView;
    
    public void registerMenu(){        
        
        registerView = new RegisterView();
        
        name = registerView.getUserName();
        lastname = registerView.getUserLastName();
        email = registerView.getUserEmail();
        System.out.println("|-------------------------------------------------------------------|");
        do {            
            pass = registerView.getUserPass();
            passConfirm = registerView.getUserPassConfirm();
            if (!pass.equals(passConfirm)) {
                System.out.println("|-------------------------------------------------------------------|");
                System.out.println("|----- Las contrase�as no coinciden. �Dig�talas nuevamente!");                
                System.out.println("|-------------------------------------------------------------------|");
            }
        } while (!pass.equals(passConfirm));
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("|----- �Usuario Registrado Exit�samente");
        System.out.println("|-------------------------------------------------------------------|");
        
    }
    
}