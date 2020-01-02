/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.bus;

import java.sql.ResultSet;
import quanlyphongkham.dal.QuyenHanDAL;

public class QuyenHanBUS {
    private final QuyenHanDAL qhDAL;

    public QuyenHanBUS() {
        qhDAL = new QuyenHanDAL();
    }
    public ResultSet loadDuLieuQuyenHan() {
        return qhDAL.loadDuLieuQuyenHan();
    }
}
