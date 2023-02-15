/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class InsurancePlans {

    ArrayList<PlanDetails> planDetailsList;

    public InsurancePlans() {
        this.planDetailsList = new ArrayList<PlanDetails>();
    }

    public ArrayList<PlanDetails> getPlanDetailsList() {
        return planDetailsList;
    }

    public void setPlanDetailsList(ArrayList<PlanDetails> planDetailsList) {
        this.planDetailsList = planDetailsList;
    }

}
