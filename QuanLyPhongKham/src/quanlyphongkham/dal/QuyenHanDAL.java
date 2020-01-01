/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Minh
 */
public class QuyenHanDAL extends ConnectDB{
    PreparedStatement pst = null;
    ResultSet rs = null;
    public ResultSet loadDuLieuQuyenHan() {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "select * from QUYENHAN";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return rs;
    }
    
}
