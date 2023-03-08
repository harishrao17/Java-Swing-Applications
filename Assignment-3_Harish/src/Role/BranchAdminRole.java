/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Branch;
import Business.Business;
import UI.BranchManagerPanels.BranchManagerJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author harish
 */
public class BranchAdminRole extends Role {

    public String getRole() {
        return "branch manager";
    }

    @Override
    public JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount, javax.swing.JFrame parent) {
        return new BranchManagerJFrame(business, branch, useraccount, parent);
    }
}
