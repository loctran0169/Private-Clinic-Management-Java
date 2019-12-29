/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dto;

/**
 *
 * @author ADMIN
 */
public class LapDonThuocDTO {
        private String MaPK;
        private String MaBN;
        private String TenBN;
        private String MaThuoc;
        private String Tenthuoc;
        private String MaLB;
        private String TenLB;
        private String TrieuChung;
        private String MaCD;
        private String CachDung;
        private int DonGia;
        private int SoLuong;
        private String MaDV;

    public String getMaPK() {
        return MaPK;
    }

    public void setMaPK(String MaPK) {
        this.MaPK = MaPK;
    }

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    public String getTenBN() {
        return TenBN;
    }

    public void setTenBN(String TenBN) {
        this.TenBN = TenBN;
    }

    public String getMaThuoc() {
        return MaThuoc;
    }

    public void setMaThuoc(String MaThuoc) {
        this.MaThuoc = MaThuoc;
    }

    public String getTenthuoc() {
        return Tenthuoc;
    }

    public void setTenthuoc(String Tenthuoc) {
        this.Tenthuoc = Tenthuoc;
    }

    public String getMaLB() {
        return MaLB;
    }

    public void setMaLB(String MaLB) {
        this.MaLB = MaLB;
    }

    public String getTenLB() {
        return TenLB;
    }

    public void setTenLB(String TenLB) {
        this.TenLB = TenLB;
    }

    public String getTrieuChung() {
        return TrieuChung;
    }

    public void setTrieuChung(String TrieuChung) {
        this.TrieuChung = TrieuChung;
    }

    public String getMaCD() {
        return MaCD;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public String getCachDung() {
        return CachDung;
    }

    public void setCachDung(String CachDung) {
        this.CachDung = CachDung;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDonvi() {
        return TenDonvi;
    }

    public void setTenDonvi(String TenDonvi) {
        this.TenDonvi = TenDonvi;
    }
        private String TenDonvi;

    public LapDonThuocDTO(String MaPK, String MaBN, String TenBN, String MaThuoc, String Tenthuoc, String MaLB, String TenLB, String TrieuChung, String MaCD, String CachDung, int DonGia, int SoLuong, String MaDV, String TenDonvi) {
        this.MaPK = MaPK;
        this.MaBN = MaBN;
        this.TenBN = TenBN;
        this.MaThuoc = MaThuoc;
        this.Tenthuoc = Tenthuoc;
        this.MaLB = MaLB;
        this.TenLB = TenLB;
        this.TrieuChung = TrieuChung;
        this.MaCD = MaCD;
        this.CachDung = CachDung;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.MaDV = MaDV;
        this.TenDonvi = TenDonvi;
    }

    public LapDonThuocDTO() {
    }
}
