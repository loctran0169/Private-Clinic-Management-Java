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

        setPreferredSize(new java.awt.Dimension(819, 502));

        date_load.setDateFormatString("dd-MM-yyyy");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Danh Sách Khám Bệnh ");

        jLabel4.setText("Ngày  khám:");

        btn_load.setText("Load Danh Sách");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        btn_in.setText("In danh sách");
        btn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_load)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_in))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(date_load, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 224, Short.MAX_VALUE)))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_load, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_load)
                    .addComponent(btn_in))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
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
