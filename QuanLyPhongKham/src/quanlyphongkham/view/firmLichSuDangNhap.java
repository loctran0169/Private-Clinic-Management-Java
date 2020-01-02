package quanlyphongkham.view;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.LichSuBUS;
import quanlyphongkham.bus.NhanVienBUS;
import quanlyphongkham.dto.LichSuDTO;
import quanlyphongkham.dto.NhanVienDTO;
import quanlyphongkham.dto.UserDTO;

public class firmLichSuDangNhap extends javax.swing.JPanel {

    private final LichSuBUS lsBUS = new LichSuBUS();
    private final NhanVienBUS nvBUS = new NhanVienBUS();
    
    public firmLichSuDangNhap() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtChucVu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        tb_date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGioiTinh = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLichSuDangNhap = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        dateChooserNgay = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        btnXem = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtChucVu.setEditable(false);
        add(txtChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 170, -1));

        jLabel3.setText("Mã Nhân Viên:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        jLabel9.setText("Chức Vụ:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, -1));

        txtHoVaTen.setEditable(false);
        add(txtHoVaTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 170, -1));

        tb_date.setEditable(false);
        add(tb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 170, 20));

        jLabel4.setText("Họ Và Tên:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        jLabel5.setText("Ngày Sinh:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        txtGioiTinh.setEditable(false);
        add(txtGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 170, -1));

        tbLichSuDangNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã User", "Mã Nhân Viên", "Tài Khoản", "Thời Điểm Đăng Nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLichSuDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLichSuDangNhapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLichSuDangNhap);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 5, 610, 560));

        jLabel6.setText("Giớ Tính:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        txtDiaChi.setEditable(false);
        add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 170, -1));

        dateChooserNgay.setDateFormatString("dd-MM-yyyy");
        add(dateChooserNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 170, -1));

        jLabel7.setText("Địa Chỉ:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        btnXem.setText("Xem");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });
        add(btnXem, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        txtSDT.setEditable(false);
        add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thông Tin Tài Khoản");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jLabel8.setText("SĐT:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, -1, -1));

        txtMaNhanVien.setEditable(false);
        add(txtMaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tbLichSuDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLichSuDangNhapMouseClicked
        int index = tbLichSuDangNhap.getSelectedRow();
        try {
            var nv = lsBUS.loadDuLieuNhanVienTuMaUsers(tbLichSuDangNhap.getValueAt(index, 1).toString());
            txtMaNhanVien.setText(nv.getMaNhanVien());
            txtHoVaTen.setText(nv.getHoVaTen());
            txtGioiTinh.setText(nv.getGioiTinh());
            tb_date.setText(nv.getNgaySinh());
            txtDiaChi.setText(nv.getDiaChi());
            txtSDT.setText(nv.getsDT());
            txtChucVu.setText(nv.getChucVu());
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_tbLichSuDangNhapMouseClicked

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed

        if(dateChooserNgay.getDate()==null){
            JOptionPane.showMessageDialog(null, "Chưa chọn ngày");
            return;
        }
        tbLichSuDangNhap.setModel(DbUtils.resultSetToTableModel(lsBUS.loadDuLieuLichSuDangNhap(dateChooserNgay.getDate())));

    }//GEN-LAST:event_btnXemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXem;
    private com.toedter.calendar.JDateChooser dateChooserNgay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLichSuDangNhap;
    private javax.swing.JTextField tb_date;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
