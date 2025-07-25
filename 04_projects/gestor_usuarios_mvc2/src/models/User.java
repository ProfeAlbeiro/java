package models;

public class User {
    
    private int userId;
    private String userName;
    private String userLastName;
    private String userEmail;
    private String userPass;
    private boolean userState;
    private Rol rol;

    public User() {
    }

    public User(int userId, String userName, String userLastName, String userEmail, String userPass, boolean userState, Rol rol) {
        this.userId = userId;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userState = userState;
        this.rol = rol;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public boolean isUserState() {
        return userState;
    }

    public void setUserState(boolean userState) {
        this.userState = userState;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getFullName() {
        return userName + " " + userLastName;
    }
    
    @Override
    public String toString(){
        return userId + " - " + getFullName() + " - " + userEmail + " - " +
                (userState ? "Activo" : "Inactivo") + " - " + rol.getRolName();
    }
    
}