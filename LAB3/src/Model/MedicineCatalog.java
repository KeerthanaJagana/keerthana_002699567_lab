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
public class MedicineCatalog {
    
    ArrayList<Medicine> medList;
    
    public MedicineCatalog(){
    this.medList=new ArrayList<Medicine>();
    
    }

    public ArrayList<Medicine> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<Medicine> medList) {
        this.medList = medList;
    }
    public Medicine createMedicine(String name, double dosage){
        Medicine medicine = new Medicine();
        medicine.setMedName(name);
        medicine.setDosage(dosage);
        
        this.medList.add(medicine);
        return medicine;
        
    }
    
    public Boolean checkIfMedicineUnique(String name) {
        for (Medicine med: this.medList){
            if(med.getMedName().equals(name)) {
                return false;
            }
        }
        return true;
    }
    
    public void removeMedicine(String name){
        for (Medicine med: this.medList){
            if(med.getMedName().equals(name)){
                this.medList.remove(med);
                    break;
            }
        }}
    
}
