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
public class LichSuDTO {

    public LichSuDTO() {
    }

    public LichSuDTO(String maUS, String maNV, Date thoiGianDN) {
        this.maUS = maUS;
        this.maNV = maNV;
        this.thoiGianDN = thoiGianDN;
    }

    public String getMaUS() {
        return maUS;
    }

    public void setMaUS(String maUS) {
        this.maUS = maUS;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getThoiGianDN() {
        return thoiGianDN;
    }

    public void setThoiGianDN(Date thoiGianDN) {
        this.thoiGianDN = thoiGianDN;
    }
    private String maUS;
    private String maNV;
    private Date thoiGianDN;
}
