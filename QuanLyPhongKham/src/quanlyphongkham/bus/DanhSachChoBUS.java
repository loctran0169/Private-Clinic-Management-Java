/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
