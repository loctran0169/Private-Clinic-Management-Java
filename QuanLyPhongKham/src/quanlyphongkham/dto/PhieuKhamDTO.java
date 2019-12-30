package quanlyphongkham.dto;

import java.util.Date;

/**
 *
 * @author LQTPL
 */
public class PhieuKhamDTO {

    public PhieuKhamDTO() {
    }

    public PhieuKhamDTO(String MaPK, String MaBN, String MaNV, String MaLB, Date NgayKham, Date NgayKhamLai) {
        this.MaPK = MaPK;
        this.MaBN = MaBN;
        this.MaNV = MaNV;
        this.MaLB = MaLB;
        this.NgayKham = NgayKham;
        this.NgayKhamLai = NgayKhamLai;
    }

    
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

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaLB() {
        return MaLB;
    }

    public void setMaLB(String MaLB) {
        this.MaLB = MaLB;
    }

    public Date getNgayKham() {
        return NgayKham;
    }

    public void setNgayKham(Date NgayKham) {
        this.NgayKham = NgayKham;
    }

    public Date getNgayKhamLai() {
        return NgayKhamLai;
    }

    public void setNgayKhamLai(Date NgayKhamLai) {
        this.NgayKhamLai = NgayKhamLai;
    }
    private String MaPK;
    private String MaBN;
    private String MaNV;
    private String MaLB;
    private Date NgayKham;
    private Date NgayKhamLai;
}