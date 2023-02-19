/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ghostdaddy16
 */
public class Applicant {

    private static int count = 3;
    int aid;
    String fn;
    String ln;
    String date;
    Pet pet;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Applicant() {
        this.aid = count;
        Applicant.count = count + 4;
    }

    public Applicant(String fn, String ln, String date) {
        this.aid = count;
        Applicant.count = count + 4;
        this.fn = fn;
        this.ln = ln;
        this.date = date;
        pet = new Pet();

    }

    public int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Applicant.count = count;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Pet newPet(String pn, int age, String gender, String type, String breed) {
        this.pet = new Pet(pn, age, gender, type, breed);
        return pet;
    }

    @Override
    public String toString() {
        return this.fn;
    }

}
