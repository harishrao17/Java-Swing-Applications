package Business;

import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidhi Raghavendra
 */
public class Branch {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    String id;
    
    private static int counter = 0;


    String name;
    UserAccountDirectory branchuseraccountDirectory;
    // library object 
    
    Library library;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    
    public Branch(String name, String buildingName) {
        this.name = name;
        id = "BR-"  + counter++;
        library = new Library(buildingName, this);
        this.branchuseraccountDirectory = new UserAccountDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }
    
    
}
