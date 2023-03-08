/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Branch;
import Business.Business;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author Nidhi Raghavendra
 */
public abstract class Role {
    
    private static String[] roles = {"branch manager", "system admin", "customer", "librarian"};
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount);
}
