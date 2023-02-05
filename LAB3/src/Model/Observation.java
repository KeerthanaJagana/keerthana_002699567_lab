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
    int observationId;
    private double bloodPressure;
    private double temperarture;
    
    public Observation(){
    
    }

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperarture() {
        return temperarture;
    }

    public void setTemperarture(double temperarture) {
        this.temperarture = temperarture;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.observationId);
    }
}
