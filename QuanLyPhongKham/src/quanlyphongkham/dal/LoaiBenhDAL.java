/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import quanlyphongkham.dto.LoaiBenhDTO;
import java.sql.SQLException;

/**
 *
 * @author Minh
 */
public class LoaiBenhDAL extends ConnectDB{
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ResultSet loadDuLieuLoaiBenh() {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "SELECT * FROM BENH";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return rs;
    }
    public Boolean them(LoaiBenhDTO lbdto) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "INSERT INTO BENH (malb,tenloaibenh,trieuchung) VALUES (?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, lbdto.getMaLB());
            pst.setString(2, lbdto.getTenLoaiBenh());
            pst.setString(3, lbdto.getTrieuChung());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Thêm");
            return false;
        }
        return true;
    }
    public Boolean Sua(LoaiBenhDTO lbdto) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "UPDATE BENH SET malb = ?, tenloaibenh = ?, trieuchung = ? WHERE malb = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, lbdto.getMaLB());
            pst.setString(2, lbdto.getTenLoaiBenh());
            pst.setString(3, lbdto.getTrieuChung());
            pst.setString(4, lbdto.getMaLB());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public Boolean Xoa(LoaiBenhDTO lbdto) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "DELETE FROM BENH WHERE malb = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, lbdto.getMaLB());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public ResultSet selectByKeyWord(String key) {
        rs = null;
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "";
            query += " SELECT * ";
            query += " FROM BENH";
            query += " WHERE (upper(malb) LIKE CONCAT('%', '" + key.toUpperCase() + "' ,'%'))";
            query += " OR ( upper(tenloaibenh) LIKE CONCAT('%', '" + key.toUpperCase() + "' ,'%'))";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return rs;
    }
}
