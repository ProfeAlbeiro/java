package controllers;

import views.landing.RegisterFormView;

public class RegisterController {
    
    private String name, lastname, email, pass, passConfirm;
    private RegisterFormView registerView;
    
    public void registerForm(){        
        
        registerView = new RegisterFormView();
        
        name = registerView.getUserName();
        lastname = registerView.getUserLastName();
        email = registerView.getUserEmail();
        System.out.println("|-------------------------------------------------------------------|");
        do {            
            pass = registerView.getUserPass();
            passConfirm = registerView.getUserPassConfirm();
            if (!pass.equals(passConfirm)) {
                System.out.println("|-------------------------------------------------------------------|");
                System.out.println("|----- Las contraseñas no coinciden. ¡Digítalas nuevamente!");                
                System.out.println("|-------------------------------------------------------------------|");
            }
        } while (!pass.equals(passConfirm));
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("|----- ¡Usuario Registrado Exitósamente");
        System.out.println("|-------------------------------------------------------------------|");
        
    }
    
}