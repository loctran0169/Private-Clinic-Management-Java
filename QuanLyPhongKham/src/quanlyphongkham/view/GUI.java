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
        
        if(user.getMaQuyenHan().equals("QH002"))
            phanQuyen();
    }

    public void phanQuyen(){
        panelHeThong.remove(panelNguoiDung);
        panelHeThong.remove(panelQuyenHan);
        panelHeThong.remove(panelSaoLuu);
        panelHeThong.remove(panelKhoiPhuc);
        
        panelQuanLy.remove(panelNhanVien);
        
        panelMain.remove(panelDanhMuc);
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
        
        panelThongTin.setLayout(new BorderLayout());
        panelThongTin.add(new JPanelThongTinTaiKhoan(us));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JTabbedPane();
        panelHeThong = new javax.swing.JTabbedPane();
        panelThongTin = new javax.swing.JPanel();
        panelNguoiDung = new javax.swing.JPanel();
        panelQuyenHan = new javax.swing.JPanel();
        panelLichSuDangNhap = new javax.swing.JPanel();
        panelThayDoiMatKhau = new javax.swing.JPanel();
        panelSaoLuu = new javax.swing.JPanel();
        panelKhoiPhuc = new javax.swing.JPanel();
        panelQuanLy = new javax.swing.JTabbedPane();
        panelNhanVien = new javax.swing.JPanel();
        panelBN = new javax.swing.JPanel();
        panelDanhSachKhamBenh = new javax.swing.JPanel();
        panelDanhSachCho = new javax.swing.JPanel();
        panelLapPhieuKham = new javax.swing.JPanel();
        panelLapDonThuoc = new javax.swing.JPanel();
        panelHoaDon = new javax.swing.JPanel();
        panelDanhMuc = new javax.swing.JTabbedPane();
        panelThamSo = new javax.swing.JPanel();
        panelThuoc = new javax.swing.JPanel();
        panelDonVi = new javax.swing.JPanel();
        panelCachDung = new javax.swing.JPanel();
        panelLoaiBenh = new javax.swing.JPanel();
        panelBaoCao = new javax.swing.JTabbedPane();
        panelDoanhThu = new javax.swing.JPanel();
        panelSuDungThuoc = new javax.swing.JPanel();
        panelGioiThieu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Phòng Mạch Tư");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 630));

        panelMain.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout panelThongTinLayout = new javax.swing.GroupLayout(panelThongTin);
        panelThongTin.setLayout(panelThongTinLayout);
        panelThongTinLayout.setHorizontalGroup(
            panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelThongTinLayout.setVerticalGroup(
            panelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelHeThong.addTab("Thông tin tài khoản", new javax.swing.ImageIcon(getClass().getResource("/image/thông tin.png")), panelThongTin); // NOI18N

        javax.swing.GroupLayout panelNguoiDungLayout = new javax.swing.GroupLayout(panelNguoiDung);
        panelNguoiDung.setLayout(panelNguoiDungLayout);
        panelNguoiDungLayout.setHorizontalGroup(
            panelNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelNguoiDungLayout.setVerticalGroup(
            panelNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelHeThong.addTab("Người dùng", new javax.swing.ImageIcon(getClass().getResource("/image/người dùng.png")), panelNguoiDung); // NOI18N

        javax.swing.GroupLayout panelQuyenHanLayout = new javax.swing.GroupLayout(panelQuyenHan);
        panelQuyenHan.setLayout(panelQuyenHanLayout);
        panelQuyenHanLayout.setHorizontalGroup(
            panelQuyenHanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelQuyenHanLayout.setVerticalGroup(
            panelQuyenHanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelHeThong.addTab("Quyền hạn", new javax.swing.ImageIcon(getClass().getResource("/image/vai trò và quyền hạn.png")), panelQuyenHan); // NOI18N

        javax.swing.GroupLayout panelLichSuDangNhapLayout = new javax.swing.GroupLayout(panelLichSuDangNhap);
        panelLichSuDangNhap.setLayout(panelLichSuDangNhapLayout);
        panelLichSuDangNhapLayout.setHorizontalGroup(
            panelLichSuDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelLichSuDangNhapLayout.setVerticalGroup(
            panelLichSuDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelHeThong.addTab("Lịch sử đăng nhập", new javax.swing.ImageIcon(getClass().getResource("/image/noname.png")), panelLichSuDangNhap); // NOI18N

        javax.swing.GroupLayout panelThayDoiMatKhauLayout = new javax.swing.GroupLayout(panelThayDoiMatKhau);
        panelThayDoiMatKhau.setLayout(panelThayDoiMatKhauLayout);
        panelThayDoiMatKhauLayout.setHorizontalGroup(
            panelThayDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelThayDoiMatKhauLayout.setVerticalGroup(
            panelThayDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelHeThong.addTab("Thay đổi mật khẩu", new javax.swing.ImageIcon(getClass().getResource("/image/thay đổi mật khẩu.png")), panelThayDoiMatKhau); // NOI18N

        javax.swing.GroupLayout panelSaoLuuLayout = new javax.swing.GroupLayout(panelSaoLuu);
        panelSaoLuu.setLayout(panelSaoLuuLayout);
        panelSaoLuuLayout.setHorizontalGroup(
            panelSaoLuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelSaoLuuLayout.setVerticalGroup(
            panelSaoLuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelHeThong.addTab("Sao lưu", new javax.swing.ImageIcon(getClass().getResource("/image/sao lưu.png")), panelSaoLuu); // NOI18N

        javax.swing.GroupLayout panelKhoiPhucLayout = new javax.swing.GroupLayout(panelKhoiPhuc);
        panelKhoiPhuc.setLayout(panelKhoiPhucLayout);
        panelKhoiPhucLayout.setHorizontalGroup(
            panelKhoiPhucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelKhoiPhucLayout.setVerticalGroup(
            panelKhoiPhucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelHeThong.addTab("Khôi phục", new javax.swing.ImageIcon(getClass().getResource("/image/khôi phục.png")), panelKhoiPhuc); // NOI18N

        panelMain.addTab("Hệ thống", new javax.swing.ImageIcon(getClass().getResource("/image/hệ thống.png")), panelHeThong); // NOI18N

        javax.swing.GroupLayout panelNhanVienLayout = new javax.swing.GroupLayout(panelNhanVien);
        panelNhanVien.setLayout(panelNhanVienLayout);
        panelNhanVienLayout.setHorizontalGroup(
            panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelNhanVienLayout.setVerticalGroup(
            panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelQuanLy.addTab("Nhân viên", new javax.swing.ImageIcon(getClass().getResource("/image/quản lí nhân viên phòng khám.png")), panelNhanVien); // NOI18N

        javax.swing.GroupLayout panelBNLayout = new javax.swing.GroupLayout(panelBN);
        panelBN.setLayout(panelBNLayout);
        panelBNLayout.setHorizontalGroup(
            panelBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelBNLayout.setVerticalGroup(
            panelBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelQuanLy.addTab("Bệnh nhân", new javax.swing.ImageIcon(getClass().getResource("/image/quản lí bệnh nhân.png")), panelBN); // NOI18N

        javax.swing.GroupLayout panelDanhSachKhamBenhLayout = new javax.swing.GroupLayout(panelDanhSachKhamBenh);
        panelDanhSachKhamBenh.setLayout(panelDanhSachKhamBenhLayout);
        panelDanhSachKhamBenhLayout.setHorizontalGroup(
            panelDanhSachKhamBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelDanhSachKhamBenhLayout.setVerticalGroup(
            panelDanhSachKhamBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelQuanLy.addTab("Danh sách khám bệnh", new javax.swing.ImageIcon(getClass().getResource("/image/danh sách khám bệnh.png")), panelDanhSachKhamBenh); // NOI18N

        javax.swing.GroupLayout panelDanhSachChoLayout = new javax.swing.GroupLayout(panelDanhSachCho);
        panelDanhSachCho.setLayout(panelDanhSachChoLayout);
        panelDanhSachChoLayout.setHorizontalGroup(
            panelDanhSachChoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelDanhSachChoLayout.setVerticalGroup(
            panelDanhSachChoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelQuanLy.addTab("Danh sách chờ", new javax.swing.ImageIcon(getClass().getResource("/image/danh sách khám bệnh.png")), panelDanhSachCho); // NOI18N

        javax.swing.GroupLayout panelLapPhieuKhamLayout = new javax.swing.GroupLayout(panelLapPhieuKham);
        panelLapPhieuKham.setLayout(panelLapPhieuKhamLayout);
        panelLapPhieuKhamLayout.setHorizontalGroup(
            panelLapPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelLapPhieuKhamLayout.setVerticalGroup(
            panelLapPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelQuanLy.addTab("Lập phiếu khám bệnh", new javax.swing.ImageIcon(getClass().getResource("/image/phiếu khám.png")), panelLapPhieuKham); // NOI18N

        javax.swing.GroupLayout panelLapDonThuocLayout = new javax.swing.GroupLayout(panelLapDonThuoc);
        panelLapDonThuoc.setLayout(panelLapDonThuocLayout);
        panelLapDonThuocLayout.setHorizontalGroup(
            panelLapDonThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelLapDonThuocLayout.setVerticalGroup(
            panelLapDonThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelQuanLy.addTab("Lập đơn thốc", new javax.swing.ImageIcon(getClass().getResource("/image/lập đơn thuốc.png")), panelLapDonThuoc); // NOI18N

        javax.swing.GroupLayout panelHoaDonLayout = new javax.swing.GroupLayout(panelHoaDon);
        panelHoaDon.setLayout(panelHoaDonLayout);
        panelHoaDonLayout.setHorizontalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelHoaDonLayout.setVerticalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelQuanLy.addTab("Lập hóa đơn", new javax.swing.ImageIcon(getClass().getResource("/image/hóa đơn.png")), panelHoaDon); // NOI18N

        panelMain.addTab("Quản lý", new javax.swing.ImageIcon(getClass().getResource("/image/quản li.png")), panelQuanLy); // NOI18N

        javax.swing.GroupLayout panelThamSoLayout = new javax.swing.GroupLayout(panelThamSo);
        panelThamSo.setLayout(panelThamSoLayout);
        panelThamSoLayout.setHorizontalGroup(
            panelThamSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelThamSoLayout.setVerticalGroup(
            panelThamSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelDanhMuc.addTab("Tham số", new javax.swing.ImageIcon(getClass().getResource("/image/tham số.png")), panelThamSo); // NOI18N

        javax.swing.GroupLayout panelThuocLayout = new javax.swing.GroupLayout(panelThuoc);
        panelThuoc.setLayout(panelThuocLayout);
        panelThuocLayout.setHorizontalGroup(
            panelThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelThuocLayout.setVerticalGroup(
            panelThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelDanhMuc.addTab("Thuốc", new javax.swing.ImageIcon(getClass().getResource("/image/thuốc.png")), panelThuoc); // NOI18N

        javax.swing.GroupLayout panelDonViLayout = new javax.swing.GroupLayout(panelDonVi);
        panelDonVi.setLayout(panelDonViLayout);
        panelDonViLayout.setHorizontalGroup(
            panelDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelDonViLayout.setVerticalGroup(
            panelDonViLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelDanhMuc.addTab("Đơn vị tính", new javax.swing.ImageIcon(getClass().getResource("/image/đơn vị.png")), panelDonVi); // NOI18N

        javax.swing.GroupLayout panelCachDungLayout = new javax.swing.GroupLayout(panelCachDung);
        panelCachDung.setLayout(panelCachDungLayout);
        panelCachDungLayout.setHorizontalGroup(
            panelCachDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelCachDungLayout.setVerticalGroup(
            panelCachDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelDanhMuc.addTab("Cách dùng", new javax.swing.ImageIcon(getClass().getResource("/image/cách dùng.png")), panelCachDung); // NOI18N

        javax.swing.GroupLayout panelLoaiBenhLayout = new javax.swing.GroupLayout(panelLoaiBenh);
        panelLoaiBenh.setLayout(panelLoaiBenhLayout);
        panelLoaiBenhLayout.setHorizontalGroup(
            panelLoaiBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelLoaiBenhLayout.setVerticalGroup(
            panelLoaiBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelDanhMuc.addTab("Loại bệnh", new javax.swing.ImageIcon(getClass().getResource("/image/bệnh.png")), panelLoaiBenh); // NOI18N

        panelMain.addTab("Danh mục", new javax.swing.ImageIcon(getClass().getResource("/image/danh mục.png")), panelDanhMuc); // NOI18N

        javax.swing.GroupLayout panelDoanhThuLayout = new javax.swing.GroupLayout(panelDoanhThu);
        panelDoanhThu.setLayout(panelDoanhThuLayout);
        panelDoanhThuLayout.setHorizontalGroup(
            panelDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelDoanhThuLayout.setVerticalGroup(
            panelDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelBaoCao.addTab("Báo  cáo doanh thu theo tháng", new javax.swing.ImageIcon(getClass().getResource("/image/báo cáo theo ngày.png")), panelDoanhThu); // NOI18N

        javax.swing.GroupLayout panelSuDungThuocLayout = new javax.swing.GroupLayout(panelSuDungThuoc);
        panelSuDungThuoc.setLayout(panelSuDungThuocLayout);
        panelSuDungThuocLayout.setHorizontalGroup(
            panelSuDungThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelSuDungThuocLayout.setVerticalGroup(
            panelSuDungThuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        panelBaoCao.addTab("Báo cáo sử dụng thống theo tháng", new javax.swing.ImageIcon(getClass().getResource("/image/báo cáo sử dụng thuốc.png")), panelSuDungThuoc); // NOI18N

        panelMain.addTab("Báo cáo", new javax.swing.ImageIcon(getClass().getResource("/image/báo cáo.png")), panelBaoCao); // NOI18N

        panelGioiThieu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Giảng viên hướng dẫn: ");
        panelGioiThieu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Lê Thanh Trọng");
        panelGioiThieu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nhóm thực hiện:");
        panelGioiThieu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Trần Hữu Lộc - 17520700");
        panelGioiThieu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nguyễn Trọng Khanh - 17520626");
        panelGioiThieu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nguyễn Văn Minh - 17520759");
        panelGioiThieu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Đồ án quản lý phòng mạch tư");
        panelGioiThieu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        panelMain.addTab("Giới thiệu", new javax.swing.ImageIcon(getClass().getResource("/image/giới thiệu.png")), panelGioiThieu); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain)
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
    private javax.swing.JPanel panelBN;
    private javax.swing.JTabbedPane panelBaoCao;
    private javax.swing.JPanel panelCachDung;
    private javax.swing.JTabbedPane panelDanhMuc;
    private javax.swing.JPanel panelDanhSachCho;
    private javax.swing.JPanel panelDanhSachKhamBenh;
    private javax.swing.JPanel panelDoanhThu;
    private javax.swing.JPanel panelDonVi;
    private javax.swing.JPanel panelGioiThieu;
    private javax.swing.JTabbedPane panelHeThong;
    private javax.swing.JPanel panelHoaDon;
    private javax.swing.JPanel panelKhoiPhuc;
    private javax.swing.JPanel panelLapDonThuoc;
    private javax.swing.JPanel panelLapPhieuKham;
    private javax.swing.JPanel panelLichSuDangNhap;
    private javax.swing.JPanel panelLoaiBenh;
    private javax.swing.JTabbedPane panelMain;
    private javax.swing.JPanel panelNguoiDung;
    private javax.swing.JPanel panelNhanVien;
    private javax.swing.JTabbedPane panelQuanLy;
    private javax.swing.JPanel panelQuyenHan;
    private javax.swing.JPanel panelSaoLuu;
    private javax.swing.JPanel panelSuDungThuoc;
    private javax.swing.JPanel panelThamSo;
    private javax.swing.JPanel panelThayDoiMatKhau;
    private javax.swing.JPanel panelThongTin;
    private javax.swing.JPanel panelThuoc;
    // End of variables declaration//GEN-END:variables
}
