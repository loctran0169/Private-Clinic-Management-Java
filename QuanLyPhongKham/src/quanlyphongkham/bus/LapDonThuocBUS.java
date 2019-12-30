/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quanlyphongkham.bus;

import java.sql.ResultSet;
import java.util.ArrayList;
import quanlyphongkham.dal.LapDonThuocDAL;
import quanlyphongkham.dto.CachDungDTO;
import quanlyphongkham.dto.LapDonThuocDTO;
import quanlyphongkham.dto.PhieuKhamDTO;
import quanlyphongkham.dto.ThuocDTO;

/**
 *
 * @author ADMIN
 */
public class LapDonThuocBUS {
    LapDonThuocDAL dal;
    
    public LapDonThuocBUS() {
        dal=new LapDonThuocDAL();
    }
    public ArrayList<LapDonThuocDTO> loadPhieuKham()
    {
        return dal.loadPhieuKham();
    }
    public ArrayList<ThuocDTO>  loadThuoc()
    {
        return dal.loadThuoc();
    }
    public ArrayList<CachDungDTO>  loadCachDung()
    {
        return dal.loadCachDung();
    }
    public boolean them(LapDonThuocDTO dto)
    {
        return dal.them(dto);
    }
    public boolean sua(LapDonThuocDTO dto)
    {
        return dal.sua(dto);
    }
    public boolean xoa(LapDonThuocDTO dto)
    {
        return dal.xoa(dto);
    }
    public ResultSet loadTable(String s)
    {
        return dal.loadTable(s);
    }
}
