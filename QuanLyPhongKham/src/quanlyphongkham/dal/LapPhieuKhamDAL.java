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
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quanlyphongkham.dto.LapPhieuKhamDTO;
import quanlyphongkham.dto.LoaiBenhDTO;
import quanlyphongkham.dto.NhanVienDTO;

/**
 *
 * @author LQTPL
 */
public class LapPhieuKhamDAL extends ConnectDB {

    PreparedStatement pst = null;
    ResultSet rs = null;

    public ResultSet select() {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "";
            query += "SELECT MAPK as 'Mã phiếu khám',BN.MABN as 'Mã bệnh nhân',BN.HOTEN as 'Tên bệnh nhân'"
                    + ",NV.HOTEN as 'Tên bác sĩ'"
                    + ",TENLOAIBENH as 'Tên loại bệnh',TRIEUCHUNG as 'Triệu chứng',NGAYKHAM as 'Ngày khám' ";
            query += "FROM PHIEUKHAM PK, BENHNHAN BN, NHANVIEN NV, BENH B  ";
            query += "where PK.MABN=BN.MABN and PK.MANV=NV.MANV and PK.MALB=B.MALB  ";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        return rs;
    }

    public ArrayList<NhanVienDTO> loadBacSi() {
        ArrayList<NhanVienDTO> list = new ArrayList<>();
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "select manv,hoten from nhanvien";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO();
                nv.setMaNhanVien(rs.getString("manv"));
                nv.setHoVaTen(rs.getString("hoten"));
                list.add(nv);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return new ArrayList<>();
        }
        return list;
    }

    public ArrayList<LoaiBenhDTO> loadLoaiBenh() {
        ArrayList<LoaiBenhDTO> list = new ArrayList<>();
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "select * from benh";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                LoaiBenhDTO nv = new LoaiBenhDTO();
                nv.setMaLB(rs.getString("MaLB"));
                nv.setTenLoaiBenh(rs.getString("TenLoaiBenh"));
                nv.setTrieuChung(rs.getString("TrieuChung"));
                list.add(nv);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+ " Loai benh");
            return new ArrayList<>();
        }
        return list;
    }
    
    public Boolean sua(LapPhieuKhamDTO hd) {
        try {
            String sql = "update PHIEUKHAM set mabn=?, malb=?,manv=?,ngaykham=? where mapk=?";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(sql);
            pst.setString(1, hd.getMaBN());
            pst.setString(2, hd.getMaLB());
            pst.setString(3, hd.getMaBS());
            pst.setDate(4, convertUtilToSql(hd.getNgayKham()));
            pst.setString(5, hd.getMaPK());

            pst.executeUpdate();
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
