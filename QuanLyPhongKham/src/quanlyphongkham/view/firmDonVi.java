package quanlyphongkham.view;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.DonViTinhBUS;
import quanlyphongkham.dto.DonViTinhDTO;

public class firmDonVi extends javax.swing.JPanel {

    DonViTinhBUS bus = new DonViTinhBUS();

    String flag = null;
    public firmDonVi() {
        initComponents();
        KhoaButton();
        ReloadDb();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDonVi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMaDonVI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenDonVi = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDonVi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Đơn Vị", "Tên Đơn Vị"
            }
        ));
        tbDonVi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDonViMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDonVi);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 890, 330));

        jLabel1.setText("Mã Đơn Vị:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));
        add(txtMaDonVI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 170, -1));

        jLabel2.setText("Tên Đơn Vị:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        txtTenDonVi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenDonViFocusLost(evt);
            }
        });
        add(txtTenDonVi, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 170, -1));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 100, 40));

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 100, 40));

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 100, 40));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 100, 40));

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 100, 40));

        btnLoad.setText("Load Dữ Liệu");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void MoKhoaButton() {
        txtTenDonVi.setEnabled(true);
        txtMaDonVI.setEnabled(true);
        btnThem.setVisible(false);
        btnSua.setVisible(false);
        btnXoa.setVisible(false);
        btnLuu.setVisible(true);
        btnHuy.setVisible(true);
    }

    private void KhoaButton() {
        txtTenDonVi.setEnabled(false);
        txtMaDonVI.setEnabled(false);
        btnThem.setVisible(true);
        btnSua.setVisible(true);
        btnXoa.setVisible(true);
        btnLuu.setVisible(false);
        btnHuy.setVisible(false);
    }

    private void ResetGiaTri() {
        txtTenDonVi.setText(null);
        txtMaDonVI.setText(null);
    }
    
    private String TaoMaTuDong(String key) {
        JTable dt = new JTable();
        dt.setModel(DbUtils.resultSetToTableModel(bus.loadToDataTable()));

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
    
    private void tbDonViMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDonViMouseClicked
        try {

            int index = tbDonVi.getSelectedRow();
            txtMaDonVI.setText((String) tbDonVi.getValueAt(index, 0));
            txtTenDonVi.setText((String) tbDonVi.getValueAt(index, 1).toString());
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_tbDonViMouseClicked

    private void txtTenDonViFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenDonViFocusLost
        txtTenDonVi.setText(ChuanHoaChuoi(txtTenDonVi.getText()));
    }//GEN-LAST:event_txtTenDonViFocusLost
 
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
    
    public void ReloadDb() {
        try {
            JTable dt = new JTable();
            dt.setModel(DbUtils.resultSetToTableModel(bus.loadToDataTable()));
            if (dt.getRowCount() > 0) {
                tbDonVi.setModel(dt.getModel());
            } else {
                JOptionPane.showMessageDialog(null, "Load thất bại");

            }
        } catch (Exception ex) {
        }
    }
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        MoKhoaButton();
        ResetGiaTri();
        txtMaDonVI.setText(TaoMaTuDong("DV"));
        flag = "Thêm";
        tbDonVi.setEnabled(false);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        KhoaButton();
        ResetGiaTri();
        tbDonVi.setEnabled(true);

    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed

        if (txtMaDonVI.getText().isEmpty()) {
            return;
        }

        if (txtTenDonVi.getText().isEmpty())
        JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin.");

        else if (flag == "Thêm") {

            DonViTinhDTO dvtDTO = new DonViTinhDTO();
            dvtDTO.setMaDV(txtMaDonVI.getText());
            dvtDTO.setTenDonVi(txtTenDonVi.getText());

            boolean kq = bus.them(dvtDTO);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Thêm đơn vị tính thất bại. Vui lòng kiểm tra lại dũ liệu");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm đơn vị tính thành công");
                tbDonVi.setModel(DbUtils.resultSetToTableModel(bus.loadToDataTable()));//load lại dữ liệu cho datagridview
                tbDonVi.setEnabled(true);
                KhoaButton();
            }
        }
        else if (flag == "Sua") {
            DonViTinhDTO dvtDTO = new DonViTinhDTO();
            dvtDTO.setMaDV(txtMaDonVI.getText());
            dvtDTO.setTenDonVi(txtTenDonVi.getText());

            boolean kq = bus.sua(dvtDTO);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Sửa thông tin đơn vị tính thất bại. Vui lòng kiểm tra lại dữ liệu");
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thông tin đơn vị tính thành công");
                tbDonVi.setModel(DbUtils.resultSetToTableModel(bus.loadToDataTable()));//load lại dữ liệu cho datagridview
                tbDonVi.setEnabled(true);
                KhoaButton();
            }

        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Bạn muốn xóa đơn vị tính?",
            "Thông báo",
            JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            DonViTinhDTO dvtDTO = new DonViTinhDTO();
            dvtDTO.setMaDV(txtMaDonVI.getText());
            dvtDTO.setTenDonVi(txtTenDonVi.getText());

            boolean kq = bus.xoa(dvtDTO);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Xóa thông tin đơn vị tính thất bại.");
            } else {
                JOptionPane.showMessageDialog(null, "Xóa thông tin đơn vị tính thành công");
                ReloadDb();
            }
            KhoaButton();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        flag = "Sua";
        txtMaDonVI.setEnabled(false);
        tbDonVi.setEnabled(false);
        MoKhoaButton();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        ReloadDb();
        try {

            int index = tbDonVi.getSelectedRow();
            txtMaDonVI.setText((String) tbDonVi.getValueAt(index, 0));
            txtTenDonVi.setText((String) tbDonVi.getValueAt(index, 1));
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnLoadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDonVi;
    private javax.swing.JTextField txtMaDonVI;
    private javax.swing.JTextField txtTenDonVi;
    // End of variables declaration//GEN-END:variables

}
