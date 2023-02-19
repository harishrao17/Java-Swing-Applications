/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ghostdaddy16
 */
public class Applicant_Directory {

    ArrayList<Applicant> applicantlist;

    public Applicant_Directory() {
        this.applicantlist = new ArrayList<Applicant>();
    }

    public ArrayList<Applicant> getApplicantlist() {
        return applicantlist;
    }

    public void setApplicantlist(ArrayList<Applicant> applicantlist) {
        this.applicantlist = applicantlist;
    }

    public Applicant newApplicant(String fn, String ln, String date) {
        Applicant newapplicant = new Applicant(fn, ln, date);

        applicantlist.add(newapplicant);
        return newapplicant;
    }

    public void deleteApplicant(int id) {
        for (Applicant nl : this.applicantlist) {
            if (nl.getAid() == id) {
                this.applicantlist.remove(nl);
                break;
            }
        }

    }

    public void deleteInfo(Applicant io) {
        applicantlist.remove(io);

    }
}
