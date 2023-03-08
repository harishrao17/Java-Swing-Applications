/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Business.Branch;
import UserAccount.UserAccount;

/**
 *
 * @author harish
 */
public class CustomerRequest {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CustomerRequest.counter = counter;
    }

    private Branch branch;

    private Material material;

    private String status;

    private boolean  isAccepcted;

    public boolean isIsAccepcted() {
        return isAccepcted;
    }

    public void setIsAccepcted(boolean isAccepcted) {
        this.isAccepcted = isAccepcted;
    }
    
    private Integer duration;

    private Integer price;
    
    private UserAccount account;

    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    private static int counter = 0;

    public CustomerRequest(UserAccount account , Branch branch, Material material, String status, Integer duration, Integer price) {
        this.id = "Req-" + counter++;
        this.branch = branch;
        this.material = material;
        this.status = status;
        this.duration = duration;
        this.price = price;
        this.account = account;
    }

}
