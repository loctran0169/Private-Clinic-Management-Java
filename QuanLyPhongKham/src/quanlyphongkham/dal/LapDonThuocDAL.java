/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quanlyphongkham.dal;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quanlyphongkham.dto.CachDungDTO;
import quanlyphongkham.dto.LapDonThuocDTO;
import quanlyphongkham.dto.PhieuKhamDTO;
import quanlyphongkham.dto.ThuocDTO;

/**
 *
 * @author ADMIN
 */
public class LapDonThuocDAL extends ConnectDB{
   
    PreparedStatement pst = null;
    ResultSet rs = null;
//    String url = "jdbc:mysql://mysql-6474-0.cloudclusters.net:10001/qlpk";
//    String userName = "loctran0169";
//    String passWord = "angel1999";
    String url = "jdbc:mysql://127.0.0.1:3306/qlpk";
    String userName = "root";
    String passWord = "ntrongkhanh";
    public LapDonThuocDAL() {
    }
    public ArrayList<LapDonThuocDTO> loadPhieuKham() {
        ArrayList<LapDonThuocDTO> list=new ArrayList<>();
        
        try {
            String sql = "SELECT * \n" +
                    "FROM phieukham,benhnhan,benh\n" +
                    "where phieukham.MaBN=benhnhan.MaBN and benh.MaLB=phieukham.MaLB";
          
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
             while( rs.next() ) {
                LapDonThuocDTO pkdto=new LapDonThuocDTO(rs.getString(1), rs.getString(2), rs.getString(7), rs.getString(4), rs.getString(13), rs.getString(14));
               list.add(pkdto);
            };
            return list;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    public ArrayList<ThuocDTO>  loadThuoc()
    {
        ArrayList<ThuocDTO> list=new ArrayList<>();
        try {
            String sql = "SELECT * FROM THUOC";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while( rs.next() ) {
                ThuocDTO dTO=new ThuocDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
               
                list.add(dTO);
            } ;
            return list;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    public ArrayList<CachDungDTO>  loadCachDung()
    {
        ArrayList<CachDungDTO> list=new ArrayList<>();
        try {
            String sql = "SELECT * FROM CACHDUNG";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while( rs.next() ) {
                CachDungDTO dTO=new CachDungDTO(rs.getString(1),rs.getString(2));
                list.add(dTO);
            } ;
            return list;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    public boolean them(LapDonThuocDTO dto)
    {
        try {
            String query = "insert DONTHUOC set MAPK=?,MATHUOC=?,SOLUONG=?,MACD=?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(1, dto.getMaPK());
            pst.setString(2, dto.getMaThuoc());
            pst.setInt(3, dto.getSoLuong());
            pst.setString(4, dto.getMaCD());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean sua(LapDonThuocDTO dto)
    {
        try {
            String query = "update DONTHUOC set SOLUONG=?,MACD=? where MAPK=? and MATHUOC=?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            
            pst.setInt(1, dto.getSoLuong());
            pst.setString(2, dto.getMaCD());
            pst.setString(3, dto.getMaPK());
            pst.setString(4, dto.getMaThuoc());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã sửa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public boolean xoa(LapDonThuocDTO dto)
    {
        try {
            String query = "delete from DONTHUOC where mathuoc=? and mapk=?";
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            pst = conn.prepareStatement(query);
            
            
            pst.setString(1, dto.getMaThuoc());
            pst.setString(2, dto.getMaPK());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    public ResultSet loadTable(String s) {
        try {
            String query = "SELECT DT.MaThuoc as \"Mã thuốc\",TenThuoc as \"Tên thuốc\",SoLuong as \"Số lượng\",TenDonVi as \"Tên đơn vị\","
                    + "DonGia as \"Đơn giá\",DT.MACD as \"Mã cách dùng\",CachDung  as \"Cách dùng\"";
            query += "FROM DONTHUOC DT ";
            query += "RIGHT JOIN PHIEUKHAM PK ON DT.MAPK=PK.MAPK ";
            query += "LEFT JOIN CACHDUNG CD ON DT.MACD=CD.MACD ";
            query += "LEFT JOIN THUOC T ON T.MATHUOC= DT.MATHUOC ";
            query += "LEFT JOIN DONVITINH DVT ON DVT.MaDV=T.MaDV ";
            query += " JOIN BENHNHAN BN on BN.MABN=PK.MABN ";
            query += " JOIN BENH B ON PK.MALB=B.MALB ";
            query += "WHERE DT.MAPK=\""+s+"\"";
            
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }
}
