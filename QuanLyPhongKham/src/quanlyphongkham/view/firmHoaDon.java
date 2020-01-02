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
        tb_tienkham.setText(bus.loadThamSo());
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

        setPreferredSize(new java.awt.Dimension(819, 502));

        bt_xem.setText("In Hóa Đơn");
        bt_xem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xemActionPerformed(evt);
            }
        });

        jLabel4.setText("Mã Phiếu Khám:");

        bt_in.setText("Lập Hóa Đơn");
        bt_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inActionPerformed(evt);
            }
        });

        tb_hoten.setEnabled(false);

        jLabel5.setText("Họ Và Tên Bệnh Nhân:");

        jLabel1.setText("Thông Tin Hóa Đơn");

        jButton1.setText("Tìm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        checkBox1.setText("Thanh Toán");
        checkBox1.setEnabled(false);

        tb_tienthuoc.setEnabled(false);

        tb_mahd.setEnabled(false);

        jLabel6.setText("Tiền Thuốc:");

        jLabel2.setText("Mã Hóa Đơn:");

        tb_tongtien.setEnabled(false);

        tb_tienkham.setEnabled(false);

        jLabel7.setText("Tổng Tiền:");

        jLabel3.setText("Tiền Khám:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(664, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tb_mahd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tb_pk, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tb_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkBox1))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tb_tienkham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bt_xem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(bt_in))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel7)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tb_tienthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tb_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(86, 86, 86))
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tb_mahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_tienkham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(tb_pk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGap(6, 6, 6)
                        .addComponent(tb_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(checkBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(tb_tienthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(tb_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_xem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_in, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
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
            int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa bệnh nhân??", "Thông báo", dialogButton);
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
        dt.setModel(DbUtils.resultSetToTableModel(bus.loadToDataTable()));

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
