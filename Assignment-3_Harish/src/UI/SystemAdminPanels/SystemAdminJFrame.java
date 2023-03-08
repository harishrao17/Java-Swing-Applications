/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminPanels;

import Business.Branch;
import Business.Business;
import Role.BranchAdminRole;
import Role.CustomerRole;
import Role.LibrarianRole;
import Role.Role;
import UI.MainJFrame;
import UserAccount.Employe;
import UserAccount.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author harish
 */
public class SystemAdminJFrame extends javax.swing.JFrame {

    private Business business;
    private Branch branch;
    private UserAccount useraccount;
    private Integer selectedRow;
    javax.swing.JFrame parent;
    

    /**
     * Creates new form SystemAdminJFrame
     */
    public SystemAdminJFrame(Business business, Branch branch, UserAccount useraccount, javax.swing.JFrame parent) {
        this.business = business;
        this.useraccount = useraccount;

        setTitle("Welcom System Admin: " + useraccount.getUsername());

        this.parent = parent;
        initComponents();
        this.setVisible(true);

        // populateDropdown();
    }

//    public void populateDropdown() {
//        role.removeAllItems();
//        for (String rolename : Role.getAllRoles()) {
//            role.addItem(rolename);
//        }
//    }
    private javax.swing.DefaultComboBoxModel getBranches() {
        String branchsModel[] = new String[this.business.getBranches().size()];

        if (this.business.getBranches() != null) {
            int i = 0;
            for (Branch branch : this.business.getBranches()) {
                branchsModel[i] = branch.getId();

                i++;
            }
        }

        return new javax.swing.DefaultComboBoxModel<>(branchsModel);
    }

    private Object[][] getCustomerDetails() {
        if (this.business != null) {
            Object[][] users = new Object[this.business.getCustomerAccountDirectory().getUseraccountlist().size()][7];
            int i = 0;
            for (UserAccount user : this.business.getCustomerAccountDirectory().getUseraccountlist()) {
                users[i][0] = user.getAccountId();
                users[i][1] = user.getUsername();
                users[i][2] = user.getPassword();

                i++;
            }

            return users;

        }
        return null;
    }

    private javax.swing.table.DefaultTableModel getCustomerModel() {
        return new javax.swing.table.DefaultTableModel(
                getCustomerDetails(),
                new String[]{
                    "Customer Id", "Name", "Password"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };

    }

    private Object[][] getEmployeDetails() {
        if (this.business != null) {
            Object[][] users = new Object[this.business.getEmployeAccountDirectory().getUseraccountlist().size()][7];
            int i = 0;
            for (Employe user : this.business.getEmployeAccountDirectory().getUseraccountlist()) {
                users[i][0] = user.getEmployeId();
                users[i][1] = user.getUsername();
                users[i][2] = user.getPassword();
                users[i][3] = user.getExperience();
                users[i][4] = user.getRole().getRole();
                users[i][5] = user.getDesignation();
                users[i][6] = user.getBranch().getId();

                i++;
            }

            return users;

        }
        return null;
    }

    private javax.swing.table.DefaultTableModel getEmployeTableModel() {
        return new javax.swing.table.DefaultTableModel(
                getEmployeDetails(),
                new String[]{
                    "Exmploy Id", "Name", "Password", "Experience", "Role", "Designation", "Branch"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
    }

    private javax.swing.table.DefaultTableModel getBranchModel() {
        return new javax.swing.table.DefaultTableModel(
                getBranchDetails(),
                new String[]{
                    "Id", "Branch Name", "Building Number"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
    }

    private Object[][] getBranchDetails() {
        if (this.business.getBranches() != null) {
            Object[][] users = new Object[this.business.getBranches().size()][3];
            int i = 0;
            for (Branch branch : this.business.getBranches()) {
                users[i][0] = branch.getId();
                users[i][1] = branch.getName();
                users[i][2] = branch.getLibrary().getBuildingName();
                i++;
            }
            return users;
        }
        return null;
    }

    private javax.swing.table.DefaultTableModel getUserModel() {
        return new javax.swing.table.DefaultTableModel(
                getUserDetails(),
                new String[]{
                    "Account Id", "User Name", "Password"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
    }

    private Object[][] getUserDetails() {
        if (this.business != null) {
            Object[][] users = new Object[this.business.getTopLevelUserAccountDirectory().getUseraccountList().size()][4];
            int i = 0;
            for (UserAccount user : this.business.getTopLevelUserAccountDirectory().getUseraccountList()) {
                users[i][0] = user.getAccountId();
                users[i][1] = user.getUsername();
                users[i][2] = user.getPassword();
                users[i][3] = user.getRole();
                i++;
            }

            return users;

        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        branchName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buildingNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        branchTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        employeName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employePassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        employeRole = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        employeBranch = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        employeExperience = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        employeDesignation = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        employeTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        customerUserName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        customerPassword = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jLabel2.setText("User Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 204));
        jTabbedPane4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane4FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Branch Name");
        jPanel1.add(jLabel1);

        branchName.setText("Name");
        branchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchNameActionPerformed(evt);
            }
        });
        jPanel1.add(branchName);

        jLabel6.setText("Building No");
        jPanel1.add(jLabel6);

        buildingNumber.setText("Number");
        buildingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingNumberActionPerformed(evt);
            }
        });
        jPanel1.add(buildingNumber);

        jButton1.setText("Add Branch");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton3.setText("Delete Branch");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        branchTable.setModel(getBranchModel());
        branchTable.setColumnSelectionAllowed(true);
        branchTable.getTableHeader().setReorderingAllowed(false);
        branchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branchTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(branchTable);
        branchTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane2);

        jTabbedPane4.addTab("Branch", jPanel1);

        jPanel3.setMinimumSize(new java.awt.Dimension(559, 200));

        jLabel5.setText("User Name");
        jPanel3.add(jLabel5);

        employeName.setText("Name");
        employeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeNameActionPerformed(evt);
            }
        });
        jPanel3.add(employeName);

        jLabel3.setText("Password");
        jPanel3.add(jLabel3);

        employePassword.setText("Password");
        employePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employePasswordActionPerformed(evt);
            }
        });
        jPanel3.add(employePassword);

        jLabel4.setText("Role");
        jPanel3.add(jLabel4);

        employeRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Librarian"}));
        jPanel3.add(employeRole);

        jLabel10.setText("Branch");
        jPanel3.add(jLabel10);

        employeBranch.setModel(getBranches());
        employeBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeBranchActionPerformed(evt);
            }
        });
        jPanel3.add(employeBranch);

        jLabel11.setText("Experience");
        jPanel3.add(jLabel11);

        employeExperience.setText("Experience");
        employeExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeExperienceActionPerformed(evt);
            }
        });
        jPanel3.add(employeExperience);

        jLabel9.setText("Designation");
        jPanel3.add(jLabel9);

        employeDesignation.setText("Designation");
        jPanel3.add(employeDesignation);

        jButton2.setText("Add");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2);

        jPanel2.add(jPanel3);

        employeTable.setModel(getEmployeTableModel());
        employeTable.setColumnSelectionAllowed(true);
        employeTable.setPreferredSize(new java.awt.Dimension(500, 200));
        employeTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(employeTable);
        employeTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel2.add(jScrollPane3);

        jTabbedPane4.addTab("Employe", jPanel2);

        jPanel5.setMinimumSize(new java.awt.Dimension(559, 200));

        jLabel7.setText("User Name");
        jPanel5.add(jLabel7);

        customerUserName.setText("Name");
        customerUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerUserNameActionPerformed(evt);
            }
        });
        jPanel5.add(customerUserName);

        jLabel8.setText("Password");
        jPanel5.add(jLabel8);

        customerPassword.setText("Password");
        customerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerPasswordActionPerformed(evt);
            }
        });
        jPanel5.add(customerPassword);

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);

        jPanel4.add(jPanel5);

        customerTable.setModel(getCustomerModel());
        customerTable.setColumnSelectionAllowed(true);
        customerTable.setPreferredSize(new java.awt.Dimension(500, 200));
        jScrollPane4.setViewportView(customerTable);
        customerTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel4.add(jScrollPane4);

        jTabbedPane4.addTab("Customer", jPanel4);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel6.add(logout);

        jTabbedPane4.addTab("More", jPanel6);

        getContentPane().add(jTabbedPane4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane4FocusGained

    private void buildingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buildingNumberActionPerformed

    private void employePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employePasswordActionPerformed

    private void employeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void branchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchNameActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.business.createBranch(this.branchName.getText(), this.buildingNumber.getText());
        this.branchTable.setModel(getBranchModel());
        this.branchTable.repaint();
        employeBranch.setModel(getBranches());
        employeBranch.repaint();
    }//GEN-LAST:event_jButton1MouseClicked

    private void branchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchTableMouseClicked

        selectedRow = branchTable.getSelectedRow();

// TODO add your handling code here:
    }//GEN-LAST:event_branchTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (this.selectedRow != null) {
            String branchId = this.branchTable.getModel().getValueAt(selectedRow, 0).toString();
            this.business.deleteBranch(branchId);
            this.branchTable.setModel(getBranchModel());
            this.branchTable.repaint();
            this.selectedRow = null;

        } else {
            JOptionPane.showMessageDialog(null, "Select Branch and try");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void employeBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeBranchActionPerformed

    private void customerUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerUserNameActionPerformed

    private void customerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerPasswordActionPerformed

    private void employeExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeExperienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeExperienceActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.business.getCustomerAccountDirectory().addCustomer(customerUserName.getText(), customerPassword.getText());
        customerTable.setModel(getCustomerModel());
        customerTable.repaint();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.parent.setVisible(true);
        
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        Branch branch = this.business.getBranchByName(String.valueOf((employeBranch.getSelectedItem())));

        //"Manager", "Librarian"
        String role = String.valueOf(employeRole.getSelectedItem());
        Role roleObj = null;
        if (role.equals("Manager")) {
            roleObj = new BranchAdminRole();
        } else if (role.equals("Librarian")) {
            roleObj = new LibrarianRole();
        }
//        employeBranch.getName();
        business.getEmployeAccountDirectory().addEmploye(employeName.getText(),
                employePassword.getText(), employeExperience.getText(), employeDesignation.getText(), roleObj, branch);

        this.employeTable.setModel(getEmployeTableModel());
        this.employeTable.repaint();
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SystemAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField branchName;
    private javax.swing.JTable branchTable;
    private javax.swing.JTextField buildingNumber;
    private javax.swing.JTextField customerPassword;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField customerUserName;
    private javax.swing.JComboBox<String> employeBranch;
    private javax.swing.JTextField employeDesignation;
    private javax.swing.JTextField employeExperience;
    private javax.swing.JTextField employeName;
    private javax.swing.JTextField employePassword;
    private javax.swing.JComboBox<String> employeRole;
    private javax.swing.JTable employeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
