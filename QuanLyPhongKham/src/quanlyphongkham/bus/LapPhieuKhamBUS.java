/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.bus;

import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import quanlyphongkham.dal.LapPhieuKhamDAL;
import quanlyphongkham.dto.LapPhieuKhamDTO;

/**
 *
 * @author LQTPL
 */
public class LapPhieuKhamBUS {
    private LapPhieuKhamDAL dal = new LapPhieuKhamDAL();
    
    public ResultSet select() {        
        return dal.select();
    }

    public Boolean sua(LapPhieuKhamDTO hd) {        
        return dal.sua(hd);
    }

    public Boolean xoa(LapPhieuKhamDTO hd) {        
        return dal.xoa(hd);
    }
}
