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
public class DonViTinhDTO {
    private String MaDV;
    private String TenDonVi;
    
    public String getMaDV() {
        return MaDV;
    }
    
    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }
    
    public String getTenDonVi() {
        return TenDonVi;
    }
    
    public void setTenDonVi(String TenDonVi) {
        this.TenDonVi = TenDonVi;
    }
    
    public DonViTinhDTO(String MaDV, String TenDonVi) {
        this.MaDV = MaDV;
        this.TenDonVi = TenDonVi;
    }
    
    public DonViTinhDTO() {
    }
}
