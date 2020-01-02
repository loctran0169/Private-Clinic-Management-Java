/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkham.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
/**
 *
 * @author Administrator
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        initPanel();
    }

    public void initPanel() {
        panelBN.setLayout(new BorderLayout());
        panelBN.add(new firmBenhNhan());
        
        panelDanhSachCho.setLayout(new BorderLayout());
        panelDanhSachCho.add(new firmDanhSachCho());
        
        panelHoaDon.setLayout(new BorderLayout());
        panelHoaDon.add(new firmHoaDon());
        
        panelSaoLuu.setLayout(new BorderLayout());
        panelSaoLuu.add(new firmSaoLuu());
        
        panelKhoiPhuc.setLayout(new BorderLayout());
        panelKhoiPhuc.add(new firmKhoiPhuc());
        
        panelDanhSachKhamBenh.setLayout(new BorderLayout());
        panelDanhSachKhamBenh.add(new firmDanhSachKhamBenh());
        
        panelLapPhieuKham.setLayout(new BorderLayout());
        panelLapPhieuKham.add(new firmPhieuKham());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane11 = new javax.swing.JTabbedPane();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        panelSaoLuu = new javax.swing.JPanel();
        panelKhoiPhuc = new javax.swing.JPanel();
        panelBenhNhan1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        panelBN = new javax.swing.JPanel();
        panelDanhSachKhamBenh = new javax.swing.JPanel();
        panelDanhSachCho = new javax.swing.JPanel();
        panelLapPhieuKham = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        panelHoaDon = new javax.swing.JPanel();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jTabbedPane8 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Phòng Mạch Tư");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 630));

        jTabbedPane11.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout panelSaoLuuLayout = new javax.swing.GroupLayout(panelSaoLuu);
        panelSaoLuu.setLayout(panelSaoLuuLayout);
        panelSaoLuuLayout.setHorizontalGroup(
            panelSaoLuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelSaoLuuLayout.setVerticalGroup(
            panelSaoLuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Sao lưu", panelSaoLuu);

        javax.swing.GroupLayout panelKhoiPhucLayout = new javax.swing.GroupLayout(panelKhoiPhuc);
        panelKhoiPhuc.setLayout(panelKhoiPhucLayout);
        panelKhoiPhucLayout.setHorizontalGroup(
            panelKhoiPhucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelKhoiPhucLayout.setVerticalGroup(
            panelKhoiPhucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane7.addTab("Khôi phục", panelKhoiPhuc);

        jTabbedPane11.addTab("Hệ thống", jTabbedPane7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Nhân viên", jPanel8);

        javax.swing.GroupLayout panelBNLayout = new javax.swing.GroupLayout(panelBN);
        panelBN.setLayout(panelBNLayout);
        panelBNLayout.setHorizontalGroup(
            panelBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelBNLayout.setVerticalGroup(
            panelBNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Bệnh nhân", panelBN);

        javax.swing.GroupLayout panelDanhSachKhamBenhLayout = new javax.swing.GroupLayout(panelDanhSachKhamBenh);
        panelDanhSachKhamBenh.setLayout(panelDanhSachKhamBenhLayout);
        panelDanhSachKhamBenhLayout.setHorizontalGroup(
            panelDanhSachKhamBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelDanhSachKhamBenhLayout.setVerticalGroup(
            panelDanhSachKhamBenhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Danh sách khám bệnh", panelDanhSachKhamBenh);

        javax.swing.GroupLayout panelDanhSachChoLayout = new javax.swing.GroupLayout(panelDanhSachCho);
        panelDanhSachCho.setLayout(panelDanhSachChoLayout);
        panelDanhSachChoLayout.setHorizontalGroup(
            panelDanhSachChoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelDanhSachChoLayout.setVerticalGroup(
            panelDanhSachChoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Danh sách chờ", panelDanhSachCho);

        javax.swing.GroupLayout panelLapPhieuKhamLayout = new javax.swing.GroupLayout(panelLapPhieuKham);
        panelLapPhieuKham.setLayout(panelLapPhieuKhamLayout);
        panelLapPhieuKhamLayout.setHorizontalGroup(
            panelLapPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelLapPhieuKhamLayout.setVerticalGroup(
            panelLapPhieuKhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Lập phiếu khám bệnh", panelLapPhieuKham);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Lập đơn thốc", jPanel6);

        javax.swing.GroupLayout panelHoaDonLayout = new javax.swing.GroupLayout(panelHoaDon);
        panelHoaDon.setLayout(panelHoaDonLayout);
        panelHoaDonLayout.setHorizontalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        panelHoaDonLayout.setVerticalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        panelBenhNhan1.addTab("Lập hóa đơn", panelHoaDon);

        jTabbedPane11.addTab("Quản lý", panelBenhNhan1);
        jTabbedPane11.addTab("Danh mục", jTabbedPane9);
        jTabbedPane11.addTab("Báo cáo", jTabbedPane10);
        jTabbedPane11.addTab("Giớ thiệu", jTabbedPane8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane11)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane11)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JPanel panelBN;
    private javax.swing.JTabbedPane panelBenhNhan;
    private javax.swing.JTabbedPane panelBenhNhan1;
    private javax.swing.JPanel panelDanhSachCho;
    private javax.swing.JPanel panelDanhSachKhamBenh;
    private javax.swing.JPanel panelHoaDon;
    private javax.swing.JPanel panelKhoiPhuc;
    private javax.swing.JPanel panelLapPhieuKham;
    private javax.swing.JPanel panelSaoLuu;
    // End of variables declaration//GEN-END:variables
}
