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
import javax.swing.JOptionPane;
import quanlyphongkham.dto.HoaDonDTO;

/**
 *
 * @author LQTPL
 */
public class HoaDonDAL {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/qlpk";
    String userName = "root";
    String passWord = "angel1999";

    public ArrayList<HoaDonDTO> loadToDataTable() {
        ArrayList<HoaDonDTO> list = new ArrayList<HoaDonDTO>();
        try {
            String sql = "SELECT * FROM hoadon";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                HoaDonDTO hd = new HoaDonDTO();
                hd.setMaHD(rs.getString("MaHD"));
                hd.setMaPK(rs.getString("MaPK"));
                hd.setNgayLap(rs.getDate("NgayLap"));
                hd.setTienThuoc(rs.getInt("TienThuoc"));
                hd.setTongTien(rs.getInt("TongTien"));
                list.add(hd);
            }
            return list;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return new ArrayList<HoaDonDTO>();
        }
    }

    public Boolean them(HoaDonDTO hd) {
        try {
            String sql = "INSERT INTO HOADON (mahd,mapk,ngaylap,tienthuoc,tongtien) VALUES (?,?,?,?,?)";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            pst.setString(0, hd.getMaHD());
            pst.setString(1, hd.getMaPK());
            pst.setDate(2, convertUtilToSql(hd.getNgayLap()));
            pst.setString(3, hd.getMaHD());
            pst.setString(4, hd.getMaHD());
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    public String LoadThamSo() {
        String data = "";
        try {
            String sql = "select GiaTri from THAMSO where MaTS = 'TS001'";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                data = rs.getString("GiaTri");
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return "";
        }
        return data;
    }

    public String TimHoaDon(String key) {
        String kq = null;
        try {
            String query = "";
            query += " SELECT MaHD";
            query += " FROM HOADON";
            query += " WHERE (mapk LIKE CONCAT('%',?,'%'))";;
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(0, key);
            rs = pst.executeQuery();
            while (rs.next()) {
                kq = rs.getString("MaHD");
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return kq;
    }

    public ResultSet LoadTienThuoc(String pk) {
        try {
            String query = "";
            query += "SELECT bn.HoTen,sum(SoLuong*DonGia) as 'TienThuoc', NgayKham ";
            query += "FROM DONTHUOC dt, PHIEUKHAM pk, THUOC t,BENHNHAN bn ";
            query += "where pk.MaPK=?and pk.MaPK=dt.MaPK and t.MaThuoc=dt.MaThuoc and bn.MaBN=pk.MaBN ";
            query += "group by pk.MaPK ";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            pst.setString(0, pk);
            rs = pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }

    public ResultSet loadDuLieu(String pk) {
        try {
            String sql = "SELECT t.TenThuoc,SoLuong,SoLuong*DonGia as 'DonGia',CachDung "
                    + "FROM PHIEUKHAM pk, DONTHUOC dt, THUOC t, CACHDUNG cd "
                    + "where pk.MaPK = dt.MaPK and dt.MaThuoc = t.MaThuoc and cd.MaCD = dt.MaCD and dt.MaPK = ?";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            pst.setString(0, pk);
            rs = pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return rs;
    }
    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
