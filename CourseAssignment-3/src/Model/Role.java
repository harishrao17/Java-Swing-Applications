/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JFrame;

/**
 *
 * @author harish
 */
public abstract class Role {

    static String[] roles = {"sysadmin", "customer", "librarian", "branchmanager"};

    public static String[] getRoles() {
        return roles;
    }

    public abstract JFrame getWorkArea(Business business, UserAccount useraccount);

}
