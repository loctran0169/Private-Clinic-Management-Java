package quanlyphongkham.bus;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quanlyphongkham.dal.LapPhieuKhamDAL;
import quanlyphongkham.dto.LapPhieuKhamDTO;
import quanlyphongkham.dto.LoaiBenhDTO;
import quanlyphongkham.dto.NhanVienDTO;

/**
 *
 * @author LQTPL
 */
public class LapPhieuKhamBUS {

    private LapPhieuKhamDAL dal = new LapPhieuKhamDAL();

    public ResultSet select() {
        return dal.select();
    }

    
    public ArrayList<NhanVienDTO> loadBacSi() {
        return dal.loadBacSi();
    }
    
    public ArrayList<LoaiBenhDTO> loadLoaiBenh() {
        return dal.loadLoaiBenh();
    }
    
    public Boolean sua(LapPhieuKhamDTO hd) {
        return dal.sua(hd);
    }

    public Boolean xoa(LapPhieuKhamDTO hd) {
        return dal.xoa(hd);
    }
    
}
