/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author keerthanajagana
 */
public class Application {
    VitalSignsHistory history;//object class
    MedicineCatalog catalog;

   
    public VitalSignsHistory getHistory() {
        return history;
    }

    public void setHistory(VitalSignsHistory history) {
        this.history = history;
    }

    public MedicineCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(MedicineCatalog catalog) {
        this.catalog = catalog;
    }
    
    
    public Application(){//deafult constructir
        
        this.catalog = new MedicineCatalog();
        this.history=new VitalSignsHistory();
    }
    
}
