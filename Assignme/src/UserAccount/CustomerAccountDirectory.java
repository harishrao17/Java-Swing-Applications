/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Role.CustomerRole;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Antony
 */
public class CustomerAccountDirectory {

    private ArrayList<UserAccount> useraccountlist;

    private UserAccountDirectory accountDirectory;

    public CustomerAccountDirectory(UserAccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
        useraccountlist = new ArrayList<>();
    }

    public void addCustomer(String username, String password) {

        UserAccount account = new UserAccount(username, password, new CustomerRole());

        useraccountlist.add(account);
        accountDirectory.getUseraccountList().add(account);

    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }

    public UserAccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(UserAccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }

}
