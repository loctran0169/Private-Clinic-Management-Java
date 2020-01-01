/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.UserBUS;
import quanlyphongkham.dto.NhanVienDTO;
import quanlyphongkham.dto.QuyenHanDTO;
import quanlyphongkham.dto.UserDTO;

/**
 *
 * @author ADMIN
 */
public class JPanelNguoiDung extends javax.swing.JPanel {

    /**
     * Creates new form JPanelNguoiDung
     */
     private QuyenHanDTO qhdto;
    private ArrayList<QuyenHanDTO> listQuyenHan=new ArrayList<>();
    private NhanVienDTO nvdto;
    private ArrayList<NhanVienDTO> listNhanVien=new ArrayList<>();
    private UserBUS userBUS;
    private int flag=0;
    public JPanelNguoiDung() {
        initComponents();
        userBUS=new UserBUS();
        qhdto=new QuyenHanDTO();
        nvdto=new NhanVienDTO();
        loadComboBox();
        loadTable();
        setVisibleBtnStart();
        disableTXT();
    }
 private void loadComboBox()
    {
        listQuyenHan= userBUS.loadQuyenHan();
        for (int i = 0; i < listQuyenHan.size(); i++) {
            combobox_maqh.addItem(listQuyenHan.get(i).getTenQuyenHan().toString());
        }
        
        listNhanVien=userBUS.loadNhanVien();
        for (int i = 0; i < listNhanVien.size(); i++) {
            combobox_manv.addItem(listNhanVien.get(i).getMaNhanVien().toString());
        }
    }
    private void loadTable()
    {
        table_nguoidung.setModel(DbUtils.resultSetToTableModel(userBUS.loadTable()));
    }
    private void enableTXT()
    {
        combobox_manv.setEnabled(true);
        txt_matk.setEnabled(true);
        txt_matkhau.setEnabled(true);
        txt_taikhoan.setEnabled(true);
        combobox_manv.setEnabled(true);
    }
    private void disableTXT()
    {
        combobox_manv.setEnabled(false);
        txt_matk.setEnabled(false);
        txt_matkhau.setEnabled(false);
        txt_taikhoan.setEnabled(false);
        combobox_manv.setEnabled(false);
    }
    private void setVisibleBtnStart()
    {
        btn_them.setVisible(true);
        btn_xoa.setVisible(true);
        btn_sua.setVisible(true);
        btn_luu.setVisible(false);
        btn_huy.setVisible(false);
    }
    private void setVisibleBtnLuu()
    {
        btn_them.setVisible(false);
        btn_xoa.setVisible(false);
        btn_sua.setVisible(false);
        btn_luu.setVisible(true);
        btn_huy.setVisible(true);
    }
    private void clearTXT()
    {
        
        txt_matk.setText("");
        txt_matkhau.setText("");
        txt_taikhoan.setText("");
    }
    private String TaoMaTuDong()
    {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<table_nguoidung.getRowCount();i++)
        {
            list.add(table_nguoidung.getValueAt(i, 0).toString());
        }
        
        //Phương thức thứ 2 là Substring(int index,int lenght).
        //Phuơng thức này sẽ trả về chuỗi con của chuỗi từ vị trí bắt đầu (index) và có chiều dài bao nhiêu (lenght)
        int coso = 0;
        if (list.size() == 0)// nếu danh sách thuốc rỗng
        {
            coso = 1;
        }
        else if (list.size() == 1 && (Integer.parseInt(list.get(0).substring(2, 5)) == 1)) // nếu danh sách có khach hang ma khach hang  này là KH0001
        {
            coso = 2;
        }
        else if (list.size() == 1 && (Integer.parseInt(list.get(0).substring(2, 5)) > 1)) // nếu danh sách có 1 thuốc mà mã thuốc này khác T001
        {
            
            coso = 1;
        }
        else // nếu danh sách có hơn 1 kh
        {
            for (int i = 0; i < list.size() - 1; i++)
            {
                if(Integer.parseInt(list.get(0).substring(2, 5))!=1)
                {
                    
                    coso = 1;
                    break;
                }else
                    if (Integer.parseInt(list.get(i+1).substring(2, 5)) - Integer.parseInt(list.get(i).substring(2, 5))> 1)
                    {
                        coso = Integer.parseInt(list.get(i).substring(2, 5)) + 1;
                        break;
                    }
                    else if(i== list.size() - 2)
                        coso = Integer.parseInt(list.get(list.size()-1).substring(2, 5)) + 1;
            }
            
            
        }
        
        //Sau khi lấy được cơ số thứ tự của thuốc, ta gắn thêm tiền tố T vào
        
        String ma = "";
        if (coso < 10)
            return ma = "US00" + coso;
        else if (coso < 100)
            return ma = "US0" + coso;
        else
            return ma = "US" + coso;
        
    }
    private boolean checkNULL()
    {
        if (txt_matk.getText().toString().equals("") ||
                txt_matkhau.getText().toString().equals("") ||
                txt_taikhoan.getText().toString().equals("") ||
                txt_tennv.getText().toString().equals("")) {
            return true;
        }
        return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txt_taikhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_nguoidung = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_matk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        txt_matkhau = new javax.swing.JTextField();
        combobox_manv = new javax.swing.JComboBox<>();
        btn_luu = new javax.swing.JButton();
        btn_huy = new javax.swing.JButton();
        combobox_maqh = new javax.swing.JComboBox<>();
        txt_tennv = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Mã Tài Khoản");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 48, -1, -1));
        add(txt_taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 71, 153, -1));

        jLabel4.setText("Tài Khoản");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 74, -1, -1));

        jLabel1.setText("Danh Sách Tài Khoản");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, -1));

        jLabel5.setText("Mật Khẩu");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 100, -1, -1));

        table_nguoidung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Tài Khoản", "Tài Khoản", "Mật Khẩu", "Mã Nhân Viên", "Mã Quyền Hạn"
            }
        ));
        table_nguoidung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_nguoidungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_nguoidung);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 233, 700, 267));

        jLabel6.setText("Thông Tin Tài Khoản");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 122, -1));
        add(txt_matk, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 45, 153, -1));

        jLabel8.setText("Tên Nhân Viên");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel9.setText("Mã Quyền Hạn");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 101, -1, -1));

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 60, 30));

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 60, 30));

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 70, 30));
        add(txt_matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 97, 153, -1));

        combobox_manv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_manvItemStateChanged(evt);
            }
        });
        add(combobox_manv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 153, -1));

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });
        add(btn_luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 60, 30));

        btn_huy.setText("Hủy");
        btn_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyActionPerformed(evt);
            }
        });
        add(btn_huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 150, 60, 30));

        combobox_maqh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_maqhItemStateChanged(evt);
            }
        });
        add(combobox_maqh, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 153, -1));

        txt_tennv.setEnabled(false);
        add(txt_tennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 153, -1));

        jLabel10.setText("Mã Nhân Viên");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void table_nguoidungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_nguoidungMouseClicked
        // TODO add your handling code here:
        try {
            int index=table_nguoidung.getSelectedRow();
            txt_matk.setText(table_nguoidung.getValueAt(index, 0).toString());
            txt_taikhoan.setText(table_nguoidung.getValueAt(index, 1).toString());
            txt_matkhau.setText(table_nguoidung.getValueAt(index, 2).toString());
            combobox_manv.setSelectedItem(table_nguoidung.getValueAt(index, 3).toString());
            combobox_maqh.setSelectedItem(table_nguoidung.getValueAt(index, 4).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_table_nguoidungMouseClicked

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        flag=3;
        enableTXT();
        setVisibleBtnLuu();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Bạn có chắc chắn muốn xóa","Cảnh báo",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            UserDTO userDTO=new UserDTO(txt_matk.getText().toString());
            userBUS.xoa(userDTO);
            loadTable();
            clearTXT();
        }

    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        flag=1;
        enableTXT();
        setVisibleBtnLuu();
        clearTXT();
        txt_matk.setText(TaoMaTuDong());
    }//GEN-LAST:event_btn_themActionPerformed

    private void combobox_manvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_manvItemStateChanged
        // TODO add your handling code here:

        for (int i = 0; i < listNhanVien.size(); i++) {
            if (combobox_manv.getSelectedItem().toString().equals(listNhanVien.get(i).getMaNhanVien().toString())) {
                nvdto=listNhanVien.get(i);
                break;
            }
        }
        txt_tennv.setText(nvdto.getHoVaTen());
    }//GEN-LAST:event_combobox_manvItemStateChanged

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        // TODO add your handling code here:
        if (checkNULL()) {
            JOptionPane.showMessageDialog(null, "Mời bạn nhập đầy đủ thông tin");
            return;
        }
        UserDTO userDTO=new UserDTO(txt_matk.getText().toString(),
            txt_taikhoan.getText().toString(), txt_matkhau.getText().toString(),
            combobox_manv.getSelectedItem().toString(), qhdto.getMaQH());
        if (flag==1) {
            userBUS.them(userDTO);
        }
        else if (flag==3) {
            userBUS.sua(userDTO);
        }
        loadTable();
        setVisibleBtnStart();
        disableTXT();
        clearTXT();
    }//GEN-LAST:event_btn_luuActionPerformed

    private void btn_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyActionPerformed
        // TODO add your handling code here:
        setVisibleBtnStart();
        disableTXT();
        clearTXT();
    }//GEN-LAST:event_btn_huyActionPerformed

    private void combobox_maqhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_maqhItemStateChanged
        // TODO add your handling code here:
        for (int i = 0; i < listQuyenHan.size(); i++) {
            if (combobox_maqh.getSelectedItem().toString().equals(listQuyenHan.get(i).getTenQuyenHan().toString())) {
                qhdto=listQuyenHan.get(i);
                break;
            }
        }
    }//GEN-LAST:event_combobox_maqhItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> combobox_manv;
    private javax.swing.JComboBox<String> combobox_maqh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_nguoidung;
    private javax.swing.JTextField txt_matk;
    private javax.swing.JTextField txt_matkhau;
    private javax.swing.JTextField txt_taikhoan;
    private javax.swing.JTextField txt_tennv;
    // End of variables declaration//GEN-END:variables
}
