/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import quanlyphongkham.dal.ConnectDB;

/**
 *
 * @author LQTPL
 */
public class firmKhoiPhuc extends javax.swing.JPanel {

    String path = "";
    ConnectDB conn = new ConnectDB();
    
    public firmKhoiPhuc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_thumuc = new javax.swing.JButton();
        btn_khoiphuc = new javax.swing.JButton();
        tb_thumuc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(819, 502));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_thumuc.setText("Chọn file");
        btn_thumuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thumucActionPerformed(evt);
            }
        });
        add(btn_thumuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        btn_khoiphuc.setText("Khôi phục");
        btn_khoiphuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khoiphucActionPerformed(evt);
            }
        });
        add(btn_khoiphuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        tb_thumuc.setEnabled(false);
        add(tb_thumuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 210, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Khôi phục dữ liệu");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Thư mục:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public Boolean checkData() {
        if (tb_thumuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa nhập thư mục");
            tb_thumuc.requestFocus();
            return false;
        }
        return true;
    }
    
    private void btn_thumucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thumucActionPerformed
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                path = jfc.getSelectedFile().toString();
                path = path.replace('\\', '/');
                tb_thumuc.setText(path);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_thumucActionPerformed

    private void btn_khoiphucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khoiphucActionPerformed
        if (!checkData()) {
            return;
        }
        String[] executeCmd = new String[]{"C:/Program Files/MySQL/MySQL Server 8.0/bin/mysql", "qlpk", "-u" + conn.userName, "-p" + conn.passWord, "-e", " source "+path};
        Process runtimeProcess;
        try {
            System.out.println(executeCmd);//this out put works in mysql shell
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "Khôi khục thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Khôi phục thất bại");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_khoiphucActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_khoiphuc;
    private javax.swing.JButton btn_thumuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tb_thumuc;
    // End of variables declaration//GEN-END:variables
}
