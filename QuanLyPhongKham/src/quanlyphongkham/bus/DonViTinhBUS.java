/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.bus;

import java.sql.ResultSet;
import quanlyphongkham.dal.DonViTinhDAL;
import quanlyphongkham.dto.DonViTinhDTO;

/**
 *
 * @author Minh
 */
public class DonViTinhBUS {

    private DonViTinhDAL dvtdal;

    public DonViTinhBUS() {
        dvtdal = new DonViTinhDAL();
    }

    public boolean them(DonViTinhDTO dvtdto) {
        boolean re = dvtdal.them(dvtdto);
        return re;
    }

    public boolean xoa(DonViTinhDTO dvtdto) {
        boolean re = dvtdal.Xoa(dvtdto);
        return re;
    }

    public boolean sua(DonViTinhDTO dvtdto) {
        boolean re = dvtdal.Sua(dvtdto);
        return re;
    }
    
    public ResultSet loadToDataTable() {
        return dvtdal.loadDuLieuDonViTinh();
    }

    public ResultSet selectByKeyWord(String key) {
        return dvtdal.selectByKeyWord(key);
    }
}
