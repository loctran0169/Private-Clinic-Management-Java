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
import quanlyphongkham.dto.BenhNhanDTO;
import quanlyphongkham.dto.PhieuKhamDTO;

/**
 *
 * @author LQTPL
 */
public class PhieuKhamDAL extends ConnectDB{
    PreparedStatement pst = null;
    ResultSet rs = null;
    public Boolean them(PhieuKhamDTO hd) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "INSERT INTO PHIEUKHAM VALUES (?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, hd.getMaPK());
            pst.setString(2, hd.getMaBN());
            pst.setString(3, hd.getMaNV());
            pst.setString(4, hd.getMaLB());
            pst.setDate(5, convertUtilToSql(hd.getNgayKham()));
            
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    
    public Boolean sua(PhieuKhamDTO hd) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "UPDATE phieukham SET chuandoan=?, chidinh=? "
                    + " WHERE mapk = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, hd.getChuanDooan());
            pst.setString(2, hd.getChiDinh());
            pst.setString(3, hd.getMaPK());

            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+" Sửa");
            return false;
        }
        return true;
    }
    
    public Boolean xoa(PhieuKhamDTO hd) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "DELETE FROM PHIEUKHAM WHERE mapk = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, hd.getMaPK());        
            pst.executeUpdate();
        } catch (Exception e) {
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
            String sql = "SELECT * FROM PHIEUKHAM";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return rs;
    }
    
    public PhieuKhamDTO loadOnePK(String MaPK) {
        PhieuKhamDTO dto = new PhieuKhamDTO();
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "SELECT * FROM PHIEUKHAM where mapk =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, MaPK);
            rs = pst.executeQuery();
            while(rs.next()){
                dto.setChuanDooan(rs.getString("ChuanDoan"));
                dto.setChiDinh(rs.getString("ChiDinh"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return dto;
        }
        return dto;
    }
    
    public ResultSet selectByKeyWord(String key) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "";
            query += " SELECT *";
            query += " FROM PHIEUKHAM";
            query += " WHERE (mapk LIKE CONCAT('%',?,'%'))";
            query += " OR (mabn LIKE CONCAT('%',?,'%'))";
            query += " OR (manv LIKE CONCAT('%',?,'%'))";            
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
    
    public BenhNhanDTO timBenhNhan(String mabn) {
        BenhNhanDTO bn = new BenhNhanDTO();
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String sql = "select MaBN,HoTen from benhnhan "
                    + "where (upper(mabn) LIKE CONCAT('%', '" + mabn.toUpperCase() + "' ,'%'))";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                bn.setMaBN(rs.getString("MaBN"));
                bn.setHoTen(rs.getString("HoTen"));
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return bn;
    }
    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
