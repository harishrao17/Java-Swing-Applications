/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LibraryManagerPanel;

import UI.BranchManagerPanels.*;
import Business.Branch;
import Business.Business;
import Libraray.Authour;
import Libraray.Book;
import Libraray.Genere;
import Libraray.Magazine;
import UI.MainJFrame;
import UserAccount.UserAccount;

/**
 *
 * @author Nidhi Raghavendra
 */
public class LibraryManagerJFrame extends javax.swing.JFrame {

    private final Business business;
    private final Branch branch;
    private final UserAccount useraccount;
    javax.swing.JFrame parent;

    /**
     * Creates new form BranchManagerJFrame
     */
    public LibraryManagerJFrame(Business business, Branch branch, UserAccount useraccount, javax.swing.JFrame parent) {
        this.business = business;
        this.branch = branch;
        this.useraccount = useraccount;
        setTitle("Welcom System Admin: " + useraccount.getUsername());
        this.parent = parent;

        initComponents();
        this.setVisible(true);

    }

    private javax.swing.DefaultComboBoxModel getGenereModel() {
        String datas[] = new String[this.branch.getLibrary().getGeneres().size()];

        if (this.branch != null) {
            int i = 0;
            for (Genere data : this.branch.getLibrary().getGeneres()) {
                datas[i] = data.getId();

                i++;
            }
        }

        return new javax.swing.DefaultComboBoxModel<>(datas);
    }

    private javax.swing.DefaultComboBoxModel getAuthouModel() {
        String datas[] = new String[this.branch.getLibrary().getAuthours().size()];

        if (this.branch != null) {
            int i = 0;
            for (Authour data : this.branch.getLibrary().getAuthours()) {
                datas[i] = data.getId();

                i++;
            }
        }

        return new javax.swing.DefaultComboBoxModel<>(datas);
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

    private Object[][] getGenereDetails() {
        if (this.business != null) {
            Object[][] users = new Object[this.branch.getLibrary().getGeneres().size()][7];
            int i = 0;
            for (Genere data : this.branch.getLibrary().getGeneres()) {
                users[i][0] = data.getId();
                users[i][1] = data.getName();
                i++;
            }

            return users;

        }
        return null;
    }

    private javax.swing.table.DefaultTableModel getGenereTableModel() {
        return new javax.swing.table.DefaultTableModel(
                getGenereDetails(),
                new String[]{
                    "Id", "Name"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };

    }

    private Object[][] getAuthourDetails() {
        if (this.business != null) {
            Object[][] users = new Object[this.branch.getLibrary().getAuthours().size()][7];
            int i = 0;
            for (Authour data : this.branch.getLibrary().getAuthours()) {
                users[i][0] = data.getId();
                users[i][1] = data.getName();
                users[i][2] = data.getCountry();

                i++;
            }

            return users;

        }
        return null;
    }

    private javax.swing.table.DefaultTableModel getAuthourTableModel() {
        return new javax.swing.table.DefaultTableModel(
                getAuthourDetails(),
                new String[]{
                    "Id", "Name", "Country"
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
        jLabel1 = new javax.swing.JLabel();
        bookName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bookSerialNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bookRegDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bookUnitAvil = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bookPage = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bookLang = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bookBindings = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        genereSelection = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        authourSelection = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        magazineName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        magazineSerialNumber = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        magazineRegDate = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        magazineUnitAvil = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        magazineCompany = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        magazineIssueType = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        magazineTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        generName = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        genereTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        authourName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        authourCountry = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        authourTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane4FocusGained(evt);
            }
        });

        jLabel1.setText("Name");
        jPanel1.add(jLabel1);

        bookName.setText("Name");
        bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameActionPerformed(evt);
            }
        });
        jPanel1.add(bookName);

        jLabel6.setText("Serial Number");
        jPanel1.add(jLabel6);

        bookSerialNumber.setText("Number");
        bookSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSerialNumberActionPerformed(evt);
            }
        });
        jPanel1.add(bookSerialNumber);

        jLabel2.setText("Registration Date");
        jPanel1.add(jLabel2);

        bookRegDate.setText("Date");
        jPanel1.add(bookRegDate);

        jLabel12.setText("Unit Avilable");
        jPanel1.add(jLabel12);

        bookUnitAvil.setText("1");
        jPanel1.add(bookUnitAvil);

        jLabel13.setText("No. Page");
        jPanel1.add(jLabel13);

        bookPage.setText("Page");
        bookPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookPageActionPerformed(evt);
            }
        });
        jPanel1.add(bookPage);

        jLabel14.setText("Lang");
        jPanel1.add(jLabel14);

        bookLang.setText("Lang");
        jPanel1.add(bookLang);

        jLabel15.setText("Bindings");
        jPanel1.add(jLabel15);

        bookBindings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardcover", "Stitch", "Staple", "Plastic" }));
        jPanel1.add(bookBindings);

        jLabel16.setText("Genre");
        jPanel1.add(jLabel16);

        genereSelection.setModel(getGenereModel());
        jPanel1.add(genereSelection);

        jLabel17.setText("Authour");
        jPanel1.add(jLabel17);

        authourSelection.setModel(getAuthouModel());
        jPanel1.add(authourSelection);

        jButton1.setText("Add");
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

        bookTable.setModel(getBooksModel());
        bookTable.setColumnSelectionAllowed(true);
        bookTable.getTableHeader().setReorderingAllowed(false);
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable);
        bookTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane2);

        jTabbedPane1.addTab("Books", jPanel1);

        jLabel18.setText("Name");
        jPanel7.add(jLabel18);

        magazineName.setText("Name");
        magazineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magazineNameActionPerformed(evt);
            }
        });
        jPanel7.add(magazineName);

        jLabel19.setText("Serial Number");
        jPanel7.add(jLabel19);

        magazineSerialNumber.setText("Number");
        magazineSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magazineSerialNumberActionPerformed(evt);
            }
        });
        jPanel7.add(magazineSerialNumber);

        jLabel20.setText("Registration Date");
        jPanel7.add(jLabel20);

        magazineRegDate.setText("Date");
        jPanel7.add(magazineRegDate);

        jLabel21.setText("Unit Avilable");
        jPanel7.add(jLabel21);

        magazineUnitAvil.setText("1");
        magazineUnitAvil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magazineUnitAvilActionPerformed(evt);
            }
        });
        jPanel7.add(magazineUnitAvil);

        jLabel27.setText("Company Name");
        jPanel7.add(jLabel27);

        magazineCompany.setText("Company");
        jPanel7.add(magazineCompany);

        jLabel28.setText("Issue Type");
        jPanel7.add(jLabel28);

        magazineIssueType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "weekly", "fortnightly", "Bi-weekly", "Monthly", "Yearly" }));
        jPanel7.add(magazineIssueType);

        jButton3.setText("Add");
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
        jPanel7.add(jButton3);

        magazineTable.setModel(getMagazineModel());
        magazineTable.getTableHeader().setReorderingAllowed(false);
        magazineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                magazineTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(magazineTable);
        magazineTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel7.add(jScrollPane5);

        jTabbedPane1.addTab("Magazine", jPanel7);

        jTabbedPane4.addTab("Material", jTabbedPane1);

        jPanel5.setMinimumSize(new java.awt.Dimension(559, 200));

        jLabel7.setText("Genere");
        jPanel5.add(jLabel7);

        generName.setText("Name");
        generName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generNameActionPerformed(evt);
            }
        });
        jPanel5.add(generName);

        jButton4.setText("Add");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);

        jPanel4.add(jPanel5);

        genereTable.setModel(getGenereTableModel());
        genereTable.setColumnSelectionAllowed(true);
        genereTable.setPreferredSize(new java.awt.Dimension(500, 200));
        jScrollPane4.setViewportView(genereTable);
        genereTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel4.add(jScrollPane4);

        jTabbedPane4.addTab("Genre", jPanel4);

        jPanel3.setMinimumSize(new java.awt.Dimension(559, 200));

        jLabel5.setText("Name");
        jPanel3.add(jLabel5);

        authourName.setText("Name");
        authourName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authourNameActionPerformed(evt);
            }
        });
        jPanel3.add(authourName);

        jLabel3.setText("Country");
        jPanel3.add(jLabel3);

        authourCountry.setText("Country");
        authourCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authourCountryActionPerformed(evt);
            }
        });
        jPanel3.add(authourCountry);

        jButton2.setText("Add");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2);

        jPanel2.add(jPanel3);

        authourTable.setModel(getAuthourTableModel());
        authourTable.setColumnSelectionAllowed(true);
        authourTable.setPreferredSize(new java.awt.Dimension(500, 200));
        authourTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(authourTable);
        authourTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel2.add(jScrollPane3);

        jTabbedPane4.addTab("Author", jPanel2);

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

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        branch.getLibrary().getAuthours().add(new Authour(authourName.getText(), authourCountry.getText()));
        authourTable.setModel(getAuthourTableModel());
        authourTable.repaint();
        authourSelection.setModel(getAuthouModel());
        authourSelection.repaint();

    }//GEN-LAST:event_jButton2MouseClicked

    private void authourCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authourCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authourCountryActionPerformed

    private void authourNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authourNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authourNameActionPerformed

    private void magazineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_magazineTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_magazineTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:

        this.branch.getLibrary().addMagazine(new Magazine(magazineCompany.getText(),
                String.valueOf(magazineIssueType.getSelectedItem()), magazineName.getText(),
                magazineRegDate.getText(), magazineSerialNumber.getText(), Integer.parseInt(magazineUnitAvil.getText())));
        magazineTable.setModel(getMagazineModel());
        magazineTable.repaint();

    }//GEN-LAST:event_jButton3MouseClicked

    private void magazineSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magazineSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_magazineSerialNumberActionPerformed

    private void magazineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magazineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_magazineNameActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked

        /*    selectedRow = bookTable.getSelectedRow(); */
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        this.branch.getLibrary().addBook(new Book(bookLang.getText(), bookPage.getText(),
                String.valueOf(bookBindings.getSelectedItem()),
                this.branch.getLibrary().getGenere(String.valueOf(genereSelection.getSelectedItem())),
                this.branch.getLibrary().getAuthour(String.valueOf(authourSelection.getSelectedItem())),
                bookName.getText(), bookRegDate.getText(),
                bookSerialNumber.getText(), Integer.parseInt(bookUnitAvil.getText())));
        this.bookTable.setModel(getBooksModel());
        this.bookTable.repaint();
    }//GEN-LAST:event_jButton1MouseClicked

    private void bookPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookPageActionPerformed

    private void bookSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookSerialNumberActionPerformed

    private void bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /*   this.business.getCustomerAccountDirectory().addCustomer(customerUserName.getText(), customerPassword.getText());
        genereTable.setModel(getCustomerModel());
        genereTable.repaint(); */
    }//GEN-LAST:event_jButton4ActionPerformed

    private void generNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generNameActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        branch.getLibrary().getGeneres().add(new Genere(generName.getText()));
        genereTable.setModel(getGenereTableModel());
        genereTable.repaint();
        genereSelection.setModel(getGenereModel());
        genereSelection.repaint();
    }//GEN-LAST:event_jButton4MouseClicked

    private void magazineUnitAvilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magazineUnitAvilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_magazineUnitAvilActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        this.parent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(LibraryManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new BranchManagerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authourCountry;
    private javax.swing.JTextField authourName;
    private javax.swing.JComboBox<String> authourSelection;
    private javax.swing.JTable authourTable;
    private javax.swing.JComboBox<String> bookBindings;
    private javax.swing.JTextField bookLang;
    private javax.swing.JTextField bookName;
    private javax.swing.JTextField bookPage;
    private javax.swing.JTextField bookRegDate;
    private javax.swing.JTextField bookSerialNumber;
    private javax.swing.JTable bookTable;
    private javax.swing.JTextField bookUnitAvil;
    private javax.swing.JTextField generName;
    private javax.swing.JComboBox<String> genereSelection;
    private javax.swing.JTable genereTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton logout;
    private javax.swing.JTextField magazineCompany;
    private javax.swing.JComboBox<String> magazineIssueType;
    private javax.swing.JTextField magazineName;
    private javax.swing.JTextField magazineRegDate;
    private javax.swing.JTextField magazineSerialNumber;
    private javax.swing.JTable magazineTable;
    private javax.swing.JTextField magazineUnitAvil;
    // End of variables declaration//GEN-END:variables
}
