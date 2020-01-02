/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dto;

import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class ThuocDTO {
    private String MaThuoc;
    private String TenThuoc;
    private String MaDV;
    private String NSX;
    private String HSD;
    private int DonGia;
   

    public ThuocDTO() {
    }

    public ThuocDTO(String MaThuoc, String TenThuoc, String MaDV, String NSX, String HSD, int DonGia) {
        this.MaThuoc = MaThuoc;
        this.TenThuoc = TenThuoc;
        this.MaDV = MaDV;
        this.NSX = NSX;
        this.HSD = HSD;
        this.DonGia = DonGia;
        
    }
    public ThuocDTO(String MaThuoc){
        this.MaThuoc=MaThuoc;
    }

    public ThuocDTO(JTextField txt_mathuoc, Object object, Object object0, Object object1, Object object2, Object object3, Object object4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaThuoc() {
        return MaThuoc;
    }

    public void setMaThuoc(String MaThuoc) {
        this.MaThuoc = MaThuoc;
    }

    public String getTenThuoc() {
        return TenThuoc;
    }

    public void setTenThuoc(String TenThuoc) {
        this.TenThuoc = TenThuoc;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    
    
}
