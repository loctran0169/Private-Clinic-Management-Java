package quanlyphongkham.view;

import javax.swing.JOptionPane;
import quanlyphongkham.bus.UserBUS;
import quanlyphongkham.dto.UserDTO;

public class firmThayDoiMatKhau extends javax.swing.JPanel {
    
    private UserDTO usDTO = new UserDTO();
    
    public firmThayDoiMatKhau(UserDTO us) {
        initComponents();
        usDTO.setMaUS(us.getMaUS());
        usDTO.setTaiKhoan(us.getTaiKhoan());
        usDTO.setMatKhau(us.getMatKhau());
        usDTO.setMaNV(us.getMaNV());
        usDTO.setMaQuyenHan(us.getMaQuyenHan());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMatKhauCu = new javax.swing.JPasswordField();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        txtNhapLaiMatKhau = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đổi Mật Khẩu");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel3.setText("Mật Khẩu Cũ:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel4.setText("Mật Khẩu Mới:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        btnThoat.setText("Thoát");
        add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 75, 31));

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 75, 31));

        jLabel5.setText("Nhập Lại Mật Khẩu:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));
        add(txtMatKhauCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 198, -1));
        add(txtMatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 198, -1));
        add(txtNhapLaiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 198, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        UserBUS usBUS = new UserBUS();
        if (txtMatKhauCu.getText() == null)
        JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu cũ ");
        else if (!txtMatKhauCu.getText().equals(usDTO.getMatKhau()))
        JOptionPane.showMessageDialog(null, "Bạn nhập sai mật khẩu cũ ");
        else if (!txtMatKhauMoi.getText().equals(txtNhapLaiMatKhau.getText()) )
        JOptionPane.showMessageDialog(null, "Mật khẩu mới chưa trùng nhau ");
        else {
            usDTO.setMatKhau(txtMatKhauMoi.getText());
            Boolean kq = usBUS.suaMatKhau(usDTO);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thất bại.");
            } else {
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtMatKhauCu;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtNhapLaiMatKhau;
    // End of variables declaration//GEN-END:variables
}
