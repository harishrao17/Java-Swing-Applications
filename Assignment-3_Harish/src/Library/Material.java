/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author harish
 */
public class Material {

    private String id;
    private String name;
    private String registrationDate;
    private String serialNumber;
    private Integer unit;
    private boolean isAvilable;

    private static int counter = 0;

    public Material(String name, String registrationDate, String serialNumber, Integer unit) {
        this.id = "Mat-" + counter++;
        this.name = name;
        this.registrationDate = registrationDate;
        this.serialNumber = serialNumber;
        this.unit = unit;
        if (unit != 0) {
            this.isAvilable = true;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public boolean isIsAvilable() {
        return isAvilable;
    }

    public void setIsAvilable(boolean isAvilable) {
        this.isAvilable = isAvilable;
    }

}
