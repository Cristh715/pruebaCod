/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gcs;

/**
 *
 * @author usuario
 */
public class Catalogo extends javax.swing.JFrame {

    /**
     * Creates new form Catalogo
     */
    public Catalogo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grupo-de-usuarios.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 140, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("BIENVENIDO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, 40));

        jPanel7.setBackground(new java.awt.Color(255, 153, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categorizacion.png"))); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 60));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel19.setText("CATEGORÍAS");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, 80));

        jPanel8.setBackground(new java.awt.Color(255, 153, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolsa-de-la-compra.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("MIS COMPRAS");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 80));

        jPanel9.setBackground(new java.awt.Color(255, 153, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito-de-compras (1).png"))); // NOI18N
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("CARRITO");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 300, 80));

        jPanel10.setBackground(new java.awt.Color(255, 153, 0));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 70));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("SALIR");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 300, 80));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TECHSALES");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ff9911.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 990, 120));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 985, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel13);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asus.jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 180));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 180, 180));

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/intel-core-i5165172.jpg"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 180, 180));

        jPanel5.setBackground(new java.awt.Color(255, 204, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mouse-ribbon-pietro-rgb-3200-dpi-black-usb-20-pnrbn-mg101.jpg"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 180));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 180, 180));

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora-epson-ecotank-l3210-multifuncional-pnc11cj68303-.jpg"))); // NOI18N
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 180));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 180, 180));

        jPanel11.setBackground(new java.awt.Color(255, 204, 153));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/auriculares.jpg"))); // NOI18N
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 180));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 180, 180));

        jPanel12.setBackground(new java.awt.Color(255, 204, 153));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/parlantes.jpg"))); // NOI18N
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 180));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 180, 180));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("PARLANTES");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 110, 30));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel20.setText("TARJETAS GRÁFICAS");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 30));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel22.setText("PROCESADORES");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 140, 30));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel23.setText("MOUSE Y TECLADOS");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 180, 30));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel24.setText("IMPRESORA");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 110, 30));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel25.setText("AURICULARES");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 140, 30));

        jTabbedPane1.addTab("tab1", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 990, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
            System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseClicked

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
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
