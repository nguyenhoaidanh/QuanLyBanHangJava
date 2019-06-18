/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybanhang;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoaidanh
 */
public class Menu extends javax.swing.JFrame {

    private DefaultListModel model;
    ArrayList<String> Monan = new ArrayList<String>();
    public int SoMonAn = 0;
    public long tien = 0;
    String[] flist;

    /**
     * Creates new form Menu
     */
    public Menu() { //tenmon - gia
        initComponents();
        setLocation(250, 70);
        setResizable(false);
        init(); DefaultListModel mo = new DefaultListModel();
        DefaultListModel mo1 = new DefaultListModel();
        flist = new database().exe();
        try {

            if (flist.length != 0) {
               
                for (int i = 0; i < flist.length; i++) {
                        if(flist[i]!=null&&i<13)
                        mo.addElement(flist[i]);
                        if(flist[i]!=null&&i>=13)
                        mo1.addElement(flist[i]);
                   
                    System.out.println("--"+flist[i]);
                }
                listFood.setModel(mo);
                listDrink.setModel(mo1);
            }
            else System.out.println("Ko dua dc vao list");
        } catch (Exception e) {
        }
    }

    public void init() {
        btnTien.requestFocus();
        model = new DefaultListModel();
        lbFood.setHorizontalAlignment(JLabel.CENTER);
        lbDrink.setHorizontalAlignment(JLabel.CENTER);
        lbSelected.setHorizontalAlignment(JLabel.CENTER);
        lbDrink.setForeground(Color.blue);
        lbFood.setForeground(Color.blue);
        lbFood.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 15));
        lbDrink.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 15));
        lbSelected.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 15));
        lbSelected.setForeground(Color.red);
        lbchao.setForeground(Color.red);
        lbchao.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 35));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listFood = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listDrink = new javax.swing.JList<>();
        lbFood = new javax.swing.JLabel();
        lbDrink = new javax.swing.JLabel();
        lbmenu = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        selectedlist = new javax.swing.JList<>();
        lbSelected = new javax.swing.JLabel();
        btnGetf = new javax.swing.JButton();
        btnGetd = new javax.swing.JButton();
        btnTien = new javax.swing.JButton();
        lbinformation = new javax.swing.JLabel();
        cbnum1 = new javax.swing.JComboBox<>();
        cbnum2 = new javax.swing.JComboBox<>();
        lb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tfuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbchao = new javax.swing.JLabel();
        btnHuyall = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jScrollPane1.setViewportView(listFood);

        jScrollPane2.setViewportView(listDrink);

        lbFood.setText("FOOD");

        lbDrink.setText("DRINK");

        lbmenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hoaidanh\\Documents\\NetBeansProjects\\QuanLyBanHang\\menu.jpg")); // NOI18N

        jScrollPane3.setViewportView(selectedlist);

        lbSelected.setText("SELECTED");

        btnGetf.setText("Get");
        btnGetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetfActionPerformed(evt);
            }
        });

        btnGetd.setText("Get");
        btnGetd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetdActionPerformed(evt);
            }
        });

        btnTien.setText(" In hóa đơn");
        btnTien.setToolTipText("");
        btnTien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienActionPerformed(evt);
            }
        });
        btnTien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTienKeyPressed(evt);
            }
        });

        lbinformation.setText("Hệ thống bán hàng - Nguyễn Hoài Danh 2018 - v1.2");

        cbnum1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnum1ActionPerformed(evt);
            }
        });

        cbnum2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnum2ActionPerformed(evt);
            }
        });

        lb.setText("Số lượng");

        jLabel2.setText("Số lượng");

        jLabel3.setText("Khách hàng:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tfuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfuserActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên khách hàng");

        lbchao.setText("Kính chào");

        btnHuyall.setText("Hủy tất cả");
        btnHuyall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyallActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb)
                            .addComponent(cbnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGetf))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGetd)
                            .addComponent(jLabel2)
                            .addComponent(cbnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbmenu)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tfuser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbchao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHuyall))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(lbinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTien, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(lbDrink, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGetf))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbFood)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(btnGetd)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbchao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(228, 228, 228))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSelected)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnHuy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHuyall)))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbinformation)
                    .addComponent(btnTien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetfActionPerformed
        btnTien.requestFocus();
        try {
            model.addElement(cbnum1.getSelectedItem().toString() + "  " + listFood.getSelectedValue().toString());
            selectedlist.setModel(model);
            Monan.add(cbnum1.getSelectedItem().toString() + "  " + listFood.getSelectedValue().toString());
            SoMonAn++;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnGetfActionPerformed

    private void btnGetdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetdActionPerformed
        btnTien.requestFocus();
        try {
            model.addElement(cbnum2.getSelectedItem().toString() + "  " + listDrink.getSelectedValue().toString());
            selectedlist.setModel(model);
            Monan.add(cbnum2.getSelectedItem().toString() + "  " + listDrink.getSelectedValue().toString());
            SoMonAn++;
        } catch (Exception e) {

        }


    }//GEN-LAST:event_btnGetdActionPerformed
    private void huyall() {
        Monan.removeAll(Monan);
        SoMonAn = 0;

    }
    private void btnTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienActionPerformed
        btnTien.requestFocus();
        Hoadon hd = new Hoadon();

        if (!lamhoadon().equals("")) {
            hd.setVisible(true);
            hd.makehoadon(lamhoadon());
        }
    }//GEN-LAST:event_btnTienActionPerformed

    private void btnTienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTienKeyPressed
        btnTien.requestFocus();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Hoadon hd = new Hoadon();
            if (!lamhoadon().equals("")) {
                hd.setVisible(true);
                hd.makehoadon(lamhoadon());
            }
        }
    }//GEN-LAST:event_btnTienKeyPressed

    private void cbnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnum1ActionPerformed
        btnTien.requestFocus();
    }//GEN-LAST:event_cbnum1ActionPerformed

    private void tfuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfuserActionPerformed
        btnTien.requestFocus();
    }//GEN-LAST:event_tfuserActionPerformed

    private void cbnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnum2ActionPerformed
        btnTien.requestFocus();
    }//GEN-LAST:event_cbnum2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        try {
            DefaultListModel model = (DefaultListModel) selectedlist.getModel();

            int selectedIndex = selectedlist.getSelectedIndex();
            if (selectedIndex != -1) {
                model.remove(selectedIndex);
                SoMonAn--;
                Monan.remove(selectedIndex);

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnHuyallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyallActionPerformed
        try {
            DefaultListModel model = (DefaultListModel) selectedlist.getModel();

            model.removeAllElements();
            huyall();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnHuyallActionPerformed
    public String lamhoadon() {
        if (SoMonAn == 0) {
            JOptionPane.showMessageDialog(null, "Chưa chọn món ăn nào!!!");
            return "";
        }
        String out = "";
        if (tfuser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập tên khách hàng!!!");
            return "";
        }
        out = "Tên khách hàng: " + tfuser.getText() + "\n" + "--------------------------------------------------------------\n";
        int num;
        int gia;
        for (String var : Monan) {
            if (var != null) {

                String[] tem = var.split("\\-");

                String[] words = var.split("\\s");
                num = Integer.parseInt(words[0]);
                gia = Integer.parseInt(words[words.length - 1].replace("d", ""));
                tien += num * gia;
                String str = String.format("%0$" + (25 - tem[0].length()) + "s", num);
                String str1 = String.format("%0$" + (28 - tem[0].length() - str.length()) + "s", " x ");
                String str2 = String.format("%0$" + (35 - tem[0].length() - str.length() - str1.length()) + "s", gia);
                String str3 = String.format("%0$" + (43 - tem[0].length() - str.length() - str1.length() - str2.length()) + "s", num * gia);
                out += (tem[0] + ":" + str + str1 + str2 + "  =  " + str3 + "d\n");
            }
        }
        out += "--------------------------------------------------------------\n" + "Tổng tiền: ";
        String str4 = String.format("%0$" + 50 + "s", tien + "d");
        out += str4;
        System.out.print(out + "\n");

        tien = 0;
        return out;
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetd;
    private javax.swing.JButton btnGetf;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnHuyall;
    private javax.swing.JButton btnTien;
    private javax.swing.JComboBox<String> cbnum1;
    private javax.swing.JComboBox<String> cbnum2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbDrink;
    private javax.swing.JLabel lbFood;
    private javax.swing.JLabel lbSelected;
    private javax.swing.JLabel lbchao;
    private javax.swing.JLabel lbinformation;
    private javax.swing.JLabel lbmenu;
    private javax.swing.JList<String> listDrink;
    private javax.swing.JList<String> listFood;
    private javax.swing.JList<String> selectedlist;
    private javax.swing.JTextField tfuser;
    // End of variables declaration//GEN-END:variables
}
