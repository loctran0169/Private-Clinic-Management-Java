/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.awt.HeadlessException;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.LichSuBUS;
import quanlyphongkham.bus.NhanVienBUS;
import quanlyphongkham.dto.LichSuDTO;
import quanlyphongkham.dto.NhanVienDTO;
import quanlyphongkham.dto.UserDTO;


public class LichSuDangNhap extends javax.swing.JFrame {
    private final UserDTO usDTO = new UserDTO();
    private final NhanVienDTO nvdto = new NhanVienDTO();
    private final LichSuDTO lsDTO = new LichSuDTO();
    private final LichSuBUS lsBUS = new LichSuBUS();
    private final NhanVienBUS nvBUS = new NhanVienBUS();
    
    public LichSuDangNhap(UserDTO us, LichSuDTO ls) {
        initComponents();
        
        
        usDTO.setMaUS(us.getMaUS());
        usDTO.setTaiKhoan(us.getTaiKhoan()); 
        usDTO.setMatKhau(us.getMatKhau()); 
        usDTO.setMaNV(us.getMaNV()); 
        usDTO.setMaQuyenHan(us.getMaQuyenHan());
        lsDTO.setMaUS(ls.getMaUS()); 
        lsDTO.setThoiGianDN(ls.getThoiGianDN()); 
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbLichSuDangNhap = new javax.swing.JTable();
        dateChooserNgay = new com.toedter.calendar.JDateChooser();
        btnXem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGioiTinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtChucVu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tb_date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lịch Sử Đăng Nhập");

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

        dateChooserNgay.setDateFormatString("dd-MM-yyyy");

        btnXem.setText("Xem");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thông Tin Tài Khoản");

        txtMaNhanVien.setEditable(false);

        jLabel3.setText("Mã Nhân Viên:");

        txtHoVaTen.setEditable(false);

        jLabel4.setText("Họ Và Tên:");

        jLabel5.setText("Ngày Sinh:");

        txtGioiTinh.setEditable(false);

        jLabel6.setText("Giớ Tính:");

        txtDiaChi.setEditable(false);

        jLabel7.setText("Địa Chỉ:");

        txtSDT.setEditable(false);

        jLabel8.setText("SĐT:");

        txtChucVu.setEditable(false);

        jLabel9.setText("Chức Vụ:");

        tb_date.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4))
                                            .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtHoVaTen)
                                        .addComponent(txtMaNhanVien)
                                        .addComponent(txtGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(tb_date)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSDT)
                                        .addComponent(txtDiaChi)
                                        .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateChooserNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXem)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
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

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichSuDangNhap(new UserDTO(),new LichSuDTO()).setVisible(true);
            }
        });
    }

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
