/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.LapPhieuKhamBUS;
import quanlyphongkham.bus.PhieuKhamBUS;
import quanlyphongkham.dto.BenhNhanDTO;
import quanlyphongkham.dto.LapPhieuKhamDTO;
import quanlyphongkham.dto.LoaiBenhDTO;
import quanlyphongkham.dto.NhanVienDTO;
import quanlyphongkham.dto.PhieuKhamDTO;

/**
 *
 * @author LQTPL
 */
public class firmPhieuKham extends javax.swing.JPanel {

    LapPhieuKhamBUS busLPK = new LapPhieuKhamBUS();
    PhieuKhamBUS busPK = new PhieuKhamBUS();
    ArrayList<NhanVienDTO> listBS = new ArrayList<NhanVienDTO>();
    ArrayList<LoaiBenhDTO> listLB = new ArrayList<LoaiBenhDTO>();
    String mabn = "";
    String flag = "";
    BenhNhanDTO bn = new BenhNhanDTO();
    int index = -1;
    
    public firmPhieuKham() {
        initComponents();
        loadBacSi();
        loadLoaiBenh();
        loadTable();
        btn_tim.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_huy = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_luu = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        cbb_loaibenh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_tim = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tb_mapk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbb_bacsi = new javax.swing.JComboBox<>();
        tb_mabn = new javax.swing.JTextField();
        date_ngaykham = new com.toedter.calendar.JDateChooser();
        btn_xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_phieukham = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_load = new javax.swing.JButton();
        tb_tenbn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(819, 502));

        btn_huy.setText("Hủy");
        btn_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyActionPerformed(evt);
            }
        });

        jLabel7.setText("Loại Bệnh:");

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        cbb_loaibenh.setEnabled(false);

        jLabel2.setText("Mã Phiếu Khám:");

        btn_tim.setText("Tìm");
        btn_tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timActionPerformed(evt);
            }
        });

        jLabel3.setText("Ngày Khám:");

        jLabel8.setText("Bác Sĩ Khám:");

        jLabel9.setText("Mã Bệnh Nhân:");

        tb_mapk.setEnabled(false);

        jLabel4.setText("Họ Và Tên (Bệnh nhân):");

        cbb_bacsi.setEnabled(false);

        tb_mabn.setEnabled(false);

        date_ngaykham.setEnabled(false);
        date_ngaykham.setFocusable(false);

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        tb_phieukham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_phieukham.setColumnSelectionAllowed(true);
        tb_phieukham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_phieukhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_phieukham);

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_load.setText("Load Dữ Liệu");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        tb_tenbn.setEnabled(false);

        jLabel1.setText("Thông Tin Nhân Viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(tb_mapk, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(tb_tenbn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_load)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(47, 47, 47)
                                .addComponent(tb_mabn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tim, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addGap(0, 510, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_them)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_luu)
                            .addComponent(btn_sua))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_xoa)
                            .addComponent(btn_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(date_ngaykham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(cbb_loaibenh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(cbb_bacsi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(date_ngaykham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(cbb_loaibenh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(cbb_bacsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tb_mapk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tb_mabn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_tim)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tb_tenbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_load, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_luu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void loadBacSi() {
        listBS = busLPK.loadBacSi();
        for (int i = 0; i < listBS.size(); i++) {
            cbb_bacsi.addItem(listBS.get(i).getHoVaTen());
        }
        cbb_bacsi.setSelectedIndex(-1);
    }

    public void loadLoaiBenh() {
        listLB = busLPK.loadLoaiBenh();
        for (int i = 0; i < listLB.size(); i++) {
            cbb_loaibenh.addItem(listLB.get(i).getTenLoaiBenh());
        }
        cbb_loaibenh.setSelectedIndex(-1);
    }

    public void loadTable() {
        tb_phieukham.setModel(DbUtils.resultSetToTableModel(busLPK.select()));
    }
    
    public Boolean checkData() {
        if (tb_mapk.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa có mã phiếu khám");
            return false;
        } else if (tb_tenbn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa có thông tin bệnh nhân");
            return false;
        } else if (date_ngaykham.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Chưa chọn ngày khám");
            return false;
        } else if (cbb_bacsi.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Chưa chọn bác sĩ");
            return false;
        } else if (cbb_loaibenh.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Chưa chọn Loại bệnh");
            return false;
        }
        return true;
    }
    
    public void emplyData() {
        tb_mabn.setText("");
        tb_mapk.setText("");
        tb_tenbn.setText("");
        cbb_loaibenh.setSelectedIndex(-1);
        cbb_bacsi.setSelectedIndex(-1);
        date_ngaykham.setDate(null);
    }

    public void ChiDoc() {
        btn_them.setVisible(true);
        btn_sua.setVisible(true);
        btn_xoa.setVisible(true);

        btn_luu.setVisible(false);
        btn_huy.setVisible(false);
        btn_tim.setVisible(false);

        cbb_loaibenh.setEnabled(false);
        cbb_bacsi.setEnabled(false);
        tb_mabn.setEnabled(false);
        date_ngaykham.setEnabled(false);
    }

    public void ChiSua() {
        btn_them.setVisible(false);
        btn_sua.setVisible(false);
        btn_xoa.setVisible(false);

        btn_luu.setVisible(true);
        btn_huy.setVisible(true);
        btn_tim.setVisible(true);
        cbb_loaibenh.setEnabled(true);
        cbb_bacsi.setEnabled(true);
        tb_mabn.setEnabled(true);
        date_ngaykham.setEnabled(true);

    }
    
    private void btn_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyActionPerformed
        ChiDoc();
        emplyData();
        flag = "";
    }//GEN-LAST:event_btn_huyActionPerformed

    private String TaoMaTuDong(String key) {
        JTable dt = new JTable();
        dt.setModel(DbUtils.resultSetToTableModel(busLPK.select()));

        int coso = 0;
        if (dt.getRowCount() == 0) {
            coso = 1;
        } else if (dt.getRowCount() == 1 && Integer.parseInt(dt.getValueAt(0, 0).toString().substring(2)) == 1) {
            coso = 2;
        } else if (dt.getRowCount() == 1 && Integer.parseInt(dt.getValueAt(0, 0).toString().substring(2)) > 1) {
            coso = 1;
        } else {
            for (int i = 0; i < dt.getRowCount() - 1; i++) {

                if (Integer.parseInt(dt.getValueAt(i + 1, 0).toString().substring(2)) - Integer.parseInt(dt.getValueAt(i, 0).toString().substring(2)) > 1) {
                    coso = 1 + Integer.parseInt(dt.getValueAt(i, 0).toString().substring(2));
                    break;
                }
            }
            coso = Integer.parseInt(dt.getValueAt(dt.getRowCount() - 1, 0).toString().substring(2)) + 1;
        }

        //Sau khi lấy được cơ số thứ tự của thuốc, ta gắn thêm tiền tố T vào
        String ma = "";
        if (coso < 10) {
            return ma = key + "00" + coso;
        } else if (coso < 100) {
            return ma = key + "0" + coso;
        } else {
            return ma = key + coso;
        }
    }
    
    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        if ("Sửa".equals(flag)) {
            if (!checkData()) {
                return;
            }
            LapPhieuKhamDTO pk = new LapPhieuKhamDTO();
            pk.setMaPK(tb_mapk.getText());
            pk.setMaLB(listLB.get(cbb_loaibenh.getSelectedIndex()).getMaLB());
            pk.setMaBS(listBS.get(cbb_bacsi.getSelectedIndex()).getMaNhanVien());
            pk.setNgayKham(date_ngaykham.getDate());
            pk.setMaBN(bn.getMaBN());
            Boolean kq = busLPK.sua(pk);
            if (kq == true) {
                JOptionPane.showMessageDialog(null, "Sửa bệnh nhân thành công");
                ChiDoc();
                loadTable();
            } else {
                JOptionPane.showMessageDialog(null, "Sửa bệnh nhân thất bại");
            }

        } else if ("them".equals(flag)) {
            if (!checkData()) {
                return;
            }
            PhieuKhamDTO pk = new PhieuKhamDTO();
            pk.setMaPK(TaoMaTuDong("PK"));
            pk.setMaBN(bn.getMaBN());
            pk.setNgayKham(date_ngaykham.getDate());
            pk.setMaLB(listLB.get(cbb_loaibenh.getSelectedIndex()).getMaLB());
            pk.setMaNV(listBS.get(cbb_bacsi.getSelectedIndex()).getMaNhanVien());
            Boolean kq = busPK.them(pk);
            if (kq == true) {
                JOptionPane.showMessageDialog(null, "Thêm  thành công");
                loadTable();
            } else {
                JOptionPane.showMessageDialog(null, "Thêm  thất bại");
            }
        }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (tb_mapk.getText().isEmpty()) {
            return;
        }
        ChiSua();
        bn.setMaBN((String) tb_phieukham.getValueAt(index, 1).toString());
        bn.setHoTen((String) tb_phieukham.getValueAt(index, 2).toString());
        flag = "Sửa";

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timActionPerformed
        bn = busPK.timBenhNhan(tb_mabn.getText());
        if (bn == null) {
            JOptionPane.showMessageDialog(null, "Không tìn thấy bện nhân");
            tb_tenbn.setText(null);
        } else {
            tb_tenbn.setText(bn.getHoTen());
        }
    }//GEN-LAST:event_btn_timActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa phiếu khám?", "Thông báo", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            PhieuKhamDTO bn = new PhieuKhamDTO();
            bn.setMaPK(tb_mapk.getText());
            Boolean kq = busPK.xoa(bn);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Xóa phiếu khám thất bại. Vui lòng kiểm tra lại dũ liệu");
            } else {
                JOptionPane.showMessageDialog(null, "Xóa phiếu khám thành công");
                loadTable();
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tb_phieukhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_phieukhamMouseClicked
        ChiDoc();
        try {
            index = tb_phieukham.getSelectedRow();
            tb_mapk.setText((String) tb_phieukham.getValueAt(index, 0));
            tb_mabn.setText((String) tb_phieukham.getValueAt(index, 1).toString());
            tb_tenbn.setText((String) tb_phieukham.getValueAt(index, 2).toString());
            date_ngaykham.setDate((Date) tb_phieukham.getValueAt(index, 6));

            java.util.List<NhanVienDTO> result = listBS.stream()
                    .filter(item -> item.getHoVaTen().equals(tb_phieukham.getValueAt(index, 3).toString()))
                    .collect(Collectors.toList());
            java.util.List<LoaiBenhDTO> result2 = listLB.stream()
                    .filter(item -> item.getTenLoaiBenh().equals(tb_phieukham.getValueAt(index, 4).toString()))
                    .collect(Collectors.toList());
            try {
                cbb_bacsi.setSelectedIndex(listBS.indexOf(result.get(0)));
            } catch (Exception e) {
                cbb_bacsi.setSelectedIndex(-1);
            }

            try {
                cbb_loaibenh.setSelectedIndex(listLB.indexOf(result2.get(0)));
            } catch (Exception e) {
                cbb_loaibenh.setSelectedIndex(-1);
            }

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_tb_phieukhamMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        ChiSua();
        emplyData();
        tb_mapk.setText(TaoMaTuDong("PK"));
        flag = "them";
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadActionPerformed
        if (listBS.isEmpty()) {
            loadBacSi();
        }
        if (listLB.isEmpty()) {
            loadLoaiBenh();
        }
        loadTable();
    }//GEN-LAST:event_btn_loadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_tim;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbb_bacsi;
    private javax.swing.JComboBox<String> cbb_loaibenh;
    private com.toedter.calendar.JDateChooser date_ngaykham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tb_mabn;
    private javax.swing.JTextField tb_mapk;
    private javax.swing.JTable tb_phieukham;
    private javax.swing.JTextField tb_tenbn;
    // End of variables declaration//GEN-END:variables
}
