/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import quanlyphongkham.dal.ConnectDB;

/**
 *
 * @author LQTPL
 */
public class firmSaoLuu extends javax.swing.JPanel {

    String path = null;
    ConnectDB conn = new ConnectDB();
    public firmSaoLuu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        tb_thumuc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_thumuc = new javax.swing.JButton();
        btn_saoluu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("Thư Mục:");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_thumuc.setEnabled(false);
        add(tb_thumuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 200, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thông Tin Sao Lưu");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 181, -1));

        btn_thumuc.setText("Thư mục");
        btn_thumuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thumucActionPerformed(evt);
            }
        });
        add(btn_thumuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        btn_saoluu.setText("Sao Lưu");
        btn_saoluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saoluuActionPerformed(evt);
            }
        });
        add(btn_saoluu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel2.setText("Thư mục");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_thumucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thumucActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                path = jfc.getCurrentDirectory().toString();
                path = path.replace('\\', '/');
                tb_thumuc.setText(path);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_thumucActionPerformed

    private void btn_saoluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saoluuActionPerformed
        if (tb_thumuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa chọn đường dẫn");
            return;
        }
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String executeCmd = "C:/Program Files/MySQL/MySQL Server 8.0/bin/mysqldump -u " + conn.userName + " -p" + conn.passWord + " --add-drop-database -B " + "qlpk" + " -r " + path + "/qlpk_" + date + ".sql";
        Process runtimeProcess;
        try {
            System.out.println(executeCmd);//this out put works in mysql shell
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "Sao lưu thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Sao lưu thất bại");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_saoluuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_saoluu;
    private javax.swing.JButton btn_thumuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tb_thumuc;
    // End of variables declaration//GEN-END:variables
}
