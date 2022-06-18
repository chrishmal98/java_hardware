/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import DB.DB;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Chrishmal Rodrigo
 */
public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
    public Reports() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daily");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 570, 24));

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jButton3.setText("Day");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 280, 40));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 280, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 570, 180));

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Stock Reports");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 570, 24));

        jButton14.setBackground(java.awt.Color.white);
        jButton14.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jButton14.setText("Full Stock");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 280, 40));

        jButton15.setBackground(java.awt.Color.white);
        jButton15.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jButton15.setText("Low Qty");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 280, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 570, 170));

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Custom Reports");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 570, 24));

        jDateChooser2.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        jPanel8.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, 40));

        jLabel5.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("To");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 90, 40));

        jButton5.setBackground(java.awt.Color.white);
        jButton5.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jButton5.setText("Month");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 280, 40));

        jDateChooser3.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        jPanel8.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 180, 40));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 570, 230));

        jPanel9.setBackground(new java.awt.Color(106, 162, 186));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Nunito ExtraBold", 1, 24)); // NOI18N
        jLabel6.setText("System Reports");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 29));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1106, 40));
        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contract.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 180, 200));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/middle line.png"))); // NOI18N
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 10, 430));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 1106, 738));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setFocusPainted(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 110));

        jButton21.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoice_icon_mini.png"))); // NOI18N
        jButton21.setText("Invoice");
        jButton21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton21.setIconTextGap(30);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, 60));

        jButton22.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/po_icon_mini.png"))); // NOI18N
        jButton22.setText("P O");
        jButton22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton22.setIconTextGap(30);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, 60));

        jButton23.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_suplier_icon_mini.png"))); // NOI18N
        jButton23.setText("New Suplier");
        jButton23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton23.setIconTextGap(30);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 240, 60));

        jButton24.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_item_icon_mini.png"))); // NOI18N
        jButton24.setText("New Item");
        jButton24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton24.setIconTextGap(30);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 240, 60));

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
        jButton13.setText("Reports");
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

        jPanel10.setBackground(new java.awt.Color(16, 52, 166));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel10.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 30));

        jLabel19.setFont(new java.awt.Font("Nunito", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paint-brush.png"))); // NOI18N
        jLabel19.setText("MELO HARDWARE & PAINT HOUSE");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 330, 25));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heder_image-1.png"))); // NOI18N
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Date date = jDateChooser1.getDate();
            InputStream is = new FileInputStream("D:\\jasper reports\\hardware\\report2.jasper");
            // String path = "D:\\jasper reports\\sadb1\\report3.jrxml";
            // JasperReport compilereport = JasperCompileManager.compileReport(path);
            JREmptyDataSource datasource = new JREmptyDataSource();
            Map<String, Object> map = new HashMap<>();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            map.put("date", sdf.format(date));

            JasperPrint fillReport = JasperFillManager.fillReport(is, map, DB.getNewConnection());
            JasperViewer.viewReport(fillReport, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            String path = "D:\\jasper reports\\hardware\\report1.jasper";
            InputStream is1 = new FileInputStream(path);
            JREmptyDataSource datasource = new JREmptyDataSource();
            JasperPrint fillReport = JasperFillManager.fillReport(is1, null, DB.getNewConnection());
            JasperViewer.viewReport(fillReport, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            Date sDate = jDateChooser2.getDate();
            Date lDate = jDateChooser3.getDate();
            InputStream is = new FileInputStream("D:\\jasper reports\\hardware\\report3.jasper");
            // String path = "D:\\jasper reports\\sadb1\\report3.jrxml";
            // JasperReport compilereport = JasperCompileManager.compileReport(path);
            JREmptyDataSource datasource = new JREmptyDataSource();
            Map<String, Object> map = new HashMap<>();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            map.put("sdate", sdf.format(sDate));
            map.put("ldate", sdf.format(lDate));

            JasperPrint fillReport = JasperFillManager.fillReport(is, map, DB.getNewConnection());
            JasperViewer.viewReport(fillReport, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        Invoice invoice = new Invoice();
        invoice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        Po po = new Po();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        Suplier suplier = new Suplier();
        suplier.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        ItemRegistration item = new ItemRegistration();
        item.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton24ActionPerformed

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

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited

    }//GEN-LAST:event_jPanel5MouseExited

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
