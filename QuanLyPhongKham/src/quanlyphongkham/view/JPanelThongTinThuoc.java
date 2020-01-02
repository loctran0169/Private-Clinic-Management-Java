/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.ThuocBUS;
import quanlyphongkham.dto.DonViTinhDTO;
import quanlyphongkham.dto.ThuocDTO;

/**
 *
 * @author ADMIN
 */
public class JPanelThongTinThuoc extends javax.swing.JPanel {

    /**
     * Creates new form JPanelThongTinThuoc
     */
    private DonViTinhDTO donViTinhDTO;
    private ArrayList<DonViTinhDTO> listDonViTinhDTOs=new ArrayList<>();
    private ThuocBUS tbus;
    private int flag=0;
    public JPanelThongTinThuoc() {
        initComponents();
        tbus=new ThuocBUS();
        donViTinhDTO=new DonViTinhDTO();
        loadTable();
        loadComboBox();
        setVisibleBtnStart();
        disableTXT();
    }
private void loadComboBox()
    {
        listDonViTinhDTOs= tbus.loadDonViTinh();
        
        // tbus.loadDonViTinh();
        for (int i = 0; i < listDonViTinhDTOs.size(); i++) {
            combobox_donvitinh.addItem(listDonViTinhDTOs.get(i).getTenDonVi().toString());
        }
    }
    //
    private void loadTable()
    {
        table_thuoc.setModel(DbUtils.resultSetToTableModel(tbus.loadTable()));
    }
    private void enableTXT(){
        txt_mathuoc.setEnabled(true);
        txt_tenloaithuoc.setEnabled(true);
        txt_dongia.setEnabled(true);
        combobox_donvitinh.setEnabled(true);
        datePicker_hsd.setEnabled(true);
        datePicker_nsx.setEnabled(true);
    }
    private void disableTXT()
    {
        txt_mathuoc.setEnabled(false);
        txt_tenloaithuoc.setEnabled(false);
        txt_dongia.setEnabled(false);
        combobox_donvitinh.setEnabled(false);
        datePicker_hsd.setEnabled(false);
        datePicker_nsx.setEnabled(false);
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
        txt_mathuoc.setText("");
        txt_tenloaithuoc.setText("");
        txt_dongia.setText("");
        
    }
    private String TaoMaTuDong()
    {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<table_thuoc.getRowCount();i++)
        {
            list.add(table_thuoc.getValueAt(i, 0).toString());
        }
        
        
        
        
        //Phương thức thứ 2 là Substring(int index,int lenght).
        //Phuơng thức này sẽ trả về chuỗi con của chuỗi từ vị trí bắt đầu (index) và có chiều dài bao nhiêu (lenght)
        int coso = 0;
        if (list.size() == 0)// nếu danh sách thuốc rỗng
        {
            coso = 1;
        }
        else if (list.size() == 1 && (Integer.parseInt(list.get(0).substring(2, 4)) == 1)) // nếu danh sách có khach hang ma khach hang  này là KH0001
        {
            coso = 2;
        }
        else if (list.size() == 1 && (Integer.parseInt(list.get(0).substring(2, 4)) > 1)) // nếu danh sách có 1 thuốc mà mã thuốc này khác T001
        {
            
            coso = 1;
        }
        else // nếu danh sách có hơn 1 kh
        {
            for (int i = 0; i < list.size() - 1; i++)
            {
                if(Integer.parseInt(list.get(0).substring(2, 4))!=1)
                {
                    
                    coso = 1;
                    break;
                }else
                    if (Integer.parseInt(list.get(i+1).substring(2, 4)) - Integer.parseInt(list.get(i).substring(2, 4))> 1)
                    {
                        coso = Integer.parseInt(list.get(i).substring(2, 4)) + 1;
                        break;
                    }
                    else if(i== list.size() - 2)
                        coso = Integer.parseInt(list.get(list.size()-1).substring(2, 4)) + 1;
            }
            
            
        }
        
        //Sau khi lấy được cơ số thứ tự của thuốc, ta gắn thêm tiền tố T vào
        
        String ma = "";
        if (coso < 10)
            return ma = "T00" + coso;
        else if (coso < 100)
            return ma = "T0" + coso;
        else
            return ma = "T" + coso;
        
    }
    private boolean checkNULL()
    {
        if (txt_dongia.getText().toString().equals("")||
                txt_mathuoc.getText().toString().equals("")||
                txt_tenloaithuoc.getText().toString().equals("")||
                datePicker_hsd.getDate()==null||
                datePicker_nsx.getDate()==null) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_thuoc = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btn_xoa = new javax.swing.JButton();
        txt_tenloaithuoc = new javax.swing.JTextField();
        btn_luu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_mathuoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_dongia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_huy = new javax.swing.JButton();
        datePicker_nsx = new com.toedter.calendar.JDateChooser();
        datePicker_hsd = new com.toedter.calendar.JDateChooser();
        combobox_donvitinh = new javax.swing.JComboBox<>();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(819, 502));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_thuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Loại Thuốc", "Tên Loại Thuốc", "Mã Đơn Vị Tính", "NSX", "HSD", "Đơn Giá"
            }
        ));
        table_thuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_thuocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_thuoc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, 890, 350));

        jLabel4.setText("Tên Loại Thuốc:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 95, 30));

        txt_tenloaithuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenloaithuocActionPerformed(evt);
            }
        });
        add(txt_tenloaithuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 171, -1));

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });
        add(btn_luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 95, 30));

        jLabel5.setText("Đơn Vị Tính:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel1.setText("Thông Tin Thuốc");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        txt_mathuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mathuocActionPerformed(evt);
            }
        });
        add(txt_mathuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 170, -1));

        jLabel6.setText("HSD:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jLabel2.setText("Mã Loại Thuốc:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        txt_dongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dongiaActionPerformed(evt);
            }
        });
        txt_dongia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dongiaKeyPressed(evt);
            }
        });
        add(txt_dongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 150, -1));

        jLabel7.setText("Đơn Giá:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel3.setText("NSX:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        btn_huy.setText("Hủy");
        btn_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyActionPerformed(evt);
            }
        });
        add(btn_huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 95, 30));
        add(datePicker_nsx, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 170, -1));
        add(datePicker_hsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 170, -1));

        combobox_donvitinh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_donvitinhItemStateChanged(evt);
            }
        });
        add(combobox_donvitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 170, -1));

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 95, 30));

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 95, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void table_thuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_thuocMouseClicked
        // TODO add your handling code here:
        try {
            int index= table_thuoc.getSelectedRow();
            txt_mathuoc.setText(table_thuoc.getValueAt(index, 0).toString());
            txt_tenloaithuoc.setText(table_thuoc.getValueAt(index, 1).toString());
            combobox_donvitinh.setSelectedItem(table_thuoc.getValueAt(index, 2).toString());
            Date nsx = null;
            Date hsd=null;
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                //  JOptionPane.showMessageDialog(null, table_nhanvien.getValueAt(index, 3).toString());
                nsx = sdf.parse(table_thuoc.getValueAt(index, 3).toString());
                hsd=sdf.parse(table_thuoc.getValueAt(index, 4).toString());

            } catch (ParseException e) {
                e.printStackTrace();
            }
            datePicker_nsx.setDate(nsx);
            datePicker_hsd.setDate(hsd);
            txt_dongia.setText(table_thuoc.getValueAt(index, 5).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_table_thuocMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Bạn có chắc chắn muốn xóa","Cảnh báo",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){

            ThuocDTO thuocDTO=new ThuocDTO(txt_mathuoc.getText().toString());
            tbus.xoa(thuocDTO);
            loadTable();
        }
        clearTXT();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void txt_tenloaithuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenloaithuocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenloaithuocActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        // TODO add your handling code here:

        if (checkNULL()) {
            JOptionPane.showMessageDialog(null,"Mời bạn nhaapjd dầy đủ thông tin");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String nsx=sdf.format(datePicker_nsx.getDate());
        String hsd=sdf.format(datePicker_hsd.getDate());

        ThuocDTO thuocDTO=new ThuocDTO(txt_mathuoc.getText().toString(),
            txt_tenloaithuoc.getText().toString(),
            donViTinhDTO.getMaDV().toString(),
            nsx,
            hsd,
            Integer.parseInt(txt_dongia.getText().toString()));
        if(flag==1)
        {
            tbus.them(thuocDTO);
        }
        else if(flag==3)
        {
            tbus.sua(thuocDTO);
        }
        loadTable();
        setVisibleBtnStart();
        disableTXT();
        clearTXT();
    }//GEN-LAST:event_btn_luuActionPerformed

    private void txt_mathuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mathuocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mathuocActionPerformed

    private void txt_dongiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dongiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dongiaActionPerformed

    private void txt_dongiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dongiaKeyPressed
        // TODO add your handling code here:
        String value = txt_dongia.getText();
        int l = value.length();
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyCode()== java.awt.event.KeyEvent.VK_BACK_SPACE) {
            txt_dongia.setEditable(true);

        } else {
            txt_dongia.setEditable(false);

        }
    }//GEN-LAST:event_txt_dongiaKeyPressed

    private void btn_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyActionPerformed
        // TODO add your handling code here:
        setVisibleBtnStart();
        disableTXT();
        clearTXT();
    }//GEN-LAST:event_btn_huyActionPerformed

    private void combobox_donvitinhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_donvitinhItemStateChanged
        // TODO add your handling code here:
        for (int i = 0; i < listDonViTinhDTOs.size(); i++) {
            if (combobox_donvitinh.getSelectedItem().toString().equals(listDonViTinhDTOs.get(i).getTenDonVi().toString())) {
                donViTinhDTO=listDonViTinhDTOs.get(i);
                break;
            }
        }
    }//GEN-LAST:event_combobox_donvitinhItemStateChanged

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        flag=1;
        enableTXT();
        setVisibleBtnLuu();
        clearTXT();
        txt_mathuoc.setText(TaoMaTuDong());
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        flag=3;
        enableTXT();
        setVisibleBtnLuu();

    }//GEN-LAST:event_btn_suaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> combobox_donvitinh;
    private com.toedter.calendar.JDateChooser datePicker_hsd;
    private com.toedter.calendar.JDateChooser datePicker_nsx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_thuoc;
    private javax.swing.JTextField txt_dongia;
    private javax.swing.JTextField txt_mathuoc;
    private javax.swing.JTextField txt_tenloaithuoc;
    // End of variables declaration//GEN-END:variables
}
