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
import quanlyphongkham.dto.DonViTinhDTO;
import quanlyphongkham.dto.NhanVienDTO;
import quanlyphongkham.dto.ThuocDTO;

/**
 *
 * @author ADMIN
 */
public class ThuocDAL {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
//    String url = "jdbc:mysql://mysql-6474-0.cloudclusters.net:10001/qlpk";
//    String userName = "loctran0169";
//    String passWord = "angel1999";
    String url = "jdbc:mysql://127.0.0.1:3306/qlpk";
    String userName = "root";
    String passWord = "ntrongkhanh";
    public ThuocDAL() {
    }
    public boolean them(ThuocDTO dto)
    {
        try {
            String query = "INSERT INTO THUOC(mathuoc,tenthuoc,madv,nsx,hsd,dongia) VALUES (?,?,?,?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaThuoc());
            pst.setString(2, dto.getTenThuoc());
            pst.setString(3, dto.getMaDV());
            pst.setString(4,  dto.getNSX());
            pst.setString(5,  dto.getHSD());
            pst.setInt(6, dto.getDonGia());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean sua(ThuocDTO dto)
    {
        try {
            String query = "UPDATE THUOC SET mathuoc = ?,tenthuoc=?, madv = ?, nsx = ?, hsd = ? ,dongia = ?  WHERE mathuoc = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaThuoc());
            pst.setString(2, dto.getTenThuoc());
            pst.setString(3, dto.getMaDV());
            pst.setString(4, dto.getNSX());
            pst.setString(5,  dto.getHSD());
            pst.setInt(6, dto.getDonGia());
            pst.setString(7, dto.getMaThuoc());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã sửa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean xoa(ThuocDTO dto)
    {
        try {
            String query = "DELETE FROM THUOC WHERE mathuoc = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaThuoc());
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
            String query = "select thuoc.mathuoc as \"Mã thuốc\",tenthuoc as \"Tên thuốc\",tendonvi as \"Đơn vị\" ,nsx as \"Ngày sản xuất\",hsd as \"Hạn sử dụng \",dongia as \"Đơn giá\"\n" +
                    "from thuoc,donvitinh\n" +
                    "where thuoc.madv=donvitinh.madv";
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
            String query = "select * from THUOC WHERE (mathuoc LIKE CONCAT('%',"+s+",'%')) OR (tenthuoc LIKE CONCAT('%',"+s+",'%'))" ;
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }
    public ArrayList<DonViTinhDTO>  loadDoViTinh()
    {
        ArrayList<DonViTinhDTO> list=new ArrayList<>();
        try {
            String sql = "SELECT * FROM DONVITINH";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                DonViTinhDTO dTO=new DonViTinhDTO(rs.getString(1).toString(),rs.getString(2).toString());
                list.add(dTO);
            } ;
            return list;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
}
