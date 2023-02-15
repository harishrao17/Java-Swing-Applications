/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harish
 */
public class Business {

    ApplicantDirectory applicantDirectory;
    InsurancePlans insurancePlans;

    public Business() {
        this.applicantDirectory = new ApplicantDirectory();
        this.insurancePlans = new InsurancePlans();
    }

    public ApplicantDirectory getApplicantDirectory() {
        return applicantDirectory;
    }

    public void setApplicantDirectory(ApplicantDirectory applicantDirectory) {
        this.applicantDirectory = applicantDirectory;
    }

    public InsurancePlans getInsurancePlans() {
        return insurancePlans;
    }

    public void setInsurancePlans(InsurancePlans insurancePlans) {
        this.insurancePlans = insurancePlans;
    }

}
