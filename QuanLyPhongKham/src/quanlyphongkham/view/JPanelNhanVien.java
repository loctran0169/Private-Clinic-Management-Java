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
import quanlyphongkham.bus.NhanVienBUS;
import quanlyphongkham.dto.NhanVienDTO;

/**
 *
 * @author ADMIN
 */
public class JPanelNhanVien extends javax.swing.JPanel {
    
    /**
     * Creates new form JPanelNhanVien
     */
    private NhanVienBUS nhanVienBUS;
    private int flag=0;
    public JPanelNhanVien() {
        initComponents();
        nhanVienBUS=new NhanVienBUS();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loadTable();
            }
        });        
        setVisibleBtnStart();
        disableTXT();
    }
    private void loadTable()
    {
        table_nhanvien.setModel(DbUtils.resultSetToTableModel(nhanVienBUS.loadTable()));
    }
    private void enableTXT()
    {
        txt_manv.setEnabled(true);
        txt_hoten.setEnabled(true);
        txt_diachi.setEnabled(true);
        txt_chucvu.setEnabled(true);
        txt_sdt.setEnabled(true);
        datePicker.setEnabled(true);
    }
    private void disableTXT()
    {
        txt_manv.setEnabled(false);
        txt_hoten.setEnabled(false);
        txt_diachi.setEnabled(false);
        txt_chucvu.setEnabled(false);
        txt_sdt.setEnabled(false);
        datePicker.setEnabled(false);
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
        txt_manv.setText("");
        txt_hoten.setText("");
        txt_diachi.setText("");
        txt_chucvu.setText("");
        txt_sdt.setText("");
        datePicker.setDate(null);
        
    }
    private String TaoMaTuDong()
    {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<table_nhanvien.getRowCount();i++)
        {
            list.add(table_nhanvien.getValueAt(i, 0).toString());
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
            return ma = "NV00" + coso;
        else if (coso < 100)
            return ma = "NV0" + coso;
        else
            return ma = "NV" + coso;
        
    }
    private boolean checkNULL()
    {
        if (txt_manv.getText().toString().equals("") ||
                txt_chucvu.getText().toString().equals("") ||
                txt_diachi.getText().toString().equals("") ||
                txt_hoten.getText().toString().equals("") ||
                txt_sdt.getText().toString().equals("") ||
                datePicker.getDate() ==null) {
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

        group = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        txt_manv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_diachi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_chucvu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_xoa = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_huy = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_nhanvien = new javax.swing.JTable();
        datePicker = new com.toedter.calendar.JDateChooser();
        btn_luu = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        radio_nam = new javax.swing.JRadioButton();
        radio_nu = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(819, 502));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Thông Tin Nhân Viên");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setText("Mã Nhân Viên:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        txt_sdt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_sdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_sdtKeyPressed(evt);
            }
        });
        add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 170, -1));

        txt_manv.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        add(txt_manv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 170, -1));

        jLabel3.setText("Số Điện Thoại");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jLabel4.setText("Họ Và Tên:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        txt_hoten.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        add(txt_hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 170, -1));

        jLabel6.setText("Ngày Sinh:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel7.setText("Địa Chỉ:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        txt_diachi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        add(txt_diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 170, -1));

        jLabel8.setText("Chức Vụ:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        txt_chucvu.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        add(txt_chucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 170, -1));

        jLabel9.setText("Giới Tính:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, 30));

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, 30));

        btn_huy.setText("Hủy");
        btn_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyActionPerformed(evt);
            }
        });
        add(btn_huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, 30));

        jLabel10.setText("Danh Sách Nhân Viên");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        table_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ Và Tên", "GiớiTính", "SĐT", "Ngày Sinh", "Địa Chỉ", "Chức Vụ"
            }
        ));
        table_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_nhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_nhanvien);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 890, 330));
        add(datePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 170, -1));

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });
        add(btn_luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, 30));

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, 30));

        group.add(radio_nam);
        radio_nam.setText("Nam");
        radio_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_namActionPerformed(evt);
            }
        });
        add(radio_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        group.add(radio_nu);
        radio_nu.setText("Nữ");
        add(radio_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void txt_sdtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sdtKeyPressed
        // TODO add your handling code here:
        String value = txt_sdt.getText();
        int l = value.length();
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyCode()== java.awt.event.KeyEvent.VK_BACK_SPACE) {
            txt_sdt.setEditable(true);
            
        } else {
            txt_sdt.setEditable(false);
            
        }
    }//GEN-LAST:event_txt_sdtKeyPressed
    
    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Bạn có chắc chắn muốn xóa","Cảnh báo",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            
            NhanVienDTO nhanVienDTO=new NhanVienDTO(txt_manv.getText().toString(), txt_hoten.getText().toString(),
                    null,"",txt_sdt.getText().toString(),
                    txt_diachi.getText().toString(),txt_chucvu.getText().toString());
            nhanVienBUS.xoa(nhanVienDTO);
            loadTable();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed
    
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        flag=1;
        enableTXT();
        setVisibleBtnLuu();
        clearTXT();
        txt_manv.setText(TaoMaTuDong());
    }//GEN-LAST:event_btn_themActionPerformed
    
    private void btn_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyActionPerformed
        // TODO add your handling code here:
        setVisibleBtnStart();
        disableTXT();
        clearTXT();
    }//GEN-LAST:event_btn_huyActionPerformed
    
    private void table_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_nhanvienMouseClicked
        // TODO add your handling code here:
        try{
            int index = table_nhanvien.getSelectedRow();
            txt_manv.setText((String) table_nhanvien.getValueAt(index, 0).toString());
            txt_hoten.setText((String) table_nhanvien.getValueAt(index, 1).toString());
            Date date = null;
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                //  JOptionPane.showMessageDialog(null, table_nhanvien.getValueAt(index, 3).toString());
                date = sdf.parse(table_nhanvien.getValueAt(index, 3).toString());
                
            } catch (ParseException e) {
                e.printStackTrace();
            }
            
            datePicker.setDate(date);
            if (table_nhanvien.getValueAt(index, 2).toString().equals("Nam") || table_nhanvien.getValueAt(index, 2).toString().equals("nam")) {
                radio_nam.setSelected(true);
            }
            else radio_nu.setSelected(true);
            txt_sdt.setText(table_nhanvien.getValueAt(index, 5).toString());
            txt_diachi.setText(table_nhanvien.getValueAt(index, 4).toString());
            txt_chucvu.setText(table_nhanvien.getValueAt(index, 6).toString());
            
        }
        catch(Exception ex){
            
        }
    }//GEN-LAST:event_table_nhanvienMouseClicked
    
    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        // TODO add your handling code here:
        //1 thêm
        //2 xóa
        //3 sửa
        if (checkNULL()) {
            JOptionPane.showMessageDialog(null, "Mời bạn nhập đầy đủ thông tin");
            return;
        }
        String gt ="";
        if (radio_nam.isSelected()==true) {
            gt="Nam";
            
        }else if (radio_nu.isSelected()==true) {
            gt="Nữ";
            
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(datePicker.getDate());
        NhanVienDTO nhanVienDTO=new NhanVienDTO(txt_manv.getText().toString(), txt_hoten.getText().toString(),
                date,gt,txt_sdt.getText().toString(),
                txt_diachi.getText().toString(),txt_chucvu.getText().toString()
        );
        if (flag==1) {
            nhanVienBUS.them(nhanVienDTO);
            
        }
        else if (flag==2) {
            nhanVienBUS.xoa(nhanVienDTO);
        }
        else if(flag==3)
        {
            nhanVienBUS.sua(nhanVienDTO);
        }
        
        loadTable();
        setVisibleBtnStart();
        disableTXT();
        clearTXT();
    }//GEN-LAST:event_btn_luuActionPerformed
    
    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        flag=3;
        enableTXT();
        setVisibleBtnLuu();
    }//GEN-LAST:event_btn_suaActionPerformed
    
    private void radio_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_namActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private com.toedter.calendar.JDateChooser datePicker;
    private javax.swing.ButtonGroup group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radio_nam;
    private javax.swing.JRadioButton radio_nu;
    private javax.swing.JTable table_nhanvien;
    private javax.swing.JTextField txt_chucvu;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_manv;
    private javax.swing.JTextField txt_sdt;
    // End of variables declaration//GEN-END:variables
}
