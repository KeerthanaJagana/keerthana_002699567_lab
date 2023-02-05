/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author keerthanajagana
 */
public class Observation {
    int obId;
    private double bp;
    private double temp;
    private Medicine med;
    
    public Observation(){
    
    this.med= new Medicine();
    }

    public int getObId() {
        return obId;
    }

    public void setObId(int obId) {
        this.obId = obId;
    }

    public double getBp() {
        return bp;
    }

    public void setBp(double bp) {
        this.bp = bp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Medicine getMed() {
        return med;
    }

    public void setMed(Medicine med) {
        this.med = med;
    }
    @Override
    public String toString(){
        return String.valueOf(this.obId);
        
    }
    
}
