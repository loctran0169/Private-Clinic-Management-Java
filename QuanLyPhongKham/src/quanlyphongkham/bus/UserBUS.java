/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quanlyphongkham.bus;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import quanlyphongkham.dal.UserDAL;
import quanlyphongkham.dto.NhanVienDTO;
import quanlyphongkham.dto.QuyenHanDTO;
import quanlyphongkham.dto.UserDTO;

/**
 *
 * @author ADMIN
 */
public class UserBUS {
    UserDAL dal ;
    
    public UserBUS() {
        dal=new UserDAL();
    }
    public boolean them(UserDTO dto)
    {
        return dal.them(dto);
    }
    public boolean sua(UserDTO dto)
    {
        return dal.sua(dto);
        
    }
    public boolean suaMatKhau(UserDTO dto)
    {
        return dal.suaMatKhau(dto);
    }
    public boolean xoa(UserDTO dto){
        return dal.xoa(dto);
    }
    public ResultSet loadTable()
    {
        return dal.loadTable();
        
    }
    public ResultSet loadTablebyKey(String s)
    {
        return dal.loadTablebyKey(s);
    }
    public ArrayList<NhanVienDTO>  loadNhanVien()
    {
        return dal.loadNhanVien();
    }
    public ArrayList<QuyenHanDTO>  loadQuyenHan(){
        return dal.loadQuyenHan();
    }
    public JTable dangNhap(UserDTO us){
            return dal.dangNhap(us);
    }
     public ResultSet loadDuLieuThongTinNV(String matk){
         return dal.loadDuLieuThongTinNV(matk);
     }
}
