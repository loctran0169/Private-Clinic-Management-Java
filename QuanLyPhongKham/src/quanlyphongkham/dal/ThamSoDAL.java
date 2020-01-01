/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import quanlyphongkham.dto.ThamSoDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Minh
 */
public class ThamSoDAL extends ConnectDB{
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    public Boolean Sua(ThamSoDTO tsdto) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "UPDATE THAMSO SET mats = ?, tenthamso = ?, giatri = ? WHERE mats = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, tsdto.getMaTS());
            pst.setString(2, tsdto.getTenThamSo());
            pst.setInt(3, tsdto.getGiaTri());
            pst.setString(4, tsdto.getMaTS());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    
        public ResultSet loadDuLieuThamSo() {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "select * from thamso";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return rs;
    }
}
