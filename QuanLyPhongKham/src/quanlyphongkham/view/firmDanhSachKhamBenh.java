package quanlyphongkham.view;

import java.awt.print.PrinterException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.BenhNhanBUS;

public class firmDanhSachKhamBenh extends javax.swing.JPanel {

    BenhNhanBUS bus = new BenhNhanBUS();

    public firmDanhSachKhamBenh() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date_load = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_load = new javax.swing.JButton();
        btn_in = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_dsBenh = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(819, 502));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date_load.setDateFormatString("dd-MM-yyyy");
        add(date_load, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 224, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Danh Sách Khám Bệnh ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel4.setText("Ngày  khám:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 30));

        btn_load.setText("Load Danh Sách");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });
        add(btn_load, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btn_in.setText("In danh sách");
        btn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inActionPerformed(evt);
            }
        });
        add(btn_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 110, -1, -1));

        tb_dsBenh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_dsBenh);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 886, 414));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadActionPerformed
        if (date_load.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Chưa chọn ngày");
            return;
        }
        try {
            tb_dsBenh.setModel(DbUtils.resultSetToTableModel(bus.loadDanhSachKhamBenh(date_load.getDate())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tải dữ liệu thất bại ");
        }
    }//GEN-LAST:event_btn_loadActionPerformed

    private void btn_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inActionPerformed
        if (tb_dsBenh.getModel() == null || tb_dsBenh.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Chưa có thông tin trong ngày này");
            return;
        } else {
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String strDate = dateFormat.format(date_load.getDate());
            MessageFormat header = new MessageFormat("Danh sách khám bệnh \nNgày " +strDate);
            MessageFormat footer = new MessageFormat("Trang {0,number,integer}");
            try {
                tb_dsBenh.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            } catch (java.awt.print.PrinterAbortException e) {

            } catch (PrinterException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_inActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_in;
    private javax.swing.JButton btn_load;
    private com.toedter.calendar.JDateChooser date_load;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_dsBenh;
    // End of variables declaration//GEN-END:variables
}
