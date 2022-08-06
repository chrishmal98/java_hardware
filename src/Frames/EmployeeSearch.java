/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import DB.DB;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author chris
 */
public class EmployeeSearch extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeSearch
     */
    public EmployeeSearch() {
        initComponents();
        jTable1.getTableHeader().setFont(new java.awt.Font("Nunito", 0, 15));
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        rad_niic = new javax.swing.JRadioButton();
        rad_name = new javax.swing.JRadioButton();
        rad_email = new javax.swing.JRadioButton();
        rad_mobile = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Rep_save = new javax.swing.JRadioButton();
        Rep_print = new javax.swing.JRadioButton();
        Rep_show = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel2.setOpaque(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("jButton3");
        jPanel8.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 210, 50));

        jButton9.setText("Save");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 50));

        jButton11.setText("jButton3");
        jPanel8.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 210, 50));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 618, 1130, 79));

        jTextField2.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jTextField2.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jTextField2.setText("Search");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField2.setOpaque(false);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 470, 30));

        rad_niic.setBackground(java.awt.Color.white);
        buttonGroup1.add(rad_niic);
        rad_niic.setFont(new java.awt.Font("Nunito Light", 0, 12)); // NOI18N
        rad_niic.setText("N I C");
        rad_niic.setOpaque(false);
        rad_niic.setRequestFocusEnabled(false);
        rad_niic.setVerifyInputWhenFocusTarget(false);
        rad_niic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_niicActionPerformed(evt);
            }
        });
        jPanel2.add(rad_niic, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        rad_name.setBackground(java.awt.Color.white);
        buttonGroup1.add(rad_name);
        rad_name.setFont(new java.awt.Font("Nunito Light", 0, 12)); // NOI18N
        rad_name.setSelected(true);
        rad_name.setText("Name");
        rad_name.setOpaque(false);
        rad_name.setRequestFocusEnabled(false);
        rad_name.setVerifyInputWhenFocusTarget(false);
        rad_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_nameActionPerformed(evt);
            }
        });
        jPanel2.add(rad_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        rad_email.setBackground(java.awt.Color.white);
        buttonGroup1.add(rad_email);
        rad_email.setFont(new java.awt.Font("Nunito Light", 0, 12)); // NOI18N
        rad_email.setText("Email");
        rad_email.setOpaque(false);
        rad_email.setRequestFocusEnabled(false);
        rad_email.setVerifyInputWhenFocusTarget(false);
        rad_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_emailActionPerformed(evt);
            }
        });
        jPanel2.add(rad_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        rad_mobile.setBackground(java.awt.Color.white);
        buttonGroup1.add(rad_mobile);
        rad_mobile.setFont(new java.awt.Font("Nunito Light", 0, 12)); // NOI18N
        rad_mobile.setText("Mobile");
        rad_mobile.setOpaque(false);
        rad_mobile.setRequestFocusEnabled(false);
        rad_mobile.setVerifyInputWhenFocusTarget(false);
        rad_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_mobileActionPerformed(evt);
            }
        });
        jPanel2.add(rad_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jTable1.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile", "N I C", "Gender", "Email", "Address "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(10);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(170);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1070, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying-glass.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 40, 30));

        buttonGroup2.add(Rep_save);
        Rep_save.setText("Save");
        Rep_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rep_saveActionPerformed(evt);
            }
        });
        jPanel2.add(Rep_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 595, -1, 20));

        buttonGroup2.add(Rep_print);
        Rep_print.setText("Print");
        jPanel2.add(Rep_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 595, -1, 20));

        buttonGroup2.add(Rep_show);
        Rep_show.setSelected(true);
        Rep_show.setText("Show");
        Rep_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rep_showActionPerformed(evt);
            }
        });
        jPanel2.add(Rep_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 595, -1, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete (3).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 530, 50, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 71, 1106, 620));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 210, 50));

        jButton4.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jButton4.setText("Generate Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 50));

        jButton5.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 210, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 689, 1106, 79));

        jPanel7.setBackground(new java.awt.Color(106, 162, 186));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nunito ExtraBold", 1, 24)); // NOI18N
        jLabel3.setText("Employee Details");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 29));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 1106, 40));

        jPanel9.setBackground(new java.awt.Color(16, 52, 166));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(255, 0, 0)));
        jPanel5.add(jLabel12);

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 30));

        jLabel9.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paint-brush.png"))); // NOI18N
        jLabel9.setText("MELO HARDWARE & PAINT HOUSE");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 330, 25));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heder_image-1.png"))); // NOI18N
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 110));

        jButton1.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoice_icon_mini.png"))); // NOI18N
        jButton1.setText("Invoice");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, 60));

        jButton2.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/po_icon_mini.png"))); // NOI18N
        jButton2.setText("P O");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setIconTextGap(30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, 60));

        jButton7.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_suplier_icon_mini.png"))); // NOI18N
        jButton7.setText("New Supplier");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton7.setIconTextGap(30);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 240, 60));

        jButton6.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_item_icon_mini.png"))); // NOI18N
        jButton6.setText("New Item");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.setIconTextGap(30);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 240, 60));

        jButton12.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_customer_mini.png"))); // NOI18N
        jButton12.setText("New Customer");
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton12.setIconTextGap(30);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 240, 60));

        jButton13.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report__icon_mini.png"))); // NOI18N
        jButton13.setText("reports");
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton13.setIconTextGap(30);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 240, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 261, 738));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int selectedRow = jTable1.getSelectedRow();
        if(selectedRow!= -1){
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            String id = (String) dtm.getValueAt(selectedRow, 0);
            Employee employee = new Employee(id);
            employee.setVisible(true);
            this.dispose();
        }
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

          try {
            String path = "D:\\java\\Hardware\\reports\\EmployeeRepport_landscape.jasper";
            InputStream is1 = new FileInputStream(path);
            JREmptyDataSource datasource = new JREmptyDataSource();
            JasperPrint fillReport = JasperFillManager.fillReport(is1, null, DB.getNewConnection());
            if (Rep_save.isSelected()) {
                String filename = System.currentTimeMillis() + "Eemployee.pdf";
                File file = new File("C:\\Users\\chris\\Pictures\\hardware\\");
                file.mkdirs();

                JasperExportManager.exportReportToPdfFile(fillReport, file.getAbsolutePath() +"\\\\"+ filename);
                JOptionPane.showMessageDialog(this,"File save Sucsessfully, Location : "+ file.getAbsolutePath() +"\\\\"+ filename ,null, JOptionPane.INFORMATION_MESSAGE);
            }
            if (Rep_print.isSelected()) {
                JasperPrintManager.printReport(fillReport, false);
                                System.out.println("print");

            }
            if (Rep_show.isSelected()) {
                JasperViewer.viewReport(fillReport, false);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited

    }//GEN-LAST:event_jPanel5MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Invoice invoice = new Invoice();
        invoice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Po po = new Po();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Suplier suplier = new Suplier();
        suplier.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ItemRegistration item = new ItemRegistration();
        item.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Customer customer = new Customer();
        customer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Reports report = new Reports();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if (jTextField2.getText().equals("Search")) {
            jTextField2.setText("");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
//        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//
//        String text = jTextField2.getText();
//
//        if (rad_name.isSelected()) {
//            dtm.setRowCount(0);
//            try {
//                System.out.println("1");
//                    ResultSet search = DB.DB.search("SELECT * FROM employee WHERE fname like '" +text+ "%"  +"' OR lname like '" +text + "%" +"' ");
//                           System.out.println("2");
//
//            while (search.next()) {
//                                           System.out.println("3");
//
//                Vector v = new Vector();
//                v.add(search.getString("fname") + " " + search.getString("lname"));
//                v.add(search.getString("mobile"));
//                v.add(search.getString("nic"));
//                v.add(search.getString("gender"));
//                v.add(search.getString("email"));
//                v.add(search.getString("address"));
//
//                dtm.addRow(v);
//
//            }
//            } catch (Exception e) {
//            }
//            
//        } else if (rad_mobile.isSelected()) {
//            dtm.setRowCount(0);
//
//        } else if (rad_niic.isSelected()) {
//            dtm.setRowCount(0);
//
//        } else if (rad_email.isSelected()) {
//            dtm.setRowCount(0);
//
//        }       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        String text = jTextField2.getText();

        if (rad_name.isSelected()) {
            dtm.setRowCount(0);
            try {
                System.out.println("1");
                ResultSet search = DB.search("SELECT * FROM employee WHERE fname like '" + text + "%" + "' OR lname like '" + text + "%" + "' ");
                System.out.println("2");

                while (search.next()) {
                    System.out.println("3");

                    Vector v = new Vector();
                    v.add(search.getString("id"));
                    v.add(search.getString("fname") + " " + search.getString("lname"));
                    v.add(search.getString("mobile"));
                    v.add(search.getString("nic"));
                    v.add(search.getString("gender"));
                    v.add(search.getString("email"));
                    v.add(search.getString("address"));

                    dtm.addRow(v);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (rad_mobile.isSelected()) {
            dtm.setRowCount(0);
            try {

                ResultSet search = DB.search("SELECT * FROM employee WHERE mobile like '" + text + "%" + "'");

                while (search.next()) {

                    Vector v = new Vector();
                    v.add(search.getString("id"));
                    v.add(search.getString("fname") + " " + search.getString("lname"));
                    v.add(search.getString("mobile"));
                    v.add(search.getString("nic"));
                    v.add(search.getString("gender"));
                    v.add(search.getString("email"));
                    v.add(search.getString("address"));

                    dtm.addRow(v);

                }
            } catch (Exception e) {
                e.printStackTrace();

            }

        } else if (rad_niic.isSelected()) {
            dtm.setRowCount(0);
            try {

                ResultSet search = DB.search("SELECT * FROM employee WHERE nic like '" + text + "%" + "'");

                while (search.next()) {

                    Vector v = new Vector();
                    v.add(search.getString("id"));
                    v.add(search.getString("fname") + " " + search.getString("lname"));
                    v.add(search.getString("mobile"));
                    v.add(search.getString("nic"));
                    v.add(search.getString("gender"));
                    v.add(search.getString("email"));
                    v.add(search.getString("address"));

                    dtm.addRow(v);

                }
            } catch (Exception e) {
                e.printStackTrace();

            }

        } else if (rad_email.isSelected()) {
            dtm.setRowCount(0);
            try {

                ResultSet search = DB.search("SELECT * FROM employee WHERE email like '" + text + "%" + "'");

                while (search.next()) {

                    Vector v = new Vector();
                   v.add(search.getString("id"));
                    v.add(search.getString("fname") + " " + search.getString("lname"));
                    v.add(search.getString("mobile"));
                    v.add(search.getString("nic"));
                    v.add(search.getString("gender"));
                    v.add(search.getString("email"));
                    v.add(search.getString("address"));

                    dtm.addRow(v);

                }
            } catch (Exception e) {
                e.printStackTrace();

            }

        }       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void rad_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_nameActionPerformed
        radFocus();

// TODO add your handling code here:
    }//GEN-LAST:event_rad_nameActionPerformed

    private void rad_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_emailActionPerformed
        radFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_rad_emailActionPerformed

    private void rad_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_mobileActionPerformed
        radFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_rad_mobileActionPerformed

    private void rad_niicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_niicActionPerformed
        radFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_rad_niicActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Employee employee = new Employee();
        employee.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Rep_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rep_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rep_showActionPerformed

    private void Rep_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rep_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rep_saveActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       if(Common.SystemData.getUtype().equals("Super Admin")){
        
        int selectedRow = jTable1.getSelectedRow();
       if(selectedRow != -1){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            String empid = dtm.getValueAt(selectedRow, 0).toString();
            if(!empid.equals("EMP1")){
            try {
                DB.iud("UPDATE employee SET status = '0' WHERE id = '"+empid+"'");
                            JOptionPane.showMessageDialog(this, "Succsussfull !..");

                
            } catch (Exception ex) {
                Logger.getLogger(EmployeeSearch.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }else{
            JOptionPane.showMessageDialog(this, "can't Delete Super user");
            }
            
              }else{
       JOptionPane.showMessageDialog(this, "Plz.. Select an Employee");
       }
        loadTable();
        
         }
       else{
        JOptionPane.showMessageDialog(this, "Access Denied ", "Error!", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jLabel2MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeSearch().setVisible(true);
            }
        });
    }

    void radFocus() {
        if (!jTextField2.getText().equals("Search")) {
            jTextField2.setText("");
            jTextField2.grabFocus();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rep_print;
    private javax.swing.JRadioButton Rep_save;
    private javax.swing.JRadioButton Rep_show;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton rad_email;
    private javax.swing.JRadioButton rad_mobile;
    private javax.swing.JRadioButton rad_name;
    private javax.swing.JRadioButton rad_niic;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        try {
            ResultSet search = DB.search("SELECT * FROM employee where status = '1'");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (search.next()) {
                Vector v = new Vector();
                v.add(search.getString("id"));
                v.add(search.getString("fname") + " " + search.getString("lname"));
                v.add(search.getString("mobile"));
                v.add(search.getString("nic"));
                v.add(search.getString("gender"));
                v.add(search.getString("email"));
                v.add(search.getString("address"));

                dtm.addRow(v);

            }

        } catch (Exception e) {
        }

    }
}
