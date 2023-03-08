/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Antony
 */
public class EmployeAccountDirectory {

    private ArrayList<Employe> useraccountlist;

    public EmployeAccountDirectory() {
        useraccountlist = new ArrayList<>();
    }

    public void addEmploye(String username, String password, String exp, String designation, Role role,Business.Branch branch)
    {
        Employe e = new Employe(username, password, exp, designation, role, branch);
        useraccountlist.add(e);
        branch.getBranchuseraccountDirectory().getUseraccountList().add(e);
       
    }
    
    public ArrayList<Employe> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Employe> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
}
