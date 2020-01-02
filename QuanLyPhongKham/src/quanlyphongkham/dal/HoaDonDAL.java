/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import quanlyphongkham.dto.HoaDonDTO;

/**
 *
 * @author LQTPL
 */
public class HoaDonDAL extends ConnectDB {

    PreparedStatement pst = null;
    ResultSet rs = null;

    public ResultSet loadToDataTable() {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "SELECT mahd as 'Mã hóa đơn', mapk as 'Mã phiếu khám', ngaykham as 'Ngày khám', tienthuoc as 'Tiền thuốc', tongtien as 'Tổng tiền' "
                    + " FROM hoadon";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }

    public Boolean them(HoaDonDTO hd) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "INSERT INTO HOADON (mahd,mapk,ngaylap,tienthuoc,tongtien) VALUES (?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, hd.getMaHD());
            pst.setString(2, hd.getMaPK());
            pst.setDate(3, convertUtilToSql(hd.getNgayLap()));
            pst.setInt(4, hd.getTienThuoc());
            pst.setInt(5, hd.getTongTien());
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    public String LoadThamSo() {
        String data = "";
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "select GiaTri from THAMSO where MaTS = 'TS001'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                data = rs.getString("GiaTri");
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return "";
        }
        return data;
    }

    public String TimHoaDon(String key) {
        String kq = null;
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "";
            query += " SELECT MaHD";
            query += " FROM HOADON";
            query += " WHERE (mapk LIKE CONCAT('%',?,'%'))";;
            pst = conn.prepareStatement(query);
            pst.setString(1, key);
            rs = pst.executeQuery();
            while (rs.next()) {
                kq = rs.getString("MaHD");
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return kq;
    }

    public ResultSet LoadTienThuoc(String pk) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "";
            query += "SELECT bn.HoTen ,sum(SoLuong*DonGia) as 'TienThuoc', NgayKham ";
            query += "FROM DONTHUOC dt, PHIEUKHAM pk, THUOC t,BENHNHAN bn ";
            query += "where upper(pk.MaPK)=? and pk.MaPK=dt.MaPK and t.MaThuoc=dt.MaThuoc and bn.MaBN=pk.MaBN ";
            query += "group by pk.MaPK ";
            pst = conn.prepareStatement(query);
            pst.setString(1, pk.toUpperCase());
            rs = pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }

    public ResultSet loadDuLieu(String pk) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "SELECT t.TenThuoc as 'Tên thuốc',SoLuong as 'Số lượng',SoLuong*DonGia as 'Đơn giá',CachDung as 'Cách dùng' "
                    + "FROM PHIEUKHAM pk, DONTHUOC dt, THUOC t, CACHDUNG cd "
                    + "where pk.MaPK = dt.MaPK and dt.MaThuoc = t.MaThuoc and cd.MaCD = dt.MaCD and dt.MaPK = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, pk);
            rs = pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }

    public ResultSet BaoCaoDoanhThuThang(Date date) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "";
            query += " SELECT NgayLap,COUNT(*) as   'SoLuongBenhNhan', sum(tongtien) as 'DoanhThu',sum(tongtien)*100/(SELECT sum(tongtien)";
            query += " FROM HOADON where year(HOADON.NgayLap)= year(?) and month(HOADON.NgayLap) = month(?)) as 'TyLe' FROM HOADON ";
            query += " where year(HOADON.NgayLap)= year(?) and month(HOADON.NgayLap) = month(?) ";
            query += " group by NgayLap";
            pst = conn.prepareStatement(query);
            pst.setDate(1, convertUtilToSql(date));
            pst.setDate(2, convertUtilToSql(date));
            pst.setDate(3, convertUtilToSql(date));
            pst.setDate(4, convertUtilToSql(date));
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return rs;
    }
    
    public ResultSet BaoCaoSuDungThuocThang(Date date) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "";
            query += " SELECT TenThuoc,dv.TenDonVi ,sum(SoLuong) as   'SoLuong', count(TenThuoc) as 'SoLanDung' ";
            query += " FROM DONTHUOC dt, HOADON hd, THUOC t,DONVITINH dv ";
            query += " where year(hd.NgayLap) =year(?) and month(hd.NgayLap) = month(?) and hd.MaPK=dt.MaPK and t.MaThuoc=dt.MaThuoc and dv.MaDV=t.MaDV ";
            query += " group by t.MaThuoc";
            pst = conn.prepareStatement(query);
            pst.setDate(1, convertUtilToSql(date));
            pst.setDate(2, convertUtilToSql(date));
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return rs;
    }
    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
