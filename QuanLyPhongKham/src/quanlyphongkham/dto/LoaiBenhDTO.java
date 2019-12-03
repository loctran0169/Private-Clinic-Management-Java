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
public class LoaiBenhDTO {

    public String getMaLB() {
        return MaLB;
    }

    public void setMaLB(String MaLB) {
        this.MaLB = MaLB;
    }

    public String getTenLoaiBenh() {
        return tenLoaiBenh;
    }

    public void setTenLoaiBenh(String tenLoaiBenh) {
        this.tenLoaiBenh = tenLoaiBenh;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public LoaiBenhDTO() {
    }
    private String MaLB;
    private String tenLoaiBenh;
    private String trieuChung;

    public LoaiBenhDTO(String MaLB, String tenLoaiBenh, String trieuChung) {
        this.MaLB = MaLB;
        this.tenLoaiBenh = tenLoaiBenh;
        this.trieuChung = trieuChung;
    }

}
