/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import Model.Role;

/**
 *
 * @author harish
 */
public class UserAccountDirectory {

    ArrayList<UserAccount> useraccountlist;

    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }

    public String[] getAllRoles() {
        return Role.getRoles();
    }

    public UserAccount createUserAccount(String username, String password, String role) {
        UserAccount user = new UserAccount(username, password, role);

        useraccountlist.add(user);
        return user;
    }

    public UserAccount findById(String id) {
        for (UserAccount u : this.useraccountlist) {
            if (u.getAccId().equals(id)) {
                return u;
            }
        }

        return null;
    }

    public UserAccount getUserAccount(String username, String password, String role) {
        for (UserAccount u : this.useraccountlist) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }

        return null;
    }

    public Boolean accountExists(String username, String password, String role) {
        for (UserAccount u : this.useraccountlist) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return true;
            }
        }

        return false;
    }

}
