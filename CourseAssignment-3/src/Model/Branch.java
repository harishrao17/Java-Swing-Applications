/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harishrao
 */
public class Branch {

    String branchName;
    Library library;
    UserAccountDirectory useraccdir;

    public Branch() {
        this.library = new Library();
        this.useraccdir = new UserAccountDirectory();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public UserAccountDirectory getUseraccdir() {
        return useraccdir;
    }

    public void setUseraccdir(UserAccountDirectory useraccdir) {
        this.useraccdir = useraccdir;
    }

}
