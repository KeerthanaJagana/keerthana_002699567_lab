/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author keerthanajagana
 */
public class VitalSignsHistory {
    
    ArrayList<Observation> vitalSignsHistory;
    
    public VitalSignsHistory(){
    this.vitalSignsHistory= new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<Observation> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    // fetch or find an obs based on id
    public Observation findObservation(int id){
    for(Observation o: this.vitalSignsHistory){
        if
    
    }
    }
    
    public Observation createObservation(int observationID, double bloodPressure,double temperature){
       Observation observation=new Observation();
       observation.setObservationId(observationID);
       observation.setTemperarture(temperature);
       observation.setBloodPressure(bloodPressure);
       //add observation object into the arraylist
       this.vitalSignsHistory.add(observation);
       
        
        return observation;//return observation object
    }
    
    public Boolean checkObservationIDUnique(int id){
        for(Observation o:this.vitalSignsHistory) {
            if(o.getObservationId()==id) {
            return false;
            }
    
   
    }
        return true;
    
    }
}
