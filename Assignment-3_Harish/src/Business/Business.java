/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Library.Authour;
import Library.Book;
import Library.Genre;
import Library.Magazine;
import Role.BranchAdminRole;
import Role.LibrarianRole;
import Role.SystemAdminRole;
import UserAccount.CustomerAccountDirectory;
import UserAccount.EmployeAccountDirectory;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class Business {

    ArrayList<Branch> branches;
    UserAccountDirectory topLevelUserAccountDirectory;

    EmployeAccountDirectory employeAccountDirectory;

    CustomerAccountDirectory customerAccountDirectory;

    public EmployeAccountDirectory getEmployeAccountDirectory() {
        return employeAccountDirectory;
    }

    public void setEmployeAccountDirectory(EmployeAccountDirectory employeAccountDirectory) {
        this.employeAccountDirectory = employeAccountDirectory;
    }

    Business() {
        this.branches = new ArrayList<Branch>();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();

        this.employeAccountDirectory = new EmployeAccountDirectory();

        customerAccountDirectory = new CustomerAccountDirectory(topLevelUserAccountDirectory);
        // CREATING ADMIN
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
        Branch branch = this.createBranch("Chennai East", "Gandiji Street");

        Authour authour = new Authour("Arun", "India");
        branch.getLibrary().addAuthour(authour);
        Genre genere = new Genre("Novel");
        branch.getLibrary().addGenere(genere);
        branch.getLibrary().addBook(new Book("English", "100", "Hardcover", genere, authour, "How to Learn Java", "12/12/2020", "11223JJI9", 10));
        branch.getLibrary().addMagazine(new Magazine("Times of India", "Weekly", "Fasion Week", "12/12/2022", "1001", 5));

        this.employeAccountDirectory.addEmploye("arun", "arun", "10", "Seniour Librarian", new LibrarianRole(), branch);
        this.employeAccountDirectory.addEmploye("br_admin", "br_admin", "10", "Seniour Branch Admin", new BranchAdminRole(), branch);

        this.customerAccountDirectory.addCustomer("antony", "antony");
    }

    public CustomerAccountDirectory getCustomerAccountDirectory() {
        return customerAccountDirectory;
    }

    public void setCustomerAccountDirectory(CustomerAccountDirectory customerAccountDirectory) {
        this.customerAccountDirectory = customerAccountDirectory;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }

    public Branch createBranch(String name, String buildingName) {
        Branch branch = new Branch(name, buildingName);
        this.branches.add(branch);
        return branch;
    }

    public void deleteBranch(String branchId) {

        for (Branch branche : branches) {
            if (branche.getId().equals(branchId)) {
                branches.remove(branche);
                return;
            }
        }
    }

    public Branch getBranchByName(String branchId) {
        for (Branch branche : branches) {
            if (branchId.equals(branche.getId())) {
                return branche;
            }
        }
        return null;
    }

    public static Business getInstance() {
        return new Business();
    }
}
