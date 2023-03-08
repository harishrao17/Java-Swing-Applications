/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harish
 */
public class UserAccount {

    private static int count = 0;
    private String accId;
    private String username;
    private String password;

    private String role;

    public UserAccount() {
        this.accId = "ACC" + count++;
        this.username = username;
        this.password = password;
        this.role = role;

    }

    public UserAccount(String username, String password, String role) {
        this.accId = "ACC" + count++;
        this.username = username;
        this.password = password;
        this.role = role;

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
