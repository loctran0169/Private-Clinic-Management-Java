package quanlyphongkham.bus;

import quanlyphongkham.dal.BenhNhanDAL;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import quanlyphongkham.dto.BenhNhanDTO;

/**
 *
 * @author LQTPL
 */
public class BenhNhanBUS {

    public BenhNhanDAL dal;

    public BenhNhanBUS() {
        dal = new BenhNhanDAL();
    }

    public Boolean them(BenhNhanDTO hd) {
        return dal.them(hd);
    }

    public Boolean Sua(BenhNhanDTO hd) {
        return dal.Sua(hd);
    }

    public Boolean xoa(BenhNhanDTO hd) {
        return dal.Xoa(hd);
    }

    public ResultSet loadToDataTable() {
        return dal.loadToDataTable();
    }

    public ResultSet selectByKeyWord(String key) {
        return dal.selectByKeyWord(key);
    }

    public ResultSet loadDanhSachKhamBenh(Date dt) {
        return dal.loadDanhSachKhamBenh(dt);
    }
}
