/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import quanlyphongkham.dto.BenhNhanDTO;

/**
 *
 * @author LQTPL
 */
public class BenhNhanDAL extends ConnectDB {

    PreparedStatement pst = null;
    ResultSet rs = null;

    public Boolean them(BenhNhanDTO hd) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "INSERT INTO BENHNHAN (mabn,hoten,ngaysinh,gioitinh,diachi,sdt) VALUES (?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, hd.getMaBN());
            pst.setString(2, hd.getHoTen());
            pst.setString(3, convertUtilToSql(hd.getNgaySinh()).toString());
            pst.setString(4, hd.getGioiTinh());
            pst.setString(5, hd.getDiaChi());
            pst.setString(6, hd.getSDT());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Thêm");
            return false;
        }
        return true;
    }

    public Boolean Sua(BenhNhanDTO hd) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "UPDATE BENHNHAN SET mabn = ?, HoTen = ?, ngaysinh = ?, gioitinh = ?,diachi = ?,sdt=? "
                    + "WHERE mabn = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, hd.getMaBN());
            pst.setString(2, hd.getHoTen());
            pst.setDate(3, convertUtilToSql(hd.getNgaySinh()));
            pst.setString(4, hd.getGioiTinh());
            pst.setString(5, hd.getDiaChi());
            pst.setString(6, hd.getSDT());
            pst.setString(7, hd.getMaBN());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    public Boolean Xoa(BenhNhanDTO hd) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "DELETE FROM BENHNHAN WHERE mabn = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, hd.getMaBN());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    public ResultSet loadToDataTable() {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "SELECT mabn as 'Mã bệnh nhân', hoten as 'Họ tên', ngaysinh as 'Ngày sinh', gioitinh as 'Giới tính', diachi as 'Địa chỉ', sdt as 'SĐT' FROM BenhNhan";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return rs;
    }

    public ResultSet selectByKeyWord(String key) {
        rs = null;
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "";
            query += " SELECT mabn as 'Mã bệnh nhân', hoten as 'Họ tên', ngaysinh as 'Ngày sinh', gioitinh as 'Giới tính', diachi as 'Địa chỉ', sdt as 'SĐT'";
            query += " FROM BENHNHAN";
            query += " WHERE (upper(mabn) LIKE CONCAT('%', '" + key.toUpperCase() + "' ,'%'))";
            query += " OR ( upper(Hoten) LIKE CONCAT('%', '" + key.toUpperCase() + "' ,'%'))";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return rs;
    }

    public ResultSet loadDanhSachKhamBenh(Date dt) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "select pk.mabn as 'Mã bệnh nhân', hoten as 'Họ tên',ngaysinh as 'Ngày sinh',gioitinh as 'Giới tính',diachi as 'Địa chỉ',sdt as 'SĐT'"
                    + "from BENHNHAN bn, PHIEUKHAM pk "
                    + "where bn.mabn = pk.mabn and year(pk.Ngaykham)= ? and month(pk.Ngaykham)= ? and day(pk.Ngaykham)= ? ";
            pst = conn.prepareStatement(sql);
            Calendar cal = Calendar.getInstance();
            cal.setTime(dt);
            pst.setString(1, Integer.toString(cal.get(Calendar.YEAR)));
            pst.setString(2, Integer.toString(cal.get(Calendar.MONTH)+1));
            pst.setString(3, Integer.toString(cal.get(Calendar.DAY_OF_MONTH)));
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }

    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
