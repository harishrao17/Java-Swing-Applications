/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Applicant;
import Model.Applicant_Directory;
import java.util.ArrayList;

/**
 *
 * @author ghostdaddy16
 */
public class Business {
    Applicant_Directory applicantdirrectory;
    Insurance_Directory insurancedirectory;
    
    public Business (){
        this.applicantdirrectory=new Applicant_Directory();
        this.insurancedirectory=new Insurance_Directory();
    }

    public Applicant_Directory getApplicantdirrectory() {
        return applicantdirrectory;
    }

    public void setApplicantdirrectory(Applicant_Directory applicantdirrectory) {
        this.applicantdirrectory = applicantdirrectory;
    }

    public Insurance_Directory getInsurancedirectory() {
        return insurancedirectory;
    }

    public void setInsurancedirectory(Insurance_Directory insurancedirectory) {
        this.insurancedirectory = insurancedirectory;
    }
    public Applicant findApplicant(int aid){
        for (Applicant a: applicantdirrectory.getApplicantlist()){
            if (a.getAid()==aid){
                return a;
            }
       
        }
        return null;
    }
//    public ArrayList<Applicant> findApplicant(String name){
//        ArrayList<Applicant> temparray=new ArrayList<Applicant>();
//        for (Applicant a: applicantdirrectory.getApplicantlist()){
//            if (a.getFn().equalsIgnoreCase(name)){
//                temparray.add(a);
//                return temparray;
//            }
//       
//        }
//        return null;
//    }
     public Insurance findInsurance(int iid){
        for (Insurance i:insurancedirectory.getInsurancelist() ){
            if (i.getIid()==iid){
                return i;
            }
       
        }
        return null;
    }
     
    
}
