/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libraray;

/**
 *
 * @author Antony
 */
public class Book extends Material {

    private String language;
    private String numPage;
    private String binding;
    private Genere genere;
    private Authour authour;

    public Book(String language, String numPage, String binding, Genere genere, Authour authour,String name, String registrationDate, String serialNumber, Integer unit) {
        super(name, registrationDate, serialNumber, unit);
        this.language = language;
        this.numPage = numPage;
        this.binding = binding;
        this.genere = genere;
        this.authour = authour;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNumPage() {
        return numPage;
    }

    public void setNumPage(String numPage) {
        this.numPage = numPage;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Authour getAuthour() {
        return authour;
    }

    public void setAuthour(Authour authour) {
        this.authour = authour;
    }

}
