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
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.dto.NhanVienDTO;
import quanlyphongkham.dto.QuyenHanDTO;
import quanlyphongkham.dto.ThuocDTO;
import quanlyphongkham.dto.UserDTO;

/**
 *
 * @author ADMIN
 */
public class UserDAL extends ConnectDB{
    
    PreparedStatement pst = null;
    ResultSet rs = null;
//    String url = "jdbc:mysql://mysql-6474-0.cloudclusters.net:10001/qlpk";
//    String userName = "loctran0169";
//    String passWord = "angel1999";
    
    public UserDAL()  {
    }
    public boolean them(UserDTO dto)
    {
        try {
            String query = "INSERT INTO USERS (maus,taikhoan,matkhau,manv,maqh) VALUES (?,?,?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            
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
            String query = "select users.maus as\"Mã Tài Khoản\", taikhoan as \"Tài Khoản\" ,matkhau as\"Mật Khẩu\" , manv as\"Mã Nhân Viên\", tenquyenhan as\"Quyền hạn\"\n" +
                    "from users,quyenhan\n" +
                    "where users.maqh=quyenhan.maqh";
            
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
            String sql = "select * from NHANVIEN";
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while( rs.next() ) {
                NhanVienDTO dTO=new NhanVienDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(dTO);
            } ;
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
            String sql = "select * from QUYENHAN";
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while( rs.next() ) {
                
                QuyenHanDTO dTO=new QuyenHanDTO(rs.getString(1),rs.getString(2), rs.getString(3));
                list.add(dTO);
            };
            
            return list;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    public JTable dangNhap(UserDTO us) {
        JTable jTable = new JTable();
        try {
            String sql = "select * from USERS where taikhoan=? and matkhau=?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            pst.setString(1, us.getTaiKhoan());
            pst.setString(2, us.getMatKhau());
            rs = pst.executeQuery();
            jTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return jTable;
    }
     
//    public  boolean checkPass(string tk, string mk)
//    {
//
//    }
}
