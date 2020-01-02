/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quanlyphongkham.bus;

import java.sql.ResultSet;
import quanlyphongkham.dal.CachDungDAL;
import quanlyphongkham.dto.CachDungDTO;

/**
 *
 * @author ADMIN
 */
public class CachDungBUS {
    private CachDungDAL dal;
    
    public CachDungBUS() {
        dal=new CachDungDAL();
    }
    public boolean them(CachDungDTO dto)
    {
        return dal.them(dto);
    }
    public boolean sua(CachDungDTO dto)
    {
        return dal.sua(dto);
    }
    public boolean xoa(CachDungDTO dto)
    {
        return dal.xoa(dto);
    }
    public ResultSet loadDuLieu()
    {
        return dal.loadTable();
    }
    public ResultSet loadByKey(String key)
    {
        return dal.loadTableByKeyWord(key);
    }
    
}
