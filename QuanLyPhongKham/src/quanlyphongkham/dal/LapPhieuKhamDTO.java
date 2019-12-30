/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dto;

import java.util.Date;

/**
 *
 * @author LQTPL
 */
public class LapPhieuKhamDTO {

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

    public Date getNgayKham() {
        return NgayKham;
    }

    public void setNgayKham(Date NgayKham) {
        this.NgayKham = NgayKham;
    }

    public String getMaBS() {
        return MaBS;
    }

    public void setMaBS(String MaBS) {
        this.MaBS = MaBS;
    }

    public String getTenBS() {
        return TenBS;
    }

    public void setTenBS(String TenBS) {
        this.TenBS = TenBS;
    }

    public String getMaLB() {
        return MaLB;
    }

    public void setMaLB(String MaLB) {
        this.MaLB = MaLB;
    }

    public String getTrieuChung() {
        return TrieuChung;
    }

    public void setTrieuChung(String TrieuChung) {
        this.TrieuChung = TrieuChung;
    }

    public String getTenLB() {
        return TenLB;
    }

    public void setTenLB(String TenLB) {
        this.TenLB = TenLB;
    }
    private String MaPK;
    private String MaBN;
    private String TenBN;
    private Date NgayKham;
    private String MaBS;
    private String TenBS;
    private String MaLB;
    private String TrieuChung;
    private String TenLB;
    
}

