package controllers;

import views.landing.RegisterFormView;

public class RegisterController {
    
    private String name, lastname, email, pass, passConfirm;
    private RegisterFormView registerFormView;
    
    public void registerForm(){        
        
        registerFormView = new RegisterFormView();
        
        name = registerFormView.getUserName();
        lastname = registerFormView.getUserLastName();
        email = registerFormView.getUserEmail();
        System.out.println("|-------------------------------------------------------------------|");
        do {            
            pass = registerFormView.getUserPass();
            passConfirm = registerFormView.getUserPassConfirm();
            if (!pass.equals(passConfirm)) {
                System.out.println("|-------------------------------------------------------------------|");
                System.out.println("|----- Las contrase�as no coinciden. �Dig�talas nuevamente!");                
                System.out.println("|-------------------------------------------------------------------|");
            }
        } while (!pass.equals(passConfirm));
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("|----- �Usuario Registrado Exit�samente!");
        System.out.println("|-------------------------------------------------------------------|");
        
    }
    
}