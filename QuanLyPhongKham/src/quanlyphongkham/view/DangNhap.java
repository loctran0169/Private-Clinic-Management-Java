/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import quanlyphongkham.bus.LichSuBUS;
import quanlyphongkham.bus.UserBUS;
import quanlyphongkham.dto.LichSuDTO;
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
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel3.setText("Tài Khoản:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });
        getContentPane().add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 204, -1));

        jLabel4.setText("Mật Khẩu:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtThoat.setText("Thoát");
        txtThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThoatActionPerformed(evt);
            }
        });
        getContentPane().add(txtThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 87, 37));

        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 37));

        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });
        getContentPane().add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 204, -1));

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
                LichSuBUS busLS = new LichSuBUS();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                Date dateNgapLap = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(dtf.format(now));
                busLS.them(new LichSuDTO(us.getMaUS(), convertUtilToSql(dateNgapLap)));
                GUI f = new GUI(us);
                f.setVisible(true);
                dispose();
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

    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
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
