/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Libraray.Authour;
import Libraray.Book;
import Libraray.Genere;
import Libraray.Magazine;
import java.util.ArrayList;

/**
 *
 * @author Antony
 */
public class Library {

    private String buildingName;

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Magazine> magazines = new ArrayList<>();
    private ArrayList<Genere> generes = new ArrayList<>();
    private ArrayList<Authour> authours = new ArrayList<>();

    public Authour getAuthour(String id) {
        for (Authour m : authours) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public Genere getGenere(String id) {
        for (Genere m : generes) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public Magazine getMagazine(String id) {
        for (Magazine m : magazines) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public Book getBook(String id) {
        for (Book m : books) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public void addMagazine(Magazine m) {
        magazines.add(m);
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void addGenere(Genere g) {
        generes.add(g);
    }

    public void addAuthour(Authour a) {
        authours.add(a);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(ArrayList<Magazine> magazines) {
        this.magazines = magazines;
    }

    public ArrayList<Genere> getGeneres() {
        return generes;
    }

    public void setGeneres(ArrayList<Genere> generes) {
        this.generes = generes;
    }

    public ArrayList<Authour> getAuthours() {
        return authours;
    }

    public void setAuthours(ArrayList<Authour> authours) {
        this.authours = authours;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    private Branch branch;

    public Library(String buildingName, Branch branch) {
        this.buildingName = buildingName;
        this.branch = branch;
    }

}
