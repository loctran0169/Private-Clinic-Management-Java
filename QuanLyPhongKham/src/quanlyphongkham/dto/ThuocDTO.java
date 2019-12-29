/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dto;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class ThuocDTO {
    private String MaThuoc;
    private String TenThuoc;
    private String MaDV;
    private Date NSX;
    private Date HSD;
    private int DonGia;
    private int SoLuongTon;

    public ThuocDTO() {
    }

    public ThuocDTO(String MaThuoc, String TenThuoc, String MaDV, Date NSX, Date HSD, int DonGia, int SoLuongTon) {
        this.MaThuoc = MaThuoc;
        this.TenThuoc = TenThuoc;
        this.MaDV = MaDV;
        this.NSX = NSX;
        this.HSD = HSD;
        this.DonGia = DonGia;
        this.SoLuongTon = SoLuongTon;
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

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(Date NSX) {
        this.NSX = NSX;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }
    
}
