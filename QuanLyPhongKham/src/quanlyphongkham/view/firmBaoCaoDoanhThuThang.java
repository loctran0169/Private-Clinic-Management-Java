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
public class firmBaoCaoDoanhThuThang extends javax.swing.JPanel {

    HoaDonBUS bus = new HoaDonBUS();
    public firmBaoCaoDoanhThuThang() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        date_ngay = new com.toedter.calendar.JDateChooser();
        btn_xem = new javax.swing.JButton();
        btn_inbaocao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_baocao = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Chọn tháng:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        date_ngay.setDateFormatString("MM-yyyy");
        add(date_ngay, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 197, -1));

        btn_xem.setText("Xem");
        btn_xem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemActionPerformed(evt);
            }
        });
        add(btn_xem, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 85, 40));

        btn_inbaocao.setText("In Báo Cáo");
        btn_inbaocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inbaocaoActionPerformed(evt);
            }
        });
        add(btn_inbaocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, 40));

        tb_baocao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"String", "String", "String", "String"},
                {"String", "String", "String", "String"}
            },
            new String [] {
                "Ngày Lập", "Số Lượng Bệnh Nhân", "Doanh Thu (VND)", "Tỷ Lệ (%)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_baocao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tb_baocao);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, 886, 347));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Báo cáo doanh thu theo tháng");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemActionPerformed
        if (date_ngay.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Chưa chọn tháng");
            return;
        }
        try {
            tb_baocao.setModel(DbUtils.resultSetToTableModel(bus.BaoCaoDoanhThuThang(date_ngay.getDate())));
            if (tb_baocao.getModel() == null || tb_baocao.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Không có thông tin trong tháng này");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lổi");
        }
    }//GEN-LAST:event_btn_xemActionPerformed

    private void btn_inbaocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inbaocaoActionPerformed
        if (tb_baocao.getModel() == null || tb_baocao.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa có thông tin");
            return;
        } else {
            DateFormat dateFormat = new SimpleDateFormat("MM-yyyy");
            String strDate = dateFormat.format(date_ngay.getDate());
            MessageFormat header = new MessageFormat("Báo cáo doanh thu " + strDate);
            MessageFormat footer = new MessageFormat("Trang {0,number,integer}");
            try {
                tb_baocao.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            } catch (java.awt.print.PrinterAbortException e) {

            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_inbaocaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inbaocao;
    private javax.swing.JButton btn_xem;
    private com.toedter.calendar.JDateChooser date_ngay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_baocao;
    // End of variables declaration//GEN-END:variables
}
