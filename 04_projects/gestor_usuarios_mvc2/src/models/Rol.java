package models;

public class Rol {
    private int rolId;        
    private String rolName;        

    public Rol() {
    }

    public Rol(int rolId, String rolName) {
        this.rolId = rolId;
        this.rolName = rolName;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }
    
    @Override
    public String toString(){
        return rolId + " - " + rolName;
    }   
    
}
