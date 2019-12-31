/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LQTPL
 */
public class ConnectDB {

    public String url = "jdbc:mysql://localhost:3306/qlpk";
    public String userName = "root";
    public String passWord = "angel1999";
    public String port = "3306";
    public String host = "localhost";
    
    public Connection conn = null;

    public ConnectDB() {
        open();
    }
    
    public void open() {// mo ket noi den csdl
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
        } catch (ClassNotFoundException | SQLException ex) {// xu ly ngoai le
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void close() {// dong ket noi co so du lieu
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {// xu ly ngoai le
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
