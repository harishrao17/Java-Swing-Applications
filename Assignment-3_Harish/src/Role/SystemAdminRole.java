/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Branch;
import Business.Business;
import UI.MainJFrame;
import UI.SystemAdminPanels.SystemAdminJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author harish
 */
public class SystemAdminRole extends Role {

    public String getRole() {
        return "system admin";
    }

    @Override
    public JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount, javax.swing.JFrame parent) {
        return new SystemAdminJFrame(business, branch, useraccount, parent);
    }

}
