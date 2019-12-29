/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quanlyphongkham.dto.NhanVienDTO;
import quanlyphongkham.dto.QuyenHanDTO;
import quanlyphongkham.dto.ThuocDTO;
import quanlyphongkham.dto.UserDTO;

/**
 *
 * @author ADMIN
 */
public class UserDAL {
     Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://mysql-6474-0.cloudclusters.net:10001/qlpk";
    String userName = "loctran0169";
    String passWord = "angel1999";

    public UserDAL() {
    }
    public boolean them(UserDTO dto)
    {
        try {
            String query = "INSERT INTO USERS (maus,taikhoan,matkhau,manv,maqh) VALUES (?,?,?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaUS());
            pst.setString(2, dto.getTaiKhoan());
            pst.setString(3, dto.getMatKhau());
           pst.setString(4, dto.getMaNV());
            pst.setString(5, dto.getMaQuyenHan());
          
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean sua(UserDTO dto)
    {
        try {
            String query = "UPDATE USERS SET  taikhoan = ?, matkhau = ?,manv=?,maqh=? WHERE maus = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getTaiKhoan());
            pst.setString(2, dto.getMatKhau());
            pst.setString(3, dto.getMaNV());
           pst.setString(4, dto.getMaQuyenHan());
            pst.setString(5, dto.getMaUS());
          
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã sửa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean suaMatKhau(UserDTO dto)
    {
        try {
            String query = "UPDATE USERS SET  matkhau = ? WHERE maus = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMatKhau());
            pst.setString(2, dto.getMaUS());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã sửa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean xoa(UserDTO dto)
    {
        try {
            String query = "DELETE FROM USERS WHERE maus = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaUS());
            
          
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    
    public ResultSet loadTable() {
        try {
            String query = "select * from USERS";
            conn = DriverManager.getConnection(url, userName, passWord);
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
            String query = "select * from USERS WHERE (maus LIKE CONCAT('%',"+s+",'%')) OR (taikhoan LIKE CONCAT('%',"+s+",'%'))" ;
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }
    public ArrayList<NhanVienDTO>  loadNhanVien()
    {
        ArrayList<NhanVienDTO> list=new ArrayList<>();
        try {
            String sql = "select MaNhanVien from NHANVIEN";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            do {
                NhanVienDTO dTO=new NhanVienDTO(rs.getString(1),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(dTO);
            } while( rs.next() );
            return list;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    public ArrayList<QuyenHanDTO>  loadQuyenHan()
    {
        ArrayList<QuyenHanDTO> list=new ArrayList<>();
        try {
            String sql = "select MaQH,TenQuyenHan from QUYENHAN";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            do {
                
                QuyenHanDTO dTO=new QuyenHanDTO(rs.getString(1),rs.getString(2), rs.getString(3));
                list.add(dTO);
            } while( rs.next() );
            return list;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
//    public  boolean checkPass(string tk, string mk)
//    {
//        
//    }
}
