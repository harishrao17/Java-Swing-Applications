/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author harish
 */
public class Authour {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Authour.counter = counter;
    }
    private String country;
    private static int counter = 0;

    public Authour(String name, String country) {
        this.id = "AUT-" + counter++;
        this.name = name;
        this.country = country;
    }
}
