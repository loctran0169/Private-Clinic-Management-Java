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
public class CachDungDTO {

    public CachDungDTO() {
    }

    public CachDungDTO(String MaCD, String CachDung) {
        this.MaCD = MaCD;
        this.CachDung = CachDung;
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
    private String MaCD;
    private String CachDung;
}
