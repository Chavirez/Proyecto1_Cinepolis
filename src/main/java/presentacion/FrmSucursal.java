/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.PeliculaDTO;
import dtos.SucursalDTO;
import dtos.ciudadDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.CiudadNegocio;
import negocio.ClienteNegocio;
import negocio.ICiudadNegocio;
import negocio.IClienteNegocio;
import negocio.IPeliculaNegocio;
import negocio.ISucursalNegocio;
import negocio.NegocioException;
import negocio.PeliculaNegocio;
import negocio.SucursalNegocio;
import persistencia.CiudadDAO;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.ICiudadDAO;
import persistencia.SucursalDAO;
import persistencia.IClienteDAO;
import persistencia.IConexionBD;
import persistencia.IPeliculasDAO;
import persistencia.ISucursalDAO;
import persistencia.SucursalDAO;
import persistencia.peliculasDAO;

/**
 *
 * @author nomar
 */
public class FrmSucursal extends javax.swing.JFrame {

    List<SucursalDTO> su = new ArrayList();
    IConexionBD conexionBD = new ConexionBD();
    ISucursalDAO clienteDAO = new SucursalDAO(conexionBD);
    ICiudadDAO ciudadDAO = new CiudadDAO(conexionBD);
    IPeliculasDAO peliculaDAO = new peliculasDAO(conexionBD);
    IPeliculaNegocio peliculaNegocio = new PeliculaNegocio(peliculaDAO);
    ISucursalNegocio sucursalNegocio = new SucursalNegocio(clienteDAO);
    ICiudadNegocio ciudad = new CiudadNegocio(ciudadDAO);    
    
    /**
     * Creates new form FrmSucursal
     */
    public FrmSucursal() {
        initComponents();
        llenarBoxCiudades(buscarCiudadTabla());
    }

    private void llenarBoxCiudades(List<ciudadDTO> ciudadLista) {
        int i = 0;
        while (ciudadLista.size() > i) {
            boxCiudad.addItem(ciudadLista.get(i).getNombre());
            i++;
        }
    }
    
    private void llenarBoxSucursales(List<SucursalDTO> sucursalLista) {
        int i = 0;
        while (sucursalLista.size() > i) {
            boxSucursal.addItem(sucursalLista.get(i).getNombre());
            i++;
        }
    }
    
/**
     * Metodo que se encarga de hacer la lista de las ciudades con la info de la
     * base de datos.
     *
     * @return lista con las ciudades de la base de datos.
     */
    private List<ciudadDTO> buscarCiudadTabla() {
        List<ciudadDTO> ciudadLista = null;
        try {

            ciudadLista = ciudad.buscarCiudadTabla();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return ciudadLista;
    }    
    
/**
     * Metodo que se encarga de hacer la lista de las ciudades con la info de la
     * base de datos.
     *
     * @return lista con las ciudades de la base de datos.
     */
    private List<SucursalDTO> buscarSucursalTabla(SucursalDTO sucursal) {
        List<SucursalDTO> sucursalLista = null;
        try {

            sucursalLista = sucursalNegocio.buscarSucursalTabla(sucursal);
            this.su = sucursalLista;
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return sucursalLista;
    }    
    
    private List<PeliculaDTO> buscarPeliculasTabla(int i){
        List<PeliculaDTO> PeliculasLista = null;
        try {
            
            PeliculasLista = this.peliculaNegocio.buscarPeliculaTabla(i);


        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return PeliculasLista;
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
        boxCiudad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        boxSucursal = new javax.swing.JComboBox<>();
        Encabezado = new javax.swing.JPanel();
        LogoC = new javax.swing.JLabel();
        btnCartelera = new javax.swing.JButton();
        btnPromos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fondoEncabezado = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        background_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escoge tu ciudad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        boxCiudad.setBackground(new java.awt.Color(102, 102, 102));
        boxCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(boxCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 150, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escoge tu sucursal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        boxSucursal.setBackground(new java.awt.Color(102, 102, 102));
        boxSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(boxSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 150, 40));

        Encabezado.setMinimumSize(new java.awt.Dimension(800, 100));
        Encabezado.setPreferredSize(new java.awt.Dimension(800, 100));
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cinépolis");
        Encabezado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        fondoEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EncabezadoBackground.png"))); // NOI18N
        fondoEncabezado.setMaximumSize(new java.awt.Dimension(800, 102));
        Encabezado.add(fondoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        getContentPane().add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        btnAceptar.setBackground(new java.awt.Color(54, 54, 54));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(54, 54, 54));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        background_img.setMaximumSize(new java.awt.Dimension(815, 600));
        background_img.setPreferredSize(new java.awt.Dimension(815, 600));
        getContentPane().add(background_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, -1));

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

    private void boxSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSucursalActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_boxSucursalActionPerformed

    private void boxCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCiudadActionPerformed
        // TODO add your handling code here:
        SucursalDTO sucursal = new SucursalDTO();
        sucursal.setIdCiudad(boxCiudad.getSelectedIndex() +1);
        boxSucursal.removeAllItems();
        llenarBoxSucursales(buscarSucursalTabla(sucursal));
    }//GEN-LAST:event_boxCiudadActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
        dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int i = boxSucursal.getSelectedIndex();
        su.get(i).getIdSucursal();
        new FrmCartelera(buscarPeliculasTabla(su.get(i).getIdSucursal())).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel LogoC;
    private javax.swing.JLabel background_img;
    private javax.swing.JComboBox<String> boxCiudad;
    private javax.swing.JComboBox<String> boxSucursal;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCartelera;
    private javax.swing.JButton btnPromos;
    private javax.swing.JLabel fondoEncabezado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
