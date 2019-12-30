/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
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
            String sql = "SELECT * FROM BenhNhan";
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
            query += " SELECT * ";
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
            String sql = "select pk.mabn, hoten,ngaysinh,gioitinh,diachi,sdt "
                    + "from BENHNHAN bn, PHIEUKHAM pk "
                    + "where bn.mabn = pk.mabn and year(pk.Ngaykham)= ? and month(pk.Ngaykham)= ? and day(pk.Ngaykham)= ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(0, dt.getYear());
            pst.setInt(1, dt.getMonth());
            pst.setInt(2, dt.getDay());
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
