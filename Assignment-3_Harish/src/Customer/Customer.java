/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import Library.CustomerRequest;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class Customer extends UserAccount.UserAccount {

    ArrayList<CustomerRequest> customerRequests = new ArrayList<>();

    public Customer(String username, String password, Role role) {
        super(username, password, role);
    }

    public ArrayList<CustomerRequest> getCustomerRequests() {
        return customerRequests;
    }

    public void setCustomerRequests(ArrayList<CustomerRequest> customerRequests) {
        this.customerRequests = customerRequests;
    }

    public CustomerRequest getCustomerRequestByMaterialId(String materialId) {
        for (CustomerRequest customerRequest : customerRequests) {
            if (customerRequest.getMaterial().getId().equals(materialId)) {
                return customerRequest;
            }
        }
        return null;
    }

    public CustomerRequest getCustomerRequest(String id) {
        for (CustomerRequest customerRequest : customerRequests) {
            if (customerRequest.getId().equals(id)) {
                return customerRequest;
            }
        }
        return null;
    }

}
