/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import entidades.PeliculaEntidad;

/**
 *
 * @author nomar
 */
public class FrmSinopsis extends javax.swing.JFrame {

    /**
     * Creates new form FrmSinopsis
     */
    public FrmSinopsis() {
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

        Encabezado = new javax.swing.JPanel();
        LogoC = new javax.swing.JLabel();
        btnCartelera = new javax.swing.JButton();
        btnPromos = new javax.swing.JButton();
        UbicacionIcon = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondoEncabezado = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        btnComprarBoletos = new javax.swing.JButton();
        background_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sinopsis");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Encabezado.add(LogoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

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
        Encabezado.add(UbicacionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 20, 30));

        txtUbicacion.setBackground(new java.awt.Color(54, 54, 54));
        txtUbicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 54, 54)));
        Encabezado.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cinépolis");
        Encabezado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        fondoEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EncabezadoBackground.png"))); // NOI18N
        Encabezado.add(fondoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        getContentPane().add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("TITULO");
        getContentPane().add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 420, -1));

        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setText("Descripcion");
        getContentPane().add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 310, 100));

        btnComprarBoletos.setBackground(new java.awt.Color(54, 54, 54));
        btnComprarBoletos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnComprarBoletos.setForeground(new java.awt.Color(255, 255, 255));
        btnComprarBoletos.setText("Comprar boletos");
        btnComprarBoletos.setBorderPainted(false);
        btnComprarBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarBoletosActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        background_img.setMaximumSize(new java.awt.Dimension(815, 600));
        background_img.setPreferredSize(new java.awt.Dimension(815, 600));
        getContentPane().add(background_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteleraActionPerformed
        // TODO add your handling code here:
        
        new FrmSucursal().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnCarteleraActionPerformed

    private void btnPromosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPromosActionPerformed

    private void btnComprarBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarBoletosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprarBoletosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel LogoC;
    private javax.swing.JLabel UbicacionIcon;
    private javax.swing.JLabel background_img;
    private javax.swing.JButton btnCartelera;
    private javax.swing.JButton btnComprarBoletos;
    private javax.swing.JButton btnPromos;
    private javax.swing.JLabel fondoEncabezado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
