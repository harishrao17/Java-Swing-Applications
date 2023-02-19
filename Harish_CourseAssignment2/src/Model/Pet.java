/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ghostdaddy16
 */
public class Pet {
    private String pn;
    private int age;
    private String gender;
    private String type;
    private String breed;
    Vaccine vaccine;
    Insurance insurance;

 
   
    
    public Pet(){
        this.vaccine = new Vaccine();
       
    }
    public Pet(String pn, int age, String gender, String type, String breed){
        this.pn=pn;
        this.age=age;
        this.gender=gender;
        this.type=type;
        this.breed=breed;
//        this.vaccine=new Vaccine();
        
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

       public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }


    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
//    public Vaccine newVaccine(String vn, Boolean cc){
//        Vaccine newvaccine =new Vaccine(vn,cc);
//        vaccinelist.add(newvaccine);
//        return newvaccine;
//    }
    
}
