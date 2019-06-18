/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybanhang;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoaidanh
 */
public class DangNhap extends javax.swing.JFrame {

    private String id = "danh", pass = "danh";

    /**
     * Creates new form DangNhap
     */
    public DangNhap() throws IOException {
        initComponents();
        init();
        setLocation(400, 200);
        this.setResizable(false);

    }

    public void init() {

        lbDninfo.setFont(new Font("TimesRoman", Font.ITALIC, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lbDn = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        tfAc = new javax.swing.JTextField();
        lbAc = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        btnDangnhap = new javax.swing.JToggleButton();
        lbDninfo = new javax.swing.JLabel();
        lbwc = new javax.swing.JLabel();
        lbimage = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        lbDn.setText("Đăng nhập");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập vào hệ thống");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        tfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPassKeyPressed(evt);
            }
        });

        tfAc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAcKeyPressed(evt);
            }
        });

        lbAc.setText("Account");

        lbPass.setText("Password");

        btnDangnhap.setText("Log in");
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });

        lbDninfo.setText("Hệ thống bán hàng 2018 - v1.0");

        lbimage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hoaidanh\\Documents\\NetBeansProjects\\QuanLyBanHang\\welcome.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lbDninfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lbimage, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbwc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAc)
                                .addGap(7, 7, 7))
                            .addComponent(lbPass))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDangnhap)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lbwc))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbimage, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPass))
                        .addGap(18, 18, 18)
                        .addComponent(lbDninfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDangnhap)
                        .addGap(59, 59, 59))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed
        if (tfAc.getText().equals("") || tfPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Password or Id is empty.");
        }
        if (tfAc.getText().equals(id) && tfPass.getText().equals(pass)) {
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                @Override
                public void run() {

                    Menu mn = new Menu();
                    mn.setVisible(true);
                    setVisible(false);
                }
            },
                    500 // tự động gọi hàm sau n giây
            );
        }
    }//GEN-LAST:event_btnDangnhapActionPerformed

    private void tfAcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAcKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnDangnhap.doClick();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfPass.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfAc.requestFocus();
        }

    }//GEN-LAST:event_tfAcKeyPressed

    private void tfPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnDangnhap.doClick();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfPass.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfAc.requestFocus();
        }
    }//GEN-LAST:event_tfPassKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnDangnhap.doClick();
        }

    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DangNhap().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDangnhap;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbAc;
    private javax.swing.JLabel lbDn;
    private javax.swing.JLabel lbDninfo;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbimage;
    private javax.swing.JLabel lbwc;
    private javax.swing.JTextField tfAc;
    private javax.swing.JPasswordField tfPass;
    // End of variables declaration//GEN-END:variables
}
