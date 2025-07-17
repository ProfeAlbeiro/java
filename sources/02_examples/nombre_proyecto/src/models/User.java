package models;

public class User {
    
    // Atributos: Encapsulados ( - )
    private int rol_id;
    private int user_id;
    private String user_name;
    private String user_lastname;
    private String user_email;
    private String user_pass;
    private boolean user_state;

    // Sobrecarga de Constructores
    
    // Constructor: 0 Parámetros
    public User() {
    }
    // Constructor: 2 Parámetros
    public User(String user_email, String user_pass) {
        this.user_email = user_email;
        this.user_pass = user_pass;
    }
    // Constructuctor: 7 parámetros
    public User(int rol_id, int user_id, String user_name, String user_lastname, String user_email, String user_pass, boolean user_state) {
        this.rol_id = rol_id;
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_lastname = user_lastname;
        this.user_email = user_email;
        this.user_pass = user_pass;
        this.user_state = user_state;
    }   
    
    // Métodos Setter y Getter
    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public boolean getUser_state() {
        return user_state;
    }

    public void setUser_state(boolean user_state) {
        this.user_state = user_state;
    }
}
