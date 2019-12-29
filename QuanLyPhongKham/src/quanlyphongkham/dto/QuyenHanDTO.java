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
public class QuyenHanDTO {
    private String maQH;
    private String tenQuyenHan;
    private String noiDung;
    
    public String getMaQH() {
        return maQH;
    }
    
    public void setMaQH(String maQH) {
        this.maQH = maQH;
    }
    
    public String getTenQuyenHan() {
        return tenQuyenHan;
    }
    
    public void setTenQuyenHan(String tenQuyenHan) {
        this.tenQuyenHan = tenQuyenHan;
    }
    
    public String getNoiDung() {
        return noiDung;
    }
    
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
    
    public QuyenHanDTO(String maQH, String tenQuyenHan, String noiDung) {
        this.maQH = maQH;
        this.tenQuyenHan = tenQuyenHan;
        this.noiDung = noiDung;
    }
    
    public QuyenHanDTO() {
    }
}
