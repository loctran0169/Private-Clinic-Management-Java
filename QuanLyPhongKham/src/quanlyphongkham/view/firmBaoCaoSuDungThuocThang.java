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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.HoaDonBUS;

/**
 *
 * @author LQTPL
 */
public class firmBaoCaoSuDungThuocThang extends javax.swing.JPanel {

    HoaDonBUS bus = new HoaDonBUS();

    public firmBaoCaoSuDungThuocThang() {
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
        date_ngay = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_xem.setText("Xem");
        btn_xem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemActionPerformed(evt);
            }
        });
        add(btn_xem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 85, 40));

        btn_in.setText("In Báo Cáo");
        btn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inActionPerformed(evt);
            }
        });
        add(btn_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 40));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 217, 880, 350));

        jLabel5.setText("Chọn Tháng:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 24));

        date_ngay.setDateFormatString("MM-yyyy");
        add(date_ngay, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 197, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemActionPerformed
        if (date_ngay.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Chưa chọn tháng");
            return;
        }
        try {
            tb_baocao.setModel(DbUtils.resultSetToTableModel(bus.BaoCaoSuDungThuocThang(date_ngay.getDate())));
            if (tb_baocao.getModel() == null || tb_baocao.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Không có thông tin trong tháng này");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lổi");
        }
    }//GEN-LAST:event_btn_xemActionPerformed

    private void btn_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inActionPerformed
        if (tb_baocao.getModel() == null || tb_baocao.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa có thông tin trong ngày này");
            return;
        } else {
            DateFormat dateFormat = new SimpleDateFormat("MM-yyyy");
            String strDate = dateFormat.format(date_ngay.getDate());
            MessageFormat header = new MessageFormat("Báo cáo sử dung thuốc " + strDate);
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
    private com.toedter.calendar.JDateChooser date_ngay;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_baocao;
    // End of variables declaration//GEN-END:variables
}
