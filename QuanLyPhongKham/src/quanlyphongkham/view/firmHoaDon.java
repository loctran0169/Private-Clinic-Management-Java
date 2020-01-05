/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.HoaDonBUS;
import quanlyphongkham.dto.HoaDonDTO;

/**
 *
 * @author LQTPL
 */
public class firmHoaDon extends javax.swing.JPanel {

    HoaDonBUS bus = new HoaDonBUS();
    JTable dt = new JTable();

    public firmHoaDon() {
        initComponents();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tb_tienkham.setText(bus.loadThamSo());
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_xem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bt_in = new javax.swing.JButton();
        tb_pk = new javax.swing.JTextField();
        tb_hoten = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_thuoc = new javax.swing.JTable();
        checkBox1 = new javax.swing.JCheckBox();
        tb_tienthuoc = new javax.swing.JTextField();
        tb_mahd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tb_tongtien = new javax.swing.JTextField();
        tb_tienkham = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(819, 502));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_xem.setText("In Hóa Đơn");
        bt_xem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xemActionPerformed(evt);
            }
        });
        add(bt_xem, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 180, 130, 30));

        jLabel4.setText("Mã Phiếu Khám:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        bt_in.setText("Lập Hóa Đơn");
        bt_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inActionPerformed(evt);
            }
        });
        add(bt_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, 30));
        add(tb_pk, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 114, -1));

        tb_hoten.setEnabled(false);
        add(tb_hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 170, -1));

        jLabel5.setText("Họ Và Tên Bệnh Nhân:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel1.setText("Thông Tin Hóa Đơn");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButton1.setText("Tìm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        tb_thuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"String", "String", "String", "String"},
                {"String", "String", "String", "String"}
            },
            new String [] {
                "Tên Thuốc ", "Số Lượng", "Đơn Giá", "Cách Dùng"
            }
        ));
        jScrollPane1.setViewportView(tb_thuoc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 251, 890, 310));

        checkBox1.setText("Thanh Toán");
        checkBox1.setEnabled(false);
        add(checkBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        tb_tienthuoc.setEnabled(false);
        add(tb_tienthuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 170, -1));

        tb_mahd.setEnabled(false);
        add(tb_mahd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 170, -1));

        jLabel6.setText("Tiền Thuốc:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        jLabel2.setText("Mã Hóa Đơn:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        tb_tongtien.setEnabled(false);
        add(tb_tongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 170, -1));

        tb_tienkham.setEnabled(false);
        add(tb_tienkham, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 170, -1));

        jLabel7.setText("Tổng Tiền:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jLabel3.setText("Tiền Khám:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_xemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xemActionPerformed

    }//GEN-LAST:event_bt_xemActionPerformed

    private void bt_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inActionPerformed
        if (checkBox1.isSelected()) {
            JOptionPane.showMessageDialog(null, "Hóa đơn mã được thanh toán");
            return;
        } else if (tb_hoten.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa có thông tin phiếu khám");
            return;
        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Lập hóa đơn", "Thông báo", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    HoaDonDTO hd = new HoaDonDTO();
                    hd.setMaHD(TaoMaTuDong("HD"));
                    hd.setMaPK(tb_pk.getText());
                    
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDateTime now = LocalDateTime.now();
                    Date dateNgapLap = new SimpleDateFormat("yyyy-MM-dd").parse(dtf.format(now));
                    hd.setNgayLap(dateNgapLap);
                    hd.setTienThuoc(Integer.parseInt(tb_tienthuoc.getText()));
                    hd.setTongTien(Integer.parseInt(tb_tongtien.getText()));
                    
                    tb_mahd.setText(hd.getMaHD());
                    Boolean kq = bus.them(hd);
                    if (kq == true) {
                        JOptionPane.showMessageDialog(null, "Lập hóa đơn thành công.");
                        checkBox1.setSelected(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Lập hóa đơn thất bại");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_bt_inActionPerformed

    private String TaoMaTuDong(String key) {
        JTable dt = new JTable();
        dt.setModel(DbUtils.resultSetToTableModel(bus.loadTD()));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tb_pk.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa nhập mã phiếu khám");
            return;
        }
        try {
            dt.setModel(DbUtils.resultSetToTableModel(bus.LoadTienThuoc(tb_pk.getText())));
            tb_thuoc.setModel(DbUtils.resultSetToTableModel(bus.loadDuLieu(tb_pk.getText())));
            if (dt.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Không có thông tin phiếu khám");
                tb_hoten.setText("");
                tb_mahd.setText("");
                tb_pk.setText("");

                tb_tienthuoc.setText("");
                tb_tongtien.setText("");
                checkBox1.setSelected(false);
                return;
            }
            tb_hoten.setText(dt.getValueAt(0, 0).toString());
            tb_tienthuoc.setText(dt.getValueAt(0, 1).toString());
            
            String hd = bus.TimHoaDon(tb_pk.getText());

            if (hd == null || hd.isEmpty()) {
                checkBox1.setSelected(false);
                tb_mahd.setText(null);
            } else {
                tb_mahd.setText(hd);
                checkBox1.setSelected(true);
            }
            int sum = Integer.parseInt(tb_tienthuoc.getText()) + Integer.parseInt(tb_tienkham.getText());
            tb_tongtien.setText(Integer.toString(sum));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_in;
    private javax.swing.JButton bt_xem;
    private javax.swing.JCheckBox checkBox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tb_hoten;
    private javax.swing.JTextField tb_mahd;
    private javax.swing.JTextField tb_pk;
    private javax.swing.JTable tb_thuoc;
    private javax.swing.JTextField tb_tienkham;
    private javax.swing.JTextField tb_tienthuoc;
    private javax.swing.JTextField tb_tongtien;
    // End of variables declaration//GEN-END:variables
}
