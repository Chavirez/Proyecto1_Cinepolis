/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

/**
 *
 * @author nomar
 */
public class FrmBoleto extends javax.swing.JFrame {

    /**
     * Creates new form FrmBoleto
     */
    public FrmBoleto() {
        initComponents();
    }
    
    private void cargarConfiguracionInicialTablaBoleto(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnCartelera = new javax.swing.JButton();
        btnPromos = new javax.swing.JButton();
        UbicacionIcon = new javax.swing.JLabel();
        LogoC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondoEncabezado = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBoleto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelRegresar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(54, 54, 54));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 54, 54)));
        Encabezado.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 120, 30));

        btnCartelera.setBackground(new java.awt.Color(54, 54, 54));
        btnCartelera.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCartelera.setForeground(new java.awt.Color(255, 255, 255));
        btnCartelera.setText("Cartelera");
        btnCartelera.setBorderPainted(false);
        btnCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarteleraActionPerformed(evt);
            }
        });
        Encabezado.add(btnCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btnPromos.setBackground(new java.awt.Color(54, 54, 54));
        btnPromos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPromos.setForeground(new java.awt.Color(255, 255, 255));
        btnPromos.setText("Promos");
        btnPromos.setBorderPainted(false);
        btnPromos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromosActionPerformed(evt);
            }
        });
        Encabezado.add(btnPromos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        UbicacionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gps_icon.png"))); // NOI18N
        Encabezado.add(UbicacionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 20, 30));
        Encabezado.add(LogoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cinépolis");
        Encabezado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        fondoEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EncabezadoBackground.png"))); // NOI18N
        Encabezado.add(fondoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        getContentPane().add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaBoleto.setBackground(new java.awt.Color(54, 54, 54));
        tablaBoleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Duracion", "Sala", "Ciudad", "Comprar"
            }
        ));
        tablaBoleto.setGridColor(new java.awt.Color(50, 50, 50));
        jScrollPane1.setViewportView(tablaBoleto);

        Contenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 330));

        jButton1.setBackground(new java.awt.Color(54, 54, 54));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Siguiente");
        jButton1.setBorderPainted(false);
        Contenedor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 140, 30));

        jButton2.setBackground(new java.awt.Color(54, 54, 54));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Anterior");
        jButton2.setBorderPainted(false);
        Contenedor.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 140, 30));

        panelRegresar.setBackground(new java.awt.Color(34, 35, 41));
        panelRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegresarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<");

        javax.swing.GroupLayout panelRegresarLayout = new javax.swing.GroupLayout(panelRegresar);
        panelRegresar.setLayout(panelRegresarLayout);
        panelRegresarLayout.setHorizontalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRegresarLayout.setVerticalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegresarLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        Contenedor.add(panelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 40, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(800, 600));
        fondo.setMinimumSize(new java.awt.Dimension(800, 600));
        fondo.setPreferredSize(new java.awt.Dimension(800, 600));
        Contenedor.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 810, -1));

        getContentPane().add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteleraActionPerformed
        // TODO add your handling code here:

        new FrmCartelera().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCarteleraActionPerformed

    private void btnPromosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromosActionPerformed
        // TODO add your handling code here:

        new FrmMenu().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnPromosActionPerformed

    private void panelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegresarMouseClicked
        // TODO add your handling code here:

        new FrmHorario().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_panelRegresarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBoleto().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel LogoC;
    private javax.swing.JLabel UbicacionIcon;
    private javax.swing.JButton btnCartelera;
    private javax.swing.JButton btnPromos;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoEncabezado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelRegresar;
    private javax.swing.JTable tablaBoleto;
    // End of variables declaration//GEN-END:variables
}
