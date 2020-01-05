/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.awt.print.PrinterException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.HoaDonBUS;

/**
 *
 * @author LQTPL
 */
public class firmBaoCaoSuDungThuocNgay extends javax.swing.JPanel {

    HoaDonBUS bus = new HoaDonBUS();
    public firmBaoCaoSuDungThuocNgay() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_xem = new javax.swing.JButton();
        btn_in = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_baocao = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        date_dau = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        date_cuoi = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        btn_xem.setText("Xem");
        btn_xem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemActionPerformed(evt);
            }
        });

        btn_in.setText("In Báo Cáo");
        btn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inActionPerformed(evt);
            }
        });

        tb_baocao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"String", "String", "String", "String"},
                {"String", "String", "String", "String"}
            },
            new String [] {
                "Tên Thuốc", "Tên Đơn Vị", "Số Lượng", "Số Lần Dùng"
            }
        ));
        jScrollPane1.setViewportView(tb_baocao);

        jLabel5.setText("Từ ngày:");

        date_dau.setDateFormatString("dd-MM-yyyy");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Báo cáo sử dụng thuốc theo tháng");

        date_cuoi.setDateFormatString("dd-MM-yyyy");

        jLabel6.setText("Đến ngày:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_dau, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_cuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(266, 266, 266)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(296, 296, 296)
                            .addComponent(btn_xem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(btn_in))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_cuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_dau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(476, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(68, 68, 68)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_xem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_in, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemActionPerformed
        if (date_dau.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Chưa chọn ngày bắt đầu");
            return;
        } else if (date_cuoi.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Chưa chọn ngày kết thúc");
            return;
        }
        try {
            tb_baocao.setModel(DbUtils.resultSetToTableModel(bus.BaoCaoSuDungThuocNgay(date_dau.getDate(),date_cuoi.getDate())));
            if (tb_baocao.getModel() == null || tb_baocao.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Không có thông tin trong thời gian này");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lổi");
        }
    }//GEN-LAST:event_btn_xemActionPerformed

    private void btn_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inActionPerformed
        if (tb_baocao.getModel() == null || tb_baocao.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa có thông tin");
            return;
        } else {
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String strDate = dateFormat.format(date_dau.getDate());
            String strDate2 = dateFormat.format(date_cuoi.getDate());
            MessageFormat header = new MessageFormat("Báo cáo sử dụng thuốc từ " + strDate + " đến " + strDate2);
            MessageFormat footer = new MessageFormat("Trang {0,number,integer}");
            try {
                tb_baocao.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            } catch (java.awt.print.PrinterAbortException e) {

            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_inActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_in;
    private javax.swing.JButton btn_xem;
    private com.toedter.calendar.JDateChooser date_cuoi;
    private com.toedter.calendar.JDateChooser date_dau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_baocao;
    // End of variables declaration//GEN-END:variables
}
