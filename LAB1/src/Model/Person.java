/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author keerthanajagana
 */


public class Person {
    String firstName;
    String lastName;
    long nuid;
    String collegeName;
    Address address;
    Address paddress;
    Contact contact;
    Contact officeContact;

    public Address getPaddress() {
        return paddress;
    }

    public void setPaddress(Address paddress) {
        this.paddress = paddress;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }
    
    
    
    
    
    public Person(){
        this.firstName="";
        this.lastName="";
        this.nuid=0;
        this.collegeName="";
        this.address = new Address();
        this.contact = new Contact();
        this.officeContact = new Contact();
        this.paddress = new Address();
        
//        this.permanentAddress = new Address();
      
    }

   

    public long getNuid() {
        return nuid;
    }

    public void setNuid(long nuid) {
        this.nuid = nuid;
    }

    

   

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLastName() {
        return lastName;
    }
   
     public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    


    
    public static void main(String [] main){
    Person obj = new Person();
    obj.setFirstName("kitty");
    obj.setLastName("jj");
    obj.setCollegeName("dbit");
    Address addr = obj.getAddress();
    
    
    addr.setStreetName("peterborough");
    
    System.out.println(obj.getLastName() + " "+ addr.getStreetName());
    
    }

    
}
