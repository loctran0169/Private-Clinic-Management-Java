package quanlyphongkham.dto;

import java.util.Date;

/**
 *
 * @author LQTPL
 */
public class HoaDonDTO {

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaPK() {
        return MaPK;
    }

    public void setMaPK(String MaPK) {
        this.MaPK = MaPK;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public int getTienThuoc() {
        return TienThuoc;
    }

    public void setTienThuoc(int TienThuoc) {
        this.TienThuoc = TienThuoc;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
    private String MaHD;
    private String MaPK;
    private Date NgayLap;
    private int TienThuoc;
    private int TongTien;
}