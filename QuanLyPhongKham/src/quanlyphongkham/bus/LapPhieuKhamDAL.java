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
import quanlyphongkham.dto.LapPhieuKhamDTO;

/**
 *
 * @author LQTPL
 */
public class LapPhieuKhamDAL {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/qlpk";
    String userName = "root";
    String passWord = "angel1999";
    
    public ResultSet select() {
        try {
            String query = "";
            query += "SELECT MAPK,BN.MABN,BN.HOTEN tenbn,PK.MANV,NV.HOTEN tennv,PK.MALB,TRIEUCHUNG ,TENLOAIBENH,NGAYKHAM ";
            query += "FROM PHIEUKHAM PK  ";
            query += "right JOIN BENHNHAN BN ON PK.MABN=BN.MABN ";
            query += "LEFT JOIN NHANVIEN NV ON PK.MANV=NV.MANV ";
            query += "LEFT JOIN BENH B ON PK.MALB=B.MALB ";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);            
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return rs;
    }
    
    public Boolean sua(LapPhieuKhamDTO hd) {
        try {
            String sql = "update PHIEUKHAM set malb=?,manv=?,ngaykham=? where mapk=?";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            pst.setString(0, hd.getMaLB());
            pst.setString(1, hd.getMaBS());
            pst.setDate(2, convertUtilToSql(hd.getNgayKham()));
            pst.setString(3, hd.getMaPK());

            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    
    public Boolean xoa(LapPhieuKhamDTO hd) {
        try {
            String sql = "delete from PHIEUKHAM where mapk= ?";
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
    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
