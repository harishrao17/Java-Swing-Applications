/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Applicant_Directory;
import Model.Applicant;
import Model.Pet;
import Model.Vaccine;
import Model.Business;
import Model.Insurance;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import static javax.xml.bind.DatatypeConverter.parseInteger;

/**
 *
 * @author ghostdaddy16
 */

public class ApplicantJPanel extends javax.swing.JPanel {

    Business business;
    Applicant applicant;
    ArrayList<Applicant> temparray = new ArrayList<Applicant>();
    ArrayList<Applicant> temparrayid = new ArrayList<Applicant>();

    public ApplicantJPanel(Business business) {
        initComponents();

        this.business = business;
        populatecomboapplicant();

        populatepettable();
        populatevaccinetable();
    }

    public void populatepettable() {

        DefaultTableModel model = (DefaultTableModel) tblpet.getModel();
        model.setRowCount(0);
        for (Applicant io : this.business.getApplicantdirrectory().getApplicantlist()) {
            Object[] row = new Object[5];
            row[0] = io.getPet().getPn();
            row[1] = io.getPet().getType();
            row[2] = io.getPet().getBreed();
            row[3] = io.getPet().getGender();
            row[4] = io.getPet().getAge();

            model.addRow(row);
        }
    }

    public void populatevaccinetable() {
        DefaultTableModel model1 = (DefaultTableModel) tblvaccine.getModel();
        model1.setRowCount(0);
        for (Applicant io : this.business.getApplicantdirrectory().getApplicantlist()) {
            Object[] row = new Object[2];
            row[0] = io.getPet().getVaccine().getVn();
            row[1] = io.getPet().getVaccine().getCc();

            model1.addRow(row);
        }
    }

    public void populatecomboapplicant() {
        for (Applicant a : this.business.getApplicantdirrectory().getApplicantlist()) {
            comboboxapplicant.addItem(toString(a.getAid()));

        }
    }

    public String toString(int a) {
        return String.valueOf(a);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        vaccinated = new javax.swing.ButtonGroup();
        comboboxapplicant = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpn = new javax.swing.JTextField();
        txttype = new javax.swing.JTextField();
        txtbreed = new javax.swing.JTextField();
        rbtnmale = new javax.swing.JRadioButton();
        rbtnfemale = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        txtgender = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rbtnyes = new javax.swing.JRadioButton();
        rbtnno = new javax.swing.JRadioButton();
        txtvaccinename = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsearch = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpet = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblvaccine = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtstoreid = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboboxapplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxapplicantActionPerformed(evt);
            }
        });
        add(comboboxapplicant, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 140, 30));

        jLabel1.setText("Applicant:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 107, 51));

        jLabel2.setText("Pet Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, 20));

        jLabel3.setText("Pet Type:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        jLabel4.setText("Pet Breed:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        txtpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnActionPerformed(evt);
            }
        });
        add(txtpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 109, -1));

        txttype.setText(" ");
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });
        add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 109, -1));
        add(txtbreed, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 109, -1));

        rbtnmale.setBackground(new java.awt.Color(204, 204, 204));
        gender.add(rbtnmale);
        rbtnmale.setText("Male");
        add(rbtnmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        rbtnfemale.setBackground(new java.awt.Color(204, 204, 204));
        gender.add(rbtnfemale);
        rbtnfemale.setText("Female");
        add(rbtnfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        jButton1.setText("Get Gender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, -1));
        add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 100, -1));

        jLabel5.setText("Gender:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        jLabel6.setText("Age:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 50, -1));
        add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 110, -1));

        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 600, 120, -1));

        jLabel7.setText("Vaccine name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, -1));

        rbtnyes.setBackground(new java.awt.Color(204, 204, 204));
        vaccinated.add(rbtnyes);
        rbtnyes.setText("Yes");
        add(rbtnyes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, -1, -1));

        rbtnno.setBackground(new java.awt.Color(204, 204, 204));
        vaccinated.add(rbtnno);
        rbtnno.setText("No");
        add(rbtnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, -1, -1));

        txtvaccinename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvaccinenameActionPerformed(evt);
            }
        });
        add(txtvaccinename, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 110, -1));

        jLabel8.setText("Vaccinated ?");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, -1, -1));
        add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 150, -1));

        jLabel9.setText("Search :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, 20));

        tblsearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "ID", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblsearch);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 100));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Search By Name");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        jLabel10.setText("Enter Vaccine Details for pet :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        jLabel11.setText("Search for Applicant :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        jLabel12.setText("Enter Pet Details :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        tblpet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Pet Name", "Pet type", "Breed", "Pet Gender", "Age"
            }
        ));
        tblpet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpetMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpet);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 580, 100));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 240, -1));

        tblvaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Vaccine Name", "Vaccine Status"
            }
        ));
        tblvaccine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblvaccineMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblvaccine);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 100));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 640, 240, -1));

        jLabel14.setText("Search :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, 20));
        add(txtstoreid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 150, -1));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Search By ID");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpnActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (rbtnmale.isSelected() == true) {
            txtgender.setText("Male");
        } else if (rbtnfemale.isSelected() == true) {
            txtgender.setText("Female");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (txtpn.getText().equals("") || txttype.getText().equals("") || txttype.getText().equals("") || txtgender.getText().equals("") || txtage.getText().equals("")
                || txtvaccinename.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter all details");

        }

        int aid = Integer.parseInt(comboboxapplicant.getSelectedItem().toString());

        Applicant applicant = this.business.findApplicant(aid);

        this.applicant = applicant;

        String pn = txtpn.getText();
        String type = txttype.getText();
        String breed = txtbreed.getText();
        int age = Integer.parseInt(txtage.getText());
        String gender = txtgender.getText();
        String vaccinename = txtvaccinename.getText();
        Boolean vaccinated;
        if (rbtnyes.isSelected() == true) {
            vaccinated = true;
        } else {
            vaccinated = false;
        }
        Vaccine vaccine = new Vaccine(vaccinename, vaccinated);
        Pet pet = new Pet(pn, age, gender, type, breed);
        pet.setVaccine(vaccine);
        applicant.setPet(pet);
        JOptionPane.showMessageDialog(null, "pet details added for applicant");

        txtpn.setText("");
        txttype.setText("");
        txtbreed.setText("");
        txtage.setText("");
        txtgender.setText("");
        txtvaccinename.setText("");

        DefaultTableModel model = (DefaultTableModel) tblpet.getModel();
        model.setRowCount(0);
        for (Applicant io : this.business.getApplicantdirrectory().getApplicantlist()) {
            Object[] row = new Object[5];
            row[0] = io.getPet().getPn();
            row[1] = io.getPet().getType();
            row[2] = io.getPet().getBreed();
            row[3] = io.getPet().getGender();
            row[4] = io.getPet().getAge();

            model.addRow(row);
        }
        DefaultTableModel model1 = (DefaultTableModel) tblvaccine.getModel();
        model1.setRowCount(0);

        for (Applicant io : this.business.getApplicantdirrectory().getApplicantlist()) {
            Object[] row = new Object[2];
            row[0] = io.getPet().getVaccine().getVn();
            row[1] = io.getPet().getVaccine().getCc();

            model1.addRow(row);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtvaccinenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvaccinenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvaccinenameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String store = txtsearch.getText();

        for (Applicant a : this.business.getApplicantdirrectory().getApplicantlist()) {
            if (a.getFn().equalsIgnoreCase(store)) {
                temparray.add(a);
            }
        }
        System.out.println(temparray.size());

        DefaultTableModel model = (DefaultTableModel) tblsearch.getModel();
        // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
        for (int i = 0; i < temparray.size(); i++) {
            Applicant applicant1 = temparray.get(i);
            model.setRowCount(i);
            System.out.println(applicant1.getAid());

            Object[] row = new Object[4];
            row[0] = applicant1;
            row[1] = applicant1.getLn();
            row[2] = applicant1.getAid();
            row[3] = applicant1.getDate();
            model.addRow(row);
        }
        temparray.clear();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblpet.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) tblpet.getModel();
        String store = model.getValueAt(selectedRowIndex, 0).toString();
        for (Applicant a : this.business.getApplicantdirrectory().getApplicantlist()) {
            if (a.getPet().getPn().equals(store)) {
                model.setValueAt(txtpn.getText(), tblpet.getSelectedRow(), 0);
                model.setValueAt(txttype.getText(), tblpet.getSelectedRow(), 1);
                model.setValueAt(txtbreed.getText(), tblpet.getSelectedRow(), 2);
                model.setValueAt(txtgender.getText(), tblpet.getSelectedRow(), 3);
                model.setValueAt(txtage.getText(), tblpet.getSelectedRow(), 4);

            }
        }
        temparrayid.clear();

        txtpn.setText("");
        txttype.setText("");
        txtbreed.setText("");
        txtgender.setText("");
        txtage.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblpetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpetMouseClicked
        // TODO add your handling code here:
        if (tblpet.getSelectedRowCount() == 1) {
            int selectedRowIndex = tblpet.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblpet.getModel();
            txtpn.setText(model.getValueAt(selectedRowIndex, 0).toString());
            txttype.setText(model.getValueAt(selectedRowIndex, 1).toString());
            txtbreed.setText(model.getValueAt(selectedRowIndex, 2).toString());
            txtgender.setText(model.getValueAt(selectedRowIndex, 3).toString());
            txtage.setText(model.getValueAt(selectedRowIndex, 4).toString());

        }
    }//GEN-LAST:event_tblpetMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblvaccine.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) tblvaccine.getModel();
        String store = model.getValueAt(selectedRowIndex, 0).toString();
        for (Applicant a : this.business.getApplicantdirrectory().getApplicantlist()) {
            if (a.getPet().getVaccine().getVn().equals(store)) {
                model.setValueAt(txtvaccinename.getText(), tblvaccine.getSelectedRow(), 0);
                if (rbtnyes.isSelected() == true) {
                    model.setValueAt("true", tblvaccine.getSelectedRow(), 1);
                } else {
                    model.setValueAt("false", tblvaccine.getSelectedRow(), 1);

                }

            }
        }

        txtvaccinename.setText("");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int Storeid = Integer.parseInt(txtstoreid.getText());
        for (Applicant a : this.business.getApplicantdirrectory().getApplicantlist()) {
            if (a.getAid() == Storeid) {
                temparrayid.add(a);
            }
        }
        System.out.println(temparrayid.size());
        DefaultTableModel model = (DefaultTableModel) tblsearch.getModel();
        // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
        for (int i = 0; i < temparrayid.size(); i++) {
            Applicant applicant1 = temparrayid.get(i);
            model.setRowCount(i);
            System.out.println(applicant1.getAid());

            Object[] row = new Object[4];
            row[0] = applicant1;
            row[1] = applicant1.getLn();
            row[2] = applicant1.getAid();
            row[3] = applicant1.getDate();
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tblvaccineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblvaccineMouseClicked
        // TODO add your handling code here:
        if (tblvaccine.getSelectedRowCount() == 1) {
            int selectedRowIndex = tblvaccine.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblvaccine.getModel();
            txtvaccinename.setText(model.getValueAt(selectedRowIndex, 0).toString());
            String s = model.getValueAt(selectedRowIndex, 1).toString();
            if (s.equals("true")) {
                rbtnyes.setEnabled(true);
            } else {
                rbtnno.setEnabled(true);
            }

        }
    }//GEN-LAST:event_tblvaccineMouseClicked

    private void comboboxapplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxapplicantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxapplicantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboboxapplicant;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rbtnfemale;
    private javax.swing.JRadioButton rbtnmale;
    private javax.swing.JRadioButton rbtnno;
    private javax.swing.JRadioButton rbtnyes;
    private javax.swing.JTable tblpet;
    private javax.swing.JTable tblsearch;
    private javax.swing.JTable tblvaccine;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtbreed;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtpn;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtstoreid;
    private javax.swing.JTextField txttype;
    private javax.swing.JTextField txtvaccinename;
    private javax.swing.ButtonGroup vaccinated;
    // End of variables declaration//GEN-END:variables
}
