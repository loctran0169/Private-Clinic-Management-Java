/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import quanlyphongkham.dto.DonViTinhDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Minh
 */
public class DonViTinhDAL extends ConnectDB {

    PreparedStatement pst = null;
    ResultSet rs = null;

    public Boolean them(DonViTinhDTO dvtdto) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "INSERT INTO DONVITINH (madv,tendonvi) VALUES (?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, dvtdto.getMaDV());
            pst.setString(2, dvtdto.getTenDonVi());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Thêm");
            return false;
        }
        return true;
    }

    public Boolean Sua(DonViTinhDTO dvtdto) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "UPDATE DONVITINH SET madv = ?, tendonvi = ? WHERE madv = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, dvtdto.getMaDV());
            pst.setString(2, dvtdto.getTenDonVi());
            pst.setString(3, dvtdto.getMaDV());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    public Boolean Xoa(DonViTinhDTO dvtdto) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "DELETE FROM DONVITINH WHERE madv = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, dvtdto.getMaDV());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    public ResultSet loadDuLieuDonViTinh() {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "select * from DONVITINH";
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
            query += " FROM DONVITINH";
            query += " WHERE (upper(madv) LIKE CONCAT('%', '" + key.toUpperCase() + "' ,'%'))";
            query += " OR ( upper(tendonvi) LIKE CONCAT('%', '" + key.toUpperCase() + "' ,'%'))";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return rs;
    }
}
