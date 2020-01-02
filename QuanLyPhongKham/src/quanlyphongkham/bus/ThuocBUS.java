/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quanlyphongkham.bus;

import java.sql.ResultSet;
import java.util.ArrayList;
import quanlyphongkham.dal.ThuocDAL;
import quanlyphongkham.dto.DonViTinhDTO;
import quanlyphongkham.dto.ThuocDTO;

/**
 *
 * @author ADMIN
 */
public class ThuocBUS {
    ThuocDAL dal;
    
    public ThuocBUS() {
        dal=new ThuocDAL();
    }
    public boolean them(ThuocDTO dto){
        return dal.them(dto);
    }
    public boolean sua(ThuocDTO dto){
        return dal.sua(dto);
    }
    public boolean xoa(ThuocDTO dto){
        return dal.xoa(dto);
    }
    public ResultSet loadTable(){
        return dal.loadTable();
    }
    public ResultSet loadTablebyKey(String s){
        return dal.loadTablebyKey(s);
    }
    public ArrayList<DonViTinhDTO>  loadDonViTinh(){
        return dal.loadDoViTinh();
    }
    
}
