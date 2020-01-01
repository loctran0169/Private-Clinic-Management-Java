/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package quanlyphongkham.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import quanlyphongkham.bus.CachDungBUS;
import quanlyphongkham.dto.CachDungDTO;

/**
 *
 * @author Administrator
 */
public class CachDungThuoc extends javax.swing.JFrame {
    
    /**
     * Creates new form CachDungThuoc
     */
    private CachDungBUS cachDungBUS;
    private int flag=0;
    public CachDungThuoc() {
        initComponents();
        cachDungBUS=new CachDungBUS();
        loadTable();
        setVisibleBtnStart();
        disableTXT();
    }
    private void loadTable(){
        
        table_CachDung.setModel(DbUtils.resultSetToTableModel(cachDungBUS.loadDuLieu()));
        
    }
    private void enableTXT()
    {
        txt_CachDung.setEnabled(true);
        txt_MaCachDung.setEnabled(true);
    }
    private void disableTXT()
    {
        txt_CachDung.setEnabled(false);
        txt_MaCachDung.setEnabled(false);
    }
    private void setVisibleBtnStart()
    {
        btn_Them.setVisible(true);
        btn_Xoa.setVisible(true);
        btn_Sua.setVisible(true);
        btn_Luu.setVisible(false);
        btn_Huy.setVisible(false);
    }
    private void setVisibleBtnLuu()
    {
        btn_Them.setVisible(false);
        btn_Xoa.setVisible(false);
        btn_Sua.setVisible(false);
        btn_Luu.setVisible(true);
        btn_Huy.setVisible(true);
    }
    private void clearTXT()
    {
        txt_CachDung.setText("");
        txt_MaCachDung.setText("");
    }
    private String TaoMaTuDong()
    {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<table_CachDung.getRowCount();i++)
        {
            list.add(table_CachDung.getValueAt(i, 0).toString());
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
            return ma = "CD00" + coso;
        else if (coso < 100)
            return ma = "CD0" + coso;
        else
            return ma = "CD" + coso;
        
    }
    private boolean checkNULL()
    {
        if (txt_CachDung.getText().toString().equals("") || txt_MaCachDung.getText().toString().equals("")) {
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

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_Them = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_CachDung = new javax.swing.JTable();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Huy = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();
        txt_MaCachDung = new javax.swing.JTextField();
        txt_CachDung = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cách Dùng Thuốc");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Mã Cách Dùng:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 33, -1, -1));

        jLabel9.setText("Cách Dùng:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 33, -1, -1));

        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 30));

        table_CachDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Cách Dùng", "Cách Dùng"
            }
        ));
        table_CachDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_CachDungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_CachDung);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 139, 700, 361));

        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 30));

        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 30));

        btn_Huy.setText("Hủy");
        btn_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 30));

        btn_Luu.setText("Lưu");
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 30));
        getContentPane().add(txt_MaCachDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 30, 183, -1));
        getContentPane().add(txt_CachDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 30, 150, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
        flag=1;
        enableTXT();
        setVisibleBtnLuu();
        clearTXT();
        txt_MaCachDung.setText(TaoMaTuDong());
        //TaoMaTuDong();
        
    }//GEN-LAST:event_btn_ThemActionPerformed
    
    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:
        flag=3;
        enableTXT();
        setVisibleBtnLuu();
      
    }//GEN-LAST:event_btn_SuaActionPerformed
    
    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
        //        flag=2;
        //        enableTXT();
        //        setVisibleBtnLuu();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Bạn có chắc chắn muốn xóa","Cảnh báo",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            CachDungDTO cachDungDTO=new CachDungDTO(txt_MaCachDung.getText().toString(), txt_CachDung.getText().toString());
            cachDungBUS.xoa(cachDungDTO);
            // Saving code here
            loadTable();
          
        }  clearTXT();
        
    }//GEN-LAST:event_btn_XoaActionPerformed
    
    private void btn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyActionPerformed
        // TODO add your handling code here:
        setVisibleBtnStart();
        disableTXT();
        clearTXT();
        
    }//GEN-LAST:event_btn_HuyActionPerformed
    
    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
        //1 thêm
        //2 xóa
        //3 sửa
        if (checkNULL()) {
            JOptionPane.showMessageDialog(null, "Mời bạn nhập đầy đủ thông tin");
            return;
        }
        CachDungDTO cachDungDTO=new CachDungDTO(txt_MaCachDung.getText().toString(), txt_CachDung.getText().toString());
        if (flag==1) {
            cachDungBUS.them(cachDungDTO);
        }
        else if (flag==2) {
            cachDungBUS.xoa(cachDungDTO);
        }
        else if(flag==3)
        {
            cachDungBUS.sua(cachDungDTO);
        }
        
        loadTable();
        setVisibleBtnStart();
        disableTXT();
        clearTXT();
    }//GEN-LAST:event_btn_LuuActionPerformed
    
    private void table_CachDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_CachDungMouseClicked
        // TODO add your handling code here:
        
        
        try{
            int index = table_CachDung.getSelectedRow();
            txt_MaCachDung.setText((String) table_CachDung.getValueAt(index, 0).toString());
            txt_CachDung.setText((String) table_CachDung.getValueAt(index, 1).toString());
            
        }
        catch(Exception ex){
            
        }
        
    }//GEN-LAST:event_table_CachDungMouseClicked
    
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
            java.util.logging.Logger.getLogger(CachDungThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CachDungThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CachDungThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CachDungThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        new CachDungThuoc().setVisible(true);
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Huy;
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_CachDung;
    private javax.swing.JTextField txt_CachDung;
    private javax.swing.JTextField txt_MaCachDung;
    // End of variables declaration//GEN-END:variables
}
