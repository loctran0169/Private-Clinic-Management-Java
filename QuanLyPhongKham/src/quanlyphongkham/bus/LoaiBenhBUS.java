/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.bus;

import java.sql.ResultSet;
import quanlyphongkham.dal.LoaiBenhDAL;
import quanlyphongkham.dto.LoaiBenhDTO;

/**
 *
 * @author Minh
 */
public class LoaiBenhBUS {

    private LoaiBenhDAL lbdal;

    public LoaiBenhBUS() {
        lbdal = new LoaiBenhDAL();
    }

    public boolean them(LoaiBenhDTO lbdto) {
        boolean re = lbdal.them(lbdto);
        return re;
    }

    public boolean xoa(LoaiBenhDTO lbdto) {
        boolean re = lbdal.Xoa(lbdto);
        return re;
    }

    public boolean sua(LoaiBenhDTO lbdto) {
        boolean re = lbdal.Sua(lbdto);
        return re;
    }

    public ResultSet loadDuLieuLoaiBenh() {
        return lbdal.loadDuLieuLoaiBenh();
    }

    public ResultSet selectByKeyWord(String key) {
        return lbdal.selectByKeyWord(key);
    }

}
