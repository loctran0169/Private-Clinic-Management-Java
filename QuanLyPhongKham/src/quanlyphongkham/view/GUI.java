/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import quanlyphongkham.dto.UserDTO;
/**
 *
 * @author Administrator
 */
public class GUI extends javax.swing.JFrame {

    UserDTO us = new UserDTO();
    public GUI(UserDTO user) {
        initComponents();
        
        us.setMaUS(user.getMaUS());
        us.setTaiKhoan(user.getTaiKhoan());
        us.setMatKhau(user.getMatKhau());
        us.setMaNV(user.getMaNV());
        us.setMaQuyenHan(user.getMaQuyenHan());
        
        this.setLocationRelativeTo(null);
        setResizable(false);
        initPanel();
    }

    public void initPanel() {
        panelBN.setLayout(new BorderLayout());
        panelBN.add(new firmBenhNhan());
        
        panelDanhSachCho.setLayout(new BorderLayout());
        panelDanhSachCho.add(new firmDanhSachCho());
        
        panelHoaDon.setLayout(new BorderLayout());
        panelHoaDon.add(new firmHoaDon());
        
        panelSaoLuu.setLayout(new BorderLayout());
        panelSaoLuu.add(new firmSaoLuu());
        
        panelKhoiPhuc.setLayout(new BorderLayout());
        panelKhoiPhuc.add(new firmKhoiPhuc());
        
        panelDanhSachKhamBenh.setLayout(new BorderLayout());
        panelDanhSachKhamBenh.add(new firmDanhSachKhamBenh());
        
        panelLapPhieuKham.setLayout(new BorderLayout());
        panelLapPhieuKham.add(new firmPhieuKham());
        
        panelCachDung.setLayout(new BorderLayout());
        panelCachDung.add(new JPanelCachDungThuoc());
        
        panelLapDonThuoc.setLayout(new BorderLayout());
        panelLapDonThuoc.add(new JPanelLapDonThuoc());
        
        panelNguoiDung.setLayout(new BorderLayout());
        panelNguoiDung.add(new JPanelNguoiDung());
        
        panelNhanVien.setLayout(new BorderLayout());
        panelNhanVien.add(new JPanelNhanVien());
        
        panelThuoc.setLayout(new BorderLayout());
        panelThuoc.add(new JPanelThongTinThuoc());
        
        panelDonVi.setLayout(new BorderLayout());
        panelDonVi.add(new firmDonVi());
        
        panelLichSuDangNhap.setLayout(new BorderLayout());
        panelLichSuDangNhap.add(new firmLichSuDangNhap());
        
        panelLoaiBenh.setLayout(new BorderLayout());
        panelLoaiBenh.add(new firmLoaiBenh());
        
        panelQuyenHan.setLayout(new BorderLayout());
        panelQuyenHan.add(new firmQuyenHan());
        
        panelThamSo.setLayout(new BorderLayout());
        panelThamSo.add(new firmThamSo());
        
        panelThayDoiMatKhau.setLayout(new BorderLayout());
        panelThayDoiMatKhau.add(new firmThayDoiMatKhau(us));
        
        panelSuDungThuoc.setLayout(new BorderLayout());
        panelSuDungThuoc.add(new firmBaoCaoSuDungThuocThang());
        
        panelDoanhThu.setLayout(new BorderLayout());
        panelDoanhThu.add(new firmBaoCaoDoanhThuThang());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane11 = new javax.swing.JTabbedPane();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        panelNguoiDung = new javax.swing.JPanel();
        panelQuyenHan = new javax.swing.JPanel();
        panelLichSuDangNhap = new javax.swing.JPanel();
        panelThayDoiMatKhau = new javax.swing.JPanel();
        panelSaoLuu = new javax.swing.JPanel();
        panelKhoiPhuc = new javax.swing.JPanel();
        panelBenhNhan1 = new javax.swing.JTabbedPane();
        panelNhanVien = new javax.swing.JPanel();
        panelBN = new javax.swing.JPanel();
        panelDanhSachKhamBenh = new javax.swing.JPanel();
        panelDanhSachCho = new javax.swing.JPanel();
        panelLapPhieuKham = new javax.swing.JPanel();
        panelLapDonThuoc = new javax.swing.JPanel();
        panelHoaDon = new javax.swing.JPanel();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        panelThamSo = new javax.swing.JPanel();
        panelThuoc = new javax.swing.JPanel();
        panelDonVi = new javax.swing.JPanel();
        panelCachDung = new javax.swing.JPanel();
        panelLoaiBenh = new javax.swing.JPanel();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        panelDoanhThu = new javax.swing.JPanel();
        panelSuDungThuoc = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Phòng Mạch Tư");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 630));

        jTabbedPane11.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout panelNguoiDungLayout = new javax.swing.GroupLayout(panelNguoiDung);
        panelNguoiDung.setLayout(panelNguoiDungLayout);
        panelNguoiDungLayout.setHorizontalGroup(
            panelNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelNguoiDungLayout.setVerticalGroup(
            panelNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Người dùng", panelNguoiDung);

        javax.swing.GroupLayout panelQuyenHanLayout = new javax.swing.GroupLayout(panelQuyenHan);
        panelQuyenHan.setLayout(panelQuyenHanLayout);
        panelQuyenHanLayout.setHorizontalGroup(
            panelQuyenHanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelQuyenHanLayout.setVerticalGroup(
            panelQuyenHanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Quyền hạn", panelQuyenHan);

        javax.swing.GroupLayout panelLichSuDangNhapLayout = new javax.swing.GroupLayout(panelLichSuDangNhap);
        panelLichSuDangNhap.setLayout(panelLichSuDangNhapLayout);
        panelLichSuDangNhapLayout.setHorizontalGroup(
            panelLichSuDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelLichSuDangNhapLayout.setVerticalGroup(
            panelLichSuDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Lịch sử đăng nhập", panelLichSuDangNhap);

        javax.swing.GroupLayout panelThayDoiMatKhauLayout = new javax.swing.GroupLayout(panelThayDoiMatKhau);
        panelThayDoiMatKhau.setLayout(panelThayDoiMatKhauLayout);
        panelThayDoiMatKhauLayout.setHorizontalGroup(
            panelThayDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelThayDoiMatKhauLayout.setVerticalGroup(
            panelThayDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Thay đổi mật khẩu", panelThayDoiMatKhau);

        javax.swing.GroupLayout panelSaoLuuLayout = new javax.swing.GroupLayout(panelSaoLuu);
        panelSaoLuu.setLayout(panelSaoLuuLayout);
        panelSaoLuuLayout.setHorizontalGroup(
            panelSaoLuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelSaoLuuLayout.setVerticalGroup(
            panelSaoLuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Sao lưu", panelSaoLuu);

        javax.swing.GroupLayout panelKhoiPhucLayout = new javax.swing.GroupLayout(panelKhoiPhuc);
        panelKhoiPhuc.setLayout(panelKhoiPhucLayout);
        panelKhoiPhucLayout.setHorizontalGroup(
            panelKhoiPhucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelKhoiPhucLayout.setVerticalGroup(
            panelKhoiPhucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Khôi phục", panelKhoiPhuc);

        jTabbedPane11.addTab("Hệ thống", jTabbedPane7);

        javax.swing.GroupLayout panelNhanVienLayout = new javax.swing.GroupLayout(panelNhanVien);
        panelNhanVien.setLayout(panelNhanVienLayout);
        panelNhanVienLayout.setHorizontalGroup(
            panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelNhanVienLayout.setVerticalGroup(
            panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Nhân viên", panelNhanVien);

        javax.swing.GroupLayout panelBNLayout = new javax.swing.GroupLayout(panelBN);
        panelBN.setLayout(panelBNLayout);
        panelBNLayout.setHorizontalGroup(
            panelBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelBNLayout.setVerticalGroup(
            panelBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Bệnh nhân", panelBN);

        javax.swing.GroupLayout panelDanhSachKhamBenhLayout = new javax.swing.GroupLayout(panelDanhSachKhamBenh);
        panelDanhSachKhamBenh.setLayout(panelDanhSachKhamBenhLayout);
        panelDanhSachKhamBenhLayout.setHorizontalGroup(
            panelDanhSachKhamBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelDanhSachKhamBenhLayout.setVerticalGroup(
            panelDanhSachKhamBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Danh sách khám bệnh", panelDanhSachKhamBenh);

        javax.swing.GroupLayout panelDanhSachChoLayout = new javax.swing.GroupLayout(panelDanhSachCho);
        panelDanhSachCho.setLayout(panelDanhSachChoLayout);
        panelDanhSachChoLayout.setHorizontalGroup(
            panelDanhSachChoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelDanhSachChoLayout.setVerticalGroup(
            panelDanhSachChoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Danh sách chờ", panelDanhSachCho);

        javax.swing.GroupLayout panelLapPhieuKhamLayout = new javax.swing.GroupLayout(panelLapPhieuKham);
        panelLapPhieuKham.setLayout(panelLapPhieuKhamLayout);
        panelLapPhieuKhamLayout.setHorizontalGroup(
            panelLapPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelLapPhieuKhamLayout.setVerticalGroup(
            panelLapPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Lập phiếu khám bệnh", panelLapPhieuKham);

        javax.swing.GroupLayout panelLapDonThuocLayout = new javax.swing.GroupLayout(panelLapDonThuoc);
        panelLapDonThuoc.setLayout(panelLapDonThuocLayout);
        panelLapDonThuocLayout.setHorizontalGroup(
            panelLapDonThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelLapDonThuocLayout.setVerticalGroup(
            panelLapDonThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Lập đơn thốc", panelLapDonThuoc);

        javax.swing.GroupLayout panelHoaDonLayout = new javax.swing.GroupLayout(panelHoaDon);
        panelHoaDon.setLayout(panelHoaDonLayout);
        panelHoaDonLayout.setHorizontalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelHoaDonLayout.setVerticalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Lập hóa đơn", panelHoaDon);

        jTabbedPane11.addTab("Quản lý", panelBenhNhan1);

        javax.swing.GroupLayout panelThamSoLayout = new javax.swing.GroupLayout(panelThamSo);
        panelThamSo.setLayout(panelThamSoLayout);
        panelThamSoLayout.setHorizontalGroup(
            panelThamSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelThamSoLayout.setVerticalGroup(
            panelThamSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("Tham số", panelThamSo);

        javax.swing.GroupLayout panelThuocLayout = new javax.swing.GroupLayout(panelThuoc);
        panelThuoc.setLayout(panelThuocLayout);
        panelThuocLayout.setHorizontalGroup(
            panelThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelThuocLayout.setVerticalGroup(
            panelThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("Thuốc", panelThuoc);

        javax.swing.GroupLayout panelDonViLayout = new javax.swing.GroupLayout(panelDonVi);
        panelDonVi.setLayout(panelDonViLayout);
        panelDonViLayout.setHorizontalGroup(
            panelDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelDonViLayout.setVerticalGroup(
            panelDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("Đơn vị tính", panelDonVi);

        javax.swing.GroupLayout panelCachDungLayout = new javax.swing.GroupLayout(panelCachDung);
        panelCachDung.setLayout(panelCachDungLayout);
        panelCachDungLayout.setHorizontalGroup(
            panelCachDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelCachDungLayout.setVerticalGroup(
            panelCachDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("Cách dùng", panelCachDung);

        javax.swing.GroupLayout panelLoaiBenhLayout = new javax.swing.GroupLayout(panelLoaiBenh);
        panelLoaiBenh.setLayout(panelLoaiBenhLayout);
        panelLoaiBenhLayout.setHorizontalGroup(
            panelLoaiBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelLoaiBenhLayout.setVerticalGroup(
            panelLoaiBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("Loại bệnh", panelLoaiBenh);

        jTabbedPane11.addTab("Danh mục", jTabbedPane9);

        javax.swing.GroupLayout panelDoanhThuLayout = new javax.swing.GroupLayout(panelDoanhThu);
        panelDoanhThu.setLayout(panelDoanhThuLayout);
        panelDoanhThuLayout.setHorizontalGroup(
            panelDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelDoanhThuLayout.setVerticalGroup(
            panelDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane10.addTab("Báo  cáo doanh thu theo tháng", panelDoanhThu);

        javax.swing.GroupLayout panelSuDungThuocLayout = new javax.swing.GroupLayout(panelSuDungThuoc);
        panelSuDungThuoc.setLayout(panelSuDungThuocLayout);
        panelSuDungThuocLayout.setHorizontalGroup(
            panelSuDungThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        panelSuDungThuocLayout.setVerticalGroup(
            panelSuDungThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane10.addTab("Báo cáo sử dụng thống theo tháng", panelSuDungThuoc);

        jTabbedPane11.addTab("Báo cáo", jTabbedPane10);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Giảng viên hướng dẫn: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Lê Thanh Trọng");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nhóm thực hiện:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Trần Hữu Lộc - 17520700");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nguyễn Trọng Khanh - 17520626");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nguyễn Văn Minh - 17520759");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Đồ án quản lý phòng mạch tư");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jTabbedPane11.addTab("Giới thiệu", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane11)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane11)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI(new UserDTO("US001", "admin", "admin", "NV001", "QH001")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JPanel panelBN;
    private javax.swing.JTabbedPane panelBenhNhan1;
    private javax.swing.JPanel panelCachDung;
    private javax.swing.JPanel panelDanhSachCho;
    private javax.swing.JPanel panelDanhSachKhamBenh;
    private javax.swing.JPanel panelDoanhThu;
    private javax.swing.JPanel panelDonVi;
    private javax.swing.JPanel panelHoaDon;
    private javax.swing.JPanel panelKhoiPhuc;
    private javax.swing.JPanel panelLapDonThuoc;
    private javax.swing.JPanel panelLapPhieuKham;
    private javax.swing.JPanel panelLichSuDangNhap;
    private javax.swing.JPanel panelLoaiBenh;
    private javax.swing.JPanel panelNguoiDung;
    private javax.swing.JPanel panelNhanVien;
    private javax.swing.JPanel panelQuyenHan;
    private javax.swing.JPanel panelSaoLuu;
    private javax.swing.JPanel panelSuDungThuoc;
    private javax.swing.JPanel panelThamSo;
    private javax.swing.JPanel panelThayDoiMatKhau;
    private javax.swing.JPanel panelThuoc;
    // End of variables declaration//GEN-END:variables
}
