/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Insurance;
import java.util.ArrayList;

/**
 *
 * @author ghostdaddy16
 */
public class Insurance_Directory {
    ArrayList<Insurance> insurancelist;

    public Insurance_Directory(){
        this.insurancelist=new ArrayList<Insurance>();
    }
    public ArrayList<Insurance> getInsurancelist() {
        return insurancelist;
    }

    public void setInsurancelist(ArrayList<Insurance> insurancelist) {
        this.insurancelist = insurancelist;
    }
    


  
    
    public Insurance newInsurance(String planname,int Costmonth){
        
        Insurance newplan=new Insurance(planname,Costmonth);
        System.out.println(newplan.toString());
        insurancelist.add(newplan);
        return newplan;
        
    }
    public void removeInsurance(String name){
        for(Insurance nl: this.insurancelist){
            if(nl.getPlanname().equals(name)){
               this.insurancelist.remove(nl);
               break;
            }
        }
    }
}
