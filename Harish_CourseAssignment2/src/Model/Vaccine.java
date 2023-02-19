/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ghostdaddy16
 */
public class Vaccine {
    private String vn;
    private Boolean cc;
    
    public Vaccine(){
        
    }
    public Vaccine(String vn, Boolean cc){
        this.vn=vn;
        this.cc=cc;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public Boolean getCc() {
        return cc;
    }

    public void setCc(Boolean cc) {
        this.cc = cc;
    }
    
}
