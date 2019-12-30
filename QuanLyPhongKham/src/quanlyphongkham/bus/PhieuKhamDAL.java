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
import quanlyphongkham.dto.PhieuKhamDTO;

/**
 *
 * @author LQTPL
 */
public class PhieuKhamDAL {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/qlpk";
    String userName = "root";
    String passWord = "angel1999"; 
    
    public Boolean them(PhieuKhamDTO hd) {
        try {
            String sql = "INSERT INTO PHIEUKHAM VALUES (?,?,?,?,?)";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            pst.setString(0, hd.getMaPK());
            pst.setString(1, hd.getMaBN());
            pst.setString(2, hd.getMaNV());
            pst.setString(3, hd.getMaLB());
            pst.setDate(4, convertUtilToSql(hd.getNgayKham()));
            
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    
    public Boolean sua(PhieuKhamDTO hd) {
        try {
            String sql = "UPDATE PHIEUKHAM SET mapk = ?, mabn = ?, manv = ?, malb = ?,ngaykham = ?, ngaykhamlai=? "
                    + "WHERE mapk = ?";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            pst.setString(0, hd.getMaPK());
            pst.setString(1, hd.getMaBN());
            pst.setString(2, hd.getMaNV());
            pst.setString(3, hd.getMaLB());
            pst.setDate(4, convertUtilToSql(hd.getNgayKham()));
            pst.setDate(5, convertUtilToSql(hd.getNgayKhamLai()));
            pst.setString(6, hd.getMaPK());

            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    
    public Boolean xoa(PhieuKhamDTO hd) {
        try {
            String sql = "DELETE FROM PHIEUKHAM WHERE mapk = ?";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            pst.setString(0, hd.getMaPK());        
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    
    public ResultSet loadToDataTable() {
        try {
            String sql = "SELECT * FROM PHIEUKHAM";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return rs;
    }
    
    public ResultSet selectByKeyWord(String key) {
        try {
            String query = "";
            query += " SELECT *";
            query += " FROM PHIEUKHAM";
            query += " WHERE (mapk LIKE CONCAT('%',?,'%'))";
            query += " OR (mabn LIKE CONCAT('%',?,'%'))";
            query += " OR (manv LIKE CONCAT('%',?,'%'))";            
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(0, key);
            pst.setString(1, key);
            pst.setString(2, key);
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
