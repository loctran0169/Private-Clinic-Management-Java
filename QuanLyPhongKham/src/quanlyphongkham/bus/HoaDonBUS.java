package quanlyphongkham.bus;

import java.util.ArrayList;
import quanlyphongkham.dal.HoaDonDAL;
import quanlyphongkham.dto.HoaDonDTO;
import java.sql.ResultSet;

/**
 *
 * @author LQTPL
 */
public class HoaDonBUS {

    public HoaDonDAL dal = new HoaDonDAL();

    public ArrayList<HoaDonDTO> loadToDataTable() {
        return dal.loadToDataTable();
    }

    public Boolean them(HoaDonDTO hd) {
        return dal.them(hd);
    }

    public String loadThamSo() {
        return dal.LoadThamSo();
    }

    public ResultSet LoadTienThuoc(String pk) {
        return dal.LoadTienThuoc(pk);
    }

    public ResultSet loadDuLieu(String pk) {
        return dal.loadDuLieu(pk);
    }
}
