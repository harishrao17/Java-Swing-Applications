/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Role.SystemAdminRole;
import UserAccount.CustomerAccountDirectory;
import UserAccount.EmployeAccountDirectory;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
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
    
    public Branch getBranchByName(String branchId)
    {
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
