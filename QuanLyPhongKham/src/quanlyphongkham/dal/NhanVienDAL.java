/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quanlyphongkham.dal;

import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quanlyphongkham.dto.LapDonThuocDTO;
import quanlyphongkham.dto.NhanVienDTO;


/**
 *
 * @author ADMIN
 */
public class NhanVienDAL extends ConnectDB{
  
    PreparedStatement pst = null;
    ResultSet rs = null;
//    String url = "jdbc:mysql://mysql-6474-0.cloudclusters.net:10001/qlpk";
//    String userName = "loctran0169";
//    String passWord = "angel1999";
  
    public NhanVienDAL() {
    }
    public ResultSet loadTable() {
        try {
            String query = "select * from NHANVIEN";
            
            
            
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }
    public ResultSet loadTablebyKey(String s) {
        try {
            String query = "select * from NHANVIEN where MaNV='" + s + "'";
            
            
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }
    public boolean them(NhanVienDTO dto)
    {
        try {
            String query = "INSERT INTO NHANVIEN(manv,hoten,gioitinh,ngaysinh,chucvu,diachi,sdt) VALUES (?,?,?,?,?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaNhanVien());
            pst.setString(2, dto.getHoVaTen());
            pst.setString(3, dto.getGioiTinh());
            pst.setString(4, dto.getNgaySinh());
            pst.setString(5, dto.getChucVu());
            pst.setString(6, dto.getDiaChi());
            pst.setString(7, dto.getsDT());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean sua(NhanVienDTO dto)
    {
        try {
            String query = "UPDATE NHANVIEN SET manv = ?, hoten = ?, gioitinh = ?, ngaysinh = ?,diachi = ?,sdt=?, chucvu=? WHERE manv = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaNhanVien());
            pst.setString(2, dto.getHoVaTen());
            pst.setString(3, dto.getGioiTinh());
            pst.setString(4,  dto.getNgaySinh());
            pst.setString(5, dto.getDiaChi());
            pst.setString(6, dto.getsDT());
            pst.setString(7, dto.getChucVu());
            pst.setString(8, dto.getMaNhanVien());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã sửa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean xoa(NhanVienDTO dto)
    {
        try {
            String query = "DELETE FROM NHANVIEN WHERE manv = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaNhanVien());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
         
        return true;
    }
    
    
}
