/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dto;

import java.sql.Date;

/**
 *
 * @author Minh
 */
public class LichSuDTO {
    private String maUS;
    private Date thoiGianDN;

    public LichSuDTO() {
    }

    public LichSuDTO(String maUS, Date thoiGianDN) {
        this.maUS = maUS;
        this.thoiGianDN = thoiGianDN;
    }

    public String getMaUS() {
        return maUS;
    }

    public Date getThoiGianDN() {
        return thoiGianDN;
    }

    public void setMaUS(String maUS) {
        this.maUS = maUS;
    }

    public void setThoiGianDN(Date thoiGianDN) {
        this.thoiGianDN = thoiGianDN;
    }
    
}
