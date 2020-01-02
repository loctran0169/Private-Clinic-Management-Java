/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.BenhNhanBUS;
import quanlyphongkham.dto.BenhNhanDTO;

/**
 *
 * @author LQTPL
 */
public class firmBenhNhan extends javax.swing.JPanel {
    BenhNhanBUS bus = new BenhNhanBUS();
    String flag = "";
    String sex = "";
    public firmBenhNhan() {
        initComponents();
        dtp_ngaysinh.setDateFormatString("yyyy-MM-dd");
        ChiDoc();
        loadData();
        tb_sdt.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyReleased(java.awt.event.KeyEvent evt) {
                try {
                    long number = Long.parseLong(tb_sdt.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Chỉ được phép nhập số");
                    tb_sdt.setText("");
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tb_mabn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tb_hoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dtp_ngaysinh = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tb_sdt = new javax.swing.JTextField();
        tb_diachi = new javax.swing.JTextField();
        radioButton1 = new javax.swing.JRadioButton();
        radioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_benhnhan = new javax.swing.JTable();
        tb_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_load = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        btn_huy = new javax.swing.JButton();

        tb_mabn.setEnabled(false);

        jLabel3.setText("Mã Bệnh Nhân:");

        tb_hoten.setEnabled(false);
        tb_hoten.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tb_hotenFocusLost(evt);
            }
        });

        jLabel4.setText("Họ Và Tên:");

        jLabel5.setText("Ngày Sinh:");

        dtp_ngaysinh.setEnabled(false);

        jLabel6.setText("Thông Tin Bệnh Nhân");

        jLabel7.setText("Giớ Tính:");

        jLabel8.setText("Số Điện Thoại:");

        jLabel9.setText("Địa Chỉ:");

        tb_sdt.setEnabled(false);

        tb_diachi.setEnabled(false);

        radioButton1.setText("Nam");
        radioButton1.setEnabled(false);
        radioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton1ActionPerformed(evt);
            }
        });

        radioButton2.setText("Nữ");
        radioButton2.setEnabled(false);
        radioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton2ActionPerformed(evt);
            }
        });

        tb_benhnhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_benhnhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_benhnhanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_benhnhan);

        btn_search.setText("Tìm Kiếm");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_load.setText("Load Dữ Liệu");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        jLabel1.setText("Danh Sách Bệnh Nhân");

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        btn_huy.setText("Hủy");
        btn_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tb_mabn, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tb_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(119, 119, 119)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioButton1)
                                    .addGap(46, 46, 46)
                                    .addComponent(radioButton2))
                                .addComponent(tb_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel5)
                            .addGap(39, 39, 39)
                            .addComponent(dtp_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(119, 119, 119)
                            .addComponent(jLabel9)
                            .addGap(59, 59, 59)
                            .addComponent(tb_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(643, 643, 643)
                            .addComponent(btn_luu)
                            .addGap(40, 40, 40)
                            .addComponent(btn_huy))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(btn_load)
                            .addGap(18, 18, 18)
                            .addComponent(tb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(207, 207, 207)
                            .addComponent(btn_them)
                            .addGap(18, 18, 18)
                            .addComponent(btn_sua)
                            .addGap(18, 18, 18)
                            .addComponent(btn_xoa))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel3)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tb_mabn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(tb_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel7)
                            .addGap(13, 13, 13)
                            .addComponent(jLabel8))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(radioButton1)
                                .addComponent(radioButton2))
                            .addGap(2, 2, 2)
                            .addComponent(tb_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel5))
                        .addComponent(dtp_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(tb_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_luu)
                        .addComponent(btn_huy))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_load, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(tb_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addComponent(jLabel1)
                    .addGap(7, 7, 7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }

    public String ChuanHoaChuoi(String str) {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = ""; // ? ^-^
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
            {
                str += " ";
            }
        }
        return str;
    }
    
    private Boolean checkData() {
        if (tb_hoten.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa nhập họ tên");
            tb_hoten.requestFocus();
            return false;
        } else if (dtp_ngaysinh.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Chưa chọn ngày sinh");
            return false;
        } else if (radioButton1.isSelected() == false && radioButton2.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Chưa chọn giới tính");
            return false;
        } else if (tb_sdt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa nhập số điện thoại");
            tb_sdt.requestFocus();
            return false;
        } else if (tb_diachi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa nhập địa chỉ");
            tb_diachi.requestFocus();
            return false;
        }
        return true;
    }

    private void ChiDoc() {
        tb_hoten.setEnabled(false);
        tb_diachi.setEnabled(false);
        tb_sdt.setEnabled(false);
        dtp_ngaysinh.setEnabled(false);
        radioButton1.setEnabled(false);
        radioButton2.setEnabled(false);
        btn_them.setVisible(true);
        btn_sua.setVisible(true);
        btn_xoa.setVisible(true);

        btn_huy.setVisible(false);
        btn_luu.setVisible(false);
        tb_benhnhan.setEnabled(true);
    }

    private void ChiSua() {
        tb_hoten.setEnabled(true);
        tb_diachi.setEnabled(true);
        tb_sdt.setEnabled(true);
        dtp_ngaysinh.setEnabled(true);
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        btn_them.setVisible(false);
        btn_sua.setVisible(false);
        btn_xoa.setVisible(false);

        btn_huy.setVisible(true);
        btn_luu.setVisible(true);
        tb_benhnhan.setEnabled(true);
    }

    private void empty() {
        tb_mabn.setText("");
        tb_hoten.setText("");
        tb_sdt.setText("");
        tb_diachi.setText("");
        tb_search.setText("");
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
    }
    
    
    public void loadData() {
        tb_benhnhan.setModel(DbUtils.resultSetToTableModel(bus.loadToDataTable()));
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
    
    private void tb_hotenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tb_hotenFocusLost
        String name = tb_hoten.getText();
        tb_hoten.setText(ChuanHoaChuoi(name));
    }//GEN-LAST:event_tb_hotenFocusLost

    private void radioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton1ActionPerformed
        if (radioButton1.isSelected())
        sex = "Nam";
        radioButton2.setSelected(false);
    }//GEN-LAST:event_radioButton1ActionPerformed

    private void radioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton2ActionPerformed
        if (radioButton1.isSelected())
        sex = "Nữ";
        radioButton1.setSelected(false);
    }//GEN-LAST:event_radioButton2ActionPerformed

    private void tb_benhnhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_benhnhanMouseClicked
        try {
            ChiDoc();
            int index = tb_benhnhan.getSelectedRow();
            tb_mabn.setText((String) tb_benhnhan.getValueAt(index, 0));
            tb_hoten.setText((String) tb_benhnhan.getValueAt(index, 1).toString());
            dtp_ngaysinh.setDate((Date) tb_benhnhan.getValueAt(index, 2));
            if (tb_benhnhan.getValueAt(index, 3).equals("Nam")) {
                radioButton1.setSelected(true);
                radioButton2.setSelected(false);
            } else {
                radioButton1.setSelected(false);
                radioButton2.setSelected(true);
            }
            tb_diachi.setText((String) tb_benhnhan.getValueAt(index, 4));
            tb_sdt.setText((String) tb_benhnhan.getValueAt(index, 5).toString());
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_tb_benhnhanMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String sKeyword = tb_search.getText().trim();
        //JOptionPane.showMessageDialog(null, sKeyword);
        if (!sKeyword.isEmpty()) {
            ((DefaultTableModel) tb_benhnhan.getModel()).setNumRows(0);
            tb_benhnhan.setModel(DbUtils.resultSetToTableModel(bus.selectByKeyWord(sKeyword)));
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadActionPerformed
        loadData();
    }//GEN-LAST:event_btn_loadActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        ChiSua();
        empty();
        tb_mabn.setText(TaoMaTuDong("BN"));
        flag = "them";
        tb_benhnhan.setEnabled(false);
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        if (tb_mabn.getText().isEmpty()) {
            return;
        }
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa bệnh nhân??", "Thông báo", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            BenhNhanDTO bn = new BenhNhanDTO();
            bn.setMaBN(tb_mabn.getText());
            Boolean kq = bus.xoa(bn);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Xóa bệnh nhân thất bại. Vui lòng kiểm tra lại dũ liệu");
            } else {
                JOptionPane.showMessageDialog(null, "Xóa bệnh nhân thành công");
                loadData();
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (tb_mabn.getText().isEmpty()) {
            return;
        }
        ChiSua();
        flag = "sua";
        tb_benhnhan.setEnabled(false);
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        if (flag == "them") {
            if (checkData() == false) {
                return;
            }
            BenhNhanDTO bn = new BenhNhanDTO();
            bn.setMaBN(tb_mabn.getText());
            bn.setHoTen(tb_hoten.getText());
            bn.setNgaySinh(dtp_ngaysinh.getDate());
            bn.setGioiTinh(sex);
            bn.setSDT(tb_sdt.getText());
            bn.setDiaChi(tb_diachi.getText());
            Boolean kq = bus.them(bn);
            if (kq == true) {
                JOptionPane.showMessageDialog(null, "Thêm bệnh nhân thành công");
                tb_benhnhan.setEnabled(true);
                ChiDoc();
                empty();
            } else {
                JOptionPane.showMessageDialog(null, "Thêm bệnh nhân thất bại");
                return;
            }
        } else if (flag == "sua") {
            if (checkData() == false) {
                return;
            }
            BenhNhanDTO bn = new BenhNhanDTO();
            bn.setMaBN(tb_mabn.getText());
            bn.setHoTen(tb_hoten.getText());
            bn.setNgaySinh(dtp_ngaysinh.getDate());
            bn.setGioiTinh(sex);
            bn.setSDT(tb_sdt.getText());
            bn.setDiaChi(tb_diachi.getText());
            Boolean kq = bus.Sua(bn);
            if (kq == false) {
                JOptionPane.showMessageDialog(null, "Sữa bệnh nhân thất bại. Vui lòng kiểm tra lại dũ liệu");
                ChiDoc();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Sữa bệnh nhân thành công");
                tb_benhnhan.setEnabled(true);
                ChiDoc();
                empty();
            }
        }
        loadData();
    }//GEN-LAST:event_btn_luuActionPerformed

    private void btn_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyActionPerformed
        ChiDoc();
        empty();
        tb_benhnhan.setEnabled(true);
    }//GEN-LAST:event_btn_huyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private com.toedter.calendar.JDateChooser dtp_ngaysinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioButton1;
    private javax.swing.JRadioButton radioButton2;
    private javax.swing.JTable tb_benhnhan;
    private javax.swing.JTextField tb_diachi;
    private javax.swing.JTextField tb_hoten;
    private javax.swing.JTextField tb_mabn;
    private javax.swing.JTextField tb_sdt;
    private javax.swing.JTextField tb_search;
    // End of variables declaration//GEN-END:variables
}
