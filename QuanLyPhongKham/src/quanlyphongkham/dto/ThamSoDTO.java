/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.dto;

/**
 *
 * @author LQTPL
 */
public class ThamSoDTO {

    public ThamSoDTO() {
    }

    public ThamSoDTO(String MaTS, String TenThamSo, int GiaTri) {
        this.MaTS = MaTS;
        this.TenThamSo = TenThamSo;
        this.GiaTri = GiaTri;
    }

    public String getMaTS() {
        return MaTS;
    }

    public void setMaTS(String MaTS) {
        this.MaTS = MaTS;
    }

    public String getTenThamSo() {
        return TenThamSo;
    }

    public void setTenThamSo(String TenThamSo) {
        this.TenThamSo = TenThamSo;
    }

    public int getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(int GiaTri) {
        this.GiaTri = GiaTri;
    }
    private String MaTS;
    private String TenThamSo;
    private int GiaTri;
}
