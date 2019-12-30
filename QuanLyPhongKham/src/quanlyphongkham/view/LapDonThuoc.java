/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quanlyphongkham.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.LapDonThuocBUS;
import quanlyphongkham.dto.CachDungDTO;
import quanlyphongkham.dto.LapDonThuocDTO;
import quanlyphongkham.dto.PhieuKhamDTO;
import quanlyphongkham.dto.ThuocDTO;

/**
 *
 * @author Administrator
 */
public class LapDonThuoc extends javax.swing.JFrame {
    
    /**
     * Creates new form LapDonThuoc
     * //     */
    
    private LapDonThuocBUS lapDonThuocBUS;
    private int flag=0;
    private ArrayList<LapDonThuocDTO> listPK=new ArrayList<>();
    private LapDonThuocDTO dTO;
    private ArrayList<ThuocDTO> listThuocDTOs=new ArrayList<>();
    private ThuocDTO thuocDTO;
    private ArrayList<CachDungDTO> listCachDungDTOs=new ArrayList<>();
    private CachDungDTO cachDungDTO;
    
    public LapDonThuoc() {
        initComponents();
        lapDonThuocBUS=new LapDonThuocBUS();
        dTO=new LapDonThuocDTO();
        thuocDTO=new ThuocDTO();
        cachDungDTO=new CachDungDTO();
        loadComboBox();
        loadTable();
        setVisibleBtnStart();
        disableTXT();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void loadComboBox()
    {
        listPK=lapDonThuocBUS.loadPhieuKham();
        for (int i = 0; i < listPK.size(); i++) {
            combobox_mapk.addItem(listPK.get(i).getMaPK().toString());
        }
        listThuocDTOs=lapDonThuocBUS.loadThuoc();
        for (int i = 0; i < listThuocDTOs.size(); i++) {
            combobox_tenthuoc.addItem(listThuocDTOs.get(i).getTenThuoc().toString());
        }
        listCachDungDTOs=lapDonThuocBUS.loadCachDung();
        for(int i=0;i<listCachDungDTOs.size();i++){
            combobox_cachdung.addItem(listCachDungDTOs.get(i).getCachDung().toString());
        }
    }
    private boolean checkNULL()
    {
        if (txt_soluong.getText().toString().equals("")) {
            return true;
        }
        return false;
    }
    private void loadTable()
    {
        table_donthuoc.setModel(DbUtils.resultSetToTableModel(lapDonThuocBUS.loadTable(combobox_mapk.getSelectedItem().toString())));
    }
    
    private void enableTXT()
    {
        txt_soluong.setEnabled(true);
        combobox_cachdung.setEnabled(true);
        combobox_tenthuoc.setEnabled(true);
    }
    private void disableTXT()
    {
        txt_soluong.setEnabled(false);
        combobox_cachdung.setEnabled(false);
        combobox_tenthuoc.setEnabled(false);
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combobox_mapk = new javax.swing.JComboBox<>();
        txt_hoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_trieuchung = new javax.swing.JTextField();
        txt_loaibenh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        btn_huy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combobox_tenthuoc = new javax.swing.JComboBox<>();
        combobox_cachdung = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_soluong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_gia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_donthuoc = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lập Đơn Thuốc");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Thông Tin Chi Tiết Phiếu Khám");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setText("Mã Phiếu Khám:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setText("Triệu Chứng:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        combobox_mapk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_mapkItemStateChanged(evt);
            }
        });
        getContentPane().add(combobox_mapk, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 177, -1));

        txt_hoten.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_hoten.setEnabled(false);
        getContentPane().add(txt_hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 177, -1));

        jLabel4.setText("Họ tên bệnh nhân:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        txt_trieuchung.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt_trieuchung.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_trieuchung.setEnabled(false);
        getContentPane().add(txt_trieuchung, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 177, -1));

        txt_loaibenh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_loaibenh.setEnabled(false);
        getContentPane().add(txt_loaibenh, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 177, -1));

        jLabel5.setText("Loại Bệnh:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        getContentPane().add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 59, -1));

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        btn_huy.setText("Hủy");
        btn_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel6.setText("Tên Thuốc:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel7.setText("Cách Dùng:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        combobox_tenthuoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_tenthuocItemStateChanged(evt);
            }
        });
        getContentPane().add(combobox_tenthuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, -1));

        combobox_cachdung.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_cachdungItemStateChanged(evt);
            }
        });
        getContentPane().add(combobox_cachdung, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 190, -1));

        jLabel8.setText("Số Lượng:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        txt_soluong.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_soluongInputMethodTextChanged(evt);
            }
        });
        txt_soluong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_soluongKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_soluongKeyReleased(evt);
            }
        });
        txt_soluong.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txt_soluongVetoableChange(evt);
            }
        });
        getContentPane().add(txt_soluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 177, -1));

        jLabel9.setText("Giá:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        txt_gia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_gia.setEnabled(false);
        getContentPane().add(txt_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 177, -1));

        table_donthuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Loại Thuốc", "Tên Loại Thuốc", "Số Lượng", "Đơn Vị Tính ", "Đơn giá", "Mã Cách Dùng", "Cách Dùng Thuốc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_donthuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_donthuocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_donthuoc);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 265, 747, 254));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        flag=1;
        enableTXT();
        setVisibleBtnLuu();
        
    }//GEN-LAST:event_btn_themActionPerformed
    
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
            
            
            LapDonThuocDTO thuocDTO=new LapDonThuocDTO(combobox_mapk.getSelectedItem().toString(),this.thuocDTO.getMaThuoc());
            lapDonThuocBUS.xoa(thuocDTO);
            loadTable();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed
    
    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        // TODO add your handling code here:
        if (checkNULL()) {
            JOptionPane.showMessageDialog(null, "Mời bạn nhập số lượng");
            return;
        }
        LapDonThuocDTO lapDonThuocDTO=new LapDonThuocDTO(combobox_mapk.getSelectedItem().toString(),
                thuocDTO.getMaThuoc(),Integer.parseInt(txt_soluong.getText().toString()),
                cachDungDTO.getMaCD());
        if (flag==1) {
            lapDonThuocBUS.them(lapDonThuocDTO);
        }
        else if (flag==3) {
            lapDonThuocBUS.sua(lapDonThuocDTO);
        }
        loadTable();
        setVisibleBtnStart();
        disableTXT();
        
    }//GEN-LAST:event_btn_luuActionPerformed
    
    private void btn_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyActionPerformed
        // TODO add your handling code here:
        setVisibleBtnStart();
        disableTXT();
        
    }//GEN-LAST:event_btn_huyActionPerformed
    
    private void combobox_mapkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_mapkItemStateChanged
        // TODO add your handling code here:
        for (int i = 0; i < listPK.size(); i++) {
            if (combobox_mapk.getSelectedItem().toString().equals(listPK.get(i).getMaPK().toString())) {
                dTO=listPK.get(i);
                break;
            }
        }
        txt_hoten.setText(dTO.getTenBN());
        txt_loaibenh.setText(dTO.getTenLB());
        txt_trieuchung.setText(dTO.getTrieuChung());
        loadTable();
        
        
    }//GEN-LAST:event_combobox_mapkItemStateChanged
    
    private void combobox_tenthuocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_tenthuocItemStateChanged
        // TODO add your handling code here:
        for (int i = 0; i < listThuocDTOs.size(); i++) {
            if (combobox_tenthuoc.getSelectedItem().toString().equals(listThuocDTOs.get(i).getTenThuoc().toString())) {
                thuocDTO=listThuocDTOs.get(i);
                break;
            }
        }
        if(!txt_soluong.equals(""))
        {
            int gia=0;
            try {
                gia=Integer.parseInt(txt_soluong.getText().toString())*thuocDTO.getDonGia();
            } catch (Exception e) {
            }
            
            txt_gia.setText(gia+"");
        }
    }//GEN-LAST:event_combobox_tenthuocItemStateChanged
    
    private void combobox_cachdungItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_cachdungItemStateChanged
        // TODO add your handling code here:
        for (int i = 0; i < listCachDungDTOs.size(); i++) {
            if (combobox_cachdung.getSelectedItem().toString().equals(listCachDungDTOs.get(i).getCachDung().toString())) {
                cachDungDTO=listCachDungDTOs.get(i);
                break;
            }
        }
    }//GEN-LAST:event_combobox_cachdungItemStateChanged
    
    private void txt_soluongInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_soluongInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_soluongInputMethodTextChanged
    
    private void txt_soluongVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txt_soluongVetoableChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_soluongVetoableChange
    
    private void txt_soluongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_soluongKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txt_soluongKeyPressed
    
    private void txt_soluongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_soluongKeyReleased
        // TODO add your handling code here:
        if(!txt_soluong.equals(""))
        {
            int gia=0;
            try {
                gia=Integer.parseInt(txt_soluong.getText().toString())*thuocDTO.getDonGia();
            } catch (Exception e) {
            }
            
            txt_gia.setText(""+gia);
        }
    }//GEN-LAST:event_txt_soluongKeyReleased
    
    private void table_donthuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_donthuocMouseClicked
        // TODO add your handling code here:
        try {
            int index=table_donthuoc.getSelectedRow();
            combobox_tenthuoc.setSelectedItem(table_donthuoc.getValueAt(index, 1).toString());
            combobox_cachdung.setSelectedItem(table_donthuoc.getValueAt(index, 6).toString());
            txt_soluong.setText(table_donthuoc.getValueAt(index, 2).toString());
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_table_donthuocMouseClicked
    
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
            java.util.logging.Logger.getLogger(LapDonThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LapDonThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LapDonThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LapDonThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LapDonThuoc().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> combobox_cachdung;
    private javax.swing.JComboBox<String> combobox_mapk;
    private javax.swing.JComboBox<String> combobox_tenthuoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table_donthuoc;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_loaibenh;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_trieuchung;
    // End of variables declaration//GEN-END:variables
}
