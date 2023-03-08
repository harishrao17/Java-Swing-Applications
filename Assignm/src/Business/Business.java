/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Role.SystemAdminRole;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class Business {
    ArrayList<Branch> branches;
    UserAccountDirectory topLevelUserAccountDirectory;
    Business() {
        this.branches = new ArrayList<Branch>();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        
        // CREATING ADMIN
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
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

    
    public static Business getInstance() {
        return new Business();
    }
}
