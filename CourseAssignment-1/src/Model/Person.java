/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class Person {
    String firstName;
    String lastName;
    String userName;
    Contact contact;
    ArrayList<Reciepe>reciepelist;

    
    public Person(){
        this.contact=new Contact();
        this.reciepelist=new ArrayList<Reciepe>();
    }
    public ArrayList<Reciepe> getReciepelist() {
        return reciepelist;
    }
   

    public void setReciepelist(ArrayList<Reciepe> reciepelist) {
        this.reciepelist = reciepelist;
    }


    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
   

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Reciepe createReciepe(String categoryFood, String descript, float diffLevel, boolean glutenFree, int noServings, String pic, String title){
       
        Reciepe reciepe = new Reciepe();
       
       reciepe.setCategoryFood(categoryFood);
       reciepe.setDescript(descript);
       reciepe.setDiffLevel(diffLevel);
       reciepe.setGlutenFree(glutenFree);
       reciepe.setNoServings(noServings);
       reciepe.setPic(pic);
       reciepe.setTitle(title);
    
       
       this.reciepelist.add(reciepe);
       return reciepe;
    }
    public Reciepe findReciepe(String recTitle) {
        for (Reciepe rec : this.reciepelist) {
            if (rec.getTitle() == recTitle) {
                return rec;
            }
        }
        return null;
    }
    
    
    @Override
    public String toString(){
        return firstName;
    }
    
 
}
