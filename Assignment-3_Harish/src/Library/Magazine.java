/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author harish
 */
public class Magazine extends Material {

    private String companyName;

    private String issueType;

    public Magazine(String companyName, String issueType, String name, String registrationDate, String serialNumber, Integer unit) {
        super(name, registrationDate, serialNumber, unit);
        this.companyName = companyName;
        this.issueType = issueType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

}
