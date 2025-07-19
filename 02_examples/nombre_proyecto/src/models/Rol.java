package models;

public class Rol {
    
    // Atributos
    private int rol_id;
    private String rol_name;    

    // Sobrecarga de Constructores
    public Rol() {}

    public Rol(int rol_id, String rol_name) {
        this.rol_id = rol_id;
        this.rol_name = rol_name;
    }
    
    // Métodos setter y getter
    public int getRol_id() {
        return rol_id;
    }    
    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }
    public String getRol_name() {
        return rol_name;
    }
    public void setRol_name(String rol_name) {
        this.rol_name = rol_name;
    }
    
}
