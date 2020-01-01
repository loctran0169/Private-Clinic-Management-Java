/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dto;

/**
 *
 * @author Minh
 */
public class ThamSoDTO {
    private String MaTS;
    private String TenThamSo;
    private int GiaTri;

    public void setTenThamSo(String TenThamSo) {
        this.TenThamSo = TenThamSo;
    }

    public void setMaTS(String MaTS) {
        this.MaTS = MaTS;
    }

    public void setGiaTri(int GiaTri) {
        this.GiaTri = GiaTri;
    }

    public String getTenThamSo() {
        return TenThamSo;
    }

    public String getMaTS() {
        return MaTS;
    }

    public int getGiaTri() {
        return GiaTri;
    }

    public ThamSoDTO(String MaTS, String TenThamSo, int GiaTri) {
        this.MaTS = MaTS;
        this.TenThamSo = TenThamSo;
        this.GiaTri = GiaTri;
    }

    public ThamSoDTO() {
    }
}
