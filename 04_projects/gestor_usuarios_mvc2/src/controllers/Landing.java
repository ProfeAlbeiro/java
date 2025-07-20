package controllers;
import views.IndexView;
public class Landing {    
    
    public static void main(String[] args) {
        // Crear objeto para cargar la vista inicial (Empresa)
        IndexView vistaInicial = new IndexView();
        vistaInicial.menuEmpresa();
    }
}
