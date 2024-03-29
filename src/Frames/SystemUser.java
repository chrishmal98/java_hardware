/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import DB.DB;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Chrishmal Rodrigo
 */
public class SystemUser extends javax.swing.JFrame {

    /**
     * Creates new form SystemUser
     */
    public SystemUser() {
        initComponents();

        jPanel5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        genaratesystemId();
        
        loadCombox();
        Common.SystemLogger.initLogger(Customer.class).info("SystemUser interface sign");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        icon_p = new javax.swing.JLabel();
        icon_cp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        lbl_sysid = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel4.setLayout(null);

        jButton3.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(30, 20, 210, 50);

        jButton4.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(850, 20, 210, 50);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 619, 1106, 79));

        icon_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility (1).png"))); // NOI18N
        icon_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon_pMousePressed(evt);
            }
        });
        jPanel2.add(icon_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 30, 30));

        icon_cp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility (1).png"))); // NOI18N
        icon_cp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon_cpMousePressed(evt);
            }
        });
        jPanel2.add(icon_cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 460, 30, 30));

        jLabel1.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel1.setText("User Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 120, 35));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 200, 110, 35));

        jLabel2.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel2.setText("Employee Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 120, 35));

        jLabel4.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 120, 35));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 260, 35));

        jLabel5.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel5.setText("User Type");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 120, 35));

        txt_username.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        txt_username.setPreferredSize(new java.awt.Dimension(35, 0));
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 260, 35));

        jComboBox1.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 260, 35));

        jComboBox2.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin", "Super Admin" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 260, 35));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        jLabel20.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel20.setText("System User ID :-");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbl_sysid.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        lbl_sysid.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(8, 8, 8)
                .addComponent(lbl_sysid, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(909, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_sysid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1106, 30));

        jLabel6.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel6.setText("Confirm Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 120, 35));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 260, 35));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/middle line.png"))); // NOI18N
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 10, 430));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contract.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 180, 200));

        jLayeredPane2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 1106, 700));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 110));

        jButton1.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
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

        jButton2.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
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

        jButton7.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
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

        jButton6.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
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

        jButton12.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
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

        jButton13.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_employee_icon-mini.png"))); // NOI18N
        jButton13.setText("New Employee");
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton13.setIconTextGap(30);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 240, 60));

        jLayeredPane2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 261, 738));

        jPanel7.setBackground(new java.awt.Color(106, 162, 186));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nunito ExtraBold", 1, 24)); // NOI18N
        jLabel3.setText("System User Registration");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 29));

        jLayeredPane2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 1106, 40));

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
        jPanel5.add(jLabel12);

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 30));

        jLabel9.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paint-brush.png"))); // NOI18N
        jLabel9.setText("MELO HARDWARE & PAINT HOUSE");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 330, 25));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heder_image-1.png"))); // NOI18N
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jLayeredPane2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, -1));

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
       
        Employee employee = new Employee();
        employee.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!txt_username.getText().isEmpty()) {
            String id = lbl_sysid.getText();
            String name = jComboBox1.getSelectedItem().toString();
            String empid = name.substring(name.length() - 8, name.length()).replace("-", "").trim();
            String username = txt_username.getText();
            String password = new String(jPasswordField1.getPassword());
            String c_password = new String(jPasswordField2.getPassword());
            String type = jComboBox2.getSelectedItem().toString();

            if (password.equals(c_password) && !password.isEmpty()) {
                try {
                    password = Common.SystemMethods.encription(password);
                    //password = encription(password);

                    DB.iud("INSERT INTO systemuser VALUES ('" + id + "','" + empid + "','" + username + "','" + password + "','" + type + "', 1 )");
                    JOptionPane.showMessageDialog(this, "Sucsussfull... !");

                    jComboBox1.setSelectedIndex(0);
                    jComboBox2.setSelectedIndex(0);
                    txt_username.setText(null);
                    jPasswordField1.setText(null);
                    jPasswordField2.setText(null);
                    genaratesystemId();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password and Confirm Password dosent matched", "Erro", JOptionPane.ERROR_MESSAGE);
                jPasswordField1.setText("");
                jPasswordField2.setText("");
                jPasswordField1.grabFocus();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Fill all the required fields", "Erro", JOptionPane.ERROR_MESSAGE);
            txt_username.grabFocus();

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

    private void icon_pMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_pMousePressed
        if (image_p == true) {
            icon_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility (2).png")));
            image_p = false;
            jPasswordField1.setEchoChar((char) 0);

        } else {
            icon_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility (1).png")));
            image_p = true;
            jPasswordField1.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_icon_pMousePressed

    private void icon_cpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_cpMousePressed
        if (image_cp == true) {
            icon_cp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility (2).png")));
            image_cp = false;
            jPasswordField2.setEchoChar((char) 0);
        } else {
            icon_cp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility (1).png")));
            image_cp = true;
            jPasswordField2.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_icon_cpMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        txt_username.setText(null);
        jPasswordField1.setText(null);
        jPasswordField2.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SystemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemUser().setVisible(true);
            }
        });
    }

    private void loadCombox() {
        try {
            ResultSet rs = DB.search("select id, fname, lname from employee");

            while (rs.next()) {
                String emp = rs.getString("id");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");

                jComboBox1.addItem(fname + " " + lname + "  -  " + emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void genaratesystemId() {
        try {
            ResultSet dataFetch = DB.search("select count('id') as x from systemuser");
            if (dataFetch.next()) {
                int count = Integer.parseInt(dataFetch.getString("x"));
                count++;
                lbl_sysid.setText("SYS" + count);
                jComboBox2.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_cp;
    private javax.swing.JLabel icon_p;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel lbl_sysid;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
    String id;
    boolean image_p = true;
    boolean image_cp = true;

}
