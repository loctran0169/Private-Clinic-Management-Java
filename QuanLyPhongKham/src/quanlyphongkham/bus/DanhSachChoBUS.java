package quanlyphongkham.bus;

import java.sql.ResultSet;
import java.util.Date;
import quanlyphongkham.dal.DanhSachChoDAL;

/**
 *
 * @author LQTPL
 */
public class DanhSachChoBUS {

    private DanhSachChoDAL dal;

    public DanhSachChoBUS() {
        dal = new DanhSachChoDAL();
    }

    public ResultSet select(Date date) {
        return dal.select(date);
    }
}
