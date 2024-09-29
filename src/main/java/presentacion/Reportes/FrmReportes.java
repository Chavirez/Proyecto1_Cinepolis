/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.Reportes;


import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import dtos.PeliculaDTO;
import dtos.ReportePeliculaDTO;
import dtos.ReporteSucursalDTO;
import dtos.ReporteTipoPagoDTO;
import dtos.SucursalDTO;
import java.io.FileNotFoundException;
import java.sql.Timestamp;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.ClienteNegocio;
import negocio.IClienteNegocio;
import negocio.IPeliculaNegocio;
import negocio.IReporteNegocio;
import negocio.ISucursalNegocio;
import negocio.NegocioException;
import negocio.PeliculaNegocio;
import negocio.ReporteNegocio;
import negocio.SucursalNegocio;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.IClienteDAO;
import persistencia.IConexionBD;
import persistencia.IPeliculasDAO;
import persistencia.IReporteDAO;
import persistencia.ISucursalDAO;
import persistencia.ReporteDAO;
import persistencia.SucursalDAO;
import persistencia.peliculasDAO;
import presentacion.FrmMenuAdmin;
import presentacion.Reportes.FrmReportes;

/**
 *
 * @author nomar
 */
public class FrmReportes extends javax.swing.JFrame {

        IConexionBD conexionBD = new ConexionBD();
        
        IPeliculasDAO peliculasDAO =  new peliculasDAO(conexionBD);
        IPeliculaNegocio peliculasNegocio = new PeliculaNegocio(peliculasDAO);
        ISucursalDAO sucursalDAO = new SucursalDAO(conexionBD);
        ISucursalNegocio sucursalNegocio = new SucursalNegocio(sucursalDAO);        
        IReporteDAO reporteDAO = new ReporteDAO(conexionBD);
        IReporteNegocio reporteNegocio = new ReporteNegocio(reporteDAO);        
        
        private int pagina=0;
        private int LIMITE=3;
        private int tipo = 5;
    
    /**
     * Creates new form FrmInicioSesion
     */
    public FrmReportes() {
        initComponents();
        lblDesde.setVisible(Boolean.FALSE);
        lblHasta.setVisible(Boolean.FALSE);
        lbl_gReporte.setVisible(Boolean.FALSE);
        btn_gReporte.setVisible(Boolean.FALSE);
        fldDesde.setVisible(Boolean.FALSE);
        fldHasta.setVisible(Boolean.FALSE);
        lblFiltroS.setVisible(Boolean.FALSE);

    }

    public void activarFields()
    {
        
        lblDesde.setVisible(Boolean.TRUE);
        lblHasta.setVisible(Boolean.TRUE);
        lbl_gReporte.setVisible(Boolean.TRUE);
        btn_gReporte.setVisible(Boolean.TRUE);
        fldDesde.setVisible(Boolean.TRUE);
        fldHasta.setVisible(Boolean.TRUE);
        lblFiltroS.setVisible(Boolean.TRUE);
        
    }

    private void generarReporteSucursal(Timestamp desde, Timestamp hasta) throws NegocioException{

        String dest = "reporteSucursal.pdf";

        try {

            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);


            document.add(new Paragraph("Reporte de ventas de las sucursales del siguiente periodo desde: " + desde.toString()+ " hasta: " + hasta.toString()));


            List<ReporteSucursalDTO> lista = reporteNegocio.buscarReporteSucursalTabla(desde, hasta);
            float[] columnWidths = {200, 200, 200};
            Table table = new Table(columnWidths);
           int[] costoTotalA = {0};
            if (lista != null) {
                lista.forEach(row -> {

                String costo = "$" + row.getCosto();    
                String cantidad = row.getCantidadBoletos()+ " boletos";    
                table.addCell(row.getNombreSucursal());
                table.addCell(cantidad);
                table.addCell(costo);
                costoTotalA[0] += row.getCosto();

            });
        }
                    
            String costoTotal = "$" + costoTotalA[0];
            document.add(table);
            document.add(new Paragraph("Ganancias totales = " + costoTotal));

            document.close();

            System.out.println("¡Reporte generado con éxito!");
            
            JOptionPane.showMessageDialog(this, "Reporte de sucursales generado con éxito!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();    
    
    }
    }
    
    private List<ReportePeliculaDTO> buscarReportePelicula(Timestamp desde, Timestamp hasta) {
        List<ReportePeliculaDTO> reporteLista = null;
        try {
            
            reporteLista = reporteNegocio.buscarReportePeliculaTabla(desde, hasta);


        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return reporteLista;
    }          
    
    private void generarReportePelicula(Timestamp desde, Timestamp hasta){

        String dest = "reportePelicula.pdf";

        try {

            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);


            document.add(new Paragraph("Reporte de ventas de las peliculas del siguiente periodo desde: " + desde.toString()+ " hasta: " + hasta.toString()));


            List<ReportePeliculaDTO> lista = buscarReportePelicula(desde, hasta);
            float[] columnWidths = {200, 200, 200, 200};
            Table table = new Table(columnWidths);
            int[] costoTotalA = {0};
            if (lista != null) {

                lista.forEach(row -> {

                String costo = "$" + row.getCosto();      
                table.addCell(row.getTitulo());
                table.addCell(row.getGenero());
                table.addCell(row.getNombreCiudad());
                table.addCell(costo);
                costoTotalA[0] += row.getCosto();
                

            });
        }
            String costoTotal = "$" + costoTotalA[0];
            document.add(table);
            document.add(new Paragraph("Ganancias totales = " + costoTotal));
            document.close();

            System.out.println("¡Reporte generado con éxito!");
            
            JOptionPane.showMessageDialog(this, "Reporte generado con éxito!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();    
    
    }
    }
     
    private List<ReporteTipoPagoDTO> buscarReporteTipoPago(Timestamp desde, Timestamp hasta) {
        List<ReporteTipoPagoDTO> reporteLista = null;
        try {
            
            reporteLista = reporteNegocio.buscarReporteTipoPagoTabla(desde, hasta);


        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return reporteLista;
    }          
    
    private void generarReporteTipoPago(Timestamp desde, Timestamp hasta){

        String dest = "reporteTipoPago.pdf";

        try {

            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);


            document.add(new Paragraph("Reporte de ventas por cada tipo de pago del siguiente periodo desde: " + desde.toString()+ " hasta: " + hasta.toString()));


            List<ReporteTipoPagoDTO> lista = buscarReporteTipoPago(desde, hasta);
            float[] columnWidths = {266, 266, 266};
            Table table = new Table(columnWidths);
            int[] costoTotalA = {0};
            if (lista != null) {

                lista.forEach(row -> {

                String costo = "$" + row.getCosto();  
                String cantidad = row.getCantidad()+ " boletos";    
                table.addCell(row.getTipo());
                table.addCell(cantidad);
                table.addCell(costo);
                costoTotalA[0] += row.getCosto();
                

            });
        }
            String costoTotal = "$" + costoTotalA[0];
            document.add(table);
            document.add(new Paragraph("Ganancias totales = " + costoTotal));
            document.close();

            System.out.println("¡Reporte generado con éxito!");
            
            JOptionPane.showMessageDialog(this, "Reporte generado con éxito!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();    
    
    }
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
        close_icon = new javax.swing.JLabel();
        btn_close1 = new javax.swing.JPanel();
        close_icon2 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        btn_pSucursal = new javax.swing.JPanel();
        lbl_sucursal = new javax.swing.JLabel();
        logo_img = new javax.swing.JLabel();
        btn_tipopago = new javax.swing.JPanel();
        lbl_tPago = new javax.swing.JLabel();
        lbl_cPeliculas1 = new javax.swing.JLabel();
        btn_pPelicula = new javax.swing.JPanel();
        lbl_pelicula = new javax.swing.JLabel();
        fldDesde = new com.toedter.calendar.JDateChooser();
        fldHasta = new com.toedter.calendar.JDateChooser();
        lblDesde = new javax.swing.JLabel();
        lblHasta = new javax.swing.JLabel();
        lblatras = new javax.swing.JLabel();
        btn_gReporte = new javax.swing.JPanel();
        lbl_gReporte = new javax.swing.JLabel();
        btn_anterior = new javax.swing.JPanel();
        btn_close = new javax.swing.JPanel();
        btn_close2 = new javax.swing.JPanel();
        close_icon3 = new javax.swing.JLabel();
        fondoEncabezado6 = new javax.swing.JLabel();
        lblFiltroS = new javax.swing.JLabel();
        lblfondoTabla = new javax.swing.JLabel();
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

        close_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_icon.png"))); // NOI18N

        btn_close1.setBackground(new java.awt.Color(47, 48, 55));
        btn_close1.setForeground(new java.awt.Color(47, 48, 55));
        btn_close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close1.setPreferredSize(new java.awt.Dimension(20, 20));
        btn_close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close1MouseClicked(evt);
            }
        });
        btn_close1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_icon.png"))); // NOI18N
        btn_close1.add(close_icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 20, 20));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinepolis App");
        setUndecorated(true);
        setResizable(false);

        content.setBackground(new java.awt.Color(47, 48, 55));
        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(800, 600));
        content.setPreferredSize(new java.awt.Dimension(800, 600));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_pSucursal.setBackground(new java.awt.Color(83, 85, 96));
        btn_pSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pSucursalMouseClicked(evt);
            }
        });

        lbl_sucursal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_sucursal.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sucursal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnSucursal.png"))); // NOI18N

        javax.swing.GroupLayout btn_pSucursalLayout = new javax.swing.GroupLayout(btn_pSucursal);
        btn_pSucursal.setLayout(btn_pSucursalLayout);
        btn_pSucursalLayout.setHorizontalGroup(
            btn_pSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pSucursalLayout.createSequentialGroup()
                .addComponent(lbl_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_pSucursalLayout.setVerticalGroup(
            btn_pSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pSucursalLayout.createSequentialGroup()
                .addComponent(lbl_sucursal)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        content.add(btn_pSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 200, 80));

        logo_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCinepolis.png"))); // NOI18N
        content.add(logo_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        btn_tipopago.setBackground(new java.awt.Color(83, 85, 96));
        btn_tipopago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tipopago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tipopagoMouseClicked(evt);
            }
        });

        lbl_tPago.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_tPago.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnTipoPago.png"))); // NOI18N

        javax.swing.GroupLayout btn_tipopagoLayout = new javax.swing.GroupLayout(btn_tipopago);
        btn_tipopago.setLayout(btn_tipopagoLayout);
        btn_tipopagoLayout.setHorizontalGroup(
            btn_tipopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_tipopagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tPago, javax.swing.GroupLayout.PREFERRED_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_tipopagoLayout.setVerticalGroup(
            btn_tipopagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_tipopagoLayout.createSequentialGroup()
                .addComponent(lbl_tPago)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        content.add(btn_tipopago, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 210, -1));

        lbl_cPeliculas1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_cPeliculas1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cPeliculas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cPeliculas1.setText("Administrador");
        content.add(lbl_cPeliculas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, 20));

        btn_pPelicula.setBackground(new java.awt.Color(83, 85, 96));
        btn_pPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pPeliculaMouseClicked(evt);
            }
        });

        lbl_pelicula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_pelicula.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnPelicula.png"))); // NOI18N

        javax.swing.GroupLayout btn_pPeliculaLayout = new javax.swing.GroupLayout(btn_pPelicula);
        btn_pPelicula.setLayout(btn_pPeliculaLayout);
        btn_pPeliculaLayout.setHorizontalGroup(
            btn_pPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pPeliculaLayout.createSequentialGroup()
                .addComponent(lbl_pelicula)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_pPeliculaLayout.setVerticalGroup(
            btn_pPeliculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pPeliculaLayout.createSequentialGroup()
                .addComponent(lbl_pelicula)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        content.add(btn_pPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 200, -1));

        fldDesde.setBackground(new java.awt.Color(186, 219, 186));
        fldDesde.setForeground(new java.awt.Color(186, 219, 186));
        fldDesde.setToolTipText("Desde");
        content.add(fldDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 200, 35));
        isVisible();

        fldHasta.setBackground(new java.awt.Color(186, 219, 186));
        fldHasta.setForeground(new java.awt.Color(186, 219, 186));
        fldHasta.setToolTipText("Desde");
        content.add(fldHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 190, 35));

        lblDesde.setBackground(new java.awt.Color(255, 255, 255));
        lblDesde.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDesde.setForeground(new java.awt.Color(255, 255, 255));
        lblDesde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesde.setText("Desde");
        content.add(lblDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 200, -1));

        lblHasta.setBackground(new java.awt.Color(255, 255, 255));
        lblHasta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHasta.setForeground(new java.awt.Color(255, 255, 255));
        lblHasta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHasta.setText("Hasta");
        content.add(lblHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 190, -1));

        lblatras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblatras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblatras.setText("<");
        lblatras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblatras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        content.add(lblatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        btn_gReporte.setBackground(new java.awt.Color(83, 85, 96));
        btn_gReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_gReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gReporteMouseClicked(evt);
            }
        });

        lbl_gReporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_gReporte.setForeground(new java.awt.Color(255, 255, 255));
        lbl_gReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_gReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnGenerarReporte.png"))); // NOI18N

        javax.swing.GroupLayout btn_gReporteLayout = new javax.swing.GroupLayout(btn_gReporte);
        btn_gReporte.setLayout(btn_gReporteLayout);
        btn_gReporteLayout.setHorizontalGroup(
            btn_gReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_gReporteLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(lbl_gReporte)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        btn_gReporteLayout.setVerticalGroup(
            btn_gReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_gReporteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_gReporte))
        );

        content.add(btn_gReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 690, -1));

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
        content.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 20, -1, 20));

        btn_close2.setBackground(new java.awt.Color(47, 48, 55));
        btn_close2.setForeground(new java.awt.Color(47, 48, 55));
        btn_close2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close2.setPreferredSize(new java.awt.Dimension(20, 20));
        btn_close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close2MouseClicked(evt);
            }
        });
        btn_close2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_icon.png"))); // NOI18N
        btn_close2.add(close_icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 20, 20));

        content.add(btn_close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 20, 20));

        fondoEncabezado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EncabezadoBackground.png"))); // NOI18N
        content.add(fondoEncabezado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        lblFiltroS.setBackground(new java.awt.Color(255, 255, 255));
        lblFiltroS.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblFiltroS.setForeground(new java.awt.Color(255, 255, 255));
        lblFiltroS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFiltroS.setText("PLACEHOLDER");
        content.add(lblFiltroS, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 376, 710, 80));

        lblfondoTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoTablas.png"))); // NOI18N
        content.add(lblfondoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 790, 500));

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

    private void btn_pSucursalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pSucursalMouseClicked
        lblFiltroS.setText("Sucursal");
        activarFields();
        tipo = 0;
    }//GEN-LAST:event_btn_pSucursalMouseClicked

    private void btn_pPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pPeliculaMouseClicked
        lblFiltroS.setText("Película");
        activarFields();    
        tipo = 1;
    }//GEN-LAST:event_btn_pPeliculaMouseClicked

    private void btn_tipopagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tipopagoMouseClicked
        lblFiltroS.setText("Tipo de Pago");
        activarFields();
        tipo = 2;
    }//GEN-LAST:event_btn_tipopagoMouseClicked

    private void btn_gReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gReporteMouseClicked
                Timestamp desde = new Timestamp(fldDesde.getDate().getTime());
                Timestamp hasta = new Timestamp(fldHasta.getDate().getTime());
        switch (tipo){   
            case 0:
                try {
                generarReporteSucursal(desde, hasta);
            } catch (NegocioException ex) {
                Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
            }
                 break;
            case 1:
                generarReportePelicula(desde, hasta);
                 break;
            case 2:
                generarReporteTipoPago(desde, hasta);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Selecciona un filtro primero");
    }
    }//GEN-LAST:event_btn_gReporteMouseClicked

    private void btn_anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anteriorMouseClicked
        // TODO add your handling code here:
        new FrmMenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_anteriorMouseClicked

    private void btn_close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close1MouseClicked
        dispose();
    }//GEN-LAST:event_btn_close1MouseClicked

    private void btn_close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close2MouseClicked
        dispose();
    }//GEN-LAST:event_btn_close2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_img;
    private javax.swing.JPanel btn_anterior;
    private javax.swing.JPanel btn_close;
    private javax.swing.JPanel btn_close1;
    private javax.swing.JPanel btn_close2;
    private javax.swing.JPanel btn_continuar1;
    private javax.swing.JPanel btn_gReporte;
    private javax.swing.JPanel btn_pPelicula;
    private javax.swing.JPanel btn_pSucursal;
    private javax.swing.JPanel btn_tipopago;
    private javax.swing.JLabel close_icon;
    private javax.swing.JLabel close_icon2;
    private javax.swing.JLabel close_icon3;
    private javax.swing.JPanel content;
    private com.toedter.calendar.JDateChooser fldDesde;
    private com.toedter.calendar.JDateChooser fldHasta;
    private javax.swing.JLabel fondoEncabezado6;
    private javax.swing.JLabel fondoTablas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblFiltroS;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lbl_cPeliculas1;
    private javax.swing.JLabel lbl_continuar1;
    private javax.swing.JLabel lbl_continuar2;
    private javax.swing.JLabel lbl_gReporte;
    private javax.swing.JLabel lbl_pelicula;
    private javax.swing.JLabel lbl_sucursal;
    private javax.swing.JLabel lbl_tPago;
    private javax.swing.JLabel lblatras;
    private javax.swing.JLabel lblfondoTabla;
    private javax.swing.JLabel logo_img;
    // End of variables declaration//GEN-END:variables
}
