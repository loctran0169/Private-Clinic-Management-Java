package quanlyphongkham.view;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import quanlyphongkham.dal.ConnectDB;

public class frmKhoiPhuc extends javax.swing.JFrame {

    String path = "";
    ConnectDB conn = new ConnectDB();

    public frmKhoiPhuc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btn_thumuc = new javax.swing.JButton();
        btn_khoiphuc = new javax.swing.JButton();
        tb_thumuc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Khôi Phục");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Thư mục:");

        btn_thumuc.setText("Chọn file");
        btn_thumuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thumucActionPerformed(evt);
            }
        });

        btn_khoiphuc.setText("Khôi phục");
        btn_khoiphuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khoiphucActionPerformed(evt);
            }
        });

        tb_thumuc.setEnabled(false);

        jLabel1.setText("Khôi phục dữ liệu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tb_thumuc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_thumuc)
                        .addGap(38, 38, 38)
                        .addComponent(btn_khoiphuc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_thumuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_thumuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_khoiphuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Boolean checkData() {
        if (tb_thumuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa nhập thư mục");
            tb_thumuc.requestFocus();
            return false;
        }
        return true;
    }

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed 

        try {

            String databaseName = "mysql";//database name
            String userName = "root";//username of mysql
            String password = "1234";//password of myql
            int processComplete;// this variable for verify the process

            String[] executeCmd = new String[]{"mysql", databaseName, "-u" + userName, "-p" + password, "-e", " source D:/backup.sql"};
//sava the command in a array
            Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);// execute the command

            processComplete = runtimeProcess.waitFor();// get the result to variable

            if (processComplete == 1) {// if return value equal to 1 then failed the process

                JOptionPane.showMessageDialog(null, "Restore Failed");
            } else if (processComplete == 0) {
                {// if return value equal to 0 then failed the process

                    JOptionPane.showMessageDialog(null, "Restore Completed");

                }
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);

        }

// TODO add your handling code here:
    }

    private void btn_thumucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thumucActionPerformed
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                path = jfc.getSelectedFile().toString();
                path = path.replace('\\', '/');
                tb_thumuc.setText(path);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_btn_thumucActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmKhoiPhuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKhoiPhuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKhoiPhuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKhoiPhuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKhoiPhuc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_khoiphuc;
    private javax.swing.JButton btn_thumuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tb_thumuc;
    // End of variables declaration//GEN-END:variables
}
