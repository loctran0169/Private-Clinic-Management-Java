/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import quanlyphongkham.dto.LichSuDTO;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import quanlyphongkham.dto.NhanVienDTO;

/**
 *
 * @author Minh
 */
public class LichSuDAL extends ConnectDB {

    PreparedStatement pst = null;
    ResultSet rs = null;

    public ResultSet loadDuLieuLichSuDangNhap(Date date) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "select ls.MaUS, MaNV,TaiKhoan, ThoiGianDN "
                    + "from USERS us join LICHSUDANGNHAP ls on us.MaUS = ls.MaUS "
                    + "where date(ls.ThoiGianDN) =? "
                    + "ORDER BY ThoiGianDN DESC";
            pst = conn.prepareStatement(sql);
            pst.setDate(1,convertUtilToSql(date) );
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return rs;
    }
    
    public NhanVienDTO loadDuLieuNhanVienTuMaUsers(String nhanvien) {
        NhanVienDTO nv = new NhanVienDTO();
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = " select * from NHANVIEN where MaNV =? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1, nhanvien);
            rs = pst.executeQuery();
            while(rs.next()){
                nv.setMaNhanVien(rs.getString("MaNV"));
                nv.setHoVaTen(rs.getString("HoTen"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setNgaySinh(rs.getDate("NgaySinh").toString());
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setsDT(rs.getString("SDT"));
                nv.setChucVu(rs.getString("ChucVu"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return nv;
        }
        return nv;
    }

    public Boolean them(LichSuDTO lsdto) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "insert into LICHSUDANGNHAP(maus,thoigiandn) values(?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, lsdto.getMaUS());
            pst.setDate(2, lsdto.getThoiGianDN());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Thêm");
            return false;
        }
        return true;
    }
    
    public Boolean Xoa(LichSuDTO lsdto) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "DELETE FROM LICHSUDANGNHAP";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
