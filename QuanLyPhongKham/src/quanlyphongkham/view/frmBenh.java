/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.LoaiBenhBUS;
import quanlyphongkham.dto.LoaiBenhDTO;

public class frmBenh extends javax.swing.JFrame {

    LoaiBenhBUS bus = new LoaiBenhBUS();
    String flag = null;


    public frmBenh() {
        initComponents();
        KhoaButton();
        ReloadDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaLoaiBenh = new javax.swing.JTextField();
        txtTrieuChung = new javax.swing.JTextField();
        txtTenLoaiBenh = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBenh = new javax.swing.JTable();
        btnLoad = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bệnh");
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Mã loại bệnh:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("label1");

        jLabel2.setText("Triệu chứng:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 80, -1));

        jLabel3.setText("Tên loại bệnh:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        txtMaLoaiBenh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtMaLoaiBenh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 200, -1));

        txtTrieuChung.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtTrieuChung, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, -1));

        txtTenLoaiBenh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtTenLoaiBenh, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 210, -1));

        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(80, 30));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 80, 40));

        btnSua.setText("Sửa");
        btnSua.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 80, 40));

        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(80, 30));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 80, 40));

        tbBenh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbBenh.setName(""); // NOI18N
        tbBenh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBenhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBenh);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 650, 250));

        btnLoad.setText("Load Dữ Liệu");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 140, 40));

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        getContentPane().add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 80, 40));

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 80, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        MoKhoaButton();
        ResetGiaTri();
        txtMaLoaiBenh.setText(TaoMaTuDong("B"));
        flag = "Thêm";
        tbBenh.setEnabled(false);

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        flag = "Sửa";
        txtMaLoaiBenh.setEnabled(false);
        tbBenh.setEnabled(false);
        MoKhoaButton();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Bạn muốn xóa thông tin loại bệnh?",
                "Thông báo",
                JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            LoaiBenhDTO lbDTO = new LoaiBenhDTO();
            lbDTO.setMaLB(txtMaLoaiBenh.getText());
            lbDTO.setTenLoaiBenh(txtTenLoaiBenh.getText());
            lbDTO.setTrieuChung(txtTrieuChung.getText());

            boolean kq = bus.xoa(lbDTO);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Xóa thông tin loại bệnh thất bại.");
            } else {
                JOptionPane.showMessageDialog(null, "Xóa thông tin loại bệnh thành công");
                ReloadDb();
            }
            KhoaButton();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed

        if ("Thêm".equals(flag)) {
            LoaiBenhDTO lbDTO = new LoaiBenhDTO();
            lbDTO.setMaLB(txtMaLoaiBenh.getText());
            lbDTO.setTenLoaiBenh(txtTenLoaiBenh.getText());
            lbDTO.setTrieuChung(txtTrieuChung.getText());
            boolean kq = bus.them(lbDTO);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Thêm loại bệnh thất bại. Vui lòng kiểm tra lại dữ liệu");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm loại bệnh thành công");
                tbBenh.setModel(DbUtils.resultSetToTableModel(bus.loadDuLieuLoaiBenh()));//load lại dữ liệu cho datagridview
                tbBenh.setEnabled(true);
                KhoaButton();
            }
        }
        
        if ("Sửa".equals(flag)) {
            LoaiBenhDTO lbDTO = new LoaiBenhDTO();
            lbDTO.setMaLB(txtMaLoaiBenh.getText());
            lbDTO.setTenLoaiBenh(txtTenLoaiBenh.getText());
            lbDTO.setTrieuChung(txtTrieuChung.getText());
            boolean kq = bus.sua(lbDTO);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Sửa thông tin đơn vị tính thất bại. Vui lòng kiểm tra lại dũ liệu");
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thông tin đơn vị tính thành công");
                tbBenh.setModel(DbUtils.resultSetToTableModel(bus.loadDuLieuLoaiBenh()));//load lại dữ liệu cho datagridview
                tbBenh.setEnabled(true);
                KhoaButton();
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        KhoaButton();
        ResetGiaTri();
        tbBenh.setEnabled(true);  
    }//GEN-LAST:event_btnHuyActionPerformed

    private void tbBenhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBenhMouseClicked
        try {
            int index = tbBenh.getSelectedRow();
            txtMaLoaiBenh.setText((String) tbBenh.getValueAt(index, 0));
            txtTenLoaiBenh.setText((String) tbBenh.getValueAt(index, 1));
            txtTrieuChung.setText((String) tbBenh.getValueAt(index, 2));
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_tbBenhMouseClicked

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        ReloadDb();
        try {
            int index = tbBenh.getSelectedRow();
            txtMaLoaiBenh.setText((String) tbBenh.getValueAt(index, 0));
            txtTenLoaiBenh.setText((String) tbBenh.getValueAt(index, 1));
            txtTrieuChung.setText((String) tbBenh.getValueAt(index, 2));
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnLoadActionPerformed

    public void ReloadDb() {
        try {
            JTable dt = new JTable();
            dt.setModel(DbUtils.resultSetToTableModel(bus.loadDuLieuLoaiBenh()));
            if (dt.getRowCount() > 0) {
                tbBenh.setModel(dt.getModel());
            } else {
                JOptionPane.showMessageDialog(null, "Load thất bại");

            }
        } catch (Exception ex) {
        }
    }
    private void MoKhoaButton() {
        txtTenLoaiBenh.setEnabled(true);
        txtTrieuChung.setEnabled(true);
        btnThem.setVisible(false);
        btnSua.setVisible(false);
        btnXoa.setVisible(false);
        btnLuu.setVisible(true);
        btnHuy.setVisible(true);
        txtMaLoaiBenh.setEnabled(true);
    }

    private void KhoaButton() {
        txtTenLoaiBenh.setEnabled(false);
        txtMaLoaiBenh.setEnabled(false);
        txtTrieuChung.setEnabled(false);
        btnThem.setVisible(true);
        btnSua.setVisible(true);
        btnXoa.setVisible(true);
        btnLuu.setVisible(false);
        btnHuy.setVisible(false);
    }

    private void ResetGiaTri() {
        txtTenLoaiBenh.setText(null);
        txtTrieuChung.setText(null);
    }

    /*private void HienThiThongTinLoaiBenh() {
        try {
            int index = tbBenh.getSelectedRow();
            txtMaLoaiBenh.setText((String) tbBenh.getValueAt(index, 0));
            txtTenLoaiBenh.setText((String) tbBenh.getValueAt(index, 1));
            txtTrieuChung.setText((String) tbBenh.getValueAt(index, 2));
        } catch (Exception ex) {

        }
    }*/

    private String TaoMaTuDong(String key) {
        JTable dt = new JTable();
        dt.setModel(DbUtils.resultSetToTableModel(bus.loadDuLieuLoaiBenh()));

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

    public String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }

    public String ChuanHoaChuoi(String str) {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) {
                str += " ";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBenh().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbBenh;
    private javax.swing.JTextField txtMaLoaiBenh;
    private javax.swing.JTextField txtTenLoaiBenh;
    private javax.swing.JTextField txtTrieuChung;
    // End of variables declaration//GEN-END:variables
}
