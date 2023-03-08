/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Library.Authour;
import Library.Book;
import Library.CustomerRequest;
import Library.Genre;
import Library.Magazine;
import Library.Material;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class Library {

    private String buildingName;

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Magazine> magazines = new ArrayList<>();
    private ArrayList<Genre> generes = new ArrayList<>();
    private ArrayList<Authour> authours = new ArrayList<>();

    public ArrayList<CustomerRequest> getCustomerRequests() {
        return customerRequests;
    }

    public void setCustomerRequests(ArrayList<CustomerRequest> customerRequests) {
        this.customerRequests = customerRequests;
    }

    private ArrayList<CustomerRequest> customerRequests = new ArrayList<>();

    public CustomerRequest getCustomerRequest(String id) {
        for (CustomerRequest customerRequest : customerRequests) {
            if (customerRequest.getId().equals(id)) {
                return customerRequest;
            }
        }
        return null;
    }

    public boolean addCustomerReq(UserAccount.UserAccount account, Branch branch, Material material, String status, Integer duration, Integer price) {

        int unit = material.getUnit();
        if (unit == 0) {
            return false;
        }
        material.setUnit(--unit);
        CustomerRequest cr = new CustomerRequest(account, branch, material, status, duration, price);
        customerRequests.add(cr);

        if (account instanceof Customer.Customer) {
            Customer.Customer c = (Customer.Customer) account;
            c.getCustomerRequests().add(cr);
        }
        return true;
    }

    public void returnCustomerReq(String id) {
        for (CustomerRequest cr : customerRequests) {
            if (cr.getId().equals(id)) {
                cr.setStatus("Return");
            }
        }
    }

    public Integer getTotalRevenue() {
        int total = 0;
        for (CustomerRequest cr : customerRequests) {
            if (!cr.isIsAccepcted() && cr.getStatus().equals("Rent")) {
                continue;
            }
            total += cr.getPrice();
        }
        return total;
    }

    public Authour getAuthour(String id) {
        for (Authour m : authours) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public Genre getGenere(String id) {
        for (Genre m : generes) {
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

    public void addGenere(Genre g) {
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

    public ArrayList<Genre> getGeneres() {
        return generes;
    }

    public void setGeneres(ArrayList<Genre> generes) {
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
