/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import quanlyphongkham.bus.UserBUS;
import quanlyphongkham.dto.UserDTO;


public class DangNhap extends javax.swing.JFrame {

   
    public DangNhap() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtThoat = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần Mềm Quản Lý Phòng Khám");
        setName("frmLogIn"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel3.setText("Tài Khoản:");

        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });

        jLabel4.setText("Mật Khẩu:");

        txtThoat.setText("Thoát");
        txtThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThoatActionPerformed(evt);
            }
        });

        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDangNhap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(txtThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
       
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        try {
            UserDTO us = new UserDTO();
            us.setTaiKhoan(txtTaiKhoan.getText());
            us.setMatKhau(txtMatKhau.getText());
            UserBUS bus = new UserBUS();
            JTable jTable = bus.dangNhap(us);         
            if (jTable.getRowCount() > 0) {
                //gán các thông tin của người đăng nhập cho user
                us.setMaUS(jTable.getModel().getValueAt(0, 0).toString());
                us.setTaiKhoan(jTable.getModel().getValueAt(0, 1).toString());
                us.setMatKhau(jTable.getModel().getValueAt(0, 2).toString());
                us.setMaNV(jTable.getModel().getValueAt(0, 3).toString());
                us.setMaQuyenHan(jTable.getModel().getValueAt(0, 4).toString());
               
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                //mo form chinh               
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không chính xác");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
            UserDTO us = new UserDTO();
            us.setTaiKhoan(txtTaiKhoan.getText());
            us.setMatKhau(txtMatKhau.getText());
            UserBUS bus = new UserBUS();
            JTable jTable = bus.dangNhap(us);         
            if (jTable.getRowCount() > 0) {
                //gán các thông tin của người đăng nhập cho user
                us.setMaUS(jTable.getModel().getValueAt(0, 0).toString());
                us.setTaiKhoan(jTable.getModel().getValueAt(0, 1).toString());
                us.setMatKhau(jTable.getModel().getValueAt(0, 2).toString());
                us.setMaNV(jTable.getModel().getValueAt(0, 3).toString());
                us.setMaQuyenHan(jTable.getModel().getValueAt(0, 4).toString());
               
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                //mo form chinh               
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không chính xác");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void txtThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThoatActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_txtThoatActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JButton txtThoat;
    // End of variables declaration//GEN-END:variables
}
