/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.bus;

import java.sql.ResultSet;
import quanlyphongkham.dal.ThamSoDAL;
import quanlyphongkham.dto.ThamSoDTO;

/**
 *
 * @author Minh
 */
public class ThamSoBUS {
    private ThamSoDAL thamSoDAL;

    public ThamSoBUS() {
        thamSoDAL = new ThamSoDAL();
    }

    public boolean sua(ThamSoDTO thamSoDTO) {
        boolean re = thamSoDAL.Sua(thamSoDTO);
        return re;
    }
    
    public ResultSet loadDuLieuThamSo() {
        return thamSoDAL.loadDuLieuThamSo();
    }

}
