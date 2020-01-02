/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quanlyphongkham.bus;

import java.sql.ResultSet;
import quanlyphongkham.dal.NhanVienDAL;
import quanlyphongkham.dto.NhanVienDTO;

/**
 *
 * @author ADMIN
 */
public class NhanVienBUS {
    NhanVienDAL dal ;
    
    public NhanVienBUS() {
        dal=new NhanVienDAL();
    }
    public ResultSet loadTable(){
        return dal.loadTable();
    }
    public ResultSet loadTablebyKey(String s)
    {
        return dal.loadTablebyKey(s);
    }
    public boolean them(NhanVienDTO dto)
    {
        return dal.them(dto);
    }
    public boolean sua(NhanVienDTO dto)
    {
        return dal.sua(dto);
    }
    public boolean xoa(NhanVienDTO dto)
    {
        return dal.xoa(dto);
    }
    
}
