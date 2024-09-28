/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.Catálogos;

import dtos.ClienteDTO;
import dtos.SalaDTO;
import presentacion.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ClienteNegocio;
import negocio.IClienteNegocio;
import negocio.ISalasNegocio;
import negocio.NegocioException;
import negocio.SalasNegocio;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.IClienteDAO;
import persistencia.IConexionBD;
import persistencia.ISalasDAO;
import persistencia.salasDAO;
import presentacion.Catálogos.FrmCatalogoSalas;

/**
 *
 * @author nomar
 */
public class FrmCatalogoSalas extends javax.swing.JFrame {

        IConexionBD conexionBD = new ConexionBD();
        ISalasDAO salasDAO =  new salasDAO(conexionBD);
        ISalasNegocio salasNegocio = new SalasNegocio(salasDAO);       
        private int pagina=0;
        private int LIMITE=3;
    
    /**
     * Creates new form FrmInicioSesion
     */
    public FrmCatalogoSalas() {
        initComponents();
        
        llenarTablaSalas(obtenerPagina(pagina, LIMITE));
    }

    private List<SalaDTO> buscarSalasTabla(){
            List<SalaDTO> salasLista = null;
            try {

                salasLista = this.salasNegocio.buscarSalasTabla();
                

            } catch (NegocioException ex) {
                Logger.getLogger(FrmCatalogoSalas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return salasLista;
    }          
    
    private void llenarTablaSalas(List<SalaDTO> salasLista) {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblSalas.getModel();

        if (modeloTabla.getRowCount() > 0) {
            for (int i = modeloTabla.getRowCount() - 1; i > -1; i--) {
                modeloTabla.removeRow(i);
            }
        }

        if (salasLista != null) {
            salasLista.forEach(row -> {
                Object[] fila = new Object[4];
                fila[0] = row.getNombre();
                fila[1] = row.getCapacidad();
                fila[2] = row.getNSucursal();
                fila[3] = row.getNCiudad();

                modeloTabla.addRow(fila);
            });
        }
    }    
    
    private List<SalaDTO> obtenerPagina(int indiceInicio, int indiceFin) {
        List<SalaDTO> todas= buscarSalasTabla();
        List<SalaDTO> todasLasPaginas = new ArrayList<>();
        indiceFin = Math.min(indiceFin, todas.size());
        for (int i = indiceInicio; i < indiceFin; i++) {
            todasLasPaginas.add(todas.get(i));
        }
        return todasLasPaginas;
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_continuar1 = new javax.swing.JLabel();
        btn_continuar1 = new javax.swing.JPanel();
        lbl_continuar2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondoTablas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        content = new javax.swing.JPanel();
        btn_Atras = new javax.swing.JPanel();
        lbl_atras = new javax.swing.JLabel();
        btn_close = new javax.swing.JPanel();
        close_icon = new javax.swing.JLabel();
        logo_img = new javax.swing.JLabel();
        lbl_cPeliculas1 = new javax.swing.JLabel();
        btn_Siguiente = new javax.swing.JPanel();
        lbl_atras2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSalas = new javax.swing.JTable();
        btn_Editar = new javax.swing.JPanel();
        lblEditar = new javax.swing.JLabel();
        btn_Eliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        btn_Agregar = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        lblfondoTabla = new javax.swing.JLabel();
        lblatras = new javax.swing.JLabel();
        btn_anterior = new javax.swing.JPanel();
        fondoEncabezado6 = new javax.swing.JLabel();
        background_img = new javax.swing.JLabel();

        lbl_continuar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_continuar1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_continuar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_continuar1.setText("Catálogo Salas");

        btn_continuar1.setBackground(new java.awt.Color(83, 85, 96));

        lbl_continuar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_continuar2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_continuar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_continuar2.setText("Catálogo Salas");

        javax.swing.GroupLayout btn_continuar1Layout = new javax.swing.GroupLayout(btn_continuar1);
        btn_continuar1.setLayout(btn_continuar1Layout);
        btn_continuar1Layout.setHorizontalGroup(
            btn_continuar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_continuar1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_continuar2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_continuar1Layout.setVerticalGroup(
            btn_continuar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_continuar1Layout.createSequentialGroup()
                .addComponent(lbl_continuar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setText("jLabel1");

        fondoTablas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoTablas.png"))); // NOI18N
        fondoTablas.setText("jLabel2");

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
        setTitle("Cinepolis App");
        setUndecorated(true);
        setResizable(false);

        content.setBackground(new java.awt.Color(47, 48, 55));
        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(800, 600));
        content.setPreferredSize(new java.awt.Dimension(800, 600));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Atras.setBackground(new java.awt.Color(83, 85, 96));
        btn_Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AtrasMouseClicked(evt);
            }
        });

        lbl_atras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_atras.setForeground(new java.awt.Color(255, 255, 255));
        lbl_atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnAtras.png"))); // NOI18N

        javax.swing.GroupLayout btn_AtrasLayout = new javax.swing.GroupLayout(btn_Atras);
        btn_Atras.setLayout(btn_AtrasLayout);
        btn_AtrasLayout.setHorizontalGroup(
            btn_AtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_AtrasLayout.createSequentialGroup()
                .addComponent(lbl_atras)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_AtrasLayout.setVerticalGroup(
            btn_AtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_AtrasLayout.createSequentialGroup()
                .addComponent(lbl_atras)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        content.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 200, 80));

        btn_close.setBackground(new java.awt.Color(47, 48, 55));
        btn_close.setForeground(new java.awt.Color(47, 48, 55));
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setPreferredSize(new java.awt.Dimension(20, 20));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        btn_close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_icon.png"))); // NOI18N
        btn_close.add(close_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 20, 20));

        content.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 20, 20));

        logo_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCinepolis.png"))); // NOI18N
        content.add(logo_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        lbl_cPeliculas1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_cPeliculas1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cPeliculas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cPeliculas1.setText("Administrador");
        content.add(lbl_cPeliculas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, 20));

        btn_Siguiente.setBackground(new java.awt.Color(83, 85, 96));
        btn_Siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SiguienteMouseClicked(evt);
            }
        });

        lbl_atras2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_atras2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_atras2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_atras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnSiguiente.png"))); // NOI18N

        javax.swing.GroupLayout btn_SiguienteLayout = new javax.swing.GroupLayout(btn_Siguiente);
        btn_Siguiente.setLayout(btn_SiguienteLayout);
        btn_SiguienteLayout.setHorizontalGroup(
            btn_SiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_SiguienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_atras2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btn_SiguienteLayout.setVerticalGroup(
            btn_SiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_SiguienteLayout.createSequentialGroup()
                .addComponent(lbl_atras2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        content.add(btn_Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 470, 240, -1));

        tblSalas.setBackground(java.awt.SystemColor.controlDkShadow);
        tblSalas.setForeground(java.awt.SystemColor.controlShadow);
        tblSalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Contraseña", "Fecha de Nacimiento", "Email", "Ciudad Establecida"
            }
        ));
        tblSalas.setRowHeight(81);
        jScrollPane2.setViewportView(tblSalas);

        content.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 650, 272));

        btn_Editar.setBackground(new java.awt.Color(83, 85, 96));
        btn_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EditarMouseClicked(evt);
            }
        });

        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnEditar.png"))); // NOI18N

        javax.swing.GroupLayout btn_EditarLayout = new javax.swing.GroupLayout(btn_Editar);
        btn_Editar.setLayout(btn_EditarLayout);
        btn_EditarLayout.setHorizontalGroup(
            btn_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_EditarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEditar)
                .addContainerGap())
        );
        btn_EditarLayout.setVerticalGroup(
            btn_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_EditarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEditar))
        );

        content.add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        btn_Eliminar.setBackground(new java.awt.Color(83, 85, 96));
        btn_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EliminarMouseClicked(evt);
            }
        });

        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnEliminar.png"))); // NOI18N

        javax.swing.GroupLayout btn_EliminarLayout = new javax.swing.GroupLayout(btn_Eliminar);
        btn_Eliminar.setLayout(btn_EliminarLayout);
        btn_EliminarLayout.setHorizontalGroup(
            btn_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_EliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        btn_EliminarLayout.setVerticalGroup(
            btn_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        content.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        btn_Agregar.setBackground(new java.awt.Color(83, 85, 96));
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseClicked(evt);
            }
        });

        lblAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnAgregar.png"))); // NOI18N

        javax.swing.GroupLayout btn_AgregarLayout = new javax.swing.GroupLayout(btn_Agregar);
        btn_Agregar.setLayout(btn_AgregarLayout);
        btn_AgregarLayout.setHorizontalGroup(
            btn_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_AgregarLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lblAgregar)
                .addContainerGap())
        );
        btn_AgregarLayout.setVerticalGroup(
            btn_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        content.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, -1));

        lblfondoTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoTablas.png"))); // NOI18N
        content.add(lblfondoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 790, 500));

        lblatras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblatras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblatras.setText("<");
        lblatras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        content.add(lblatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        btn_anterior.setBackground(new java.awt.Color(47, 48, 55));
        btn_anterior.setForeground(new java.awt.Color(47, 48, 55));
        btn_anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_anterior.setPreferredSize(new java.awt.Dimension(20, 20));
        btn_anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_anteriorMouseClicked(evt);
            }
        });
        btn_anterior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        content.add(btn_anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        fondoEncabezado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EncabezadoBackground.png"))); // NOI18N
        content.add(fondoEncabezado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        background_img.setMaximumSize(new java.awt.Dimension(815, 600));
        background_img.setPreferredSize(new java.awt.Dimension(815, 600));
        content.add(background_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AtrasMouseClicked
        // TODO add your handling code here:
        if (pagina -3 < 0)
        {
            JOptionPane.showMessageDialog(this, "No hay más páginas atrás");
        }
        else
        {
        pagina -= 3;
        LIMITE -= 3;   
        llenarTablaSalas(obtenerPagina(pagina, LIMITE));
        } 


    }//GEN-LAST:event_btn_AtrasMouseClicked

    private void btn_SiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SiguienteMouseClicked
        // TODO add your handling code here:
        pagina += 3;
        LIMITE += 3;   
        llenarTablaSalas(obtenerPagina(pagina, LIMITE));
    }//GEN-LAST:event_btn_SiguienteMouseClicked

    private void btn_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarMouseClicked

    private void btn_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarMouseClicked

    private void btn_EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditarMouseClicked

    private void btn_anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anteriorMouseClicked
        // TODO add your handling code here:
        new FrmMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_anteriorMouseClicked

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
            java.util.logging.Logger.getLogger(FrmCatalogoSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogoSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogoSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogoSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCatalogoSalas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_img;
    private javax.swing.JPanel btn_Agregar;
    private javax.swing.JPanel btn_Atras;
    private javax.swing.JPanel btn_Editar;
    private javax.swing.JPanel btn_Eliminar;
    private javax.swing.JPanel btn_Siguiente;
    private javax.swing.JPanel btn_anterior;
    private javax.swing.JPanel btn_close;
    private javax.swing.JPanel btn_continuar1;
    private javax.swing.JLabel close_icon;
    private javax.swing.JPanel content;
    private javax.swing.JLabel fondoEncabezado6;
    private javax.swing.JLabel fondoTablas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lbl_atras;
    private javax.swing.JLabel lbl_atras2;
    private javax.swing.JLabel lbl_cPeliculas1;
    private javax.swing.JLabel lbl_continuar1;
    private javax.swing.JLabel lbl_continuar2;
    private javax.swing.JLabel lblatras;
    private javax.swing.JLabel lblfondoTabla;
    private javax.swing.JLabel logo_img;
    private javax.swing.JTable tblSalas;
    // End of variables declaration//GEN-END:variables
}
