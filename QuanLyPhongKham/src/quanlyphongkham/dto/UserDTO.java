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
public class UserDTO {
    private String maUS;
    private String taiKhoan;
    private String matKhau;
    private String maNV;
    private String maQuyenHan;
    
    public String getMaUS() {
        return maUS;
    }
    
    public void setMaUS(String maUS) {
        this.maUS = maUS;
    }
    
    public String getTaiKhoan() {
        return taiKhoan;
    }
    
    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    
    public String getMatKhau() {
        return matKhau;
    }
    
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public String getMaNV() {
        return maNV;
    }
    
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
    public String getMaQuyenHan() {
        return maQuyenHan;
    }
    
    public void setMaQuyenHan(String maQuyenHan) {
        this.maQuyenHan = maQuyenHan;
    }
    
    public UserDTO(String maUS, String taiKhoan, String matKhau, String maNV, String maQuyenHan) {
        this.maUS = maUS;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.maNV = maNV;
        this.maQuyenHan = maQuyenHan;
    }
    
    public UserDTO() {
    }
    
}
