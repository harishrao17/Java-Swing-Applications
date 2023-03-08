/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Business.Branch;
import Role.Role;

/**
 *
 * @author Antony
 */
public class Employe extends UserAccount {

    private String employeId;
    private String experience;
    private String designation;
    
    private static int empIdcounter = 0;


    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    
    private Business.Branch branch;

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    public Employe(String username, String password, String exp, String designation, Role role,Business.Branch branch) {
        super(username, password, role);
        
        this.experience = exp;
        this.designation = designation;
        
        this.employeId = "EMP-" + this.empIdcounter++;

        this.branch = branch; 
    } 
}
