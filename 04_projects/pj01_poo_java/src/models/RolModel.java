package models;

public class RolModel {
    
    private int rolId;
    private int rolName;

    public RolModel() {
    }
    
    public RolModel(int rolId, int rolName) {
        this.rolId = rolId;
        this.rolName = rolName;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public int getRolName() {
        return rolName;
    }

    public void setRolName(int rolName) {
        this.rolName = rolName;
    }
    
    @Override
    public String toString(){
        return rolId + " - " + rolName;
    }
    
}