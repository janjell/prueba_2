package cl.org.app;

import cl.org.model.Cliente;
import cl.org.model.Data;
import cl.org.model.Estado;
import cl.org.model.Log;
import cl.org.model.TMLog;
import cl.org.model.TMTop;
import cl.org.model.TMVivienda;
import cl.org.model.Usuario;
import cl.org.model.Venta;
import cl.org.model.Vivienda;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import cl.org.model.TMVenta;
import cl.org.model.TMVentasString;
import cl.org.model.VentasString;
import cl.org.model.VistaTop;

/**
 *
 * @author janjel
 */
public class App extends javax.swing.JFrame {

    Data d;
    Logger logger = Logger.getLogger("Logs");
    FileHandler fh;
    private String valorRol;
    private int vRol;
    private int vEst;
    private int lgu = 0;

    public App() {

        try {
            fh = new FileHandler("archivo.log", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        fh.close();

        logger.info("Inicio de Aplicación");

        try {
            d = new Data();
            initComponents();
            setLocationRelativeTo(null);
            //cambiarApariencia();
            cargarTablaLOG();
            cargarTablaViviendas();
            cargarTblventas();
            cargarEstados();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameVendedor = new javax.swing.JFrame();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        frameAdministrador = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtcantPiezas = new javax.swing.JTextField();
        txtCantBaños = new javax.swing.JTextField();
        opCasa = new javax.swing.JRadioButton();
        opDepartamento = new javax.swing.JRadioButton();
        txtValorVivienda = new javax.swing.JTextField();
        opNueva = new javax.swing.JRadioButton();
        opUsada = new javax.swing.JRadioButton();
        btnAceptarVivienda = new javax.swing.JButton();
        btnBorrarDireccion = new javax.swing.JButton();
        btnCantidadPiezas = new javax.swing.JButton();
        btnCantidadBaños = new javax.swing.JButton();
        btnBorrarValor = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cboxEstados = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabLog = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRunVendedor = new javax.swing.JTextField();
        txtNombreVendedor = new javax.swing.JTextField();
        btnAceptarVendedor = new javax.swing.JButton();
        btnBorrarRunVendedor = new javax.swing.JButton();
        btnBorrarNombreVendedor = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        btnListVAoV = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnTopVendedores = new javax.swing.JButton();
        btnTopLogin = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btnListadoCasas = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        btnListadoDepa = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        bgTipovivienda = new javax.swing.ButtonGroup();
        bgNuevaoUsada = new javax.swing.ButtonGroup();
        bgAdministradorOusuario = new javax.swing.ButtonGroup();
        frameCrearCliente = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRunCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtSueldoCliente = new javax.swing.JTextField();
        btnAceptarCliente = new javax.swing.JButton();
        btnBorrarRunCliente = new javax.swing.JButton();
        btnBorrarNombreCliente = new javax.swing.JButton();
        btnborrarSueldoCliente = new javax.swing.JButton();
        frameArrendarOVender = new javax.swing.JFrame();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabviviendas = new javax.swing.JTable();
        lblUpdateEstado = new javax.swing.JLabel();
        btnUpdateEstado = new javax.swing.JButton();
        cboUpdateEstado = new javax.swing.JComboBox();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabPrecio = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabviviendaNOU = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        frameApariencia = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtColorBotones = new javax.swing.JTextField();
        txtColorTextoBotones = new javax.swing.JTextField();
        btnAceptarCambiosApariencia = new javax.swing.JButton();
        frameListaventas = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        btnVolverVentas = new javax.swing.JButton();
        ListaviviendasArrendadasyVendidas = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabviviendasAoV = new javax.swing.JTable();
        topVendedoresVentas = new javax.swing.JFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabTopVendedorVenta = new javax.swing.JTable();
        topLogin = new javax.swing.JFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabTopLoginVendedor = new javax.swing.JTable();
        frameListarDepasString = new javax.swing.JFrame();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaDepartamentoslist = new javax.swing.JTable();
        frameListarCasasString = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaListarCasasString = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblRun = new javax.swing.JLabel();
        btnAceptarSesion = new javax.swing.JButton();
        imgUrizer = new javax.swing.JLabel();
        txtRun = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();

        jLabel14.setText("Nombre:");

        jLabel15.setText("RUN:");

        lblVendedor.setText("...");

        lblPerfil.setText("...");

        jMenu1.setText("Menú");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Crear Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Vivienda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Apariencia");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Cambiar Apariencia");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        frameVendedor.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout frameVendedorLayout = new javax.swing.GroupLayout(frameVendedor.getContentPane());
        frameVendedor.getContentPane().setLayout(frameVendedorLayout);
        frameVendedorLayout.setHorizontalGroup(
            frameVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameVendedorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(frameVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(60, 60, 60)
                .addGroup(frameVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPerfil)
                    .addComponent(lblVendedor))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        frameVendedorLayout.setVerticalGroup(
            frameVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameVendedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(frameVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblVendedor))
                .addGap(18, 18, 18)
                .addGroup(frameVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblPerfil))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrador"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Vivienda"));

        jLabel1.setText("Direccion: ");

        jLabel2.setText("Cantidad de Piezas: ");

        jLabel3.setText("Cantidad de Baños: ");

        jLabel4.setText("Tipo de Vivienda:");

        jLabel5.setText("Valor:");

        jLabel6.setText("La Vivienda se encuentra?");

        bgTipovivienda.add(opCasa);
        opCasa.setText("Casa");

        bgTipovivienda.add(opDepartamento);
        opDepartamento.setText("Departamento");

        bgNuevaoUsada.add(opNueva);
        opNueva.setText("Nueva");

        bgNuevaoUsada.add(opUsada);
        opUsada.setText("Usada");

        btnAceptarVivienda.setText("Aceptar");
        btnAceptarVivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarViviendaActionPerformed(evt);
            }
        });

        btnBorrarDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnBorrarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDireccionActionPerformed(evt);
            }
        });

        btnCantidadPiezas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnCantidadPiezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadPiezasActionPerformed(evt);
            }
        });

        btnCantidadBaños.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnCantidadBaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadBañosActionPerformed(evt);
            }
        });

        btnBorrarValor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnBorrarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarValorActionPerformed(evt);
            }
        });

        jLabel22.setText("Estado: ");

        cboxEstados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(opCasa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opDepartamento))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtValorVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cboxEstados, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCantBaños, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(txtcantPiezas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBorrarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCantidadPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCantidadBaños, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptarVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(opNueva)
                                .addGap(18, 18, 18)
                                .addComponent(opUsada)))))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBorrarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cboxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtcantPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCantidadPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCantBaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCantidadBaños, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(opCasa)
                    .addComponent(opDepartamento))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtValorVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(btnBorrarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opUsada)
                    .addComponent(opNueva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptarVivienda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modulo de Viviendas", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modulo de Restauracion", jPanel4);

        tabLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabLog);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LOG", jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Vendedor"));

        jLabel7.setText("Run: ");

        jLabel8.setText("Nombre: ");

        btnAceptarVendedor.setText("Aceptar");
        btnAceptarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarVendedorActionPerformed(evt);
            }
        });

        btnBorrarRunVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnBorrarRunVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRunVendedorActionPerformed(evt);
            }
        });

        btnBorrarNombreVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnBorrarNombreVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarNombreVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtRunVendedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarRunVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtRunVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBorrarRunVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBorrarNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptarVendedor)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modulo de Creacion", jPanel6);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Listar casas y departamentos vendidos: ");

        btnListar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Listado de Viviendas Arrendadas y Vendidas: ");

        btnListVAoV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnListVAoV.setText("Ver");
        btnListVAoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListVAoVActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Vendedores con más ventas:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Cantidad de inicio de sesión de vendedores:");

        btnTopVendedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTopVendedores.setText("Ver");
        btnTopVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopVendedoresActionPerformed(evt);
            }
        });

        btnTopLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTopLogin.setText("Ver");
        btnTopLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopLoginActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Listado de Ventas de casas: ");

        btnListadoCasas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnListadoCasas.setText("Listado");
        btnListadoCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoCasasActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Listado de Ventas de departamentos: ");

        btnListadoDepa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnListadoDepa.setText("Listado");
        btnListadoDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoDepaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(96, 96, 96)
                        .addComponent(btnListadoDepa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnListadoCasas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListVAoV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTopVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTopLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(89, 89, 89))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(btnListar))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(btnListVAoV))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(btnTopVendedores))
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(btnTopLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(btnListadoCasas))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(btnListadoDepa))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estadisticas", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        frameAdministrador.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout frameAdministradorLayout = new javax.swing.GroupLayout(frameAdministrador.getContentPane());
        frameAdministrador.getContentPane().setLayout(frameAdministradorLayout);
        frameAdministradorLayout.setHorizontalGroup(
            frameAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameAdministradorLayout.setVerticalGroup(
            frameAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel9.setText("Run: ");

        jLabel10.setText("Nombre: ");

        jLabel11.setText("Sueldo: ");

        txtSueldoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoClienteActionPerformed(evt);
            }
        });

        btnAceptarCliente.setText("Aceptar");
        btnAceptarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarClienteActionPerformed(evt);
            }
        });

        btnBorrarRunCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnBorrarRunCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRunClienteActionPerformed(evt);
            }
        });

        btnBorrarNombreCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnBorrarNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarNombreClienteActionPerformed(evt);
            }
        });

        btnborrarSueldoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnborrarSueldoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarSueldoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRunCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSueldoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarRunCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnborrarSueldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(184, 184, 184))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBorrarRunCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(txtRunCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBorrarNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtSueldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnborrarSueldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnAceptarCliente)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameCrearClienteLayout = new javax.swing.GroupLayout(frameCrearCliente.getContentPane());
        frameCrearCliente.getContentPane().setLayout(frameCrearClienteLayout);
        frameCrearClienteLayout.setHorizontalGroup(
            frameCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameCrearClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        frameCrearClienteLayout.setVerticalGroup(
            frameCrearClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameCrearClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        tabviviendas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabviviendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabviviendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabviviendas);

        lblUpdateEstado.setText("Actualizar Estado:");

        btnUpdateEstado.setText("Aceptar");
        btnUpdateEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEstadoActionPerformed(evt);
            }
        });

        cboUpdateEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUpdateEstado)
                    .addComponent(cboUpdateEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(lblUpdateEstado)
                        .addGap(11, 11, 11)
                        .addComponent(cboUpdateEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdateEstado))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTabbedPane2.addTab("Arrendar o Vender", jPanel13);

        tabPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tabPrecio);

        jButton4.setText("ascendente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("descendente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane2.addTab("Lista de Viviendas", jPanel14);

        jLabel18.setText("Viviendas nuevas o Usadas");

        tabviviendaNOU.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(tabviviendaNOU);

        jButton1.setText("Nueva");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Usada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton1)
                        .addGap(129, 129, 129)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jTabbedPane2.addTab("Viviendas", jPanel15);

        javax.swing.GroupLayout frameArrendarOVenderLayout = new javax.swing.GroupLayout(frameArrendarOVender.getContentPane());
        frameArrendarOVender.getContentPane().setLayout(frameArrendarOVenderLayout);
        frameArrendarOVenderLayout.setHorizontalGroup(
            frameArrendarOVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameArrendarOVenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameArrendarOVenderLayout.setVerticalGroup(
            frameArrendarOVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameArrendarOVenderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameArrendarOVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(frameArrendarOVenderLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cambiar Apariencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel12.setText("Cambiar Color de Botones: ");

        jLabel13.setText("Cambiar Texto de Botones:");

        btnAceptarCambiosApariencia.setText("Aceptar Cambios");
        btnAceptarCambiosApariencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCambiosAparienciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtColorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtColorTextoBotones))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnAceptarCambiosApariencia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtColorBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtColorTextoBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnAceptarCambiosApariencia)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout frameAparienciaLayout = new javax.swing.GroupLayout(frameApariencia.getContentPane());
        frameApariencia.getContentPane().setLayout(frameAparienciaLayout);
        frameAparienciaLayout.setHorizontalGroup(
            frameAparienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAparienciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameAparienciaLayout.setVerticalGroup(
            frameAparienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAparienciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblVentas);

        btnVolverVentas.setText("Volver");
        btnVolverVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameListaventasLayout = new javax.swing.GroupLayout(frameListaventas.getContentPane());
        frameListaventas.getContentPane().setLayout(frameListaventasLayout);
        frameListaventasLayout.setHorizontalGroup(
            frameListaventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameListaventasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameListaventasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverVentas)
                .addContainerGap())
        );
        frameListaventasLayout.setVerticalGroup(
            frameListaventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameListaventasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolverVentas)
                .addContainerGap())
        );

        tabviviendasAoV.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tabviviendasAoV);

        javax.swing.GroupLayout ListaviviendasArrendadasyVendidasLayout = new javax.swing.GroupLayout(ListaviviendasArrendadasyVendidas.getContentPane());
        ListaviviendasArrendadasyVendidas.getContentPane().setLayout(ListaviviendasArrendadasyVendidasLayout);
        ListaviviendasArrendadasyVendidasLayout.setHorizontalGroup(
            ListaviviendasArrendadasyVendidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListaviviendasArrendadasyVendidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        ListaviviendasArrendadasyVendidasLayout.setVerticalGroup(
            ListaviviendasArrendadasyVendidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaviviendasArrendadasyVendidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabTopVendedorVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tabTopVendedorVenta);

        javax.swing.GroupLayout topVendedoresVentasLayout = new javax.swing.GroupLayout(topVendedoresVentas.getContentPane());
        topVendedoresVentas.getContentPane().setLayout(topVendedoresVentasLayout);
        topVendedoresVentasLayout.setHorizontalGroup(
            topVendedoresVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topVendedoresVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        topVendedoresVentasLayout.setVerticalGroup(
            topVendedoresVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topVendedoresVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabTopLoginVendedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tabTopLoginVendedor);

        javax.swing.GroupLayout topLoginLayout = new javax.swing.GroupLayout(topLogin.getContentPane());
        topLogin.getContentPane().setLayout(topLoginLayout);
        topLoginLayout.setHorizontalGroup(
            topLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        topLoginLayout.setVerticalGroup(
            topLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLoginLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas departamentos"));

        tablaDepartamentoslist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(tablaDepartamentoslist);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameListarDepasStringLayout = new javax.swing.GroupLayout(frameListarDepasString.getContentPane());
        frameListarDepasString.getContentPane().setLayout(frameListarDepasStringLayout);
        frameListarDepasStringLayout.setHorizontalGroup(
            frameListarDepasStringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameListarDepasStringLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameListarDepasStringLayout.setVerticalGroup(
            frameListarDepasStringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameListarDepasStringLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Casas"));

        tablaListarCasasString.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(tablaListarCasasString);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameListarCasasStringLayout = new javax.swing.GroupLayout(frameListarCasasString.getContentPane());
        frameListarCasasString.getContentPane().setLayout(frameListarCasasStringLayout);
        frameListarCasasStringLayout.setHorizontalGroup(
            frameListarCasasStringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameListarCasasStringLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameListarCasasStringLayout.setVerticalGroup(
            frameListarCasasStringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameListarCasasStringLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iniciar Sesion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblRun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRun.setText("RUN:");

        btnAceptarSesion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAceptarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/images/iniciar.png"))); // NOI18N
        btnAceptarSesion.setText("Ingresar");
        btnAceptarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarSesionActionPerformed(evt);
            }
        });

        imgUrizer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUrizer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/images/logo_10.png"))); // NOI18N
        imgUrizer.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgUrizer.setAlignmentY(0.0F);
        imgUrizer.setAutoscrolls(true);
        imgUrizer.setOpaque(true);
        imgUrizer.setPreferredSize(new java.awt.Dimension(90, 40));

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/org/app/borrador.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRun)
                        .addGap(8, 8, 8)
                        .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAceptarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgUrizer, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRun)
                            .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(btnAceptarSesion))
                    .addComponent(imgUrizer, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarSesionActionPerformed
        try {
            String run;

            run = txtRun.getText();

            if (run.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Casilla RUN vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                txtRun.requestFocus();
                logger.info("Error de Ingreso: RUN Vacío.");
            } else if (d.existeUsuario(run) == 0) {
                JOptionPane.showMessageDialog(null, "El RUN Ingresado no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                logger.info("Error de Ingreso: RUN Inexistente.");
                txtRun.requestFocus();
            } else {
                //Validar si es admin o no

                int verif = d.verificarPersona(run);

                if (verif == 1) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    frameAdministrador.setVisible(true);
                    frameAdministrador.setBounds(0, 0, 600, 500);
                    frameAdministrador.setLocationRelativeTo(this);
                    frameVendedor.setVisible(false);
                    cargarEstados();
                    logger.info("Login de Administrador.");
                } else {
                    JOptionPane.showMessageDialog(null, "Bienvenido Vendedor", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                    Usuario u;
                    u = d.getUsuarioNombre(run);
                    lblPerfil.setText(run);
                    String nombre = d.getUsuarioNombre(run).toString();
                    lblVendedor.setText(nombre);

                    frameVendedor.setVisible(true);
                    frameVendedor.setBounds(0, 0, 600, 500);
                    frameVendedor.setLocationRelativeTo(this);
                    frameAdministrador.setVisible(false);

                    d.crearLog("Login de Vendedor", run, nombre);

                    logger.info("Login de Vendedor");

                }
            }

            txtRun.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(App.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarSesionActionPerformed

    private void btnAceptarViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarViviendaActionPerformed
        try {
            Vivienda v = new Vivienda();

            v.setDireccion(txtDireccion.getText());

            Estado es;
            //obtengo el valor del indice seleccionad
            int estado;
            es = (Estado) cboxEstados.getSelectedItem();//-->CASTEO
            estado = es.getId();

            v.setEstado(estado);

            v.setCantPiezas(Integer.parseInt(txtcantPiezas.getText()));

            v.setCantBanos(Integer.parseInt(txtCantBaños.getText()));

            if (opCasa.isSelected()) {
                v.setTipoVivienda(1);
            } else {
                v.setTipoVivienda(2);
            }

            v.setPrecio(Integer.parseInt(txtValorVivienda.getText()));

            if (opNueva.isSelected()) {
                v.setNuevo(true);
            } else {
                v.setNuevo(false);
            }

            d.crearVivienda(v);

            logger.info("Se crea una vivienda nueva.");

            txtRun.setText("");
            txtDireccion.setText("");
            txtcantPiezas.setText("");
            txtCantBaños.setText("");
            txtValorVivienda.setText("");
            txtRun.requestFocus();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_btnAceptarViviendaActionPerformed

    private void btnAceptarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarVendedorActionPerformed
        try {
            Usuario u = new Usuario();

            u.setRun(txtRunVendedor.getText());
            u.setNombre(txtNombreVendedor.getText());

            u.setAdministrador(false);

            d.crearUsuario(u);

            logger.info("Se crea un usuario.");

            txtRunVendedor.setText("");
            txtNombreVendedor.setText("");
            txtRunVendedor.requestFocus();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btnAceptarVendedorActionPerformed

    private void txtSueldoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoClienteActionPerformed

    }//GEN-LAST:event_txtSueldoClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frameCrearCliente.setVisible(true);
        frameCrearCliente.setBounds(550, 100, 300, 400);
        logger.info("Ajuste de frame crear cliente.");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        frameApariencia.setVisible(true);
        frameApariencia.setBounds(100, 100, 600, 500);
        logger.info("Ajuste de frame apariencia.");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnAceptarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarClienteActionPerformed
        try {
            Cliente cl = new Cliente();

            cl.setRun(txtRunCliente.getText());
            cl.setNombre(txtNombreCliente.getText());
            cl.setSueldo(Integer.parseInt(txtSueldoCliente.getText()));

            d.crearCliente(cl);

            logger.info("Se crea cliente.");

            txtRunCliente.setText("");
            txtNombreCliente.setText("");
            txtSueldoCliente.setText("");
            txtRunVendedor.requestFocus();

            cargarTablaLOG();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_btnAceptarClienteActionPerformed

    private void btnAceptarCambiosAparienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCambiosAparienciaActionPerformed
        try {
            Properties prop = new Properties();
            prop.load(new FileReader("../cl.org.model/propierties.config"));

            String cb, cbt;

            cb = txtColorBotones.getText();
            cbt = txtColorTextoBotones.getText();

            prop.put("Color Botones:", cb);
            prop.put("Color Texto Botones", cbt);

            prop.setProperty("Color Botones:", cb);
            prop.setProperty("Color Texto Botones", cbt);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class
                    .getName()).log(Level.SEVERE, null, ex);
            logger.info("El archivo properties no existe.");

        } catch (IOException ex) {
            Logger.getLogger(App.class
                    .getName()).log(Level.SEVERE, null, ex);
            logger.info("¿ Error ?");
        }

        logger.info("Configuración de Apariencia guardada.");

    }//GEN-LAST:event_btnAceptarCambiosAparienciaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frameArrendarOVender.setVisible(true);
        frameArrendarOVender.setBounds(100, 100, 800, 450);
        logger.info("Ajuste de frame Arrendar o vender.");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtRun.setText("");
        txtRun.requestFocus();
        logger.info("Borrado de textfield run.");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBorrarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDireccionActionPerformed
        txtDireccion.setText("");
        txtDireccion.requestFocus();
        logger.info("Borrado de textfield dirección.");
    }//GEN-LAST:event_btnBorrarDireccionActionPerformed

    private void btnCantidadPiezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadPiezasActionPerformed
        txtcantPiezas.setText("");
        txtcantPiezas.requestFocus();
        logger.info("Borrado de textfield piezas");
    }//GEN-LAST:event_btnCantidadPiezasActionPerformed

    private void btnCantidadBañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadBañosActionPerformed
        txtCantBaños.setText("");
        txtCantBaños.requestFocus();
        logger.info("Borrado de textfield cantidad de baños");
    }//GEN-LAST:event_btnCantidadBañosActionPerformed

    private void btnBorrarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarValorActionPerformed
        txtValorVivienda.setText("");
        txtValorVivienda.requestFocus();
        logger.info("Borrado de textfield valor de vivienda");
    }//GEN-LAST:event_btnBorrarValorActionPerformed

    private void btnBorrarRunClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRunClienteActionPerformed
        txtRunCliente.setText("");
        txtRunCliente.requestFocus();
        logger.info("Borrado de textfield run de cliente.");
    }//GEN-LAST:event_btnBorrarRunClienteActionPerformed

    private void btnBorrarNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarNombreClienteActionPerformed
        txtNombreCliente.setText("");
        txtNombreCliente.requestFocus();
        logger.info("Borrado de textfield nombre de cliente.");
    }//GEN-LAST:event_btnBorrarNombreClienteActionPerformed

    private void btnborrarSueldoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarSueldoClienteActionPerformed
        txtSueldoCliente.setText("");
        txtSueldoCliente.requestFocus();
        logger.info("Borrado de textfield sueldo de cliente");
    }//GEN-LAST:event_btnborrarSueldoClienteActionPerformed

    private void btnBorrarRunVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRunVendedorActionPerformed
        txtRunVendedor.setText("");
        txtRunVendedor.requestFocus();
        logger.info("Borrado de textfield run de vendedor");
    }//GEN-LAST:event_btnBorrarRunVendedorActionPerformed

    private void btnBorrarNombreVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarNombreVendedorActionPerformed
        txtNombreVendedor.setText("");
        txtNombreVendedor.requestFocus();
        logger.info("Borrado de textfield nombre vendedor");
    }//GEN-LAST:event_btnBorrarNombreVendedorActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        frameAdministrador.setVisible(false);
        frameListaventas.setVisible(true);
        frameListaventas.setBounds(0, 0, 500, 400);
        frameListaventas.setLocationRelativeTo(this);
        cargarTblventas();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnVolverVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverVentasActionPerformed
        frameAdministrador.setVisible(true);
        frameListaventas.setVisible(false);
    }//GEN-LAST:event_btnVolverVentasActionPerformed

    private void btnListVAoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListVAoVActionPerformed
        CargarTablasVendidasArrendadas();
        ListaviviendasArrendadasyVendidas.setVisible(true);
        ListaviviendasArrendadasyVendidas.setBounds(0, 0, 500, 400);
        ListaviviendasArrendadasyVendidas.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnListVAoVActionPerformed

    private void btnTopVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopVendedoresActionPerformed
        cargarTablaTopVentas();
        topVendedoresVentas.setVisible(true);
        topVendedoresVentas.setBounds(0, 0, 500, 400);
        topVendedoresVentas.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnTopVendedoresActionPerformed

    private void btnTopLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopLoginActionPerformed
        cargarTablaTopLogins();
        topLogin.setVisible(true);
        topLogin.setBounds(0, 0, 500, 400);
        topLogin.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnTopLoginActionPerformed

    private void btnListadoCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoCasasActionPerformed
        cargarTblventasStringCas();
        frameListarCasasString.setVisible(true);
        
        frameListarCasasString.setBounds(0, 0, 500, 400);
        frameListarCasasString.setLocationRelativeTo(this);

    }//GEN-LAST:event_btnListadoCasasActionPerformed

    private void btnListadoDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoDepaActionPerformed
        cargarTblventasStringDep();
        frameListarDepasString.setVisible(true);
        
                
        frameListarDepasString.setBounds(0, 0, 500, 400);
        frameListarDepasString.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_btnListadoDepaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cargarTablaPrecioDesc();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cargarTablaPrecioasc();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnUpdateEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEstadoActionPerformed

        int estado = (cboUpdateEstado.getSelectedIndex() + 1);

        System.out.println(estado);

        try {
            d.updEstadoVivienda(estado, vRol);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnUpdateEstadoActionPerformed

    private void tabviviendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabviviendasMouseClicked
        if (evt.getClickCount() == 2) {
            System.out.println("Se ha hecho doble click");
            int row = tabviviendas.getSelectedRow();
            int rolCol = 0;
            // System.out.println(row);

            TMVivienda produc = (TMVivienda) tabviviendas.getModel();
            Vivienda v = produc.getViviendas(row);

            valorRol = tabviviendas.getModel().getValueAt(row, rolCol).toString();

            System.out.println("Valor de Rol: " + valorRol);

            try {
                vRol = Integer.parseInt(valorRol);
                vEst = d.getVivendaEstado(vRol);
                System.out.println("Estado Vivienda INT: " + vEst);
                cboUpdateEstado.setSelectedIndex(vEst - 1);
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_tabviviendasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarTblviviedasNuevas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       cargarTblviviedasUsadas();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ListaviviendasArrendadasyVendidas;
    private javax.swing.ButtonGroup bgAdministradorOusuario;
    private javax.swing.ButtonGroup bgNuevaoUsada;
    private javax.swing.ButtonGroup bgTipovivienda;
    private javax.swing.JButton btnAceptarCambiosApariencia;
    private javax.swing.JButton btnAceptarCliente;
    private javax.swing.JButton btnAceptarSesion;
    private javax.swing.JButton btnAceptarVendedor;
    private javax.swing.JButton btnAceptarVivienda;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarDireccion;
    private javax.swing.JButton btnBorrarNombreCliente;
    private javax.swing.JButton btnBorrarNombreVendedor;
    private javax.swing.JButton btnBorrarRunCliente;
    private javax.swing.JButton btnBorrarRunVendedor;
    private javax.swing.JButton btnBorrarValor;
    private javax.swing.JButton btnCantidadBaños;
    private javax.swing.JButton btnCantidadPiezas;
    private javax.swing.JButton btnListVAoV;
    private javax.swing.JButton btnListadoCasas;
    private javax.swing.JButton btnListadoDepa;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnTopLogin;
    private javax.swing.JButton btnTopVendedores;
    private javax.swing.JButton btnUpdateEstado;
    private javax.swing.JButton btnVolverVentas;
    private javax.swing.JButton btnborrarSueldoCliente;
    private javax.swing.JComboBox cboUpdateEstado;
    private javax.swing.JComboBox cboxEstados;
    private javax.swing.JFrame frameAdministrador;
    private javax.swing.JFrame frameApariencia;
    private javax.swing.JFrame frameArrendarOVender;
    private javax.swing.JFrame frameCrearCliente;
    private javax.swing.JFrame frameListarCasasString;
    private javax.swing.JFrame frameListarDepasString;
    private javax.swing.JFrame frameListaventas;
    private javax.swing.JFrame frameVendedor;
    private javax.swing.JLabel imgUrizer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblRun;
    private javax.swing.JLabel lblUpdateEstado;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JRadioButton opCasa;
    private javax.swing.JRadioButton opDepartamento;
    private javax.swing.JRadioButton opNueva;
    private javax.swing.JRadioButton opUsada;
    private javax.swing.JTable tabLog;
    private javax.swing.JTable tabPrecio;
    private javax.swing.JTable tabTopLoginVendedor;
    private javax.swing.JTable tabTopVendedorVenta;
    private javax.swing.JTable tablaDepartamentoslist;
    private javax.swing.JTable tablaListarCasasString;
    private javax.swing.JTable tabviviendaNOU;
    private javax.swing.JTable tabviviendas;
    private javax.swing.JTable tabviviendasAoV;
    private javax.swing.JTable tblVentas;
    private javax.swing.JFrame topLogin;
    private javax.swing.JFrame topVendedoresVentas;
    private javax.swing.JTextField txtCantBaños;
    private javax.swing.JTextField txtColorBotones;
    private javax.swing.JTextField txtColorTextoBotones;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreVendedor;
    private javax.swing.JTextField txtRun;
    private javax.swing.JTextField txtRunCliente;
    private javax.swing.JTextField txtRunVendedor;
    private javax.swing.JTextField txtSueldoCliente;
    private javax.swing.JTextField txtValorVivienda;
    private javax.swing.JTextField txtcantPiezas;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaViviendas() {
        try {
            List<Vivienda> viviendas = d.verViviendasParaArrendarOvender();
            TMVivienda tabla = new TMVivienda(viviendas);
            tabviviendas.setModel(tabla);//nombre de la tabla  
            logger.info("Se carga tabla viviendas.");

        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cargarTblventas() {
        try {
            List<Venta> ventas = d.verVentas();
            TMVenta model = new TMVenta(ventas);
            tblVentas.setModel(model);
            logger.info("Se carga tabla ventas.");
        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarEstados() {
        try {
            List<Estado> estados = d.getEstados();
            cboxEstados.removeAllItems();
            cboUpdateEstado.removeAllItems();
            for (Estado e : estados) {
                cboxEstados.addItem(e);
                cboUpdateEstado.addItem(e);
                logger.info("Se añaden item de estados.");

            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cargarTablaLOG() {
        try {
            List<Log> historial = d.getLog();
            TMLog model = new TMLog(historial);
            tabLog.setModel(model);
            logger.info("Se carga tabla historial.");
        } catch (SQLException ex) {
            Logger.getLogger(Log.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void CargarTablasVendidasArrendadas() {
        try {
            List<Vivienda> viviendas = d.verViviendasArrendadasyVendidas();
            TMVivienda tabla = new TMVivienda(viviendas);
            tabviviendasAoV.setModel(tabla);//nombre de la tabla  
            logger.info("Se carga tabla viviendas arrendadas.");

        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarTablaPrecioDesc() {
        try {
            List<Vivienda> viviendas = d.verViviendasPrecioDesc();
            TMVivienda tabla = new TMVivienda(viviendas);
            tabPrecio.setModel(tabla);//nombre de la tabla  
            logger.info("Se carga tabla viviendas desc.");

        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cargarTablaPrecioasc() {
        try {
            List<Vivienda> viviendas = d.verViviendasPrecioAsc();
            TMVivienda tabla = new TMVivienda(viviendas);
            tabPrecio.setModel(tabla);//nombre de la tabla  
            logger.info("Se carga tabla viviendas asc.");

        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cargarTablaTopVentas() {
        try {
            List<VistaTop> topVentas = d.verTopVentas();
            TMTop model = new TMTop(topVentas);
            tabTopVendedorVenta.setModel(model);
            logger.info("Se carga tabla top ventas.");
        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarTablaTopLogins() {
        try {
            List<Log> topLogin = d.verTopLogin();
            TMLog model = new TMLog(topLogin);
            tabTopLoginVendedor.setModel(model);
            logger.info("Se carga la tabla top logins.");
        } catch (SQLException ex) {
            Logger.getLogger(Log.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarTblventasStringCas() {
        try {
            List<VentasString> ven = d.cantidadCasasVendidas();
            TMVentasString model = new TMVentasString(ven);
            tablaListarCasasString.setModel(model);
            logger.info("Se carga tabla ventasString");
        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarTblventasStringDep() {
         try {
            List<VentasString> ven = d.cantidadDepartamentoVendidossjkda();
            TMVentasString model = new TMVentasString(ven);
            tablaDepartamentoslist.setModel(model);
            logger.info("Se carga tabla ventasString");
        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void cargarTblviviedasNuevas() {
         try {
            List<VentasString> ven = d.viviendasNuevas();
            TMVentasString model = new TMVentasString(ven);
            tabviviendaNOU.setModel(model);
            logger.info("Se carga tabla ventasString");
        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cargarTblviviedasUsadas() {
         try {
            List<VentasString> ven = d.viviendasUsadas();
            TMVentasString model = new TMVentasString(ven);
            tabviviendaNOU.setModel(model);
            logger.info("Se carga tabla ventasString");
        } catch (SQLException ex) {
            Logger.getLogger(Vivienda.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

}
