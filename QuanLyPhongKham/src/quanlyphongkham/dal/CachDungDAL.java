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
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.dto.CachDungDTO;

/**
 *
 * @author ADMIN
 */
public class CachDungDAL {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
//    String url = "jdbc:mysql://mysql-6474-0.cloudclusters.net:10001/qlpk";
//    String userName = "loctran0169";
//    String passWord = "angel1999";
    String url = "jdbc:mysql://127.0.0.1:3306/qlpk";
    String userName = "root";
    String passWord = "ntrongkhanh";
    public CachDungDAL() {       
    }
    public boolean them(CachDungDTO dto)
    {
        try {
            String query = "INSERT INTO CACHDUNG (macd,cachdung) VALUES (?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaCD());
            pst.setString(2, dto.getCachDung());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean sua(CachDungDTO dto)
    {
        try {
            String query = "UPDATE CACHDUNG SET cachdung = ? WHERE macd = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getCachDung());
            pst.setString(2, dto.getMaCD());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã Sửa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean xoa(CachDungDTO dto)
    {
        try {
            String query = "DELETE FROM CACHDUNG where MaCD = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaCD());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã Xóa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public ResultSet loadTable() {
        try {
            String sql = "SELECT * FROM CACHDUNG";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    } 
    public ResultSet loadTableByKeyWord(String key) {
        try {
            String sql = "SELECT * FROM CACHDUNG WHERE (macd LIKE CONCAT('%',?,'%')) OR (cachdung LIKE CONCAT('%',?,'%'))";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            pst.setString(1, key);
            pst.setString(2, key);
            rs = pst.executeQuery();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    } 
}
