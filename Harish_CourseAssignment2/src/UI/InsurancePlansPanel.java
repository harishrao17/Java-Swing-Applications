/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Insurance;
import Model.Applicant;
import Model.Applicant_Directory;
import Model.Business;
import Model.Insurance_Directory;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ghostdaddy16
 */
public class InsurancePlansPanel extends javax.swing.JPanel {

    /**
     * Creates new form Manager
     */
    Business business;
    Applicant_Directory appliccantlist;
    Insurance_Directory insurancelist;

    public InsurancePlansPanel(Applicant_Directory applicantlist, Insurance_Directory insurancelist) {
        initComponents();
        this.business = business;
        this.appliccantlist = applicantlist;
        this.insurancelist = insurancelist;
        populateapplicanttable();
        populateinsurancedetails();
    }

    public void populateapplicanttable() {
        DefaultTableModel model = (DefaultTableModel) tblapplicant.getModel();
        // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
        model.setRowCount(0);

        for (Applicant io : appliccantlist.getApplicantlist()) {
            Object[] row = new Object[4];
            row[0] = io;
            row[1] = io.getLn();
            row[2] = io.getAid();
            row[3] = io.getDate();

            model.addRow(row);
        }
    }

    public void populateinsurancedetails() {
        DefaultTableModel model = (DefaultTableModel) tblinsurance.getModel();
        // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
        model.setRowCount(0);

        for (Insurance io : insurancelist.getInsurancelist()) {
            Object[] row = new Object[4];
            row[0] = io;
            row[1] = io.getPlanname();
            row[2] = io.getCostmonth();

            row[3] = io.getCostAnnum();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        txtfn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtln = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtpn = new javax.swing.JTextField();
        txtcpm = new javax.swing.JTextField();
        addPlan = new javax.swing.JButton();
        addApplicant = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbliid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblaid = new javax.swing.JLabel();
        lblcpa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblinsurance = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblapplicant = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtdatechooser = new com.toedter.calendar.JDateChooser();
        deleteButton = new javax.swing.JButton();

        jLabel9.setText("jLabel9");

        setBackground(new java.awt.Color(204, 240, 241));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnActionPerformed(evt);
            }
        });
        txtfn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfnKeyReleased(evt);
            }
        });
        add(txtfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, -1));

        jLabel1.setText("First Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 74, -1, -1));

        jLabel2.setText("Last Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 82, -1));

        jLabel3.setText("Applicant ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel4.setText("Application Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        txtln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnActionPerformed(evt);
            }
        });
        txtln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlnKeyReleased(evt);
            }
        });
        add(txtln, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, -1));

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        txtdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdateKeyReleased(evt);
            }
        });
        add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 91, -1));

        txtpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnActionPerformed(evt);
            }
        });
        txtpn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpnKeyReleased(evt);
            }
        });
        add(txtpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 93, -1));

        txtcpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpmActionPerformed(evt);
            }
        });
        txtcpm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcpmKeyReleased(evt);
            }
        });
        add(txtcpm, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 93, -1));

        addPlan.setBackground(new java.awt.Color(204, 204, 204));
        addPlan.setText("Create Plan");
        addPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlanActionPerformed(evt);
            }
        });
        add(addPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, 300, 35));

        addApplicant.setBackground(new java.awt.Color(204, 204, 204));
        addApplicant.setText("Create Applicant");
        addApplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addApplicantActionPerformed(evt);
            }
        });
        add(addApplicant, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 290, 33));

        jLabel5.setText("Plan ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        jLabel6.setText("Plane Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        jLabel7.setText("Cost per Month:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, -1));

        jLabel8.setText("Cost per Annum:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, -1, -1));

        lbliid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(lbliid, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 470, 93, 24));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Get Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 97, -1));

        lblaid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(lblaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 91, 30));

        lblcpa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(lblcpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 93, 24));

        tblinsurance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Plan ID", "Plan Name", "Cost For a Month", "Annum cost"
            }
        ));
        tblinsurance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblinsuranceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblinsurance);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, 130));

        tblapplicant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Application ID", "Register Date"
            }
        ));
        tblapplicant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblapplicantMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblapplicant);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 530, 150));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        jLabel10.setText("Register Insurance Plan");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        jLabel11.setText("Register Applicant");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));
        add(txtdatechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnActionPerformed

    private void txtlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnActionPerformed

    private void addApplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addApplicantActionPerformed
        // TODO add your handling code here:
        String fn = txtfn.getText();
        String ln = txtln.getText();
        String date = txtdate.getText();
        if (fn.equals("") || ln.equals("") || date.equals("")) {
            JOptionPane.showMessageDialog(null, "please enter all details ");

        } else {
            Applicant applicant = new Applicant(fn, ln, date);
            appliccantlist.getApplicantlist().add(applicant);

            lblaid.setText(String.valueOf(applicant.getAid()));
            JOptionPane.showMessageDialog(null, "Applicant details added");

            txtfn.setText("");
            txtln.setText("");
            txtdate.setText("");
            lblaid.setText("");
            txtdatechooser.setCalendar(null);

            DefaultTableModel model = (DefaultTableModel) tblapplicant.getModel();
            // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
            model.setRowCount(0);

            for (Applicant io : appliccantlist.getApplicantlist()) {
                Object[] row = new Object[4];
                row[0] = io;
                row[1] = io.getLn();
                row[2] = io.getAid();
                row[3] = io.getDate();

                model.addRow(row);
            }
        }
    }//GEN-LAST:event_addApplicantActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String selectdate = ((JTextField) txtdatechooser.getDateEditor().getUiComponent()).getText();
        txtdate.setText(selectdate);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpnActionPerformed

    private void txtcpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpmActionPerformed

    private void addPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlanActionPerformed
        // TODO add your handling code here:
        String pn = txtpn.getText();

        if (pn.equals("")) {
            JOptionPane.showMessageDialog(null, "please enter all details ");

        } else if (txtcpm.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "please enter all details ");
        } else {
            int cpm = parseInt(txtcpm.getText());
            Insurance insurance = new Insurance(pn, cpm);
            insurancelist.getInsurancelist().add(insurance);
//      //  Insurance insurance= this.business.getInsurancedirectory().getInsurancelist().add(pn)newInsurance(pn, cpm);
//       // System.out.println(insurance.toString());
            lbliid.setText(String.valueOf(insurance.getIid()));
            lblcpa.setText(String.valueOf(insurance.getCostAnnum()));
            JOptionPane.showMessageDialog(null, "plan details added");
            lbliid.setText("");
            lblcpa.setText("");
            txtpn.setText("");
            txtcpm.setText("");
            DefaultTableModel model = (DefaultTableModel) tblinsurance.getModel();
            // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
            model.setRowCount(0);

            for (Insurance io : insurancelist.getInsurancelist()) {
                Object[] row = new Object[4];
                row[0] = io;
                row[1] = io.getPlanname();
                row[2] = io.getCostmonth();

                row[3] = io.getCostAnnum();

                model.addRow(row);
            }
        }

    }//GEN-LAST:event_addPlanActionPerformed

    private void tblapplicantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblapplicantMouseClicked
        // TODO add your handling code here:
        if (tblapplicant.getSelectedRowCount() == 1) {
            int selectedRowIndex = tblapplicant.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblapplicant.getModel();
            txtfn.setText(model.getValueAt(selectedRowIndex, 0).toString());
            txtln.setText(model.getValueAt(selectedRowIndex, 1).toString());
            lblaid.setText(model.getValueAt(selectedRowIndex, 2).toString());
            txtdate.setText(model.getValueAt(selectedRowIndex, 3).toString());
        }
    }//GEN-LAST:event_tblapplicantMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblapplicant.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) tblapplicant.getModel();
        int store = Integer.parseInt(model.getValueAt(selectedRowIndex, 2).toString());
        for (Applicant a : appliccantlist.getApplicantlist()) {
            if (a.getAid() == store) {
                model.setValueAt(txtfn.getText(), tblapplicant.getSelectedRow(), 0);
                model.setValueAt(txtln.getText(), tblapplicant.getSelectedRow(), 1);
                model.setValueAt(lblaid.getText(), tblapplicant.getSelectedRow(), 2);
                model.setValueAt(txtdate.getText(), tblapplicant.getSelectedRow(), 3);

            }
        }

        txtfn.setText("");
        txtln.setText("");
        lblaid.setText("");
        txtdate.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblinsurance.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) tblinsurance.getModel();
        int store = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        for (Insurance a : insurancelist.getInsurancelist()) {
            if (a.getIid() == store) {
                model.setValueAt(lbliid.getText(), tblinsurance.getSelectedRow(), 0);
                model.setValueAt(txtpn.getText(), tblinsurance.getSelectedRow(), 1);
                model.setValueAt(txtcpm.getText(), tblinsurance.getSelectedRow(), 2);
                lblcpa.setText(String.valueOf(Integer.parseInt(txtcpm.getText()) * 12));
                model.setValueAt(lblcpa.getText(), tblinsurance.getSelectedRow(), 3);

            }
        }

        txtpn.setText("");
        txtcpm.setText("");
        lbliid.setText("");
        lblcpa.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblinsuranceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblinsuranceMouseClicked
        // TODO add your handling code here:
        if (tblinsurance.getSelectedRowCount() == 1) {
            int selectedRowIndex = tblinsurance.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblinsurance.getModel();
            lbliid.setText(model.getValueAt(selectedRowIndex, 0).toString());
            txtpn.setText(model.getValueAt(selectedRowIndex, 1).toString());
            txtcpm.setText(model.getValueAt(selectedRowIndex, 2).toString());
            lblcpa.setText(model.getValueAt(selectedRowIndex, 3).toString());
        }
    }//GEN-LAST:event_tblinsuranceMouseClicked

    private void txtfnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtfnKeyReleased

    private void txtlnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtlnKeyReleased

    private void txtdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdateKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtdateKeyReleased

    private void txtpnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpnKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtpnKeyReleased

    private void txtcpmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpmKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtcpmKeyReleased

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblapplicant.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblapplicant.getModel();
        int store = Integer.parseInt(model.getValueAt(selectedRowIndex, 2).toString());
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "please select a row to delete");
            return;
        }
        for (Applicant a : this.appliccantlist.getApplicantlist()) {
            if (a.getAid() == store) {
                appliccantlist.deleteInfo(a);
                txtfn.setText("");
                txtln.setText("");
                txtdate.setText("");
                txtdatechooser.setCalendar(null);
                lblaid.setText("");
            }
            populateapplicanttable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addApplicant;
    private javax.swing.JButton addPlan;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel lblaid;
    private javax.swing.JLabel lblcpa;
    private javax.swing.JLabel lbliid;
    private javax.swing.JTable tblapplicant;
    private javax.swing.JTable tblinsurance;
    private javax.swing.JTextField txtcpm;
    private javax.swing.JTextField txtdate;
    private com.toedter.calendar.JDateChooser txtdatechooser;
    private javax.swing.JTextField txtfn;
    private javax.swing.JTextField txtln;
    private javax.swing.JTextField txtpn;
    // End of variables declaration//GEN-END:variables
}
