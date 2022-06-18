/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class PasswordReset extends javax.swing.JFrame {

    /**
     * Creates new form PasswordReset
     */
    public PasswordReset() {
        initComponents();
        setEmail();
        jPasswordField1.setEnabled(false);
        jPasswordField2.setEnabled(false);
        btnSave.setEnabled(false);
         btnAgain.setEnabled(false);
            btnAgain.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        icon_p = new javax.swing.JLabel();
        icon_cp = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAgain = new javax.swing.JButton();
        btn_verify = new javax.swing.JButton();
        verifyMsg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Nunito", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reset Your Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 270, 50));

        lbl_email.setBackground(new java.awt.Color(255, 255, 255));
        lbl_email.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        lbl_email.setForeground(java.awt.Color.white);
        lbl_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 410, 50));

        txt2.setColumns(1);
        txt2.setFont(new java.awt.Font("Nunito ExtraBold", 0, 24)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setAutoscrolls(false);
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt2KeyReleased(evt);
            }
        });
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 50, 50));

        txt1.setColumns(1);
        txt1.setFont(new java.awt.Font("Nunito ExtraBold", 0, 24)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setAutoscrolls(false);
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 50, 50));

        txt4.setColumns(1);
        txt4.setFont(new java.awt.Font("Nunito ExtraBold", 0, 24)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setAutoscrolls(false);
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt4KeyReleased(evt);
            }
        });
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, 50, 50));

        txt3.setColumns(1);
        txt3.setFont(new java.awt.Font("Nunito ExtraBold", 0, 24)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setAutoscrolls(false);
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt3KeyReleased(evt);
            }
        });
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 50, 50));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 260, 35));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Nunito", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("The Verification code was sent to your Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 660, 50));

        icon_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility_white (3).png"))); // NOI18N
        icon_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon_pMousePressed(evt);
            }
        });
        getContentPane().add(icon_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 510, 30, 30));

        icon_cp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility_white (3).png"))); // NOI18N
        icon_cp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon_cpMousePressed(evt);
            }
        });
        getContentPane().add(icon_cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 590, 30, 30));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 260, 35));

        jLabel6.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, 120, 35));

        jLabel5.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("New Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 120, 35));

        btnSave.setFont(new java.awt.Font("Nunito Black", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 670, 260, 40));

        jLabel10.setBackground(new java.awt.Color(153, 255, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 2));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 350, 4));

        jLabel11.setBackground(new java.awt.Color(153, 255, 255));
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 2));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 340, 4));

        btnAgain.setFont(new java.awt.Font("Nunito Medium", 0, 14)); // NOI18N
        btnAgain.setText("Send Again");
        btnAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgainActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 340, 120, 40));

        btn_verify.setFont(new java.awt.Font("Nunito Black", 0, 18)); // NOI18N
        btn_verify.setText("Verify");
        btn_verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verifyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 120, 40));

        verifyMsg.setFont(new java.awt.Font("Nunito SemiBold", 0, 18)); // NOI18N
        verifyMsg.setForeground(java.awt.Color.white);
        verifyMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(verifyMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 520, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradiant-0002.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 986, 740));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, 150));

        jPanel4.setBackground(new java.awt.Color(16, 52, 166));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
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
        jPanel5.setLayout(new java.awt.GridLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jPanel5.add(jLabel12);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 30));

        jLabel7.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paint-brush.png"))); // NOI18N
        jLabel7.setText("MELO HARDWARE & PAINT HOUSE");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 330, 25));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heder_image-1.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 310, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(Color.red);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
    }//GEN-LAST:event_jPanel5MouseExited

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void icon_pMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_pMousePressed
        
        if (image_p == true) {
            icon_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility_white (4).png")));
            image_p = false;
            jPasswordField1.setEchoChar((char) 0);

        } else {
            icon_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility_white (3).png")));
            image_p = true;
            jPasswordField1.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_icon_pMousePressed

    private void icon_cpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_cpMousePressed
        if (image_cp == true) {
            icon_cp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility_white (4).png")));
            image_cp = false;
            jPasswordField2.setEchoChar((char) 0);
        } else {
            icon_cp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visibility_white (3).png")));
            image_cp = true;
            jPasswordField2.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_icon_cpMousePressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String p = new String(jPasswordField1.getPassword());
        String cp = new String(jPasswordField2.getPassword());
        
        if(p.equals(cp)){
            
        
       
             p = Common.SystemMethods.encription(p);
            try {
                DB.DB.iud("UPDATE systemuser SET password = '"+p+"'WHERE id = '"+Common.SystemData.getSystemUser()+"' ");
                
                
                  JOptionPane.showMessageDialog(null, "Reset Sucsussfully !.. use new password to login", "Sucsuss", JOptionPane.PLAIN_MESSAGE);
                  
                  Login login = new Login();
                  login.setVisible(true);
                  this.dispose();
                  
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erroor! ", "Error", JOptionPane.ERROR_MESSAGE);

            }
            
        }else{
                        JOptionPane.showMessageDialog(null, "Confirm password dose not match", "Error", JOptionPane.ERROR_MESSAGE);
            

        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btn_verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verifyActionPerformed
        String code = txt1.getText() + txt2.getText() + txt3.getText() + txt4.getText();
        String code1 = Common.SystemData.getCode();
        if (code.equals(code1)) {
            verifyMsg.setText("Sucsussfully Verified Reset Your Password To Proceed");
            txt1.setEnabled(false);
            txt2.setEnabled(false);
            txt3.setEnabled(false);
            txt4.setEnabled(false);
            btn_verify.setEnabled(false);

            jPasswordField1.setEnabled(true);
            jPasswordField2.setEnabled(true);
            btnSave.setEnabled(true);

        } else {
            verifyMsg.setText("Invalid Code");
            btnAgain.setEnabled(true);
            btnAgain.setVisible(true);

        }

    }//GEN-LAST:event_btn_verifyActionPerformed

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
        // TODO add your handling code here:
        if (txt1.getText().length() == 1) {
            txt2.grabFocus();
        }

    }//GEN-LAST:event_txt1KeyReleased

    private void txt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyReleased
        if (txt2.getText().length() == 1) {
            txt3.grabFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2KeyReleased

    private void txt3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyReleased
        if (txt3.getText().length() == 1) {
            txt4.grabFocus();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txt3KeyReleased

    private void txt4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyReleased
        if (txt4.getText().length() == 1) {
            btn_verify.grabFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4KeyReleased

    private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
        if (txt1.getText().length() == 1) {
            txt2.grabFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1KeyPressed

    private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
        if (txt2.getText().length() == 1) {
            txt3.grabFocus();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_txt2KeyPressed

    private void txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyPressed
        if (txt3.getText().length() == 1) {
            txt4.grabFocus();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_txt3KeyPressed

    private void btnAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgainActionPerformed
        Common.Mail.sendMail(lbl_email.getText());
    }//GEN-LAST:event_btnAgainActionPerformed

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
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordReset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgain;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btn_verify;
    private javax.swing.JLabel icon_cp;
    private javax.swing.JLabel icon_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JLabel verifyMsg;
    // End of variables declaration//GEN-END:variables
    boolean image_p = true;
    boolean image_cp = true;    
    void setEmail() {
        try {
            ResultSet search = DB.DB.search("SELECT employee.email FROM employee INNER JOIN systemuser ON systemuser.emp_id = employee.id WHERE systemuser.id = '" + Common.SystemData.getSystemUser() + "'");
            if (search.next()) {
                String email = search.getString("email");

                lbl_email.setText(email);
              Common.Mail.sendMail(email);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
