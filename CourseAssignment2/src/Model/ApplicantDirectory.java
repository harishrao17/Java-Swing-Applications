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
public class ApplicantDirectory {

    ArrayList<Applicant> applicantList;

    public ApplicantDirectory() {
        this.applicantList = new ArrayList<Applicant>();
    }

    public ArrayList<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(ArrayList<Applicant> applicantList) {
        this.applicantList = applicantList;
    }

}
