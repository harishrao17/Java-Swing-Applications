/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CustomerPanels;

import Business.Branch;
import Business.Business;
import Library.Authour;
import Library.Book;
import Library.CustomerRequest;
import Library.Magazine;
import Library.Material;
import UI.MainJFrame;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author harish
 */
public class CustomerJFrame extends javax.swing.JFrame {

    private Business business;
    private Branch branch;
    private UserAccount useraccount;
    javax.swing.JFrame parent;
    Customer.Customer customer;

    /**
     * Creates new form CustomerJFrame
     */
    public CustomerJFrame() {
        initComponents();
    }

    public CustomerJFrame(Business business, Branch branch, UserAccount useraccount, javax.swing.JFrame parent) {
        this.setVisible(true);

        this.business = business;
        this.branch = branch;
        this.useraccount = useraccount;

        if (useraccount instanceof Customer.Customer) {
            this.customer = (Customer.Customer) useraccount;
        }
        initComponents();

        setTitle("Welcom Customer: " + useraccount.getUsername());
        this.parent = parent;
        jScrollPane1.setSize(1000, 500);
        bookMagazineTable.setSize(1000, 500);

        setColumnWidths(bookMagazineTable, 100);
    }

    public static void setColumnWidths(JTable table, int width) {
        TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setMaxWidth(width);
        }
    }

    private Object[][] getRentalReqTableDetails() {
        Object data[][] = new Object[this.customer.getCustomerRequests().size()][10];
        int i = 0;
        for (CustomerRequest customerRequest : this.customer.getCustomerRequests()) {

            data[i][0] = customerRequest.getBranch().getId();
            data[i][1] = customerRequest.getBranch().getName();

            data[i][2] = customerRequest.getMaterial().getId();
            data[i][3] = customerRequest.getMaterial().getName();
            data[i][4] = customerRequest.getStatus();
            data[i][5] = customerRequest.getDuration();
            data[i][6] = customerRequest.getPrice();
            data[i][7] = customerRequest.isIsAccepcted();

            i++;
        }
        return data;

    }

    private javax.swing.table.DefaultTableModel getRentalReqTableModel() {
        return new javax.swing.table.DefaultTableModel(
                getRentalReqTableDetails(),
                new String[]{
                    "Branch Id", "Branch Name", "Material Id", "Name", "Status", "Duration",
                    "Price", "Accepted"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class};

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
    }

    private Object[][] getBookMagazineDetails() {
        ArrayList<Object[]> data1 = getBookDetails();
        ArrayList<Object[]> data2 = getMagazineDetails();
        data1.addAll(data2);

        Object[][] result = new Object[data1.size()][20];

        data1.toArray(result);

        return result;
    }

    private javax.swing.table.DefaultTableModel getBooksMagazineModel() {
        return new javax.swing.table.DefaultTableModel(
                getBookMagazineDetails(),
                new String[]{
                    "Branch Id", "Branch Name", "Book Id", "Name", "Serial Number", "Registration Date",
                    "Avilability", "Type", "Pages", "Language", "Authour", "Genere", "Company Name", "Issue Type"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };

    }

    private ArrayList<Object[]> getBookDetails() {
        ArrayList<Object[]> list = new ArrayList<>();

        if (this.business != null) {
            for (Branch branche : this.business.getBranches()) {
                for (Book data : branche.getLibrary().getBooks()) {
                    Object[] users = new Object[20];

                    users[0] = branche.getId();
                    users[1] = branche.getName();

                    users[2] = data.getId();
                    users[3] = data.getName();
                    users[4] = data.getSerialNumber();
                    users[5] = data.getRegistrationDate();
                    users[6] = data.isIsAvilable();

                    users[7] = "Book";

                    users[8] = data.getNumPage();
                    users[9] = data.getLanguage();
                    users[10] = data.getAuthour().getName();
                    users[11] = data.getGenere().getName();
                    users[12] = "N/A";
                    users[13] = "N/A";

                    list.add(users);
                }

            }
        }
        return list;
    }

    private ArrayList<Object[]> getMagazineDetails() {

        ArrayList<Object[]> list = new ArrayList<>();

        if (this.business != null) {
            for (Branch branche : this.business.getBranches()) {
                for (Magazine data : branche.getLibrary().getMagazines()) {
                    Object[] users = new Object[20];

                    users[0] = branche.getId();
                    users[1] = branche.getName();

                    users[2] = data.getId();
                    users[3] = data.getName();
                    users[4] = data.getSerialNumber();
                    users[5] = data.getRegistrationDate();
                    users[6] = data.isIsAvilable();

                    users[7] = "Magazine";

                    users[8] = "N/A";
                    users[9] = "N/A";
                    users[10] = "N/A";
                    users[11] = "N/A";
                    users[12] = data.getCompanyName();
                    users[13] = data.getIssueType();

                    list.add(users);
                }

            }
        }
        return list;
    }

    private javax.swing.DefaultComboBoxModel getRentalReqModel() {

        ArrayList<String> datas = new ArrayList<>();

        for (CustomerRequest data : this.customer.getCustomerRequests()) {
            if (data.isIsAccepcted() && data.getStatus().equals("Rent")) {
                datas.add(data.getId());
            }
        }

        return new javax.swing.DefaultComboBoxModel<>(datas.toArray());
    }

    private javax.swing.DefaultComboBoxModel getBranchModel() {
        String datas[] = new String[this.business.getBranches().size()];

        int i = 0;
        for (Branch data : this.business.getBranches()) {
            datas[i] = data.getId();

            i++;
        }

        return new javax.swing.DefaultComboBoxModel<>(datas);
    }

    private javax.swing.DefaultComboBoxModel getMaterialModel() {
        ArrayList<String> datas = new ArrayList<>();
        if (this.selectedBranch != null) {
            for (Book data : this.selectedBranch.getLibrary().getBooks()) {
                datas.add(data.getId());
            }
            for (Magazine data : this.selectedBranch.getLibrary().getMagazines()) {
                datas.add(data.getId());

            }

        }
        return new javax.swing.DefaultComboBoxModel<>(datas.toArray());

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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rentalBranch = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rentalMaterial = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        rentalDuration = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rentalPrice = new javax.swing.JTextField();
        rentalSubmit = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        rentalReqTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rentalReqId = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookMagazineTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 204));
        jTabbedPane4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane4FocusGained(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Rental Request");
        jPanel4.add(jLabel1);

        jLabel2.setText("Branch");
        jPanel4.add(jLabel2);

        rentalBranch.setModel(getBranchModel());
        rentalBranch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rentalBranchItemStateChanged(evt);
            }
        });
        rentalBranch.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rentalBranchPropertyChange(evt);
            }
        });
        jPanel4.add(rentalBranch);

        jLabel3.setText("Material");
        jPanel4.add(jLabel3);

        rentalMaterial.setModel(getMaterialModel());
        jPanel4.add(rentalMaterial);

        jLabel5.setText("Duration");
        jPanel4.add(jLabel5);

        rentalDuration.setText("5");
        jPanel4.add(rentalDuration);

        jLabel6.setText("Price");
        jPanel4.add(jLabel6);

        rentalPrice.setText("10");
        rentalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentalPriceActionPerformed(evt);
            }
        });
        jPanel4.add(rentalPrice);

        rentalSubmit.setText("Submit");
        rentalSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentalSubmitActionPerformed(evt);
            }
        });
        jPanel4.add(rentalSubmit);

        rentalReqTable.setModel(getRentalReqTableModel());
        rentalReqTable.setColumnSelectionAllowed(true);
        rentalReqTable.setPreferredSize(new java.awt.Dimension(500, 200));
        jScrollPane4.setViewportView(rentalReqTable);
        rentalReqTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel4.add(jScrollPane4);

        jTabbedPane4.addTab("Rental Req", jPanel4);

        jLabel4.setText("Rental Return");
        jPanel7.add(jLabel4);

        jLabel7.setText("Request Id");
        jPanel7.add(jLabel7);

        rentalReqId.setModel(getRentalReqModel());
        jPanel7.add(rentalReqId);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButton1PropertyChange(evt);
            }
        });
        jPanel7.add(jButton1);

        jTabbedPane4.addTab("Retuen Submit", jPanel7);

        bookMagazineTable.setModel(getBooksMagazineModel());
        bookMagazineTable.setColumnSelectionAllowed(true);
        bookMagazineTable.getTableHeader().setReorderingAllowed(false);
        bookMagazineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMagazineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookMagazineTable);
        bookMagazineTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1);

        jTabbedPane4.addTab("Books & Magazine List", jPanel1);

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

    private void jTabbedPane4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane4FocusGained

    private void bookMagazineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMagazineTableMouseClicked

        /*    selectedRow = bookTable.getSelectedRow(); */
        // TODO add your handling code here:
    }//GEN-LAST:event_bookMagazineTableMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        this.parent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutMouseClicked

    private void rentalSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentalSubmitActionPerformed
        // TODO add your handling code here:
        String materialId = String.valueOf(rentalMaterial.getSelectedItem());
        Material material = null;
        Branch branch = null;
        for (Branch branche : business.getBranches()) {
            for (Book data : branche.getLibrary().getBooks()) {
                if (materialId.equals(data.getId())) {
                    material = data;
                    branch = branche;
                    break;
                }
            }

            for (Magazine data : branche.getLibrary().getMagazines()) {
                if (materialId.equals(data.getId())) {
                    material = data;
                    branch = branche;
                    break;
                }

            }
        }
        // String status = String.valueOf(this.rentalStatus.getSelectedItem());

        CustomerRequest cr = this.customer.getCustomerRequestByMaterialId(material.getId());
        if (cr != null) {
            JOptionPane.showMessageDialog(null, "Book/Magazine Alredy rented");
            return;
        }

        boolean status = this.selectedBranch.getLibrary().addCustomerReq(customer, branch, material, "Rent", Integer.parseInt(rentalDuration.getText()), Integer.parseInt(rentalPrice.getText()));

        refresh();
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Book/Magazine Not Avilable - Sorry for inconvenence");

        }

    }//GEN-LAST:event_rentalSubmitActionPerformed

    private void rentalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentalPriceActionPerformed

    private Branch selectedBranch = null;
    private void rentalBranchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rentalBranchPropertyChange
        // TODO add your handling code here:
        selectedBranch = this.business.getBranchByName(String.valueOf(rentalBranch.getSelectedItem()));
        rentalMaterial.setModel(getMaterialModel());
        rentalMaterial.repaint();
    }//GEN-LAST:event_rentalBranchPropertyChange

    private void rentalBranchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rentalBranchItemStateChanged
        // TODO add your handling code here:
        rentalBranchPropertyChange(null);
    }//GEN-LAST:event_rentalBranchItemStateChanged

    private void jButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButton1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String rentalReq = String.valueOf(this.rentalReqId.getSelectedItem());
        CustomerRequest cr = this.customer.getCustomerRequest(rentalReq);
        if (!cr.isIsAccepcted()) {
            JOptionPane.showMessageDialog(null, "Book/Because still not acceptedAvilable - Because still not accepted");
            return;
        }
        cr.setStatus("Return");
        cr.setIsAccepcted(false);
        refresh();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void refresh() {
        this.bookMagazineTable.setModel(getBooksMagazineModel());
        this.bookMagazineTable.repaint();

        this.rentalReqTable.setModel(getRentalReqTableModel());
        this.rentalReqTable.repaint();

        this.rentalReqId.setModel(getRentalReqModel());
        this.rentalReqId.repaint();
    }

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
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookMagazineTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> rentalBranch;
    private javax.swing.JTextField rentalDuration;
    private javax.swing.JComboBox<String> rentalMaterial;
    private javax.swing.JTextField rentalPrice;
    private javax.swing.JComboBox<String> rentalReqId;
    private javax.swing.JTable rentalReqTable;
    private javax.swing.JButton rentalSubmit;
    // End of variables declaration//GEN-END:variables
}
