/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libraray;

/**
 *
 * @author Antony
 */
public class Genere {

    private String id;

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

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Genere.counter = counter;
    }
    private String name;
    private static int counter = 0;

    public Genere(String name) {
        this.id = "Gen-" + counter++;
        this.name = name;
    }
}
