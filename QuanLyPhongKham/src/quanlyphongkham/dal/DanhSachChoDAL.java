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
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author LQTPL
 */
public class DanhSachChoDAL {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/qlpk";
    String userName = "root";
    String passWord = "angel1999";

    public ResultSet select(Date s) {
        try {
            String query = "";
            query += "select PK.MABN,HOTEN,NGAYSINH,GIOITINH,SDT,DIACHI,NGAYKHAM ";
            query += "from PHIEUKHAM PK,  BENHNHAN BN ";
            query += "where NGAYKHAM = '" + convertUtilToSql(s).toString().trim() + "' and PK.MABN = BN.MABN and MAPK != all(SELECT MAPK FROM DONTHUOC) ";
            conn = DriverManager.getConnection(url, userName, passWord);
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return rs;
    }

    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
