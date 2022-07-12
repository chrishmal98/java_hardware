/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Common.SystemData;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Chrishmal Rodrigo
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
    public Home() {
        initComponents();
        setDateAndTime();
         lbl_utype.setText(SystemData.getUtype());
       lbl_uname.setText(SystemData.getName());
       Common.SystemLogger.initLogger(Customer.class).info("Home interface sign");

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_time = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_day = new javax.swing.JLabel();
        lbl_utype = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_time.setBackground(new java.awt.Color(221, 247, 243));
        lbl_time.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_time.setOpaque(true);
        jPanel1.add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 160, 30));

        lbl_date.setBackground(new java.awt.Color(221, 247, 243));
        lbl_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_date.setOpaque(true);
        jPanel1.add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 160, 20));

        lbl_day.setBackground(new java.awt.Color(221, 247, 243));
        lbl_day.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_day.setOpaque(true);
        jPanel1.add(lbl_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 160, 20));

        lbl_utype.setFont(new java.awt.Font("Nunito Light", 0, 12)); // NOI18N
        lbl_utype.setText("Admin");
        jPanel1.add(lbl_utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(1205, 70, 120, 20));

        lbl_uname.setFont(new java.awt.Font("Nunito Medium", 0, 16)); // NOI18N
        lbl_uname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin_icon.png"))); // NOI18N
        lbl_uname.setText("Chrishmal Rodrigo");
        jPanel1.add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 240, 90));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5, 240, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 110));

        jButton1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton1.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton1.setText("Reports");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 280, 210, 40));

        jButton5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton5.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton5.setText("New Customer");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 210, 40));

        jButton6.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton6.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton6.setText("New Supplier");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 210, 40));

        jButton7.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton7.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton7.setText("New Systemuser");
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 500, 210, 40));

        jButton8.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton8.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton8.setText("New Employee");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 210, 40));

        jButton14.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton14.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton14.setText("G R N");
        jButton14.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton14.setContentAreaFilled(false);
        jButton14.setFocusPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 210, 40));

        jButton15.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton15.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton15.setText("P O");
        jButton15.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton15.setContentAreaFilled(false);
        jButton15.setFocusPainted(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 40));

        jButton16.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton16.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton16.setText("Invoice");
        jButton16.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton16.setContentAreaFilled(false);
        jButton16.setFocusPainted(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 210, 40));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grn_icon_1.png"))); // NOI18N
        jButton17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton17.setContentAreaFilled(false);
        jButton17.setFocusable(false);
        jButton17.setRequestFocusEnabled(false);
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 210, 90));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/po_icon.png"))); // NOI18N
        jButton18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton18.setContentAreaFilled(false);
        jButton18.setFocusable(false);
        jButton18.setRequestFocusEnabled(false);
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 210, 90));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report__icon.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setRequestFocusEnabled(false);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 190, 210, 90));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_customer.png"))); // NOI18N
        jButton13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusable(false);
        jButton13.setRequestFocusEnabled(false);
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 210, 90));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_suplier_icon.png"))); // NOI18N
        jButton21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton21.setContentAreaFilled(false);
        jButton21.setFocusable(false);
        jButton21.setRequestFocusEnabled(false);
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 210, 90));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_systemuser_icon.png"))); // NOI18N
        jButton22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton22.setContentAreaFilled(false);
        jButton22.setFocusable(false);
        jButton22.setRequestFocusEnabled(false);
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 410, 210, 90));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_employee_icon.png"))); // NOI18N
        jButton23.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton23.setContentAreaFilled(false);
        jButton23.setFocusable(false);
        jButton23.setRequestFocusEnabled(false);
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 210, 90));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoice_icon.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusable(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 210, 90));

        jButton24.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton24.setFont(new java.awt.Font("Nunito Medium", 1, 14)); // NOI18N
        jButton24.setText("Log In");
        jButton24.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton24.setContentAreaFilled(false);
        jButton24.setFocusPainted(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 150, 40));

        jButton25.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton25.setFont(new java.awt.Font("Nunito Medium", 1, 14)); // NOI18N
        jButton25.setText("Log Out");
        jButton25.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton25.setContentAreaFilled(false);
        jButton25.setFocusPainted(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 720, 150, 40));

        jButton26.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton26.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton26.setText("New Item");
        jButton26.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton26.setContentAreaFilled(false);
        jButton26.setFocusPainted(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 210, 40));

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_item_icon.png"))); // NOI18N
        jButton27.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton27.setContentAreaFilled(false);
        jButton27.setFocusable(false);
        jButton27.setRequestFocusEnabled(false);
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 210, 90));

        jButton28.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jButton28.setFont(new java.awt.Font("Nunito Medium", 1, 16)); // NOI18N
        jButton28.setText("Item Management");
        jButton28.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 12, 18)));
        jButton28.setContentAreaFilled(false);
        jButton28.setFocusPainted(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 210, 40));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings_icon1.png"))); // NOI18N
        jButton29.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 0, 1));
        jButton29.setContentAreaFilled(false);
        jButton29.setFocusable(false);
        jButton29.setRequestFocusEnabled(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 210, 90));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log Out_icon.png"))); // NOI18N
        jButton30.setContentAreaFilled(false);
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 660, 150, 60));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_icon.png"))); // NOI18N
        jButton31.setContentAreaFilled(false);
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 150, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradiant-0006.png"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 740));

        jPanel9.setBackground(new java.awt.Color(16, 52, 166));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 3, new java.awt.Color(204, 0, 0)));
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
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(204, 0, 0)));
        jPanel5.add(jLabel12);

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 30));

        jLabel9.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paint-brush.png"))); // NOI18N
        jLabel9.setText("MELO HARDWARE & PAINT HOUSE");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 330, 25));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heder_image-1.png"))); // NOI18N
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       if(Common.SystemData.getUtype().equals("Super Admin")){
        SystemUser systemuser = new SystemUser();
        systemuser.setVisible(true);
        this.dispose();
       }
       else{
        JOptionPane.showMessageDialog(this, "Access Denied ", "Error!", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
     Settings settings = new Settings();
     settings.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Invoice invoice = new Invoice();
        invoice.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        GRN grn = new GRN();
        grn.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Po po = new Po();
        po.setVisible(true);
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Customer customer = new Customer();
        customer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Suplier suplier = new Suplier();
        suplier.setVisible(true);
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Employee employee = new Employee();
        employee.setVisible(true);
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        ItemRegistration item = new ItemRegistration();
        item.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reports report = new Reports();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
      //  this.dispose();
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited

    }//GEN-LAST:event_jPanel5MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.out.println("Clicked");       // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
 this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_day;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JLabel lbl_utype;
    // End of variables declaration//GEN-END:variables
Date date = null;

    private void setDateAndTime() {
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm aa");
                    SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMMM yyyy");
                    SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");

                    lbl_time.setText(sdf.format(date));
                    lbl_date.setText(sdf1.format(date));
                    lbl_day.setText(sdf2.format(date));
                    

            
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        t.start();
    }
}
