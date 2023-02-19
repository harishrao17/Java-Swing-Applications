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
public class Insurance {
    public static int counter=89;
    private int iid;
    private String planname;
    private int Costmonth;
    private  int CostAnnum;
    
    public Insurance(String planname,int Costmonth){
        this.iid=counter;
        counter++;
        this.planname=planname;
        System.out.println(this.planname);
        this.Costmonth=Costmonth;
        System.out.println(this.Costmonth);
        this.CostAnnum=this.Costmonth*12;
        
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getPlanname() {
        return planname;
    }

    public void setPlanname(String planname) {
        this.planname = planname;
    }

    public int getCostmonth() {
        return Costmonth;
    }

    public void setCostmonth(int Costmonth) {
        this.Costmonth = Costmonth;
    }

    public int getCostAnnum() {
        return CostAnnum;
    }
 
    @Override 
    public String toString(){
        return String.valueOf(this.getIid());
    }
}