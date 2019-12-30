package quanlyphongkham.bus;

import quanlyphongkham.dal.PhieuKhamDAL;
import quanlyphongkham.dto.PhieuKhamDTO;
import java.sql.ResultSet;

/**
 *
 * @author LQTPL
 */
public class PhieuKhamBUS {

    private PhieuKhamDAL dal = new PhieuKhamDAL();

    public Boolean them(PhieuKhamDTO hd) {
        return dal.them(hd);
    }

    public Boolean sua(PhieuKhamDTO hd) {
        return dal.sua(hd);
    }

    public Boolean xoa(PhieuKhamDTO hd) {
        return dal.xoa(hd);
    }

    public ResultSet loadToDataTable() {
        return dal.loadToDataTable();
    }

    public ResultSet selectByKeyWord(String key) {
        return dal.selectByKeyWord(key);
    }
}
