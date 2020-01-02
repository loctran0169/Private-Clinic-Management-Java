/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.ThamSoBUS;
import quanlyphongkham.dto.ThamSoDTO;

/**
 *
 * @author LQTPL
 */
public class firmThamSo extends javax.swing.JPanel {

    private ThamSoBUS tsbus = new ThamSoBUS();
    private final ThamSoDTO tsdto = new ThamSoDTO();
    
    public firmThamSo() {
        initComponents();
        btnLuu.setVisible(false);
        btnHuy.setVisible(false);
        txtMaThamSo.setEnabled(false);
        txtGiaTri.setEnabled(false);
        txtTenThamSo.setEnabled(false);
        ReloadDb();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtTenThamSo = new javax.swing.JTextField();
        btnHuy = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        txtMaThamSo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThamSo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtGiaTri = new javax.swing.JTextField();

        jLabel3.setText("Tên tham số:");

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã tham số:");

        btnLoad.setText("Load dữ liệu");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        tbThamSo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tham số", "Tên tham số", "Giá trị"
            }
        ));
        tbThamSo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThamSoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbThamSo);

        jLabel2.setText("Giá Trị:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtMaThamSo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenThamSo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaThamSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenThamSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void ReloadDb() {
        try {
            JTable dt = new JTable();
            dt.setModel(DbUtils.resultSetToTableModel(tsbus.loadDuLieuThamSo()));
            if (dt.getRowCount() > 0) {
                tbThamSo.setModel(dt.getModel());
            } else {
                JOptionPane.showMessageDialog(null, "Load thất bại");

            }
        } catch (Exception ex) {
        }
    }
    
    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        txtTenThamSo.setEnabled(false);
        txtGiaTri.setEnabled(false);
        btnSua.setVisible(true);
        btnLuu.setVisible(false);
        btnHuy.setVisible(false);
        tbThamSo.setEnabled(true);
        txtTenThamSo.setText("");
        txtGiaTri.setText("");
        txtMaThamSo.setText("");
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        tsdto.setMaTS(txtMaThamSo.getText());
        tsdto.setTenThamSo(txtTenThamSo.getText());
        tsdto.setGiaTri(Integer.parseInt(txtGiaTri.getText()));
        boolean kq = tsbus.sua(tsdto);
        if (kq == false) {
            JOptionPane.showMessageDialog(null, "Sửa tham số thất bại. Vui lòng kiểm tra lại dữ liệu");
        } else {
            txtTenThamSo.setEnabled(false);
            txtGiaTri.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Sửa tham số thành công");
        }
        txtTenThamSo.setEditable(true);
        txtGiaTri.setEditable(true);
        btnSua.setVisible(true);
        btnLuu.setVisible(false);
        btnHuy.setVisible(false);
        tbThamSo.setEnabled(true);
        txtGiaTri.setText("");
        txtTenThamSo.setText("");
        txtMaThamSo.setText("");
        ReloadDb();
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(txtGiaTri.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Chưa chọn tham số");
            return;
        }
        txtTenThamSo.setEnabled(true);
        txtGiaTri.setEnabled(true);
        btnSua.setVisible(false);
        btnLuu.setVisible(true);
        btnHuy.setVisible(true);
        tbThamSo.setEnabled(true);

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        ReloadDb();
        try {

            int index = tbThamSo.getSelectedRow();
            txtMaThamSo.setText((String) tbThamSo.getValueAt(index, 0));
            txtTenThamSo.setText((String) tbThamSo.getValueAt(index, 1));
            txtGiaTri.setText((String) tbThamSo.getValueAt(index, 2));

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void tbThamSoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThamSoMouseClicked
        // TODO add your handling code here:
        try {
            int index = tbThamSo.getSelectedRow();
            txtMaThamSo.setText((String) tbThamSo.getValueAt(index, 0));
            txtTenThamSo.setText((String) tbThamSo.getValueAt(index, 1));
            txtGiaTri.setText( tbThamSo.getValueAt(index, 2)+"");

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_tbThamSoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbThamSo;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtMaThamSo;
    private javax.swing.JTextField txtTenThamSo;
    // End of variables declaration//GEN-END:variables
}
