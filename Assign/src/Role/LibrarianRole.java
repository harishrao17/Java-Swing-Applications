/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Branch;
import Business.Business;
import UI.BranchManagerPanels.BranchManagerJFrame;
import UI.LibraryManagerPanel.LibraryManagerJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author Antony
 */
public class LibrarianRole extends Role {

    public String getRole() {
        return "librarian";
    }

    @Override
    public JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount, javax.swing.JFrame parent) {
        return new LibraryManagerJFrame(business, branch, useraccount, parent);
    }

}
