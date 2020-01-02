/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.bus;

import java.sql.ResultSet;
import java.util.Date;
import quanlyphongkham.dal.LichSuDAL;
import quanlyphongkham.dto.LichSuDTO;
import quanlyphongkham.dto.NhanVienDTO;


/**
 *
 * @author Minh
 */
public class LichSuBUS {
    private LichSuDAL lsDAL;

    public LichSuBUS() {
        lsDAL = new LichSuDAL();
    }

    public ResultSet loadDuLieuLichSuDangNhap(Date date) {
        return lsDAL.loadDuLieuLichSuDangNhap(date);
    }
    public NhanVienDTO loadDuLieuNhanVienTuMaUsers(String nv) {
        return lsDAL.loadDuLieuNhanVienTuMaUsers(nv);
    }
    
    public boolean them(LichSuDTO lsDTO) {
        boolean re = lsDAL.them(lsDTO);
        return re;
    }

    public boolean xoa(LichSuDTO lsDTO) {
        boolean re = lsDAL.Xoa(lsDTO);
        return re;
    }    
}
