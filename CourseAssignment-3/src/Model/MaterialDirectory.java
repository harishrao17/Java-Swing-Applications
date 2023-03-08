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
public class MaterialDirectory {

    ArrayList<Material> materialList;

    public ArrayList<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(ArrayList<Material> materialList) {
        this.materialList = materialList;
    }

    public MaterialDirectory() {
        this.materialList = new ArrayList<Material>();
    }

}
