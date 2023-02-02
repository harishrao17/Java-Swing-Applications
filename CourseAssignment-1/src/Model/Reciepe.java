/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harish
 */
public class Reciepe {
    String title;
    int noServings;
    boolean glutenFree;
    float diffLevel;
    String categoryFood;
    String descript;
    String pic;
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoServings() {
        return noServings;
    }

    public void setNoServings(int noServings) {
        this.noServings = noServings;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public float getDiffLevel() {
        return diffLevel;
    }

    public void setDiffLevel(float diffLevel) {
        this.diffLevel = diffLevel;
    }

    public String getCategoryFood() {
        return categoryFood;
    }

    public void setCategoryFood(String categoryFood) {
        this.categoryFood = categoryFood;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
