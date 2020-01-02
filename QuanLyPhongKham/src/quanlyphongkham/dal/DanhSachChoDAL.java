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
public class DanhSachChoDAL extends ConnectDB {

    PreparedStatement pst = null;
    ResultSet rs = null;
    public ResultSet select(Date s) {
        try {
            if (conn == null || conn.isClosed()) {
                open();
            }
            String query = "";
            query += "select PK.MABN as 'Mã bệnh nhân',HOTEN as 'Họ tên',NGAYSINH as 'Ngày sinh',GIOITINH as 'Giới tính',SDT as 'SĐT',DIACHI as 'Địa chỉ',NGAYKHAM as 'Ngày Khám'";
            query += "from PHIEUKHAM PK,  BENHNHAN BN ";
            query += "where NGAYKHAM = '" + convertUtilToSql(s).toString().trim() + "' and PK.MABN = BN.MABN and MAPK != all(SELECT MAPK FROM DONTHUOC) ";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
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
