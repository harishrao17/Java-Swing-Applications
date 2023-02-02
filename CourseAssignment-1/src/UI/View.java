/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Person;
import Model.Contact;
import Model.Reciepe;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harish
 */
public class View extends javax.swing.JPanel {
private Person person;

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    View(Person personreceipe) {
        initComponents();
        this.person = personreceipe;
        
        display();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblview = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 204));

        tblview.setBackground(new java.awt.Color(255, 255, 204));
        tblview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "User Name", "Email.ID", "Contact No.", "Reciepe Title", "Image", "No. of Servings", "Diff Level", "Is Gluten Free", "FoodCatagory", "Description"
            }
        ));
        jScrollPane1.setViewportView(tblview);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void display(){
    DefaultTableModel model= (DefaultTableModel )tblview.getModel();
    model.setRowCount(0);
       for(Reciepe  io : person.getReciepelist()){
            Object[]row =new Object[12];
            row[0]=io;
            row[1]=person.getLastName();
            row[2]=person.getUserName();
            row[3]=person.getContact().getEmailID();
            row[4]=person.getContact().getPhoneNo();
            row[5]= io.getTitle();
            row[6]= io.getPic();
            row[7]= io.getNoServings();
            row[8]= io.getDiffLevel();
            row[9]= io.isGlutenFree();
            row[10]= io.getCategoryFood();
            row[11]=io.getDescript();
            model.addRow(row);
       
            
            
       }      
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblview;
    // End of variables declaration//GEN-END:variables
}
