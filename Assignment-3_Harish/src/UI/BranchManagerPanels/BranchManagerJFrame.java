/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.BranchManagerPanels;

import Business.Branch;
import Business.Business;
import Libraray.Book;
import Libraray.CustomerRequest;
import Libraray.Magazine;
import UI.MainJFrame;
import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class BranchManagerJFrame extends javax.swing.JFrame {

    private final Business business;
    private final Branch branch;
    private final UserAccount useraccount;

    /**
     * Creates new form BranchManagerJFrame
     */
    private javax.swing.DefaultComboBoxModel getRentalReqModel() {

        ArrayList<String> datas = new ArrayList<>();

        for (CustomerRequest data : this.branch.getLibrary().getCustomerRequests()) {
            if (!data.isIsAccepcted()) {
                datas.add(data.getId());
            }

        }

        return new javax.swing.DefaultComboBoxModel<>(datas.toArray());
    }

    public String getRevenue() {
        return this.branch.getLibrary().getTotalRevenue() + "";
    }

    private Object[][] getBookDetails() {
        if (this.business != null) {
            Object[][] users = new Object[this.branch.getLibrary().getBooks().size()][9];
            int i = 0;
            for (Book data : this.branch.getLibrary().getBooks()) {
                users[i][0] = data.getId();
                users[i][1] = data.getName();
                users[i][2] = data.getSerialNumber();
                users[i][3] = data.getRegistrationDate();
                users[i][4] = data.isIsAvilable();
                users[i][5] = data.getNumPage();
                users[i][6] = data.getLanguage();
                users[i][7] = data.getAuthour().getName();
                users[i][8] = data.getGenere().getName();

                i++;
            }

            return users;

        }
        return null;
    }

    private Object[][] getRentalReqTableDetails() {
        Object data[][] = new Object[this.branch.getLibrary().getCustomerRequests().size()][10];
        int i = 0;
        for (CustomerRequest customerRequest : this.branch.getLibrary().getCustomerRequests()) {

            data[i][0] = customerRequest.getBranch().getId();
            data[i][1] = customerRequest.getBranch().getName();

            data[i][2] = customerRequest.getMaterial().getId();
            data[i][3] = customerRequest.getMaterial().getName();
            data[i][4] = customerRequest.getStatus();
            data[i][5] = customerRequest.getDuration();
            data[i][6] = customerRequest.getPrice();
            data[i][7] = customerRequest.getAccount().getUsername();
            data[i][8] = customerRequest.isIsAccepcted();

            i++;
        }
        return data;

    }

    private javax.swing.table.DefaultTableModel getRentalReqTableModel() {
        return new javax.swing.table.DefaultTableModel(
                getRentalReqTableDetails(),
                new String[]{
                    "Branch Id", "Branch Name", "Material Id", "Name", "Status", "Duration",
                    "Price", "User", "Accepted"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class};

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
    }

    private javax.swing.table.DefaultTableModel getBooksModel() {
        return new javax.swing.table.DefaultTableModel(
                getBookDetails(),
                new String[]{
                    "Id", "Name", "Serial Number", "Registration Date",
                    "Avilability", "Pages", "Language", "Authour", "Genere"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };

    }

    private Object[][] getMagazineDetails() {
        if (this.business != null) {
            Object[][] users = new Object[this.branch.getLibrary().getMagazines().size()][7];
            int i = 0;
            for (Magazine data : this.branch.getLibrary().getMagazines()) {
                users[i][0] = data.getId();
                users[i][1] = data.getName();
                users[i][2] = data.getSerialNumber();
                users[i][3] = data.getRegistrationDate();
                users[i][4] = data.isIsAvilable();
                users[i][5] = data.getCompanyName();
                users[i][6] = data.getIssueType();

                i++;
            }

            return users;

        }
        return null;
    }

    private javax.swing.table.DefaultTableModel getMagazineModel() {
        return new javax.swing.table.DefaultTableModel(
                getMagazineDetails(),
                new String[]{
                    "Id", "Name", "Serial Number", "Registration Date",
                    "Avilability", "Company Name", "Issue Type"
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

    javax.swing.JFrame parent;

    public BranchManagerJFrame(Business business, Branch branch, UserAccount useraccount, javax.swing.JFrame parent) {
        this.setVisible(true);
        this.business = business;
        this.branch = branch;
        this.useraccount = useraccount;

        this.parent = parent;

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        magazineTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        rentalReqTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane4FocusGained(evt);
            }
        });

        bookTable.setModel(getBooksModel());
        bookTable.setColumnSelectionAllowed(true);
        bookTable.getTableHeader().setReorderingAllowed(false);
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable);

        jPanel1.add(jScrollPane2);

        jTabbedPane1.addTab("Books", jPanel1);

        magazineTable.setModel(getMagazineModel());
        magazineTable.getTableHeader().setReorderingAllowed(false);
        magazineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                magazineTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(magazineTable);

        jPanel7.add(jScrollPane5);

        jTabbedPane1.addTab("Magazine", jPanel7);

        jTabbedPane4.addTab("Material", jTabbedPane1);

        rentalReqTable.setModel(getRentalReqTableModel());
        rentalReqTable.setColumnSelectionAllowed(true);
        rentalReqTable.setPreferredSize(new java.awt.Dimension(500, 200));
        jScrollPane6.setViewportView(rentalReqTable);

        jPanel8.add(jScrollPane6);

        jTabbedPane4.addTab("Rental Req", jPanel8);

        jLabel1.setText("Total Revenue Generated");

        jLabel2.setText(getRevenue());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(jLabel2)
                .addContainerGap(1156, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Revenue", jPanel2);

        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel6.add(logout);

        jTabbedPane4.addTab("More", jPanel6);

        getContentPane().add(jTabbedPane4, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked

        /*    selectedRow = bookTable.getSelectedRow(); */
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTableMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        this.parent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void jTabbedPane4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane4FocusGained

    private void magazineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_magazineTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_magazineTableMouseClicked

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
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new BranchManagerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton logout;
    private javax.swing.JTable magazineTable;
    private javax.swing.JTable rentalReqTable;
    // End of variables declaration//GEN-END:variables
}
