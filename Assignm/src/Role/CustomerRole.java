/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Branch;
import Business.Business;
import UI.CustomerPanels.CustomerJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author Nidhi Raghavendra
 */
public class CustomerRole extends Role {

    @Override
    public JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount) {
        // return jframe
        return new CustomerJFrame(business, branch, useraccount);
        
    }
    
}
