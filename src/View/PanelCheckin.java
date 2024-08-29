
package View;

import Model.Registro;
import Model.RegistroHuesped;
import Model.Habitacion;
import Model.Servicio;

import java.time.LocalDate;
import java.time.ZoneId;

import java.util.Date;
import java.util.List;
import static java.util.concurrent.TimeUnit.DAYS;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class PanelCheckin extends javax.swing.JPanel {
     enum TypeProcess {
        CHECKIN,
        RESERVA
            ;
    }
  
    public PanelCheckin() {
        initComponents();     
        initData();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PageReserva = new javax.swing.JPanel();
        PanelHabitaciones = new javax.swing.JPanel();
        btnconsultar = new javax.swing.JButton();
        s1 = new javax.swing.JScrollPane();
        Tablahabitaciones = new javax.swing.JTable();
        lblTipo = new javax.swing.JLabel();
        ComboTipo = new javax.swing.JComboBox<>();
        lblDateIni = new javax.swing.JLabel();
        Jdateini = new com.toedter.calendar.JDateChooser();
        lblDateEnd = new javax.swing.JLabel();
        Jdateend = new com.toedter.calendar.JDateChooser();
        lblDateEnd1 = new javax.swing.JLabel();
        Numdays = new javax.swing.JLabel();
        Panelhuespedes = new javax.swing.JPanel();
        txtnumroom = new javax.swing.JTextField();
        lblPiso = new javax.swing.JLabel();
        txtpiso = new javax.swing.JTextField();
        lbltipo = new javax.swing.JLabel();
        txttipohab = new javax.swing.JTextField();
        lblNumper = new javax.swing.JLabel();
        txtnumper = new javax.swing.JTextField();
        lblvalor = new javax.swing.JLabel();
        lblContacto = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        lblphone = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        txtAbono = new javax.swing.JTextField();
        lblvalortotal1 = new javax.swing.JLabel();
        txtvalorfalta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtvalortotal = new javax.swing.JTextField();
        lblvalorabono1 = new javax.swing.JLabel();
        lblvalor1 = new javax.swing.JLabel();
        txtvalornoche = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tablahuespedes = new javax.swing.JTable();
        btnContacto = new javax.swing.JButton();
        btncrear = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(717, 517));

        PageReserva.setBackground(new java.awt.Color(234, 234, 213));
        PageReserva.setMinimumSize(new java.awt.Dimension(700, 500));
        PageReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelHabitaciones.setBackground(new java.awt.Color(234, 234, 213));
        PanelHabitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelHabitaciones.setPreferredSize(new java.awt.Dimension(690, 180));
        PanelHabitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnconsultar.setBackground(new java.awt.Color(21, 95, 130));
        btnconsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnconsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnconsultar.setText("Consultar");
        btnconsultar.setToolTipText("");
        btnconsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        PanelHabitaciones.add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 90, 30));

        Tablahabitaciones.setAutoCreateRowSorter(true);
        Tablahabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Piso", "Tipo", "NoPersonas", "Valor x persona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tablahabitaciones.setName(""); // NOI18N
        Tablahabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablahabitacionesMouseClicked(evt);
            }
        });
        s1.setViewportView(Tablahabitaciones);
        if (Tablahabitaciones.getColumnModel().getColumnCount() > 0) {
            Tablahabitaciones.getColumnModel().getColumn(1).setPreferredWidth(50);
            Tablahabitaciones.getColumnModel().getColumn(2).setPreferredWidth(100);
            Tablahabitaciones.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        PanelHabitaciones.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 400, 150));

        lblTipo.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblTipo.setText("Tipo");
        PanelHabitaciones.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 13, -1, -1));

        ComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoActionPerformed(evt);
            }
        });
        PanelHabitaciones.add(ComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 9, 130, -1));

        lblDateIni.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblDateIni.setText("Fecha Inicial");
        PanelHabitaciones.add(lblDateIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        Jdateini.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JdateiniPropertyChange(evt);
            }
        });
        Jdateini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JdateiniKeyTyped(evt);
            }
        });
        Jdateini.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                JdateiniVetoableChange(evt);
            }
        });
        PanelHabitaciones.add(Jdateini, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, -1));

        lblDateEnd.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblDateEnd.setText("Fecha Final");
        PanelHabitaciones.add(lblDateEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        Jdateend.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JdateendPropertyChange(evt);
            }
        });
        PanelHabitaciones.add(Jdateend, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, -1));

        lblDateEnd1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblDateEnd1.setText("Numero de Dias");
        PanelHabitaciones.add(lblDateEnd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        Numdays.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        Numdays.setForeground(new java.awt.Color(0, 51, 255));
        Numdays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Numdays.setText("0");
        PanelHabitaciones.add(Numdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 50, 30));

        PageReserva.add(PanelHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 180));

        Panelhuespedes.setBackground(new java.awt.Color(232, 232, 232));
        Panelhuespedes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panelhuespedes.setForeground(new java.awt.Color(204, 204, 204));
        Panelhuespedes.setPreferredSize(new java.awt.Dimension(690, 261));
        Panelhuespedes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnumroom.setEditable(false);
        txtnumroom.setBackground(new java.awt.Color(238, 238, 218));
        txtnumroom.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtnumroom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumroomActionPerformed(evt);
            }
        });
        Panelhuespedes.add(txtnumroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 68, -1));

        lblPiso.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblPiso.setText("Piso");
        Panelhuespedes.add(lblPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        txtpiso.setEditable(false);
        txtpiso.setBackground(new java.awt.Color(238, 238, 218));
        txtpiso.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtpiso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpisoActionPerformed(evt);
            }
        });
        Panelhuespedes.add(txtpiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 83, -1));

        lbltipo.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lbltipo.setText("Tipo");
        Panelhuespedes.add(lbltipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        txttipohab.setEditable(false);
        txttipohab.setBackground(new java.awt.Color(238, 238, 218));
        txttipohab.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txttipohab.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttipohab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipohabActionPerformed(evt);
            }
        });
        Panelhuespedes.add(txttipohab, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 127, -1));

        lblNumper.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumper.setText(" personas");
        Panelhuespedes.add(lblNumper, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        txtnumper.setEditable(false);
        txtnumper.setBackground(new java.awt.Color(238, 238, 218));
        txtnumper.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtnumper.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumper.setText("0");
        txtnumper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumperActionPerformed(evt);
            }
        });
        Panelhuespedes.add(txtnumper, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 55, -1));

        lblvalor.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblvalor.setText("Valor Total");
        Panelhuespedes.add(lblvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        lblContacto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto.setText("Contacto:");
        Panelhuespedes.add(lblContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtContacto.setEditable(false);
        txtContacto.setBackground(new java.awt.Color(232, 232, 232));
        txtContacto.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoActionPerformed(evt);
            }
        });
        Panelhuespedes.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 300, 30));

        lblphone.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblphone.setText("Telefono");
        Panelhuespedes.add(lblphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        txtphone.setEditable(false);
        txtphone.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtphone.setForeground(new java.awt.Color(0, 102, 153));
        txtphone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        txtphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtphoneKeyTyped(evt);
            }
        });
        Panelhuespedes.add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, -1));

        txtAbono.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        txtAbono.setForeground(new java.awt.Color(102, 102, 102));
        txtAbono.setText("0");
        txtAbono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAbonoFocusLost(evt);
            }
        });
        txtAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAbonoActionPerformed(evt);
            }
        });
        txtAbono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAbonoKeyTyped(evt);
            }
        });
        Panelhuespedes.add(txtAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 120, 30));

        lblvalortotal1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblvalortotal1.setText("Saldo");
        Panelhuespedes.add(lblvalortotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, 21));

        txtvalorfalta.setEditable(false);
        txtvalorfalta.setBackground(new java.awt.Color(232, 232, 232));
        txtvalorfalta.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        txtvalorfalta.setForeground(new java.awt.Color(0, 102, 153));
        txtvalorfalta.setText("0");
        txtvalorfalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorfaltaActionPerformed(evt);
            }
        });
        Panelhuespedes.add(txtvalorfalta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 120, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Panelhuespedes.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 690, 10));

        txtvalortotal.setEditable(false);
        txtvalortotal.setBackground(new java.awt.Color(238, 238, 218));
        txtvalortotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtvalortotal.setText("0");
        txtvalortotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtvalortotalKeyReleased(evt);
            }
        });
        Panelhuespedes.add(txtvalortotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 120, -1));

        lblvalorabono1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblvalorabono1.setText("Abono");
        Panelhuespedes.add(lblvalorabono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        lblvalor1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblvalor1.setText("Valor Noche");
        Panelhuespedes.add(lblvalor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        txtvalornoche.setEditable(false);
        txtvalornoche.setBackground(new java.awt.Color(238, 238, 218));
        txtvalornoche.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtvalornoche.setForeground(new java.awt.Color(255, 102, 102));
        txtvalornoche.setText("0");
        txtvalornoche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtvalornocheKeyReleased(evt);
            }
        });
        Panelhuespedes.add(txtvalornoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Habitacion");
        Panelhuespedes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        PageReserva.add(Panelhuespedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 690, 140));

        btnLimpiar.setBackground(new java.awt.Color(21, 95, 130));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PageReserva.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 100, 30));

        btnProcesar.setBackground(new java.awt.Color(21, 95, 130));
        btnProcesar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesar.setText("Realizar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        PageReserva.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 100, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablahuespedes.setBackground(new java.awt.Color(204, 204, 204));
        Tablahuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "identificacion", "telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tablahuespedes.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tablahuespedes.setSelectionForeground(new java.awt.Color(51, 51, 51));
        Tablahuespedes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tablahuespedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablahuespedesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tablahuespedes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 430, 100));

        btnContacto.setBackground(new java.awt.Color(21, 95, 130));
        btnContacto.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnContacto.setForeground(new java.awt.Color(255, 255, 255));
        btnContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuario.png"))); // NOI18N
        btnContacto.setToolTipText("Contacto");
        btnContacto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactoActionPerformed(evt);
            }
        });
        jPanel1.add(btnContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 80, 40));

        btncrear.setBackground(new java.awt.Color(21, 95, 130));
        btncrear.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btncrear.setForeground(new java.awt.Color(255, 255, 255));
        btncrear.setText("Crear");
        btncrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });
        jPanel1.add(btncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 70, 30));

        btnBorrar.setBackground(new java.awt.Color(21, 95, 130));
        btnBorrar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 70, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("HUESPEDES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Contacto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        PageReserva.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 690, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PageReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PageReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

     private void initData(){

        ComboTipo.addItem(PanelCheckin.TypeProcess.CHECKIN.name());
        ComboTipo.addItem(PanelCheckin.TypeProcess.RESERVA.name());
        
        LocalDate x = LocalDate.now();
        Date fecha_actual = Date.from(x.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());  
        Jdateini.setMinSelectableDate(fecha_actual);
        Tablahabitaciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        centercolumns();
    }
    private void centercolumns(){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        Tablahabitaciones.getColumnModel().getColumn(0).setCellRenderer(tcr);
        Tablahabitaciones.getColumnModel().getColumn(1).setCellRenderer(tcr);        
        Tablahabitaciones.getColumnModel().getColumn(2).setCellRenderer(tcr);
        Tablahabitaciones.getColumnModel().getColumn(3).setCellRenderer(tcr);    
    }
    
    private void FillTablerooms(){
        Servicio objregroom = new Servicio();        
        Date fecha1 = Jdateini.getDate(); //Logger.getLogger(PanelCheckin.class.getName()).log(Level.SEVERE, null, ex);
        Date fecha2 = Jdateend.getDate();
        LocalDate startA = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endA = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<Habitacion> regroom = objregroom.ConsultaHabitacionesDisponibles( startA , endA);
        // retorna una lista con los disponibles.
        var model = (DefaultTableModel) Tablahabitaciones.getModel();
        CleanTablerooms();
        for(Habitacion obj: regroom ){
            model.addRow(new Object[]{
                obj.getnumero(), obj.getpiso(), obj.gettipo(), obj.getnum_personas(), obj.getprecio()
            });
        }//ese for agrega lo de la lista a la tabla
    }
    
    private boolean Info_Huespedescompleta(){

        int row2 = Tablahuespedes.getRowCount();
        
        boolean valida = true;
        if (row2 != 0){
            for (int i = 0; i < Tablahuespedes.getRowCount(); i++) {
                try{
                    String nameh = (String) Tablahuespedes.getValueAt(i, 0);
                    float identh = Float.parseFloat((String) Tablahuespedes.getValueAt(i,1).toString());   
                    float telefonoh = Float.parseFloat((String) Tablahuespedes.getValueAt(i,2).toString());  
                    //aca se hace conversiona a los datos de la table huespedes, si hay una fila vacia, va a fallar la conversion
                    //por lo que no deben haber filas vacias o se ira por error y por lo tanto "informacion de huesped incompleta"

                }catch (Exception  e){
                    System.out.println("ERROR Info_Huespedescompleta");                
                    valida = false;
                }
           }
        }
        else 
            valida = false;
       return valida;
    }    
    
    private String Info_completa(){
        
     boolean valida = true;
        String info = "";
        if (Jdateend.getDate() == null || Jdateini.getDate() == null ||
                txtContacto.getText().isEmpty() ||txtphone.getText().isEmpty() || txtAbono.getText().isEmpty() ||
                txtnumroom.getText().isEmpty()){
            valida = false;
            info = "Información Incompleta. Verifique";
        }
        if (valida){
            if (!Info_Huespedescompleta()){
                valida = false;
                info = "Información Incompleta en Huespedes. Verifique";
            }
        }
        if (valida){
            if (txtAbono.getText().equals("0")){
                valida = false;
                info = "Digite el valor del Abono";
            } 
        }

        if (valida){
            if (txtphone.getText().equals(null)){
                valida = false;
                info = "El telefono de contacto esta null";
            } 
        }

        return info;
    }
     
    private void Crea_Registros(){
        String tiporegistro = (String) ComboTipo.getSelectedItem();
        float valortotal = Float.parseFloat(txtvalortotal.getText());
        float valorabono = Float.parseFloat(txtAbono.getText());       
        String contacto = txtContacto.getText();
        long telefono = Long.parseLong(txtphone.getText());        
        int numroom = Integer.parseInt(txtnumroom.getText());        
          
        String estado = "";
        if (tiporegistro == "CHECKIN"){
            estado = "OCUPADO";
        }else if (tiporegistro == "RESERVA"){
            estado = "RESERVADO";
        }
        Date fecha1 = Jdateini.getDate();
        Date fecha2 = Jdateend.getDate();

        LocalDate localDate1 = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();  //es para pasar date alocaldate
        LocalDate localDate2 = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        // crea un objeto tipo registro y le manda los datos anteriores
        //******************************************
        Registro p5 = new Registro (0, tiporegistro, valortotal, valorabono, contacto, telefono, numroom, estado, localDate1, localDate2);
        p5.CrearRegistro();
        //******************************************
        //recorre los datos mandados en la segunda tabla, y los guarda fila por fila en un objeto p7 que luego lo inseta en la BD(uno a uno)
        for (int i = 0; i < Tablahuespedes.getRowCount(); i++) {
            String nameh = (String) Tablahuespedes.getValueAt(i, 0);
            long identh = Long.parseLong((String) Tablahuespedes.getValueAt(i,1).toString());
            long telefonoh= Long.parseLong((String) Tablahuespedes.getValueAt(i,2).toString());
            
            RegistroHuesped p7 = new RegistroHuesped (p5.getNumero(), identh, nameh, telefonoh);
            //p7.showInfo();
            
            p7.CrearRegistroHuesped();
        }
        //******************************************
    }
      
    private void CleanTablerooms(){
        DefaultTableModel model = (DefaultTableModel) Tablahabitaciones.getModel();    
        while (Tablahabitaciones.getRowCount() >0){
            model.removeRow(0);
        }
    }    
    
    private void CleanTableguest(){
         DefaultTableModel model = (DefaultTableModel) Tablahuespedes.getModel();    
        while (Tablahuespedes.getRowCount() >0){
            model.removeRow(0);
        }
    }    

    private void Cleandataroom(){
        txtnumroom.setText("");
        txttipohab.setText("");
        txtpiso.setText("");
        txtnumper.setText("");
        txtvalornoche.setText("");
    }    
    private void CleandataPanel(){
        ComboTipo.setSelectedItem(PanelCheckin.TypeProcess.CHECKIN.name());
        Jdateini.setDate(null);
        Jdateend.setDate(null);
        Numdays.setText("0");
        
        Cleandataroom();
        
        txtContacto.setText("");
        txtphone.setText("");
        txtvalortotal.setText("0");
        txtAbono.setText("0");
        txtvalorfalta.setText("0");
        
        CleanTableguest();
    }
     
    
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        int dias = Integer.parseInt(Numdays.getText());
        if (Jdateend.getDate() == null || Jdateini.getDate() == null || dias<=0){
            JOptionPane.showMessageDialog(new JFrame(), "Ingrese las fechas. Intente de nuevo","Informacion", JOptionPane.INFORMATION_MESSAGE);                                    
        }
        else{
            FillTablerooms();
            Cleandataroom();
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void txtnumroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumroomActionPerformed

    private void txtpisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpisoActionPerformed

    private void txtnumperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumperActionPerformed

    private void txttipohabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipohabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipohabActionPerformed

    private void txtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneKeyTyped

    private void txtAbonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAbonoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAbonoFocusLost

    private void txtAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbonoActionPerformed
        // TODO add your handling code here:
        float ValorTotal = Float.parseFloat(txtvalortotal.getText());    
        float ValorAbono =  Float.parseFloat((String) txtAbono.getText());
        float saldo = ValorTotal - ValorAbono;
    
        txtvalorfalta.setText("" + saldo);    
    }//GEN-LAST:event_txtAbonoActionPerformed

    private void txtAbonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros){
            evt.consume();
        }

        if (txtAbono.getText().trim().length() == 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAbonoKeyTyped

    private void txtvalorfaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorfaltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorfaltaActionPerformed

    private void btnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactoActionPerformed
        // TODO add your handling code here:
     boolean valida = true;
        int row = Tablahuespedes.getSelectedRow();
        if (row <0){
            JOptionPane.showMessageDialog(new JFrame(), "Por favor seleccione una Fila","Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            String contacto = (String) Tablahuespedes.getValueAt(row,0);                            
            if (Tablahuespedes.getValueAt(row,2)== null){
                JOptionPane.showMessageDialog(new JFrame(), "Falta telefono","Informacion", JOptionPane.INFORMATION_MESSAGE);                
                valida = false;
            }
            if (valida){
                if (contacto == ""){
                    JOptionPane.showMessageDialog(new JFrame(), "Falta Nombre ","Informacion", JOptionPane.INFORMATION_MESSAGE);                
                    valida = false;
                }
            }
            if (valida) {
                long telefonoh= Long.parseLong((String) Tablahuespedes.getValueAt(row,2).toString());              
                txtContacto.setText(contacto);
                txtphone.setText(telefonoh+"");
            }
        }
    }//GEN-LAST:event_btnContactoActionPerformed

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Tablahuespedes.getModel();
        model.addRow(new Object[]{"",null,null});
    }//GEN-LAST:event_btncrearActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        int row = Tablahuespedes.getSelectedRow();
        if (row <0){
            JOptionPane.showMessageDialog(new JFrame(), "Por favor seleccione una Fila","Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            DefaultTableModel model = (DefaultTableModel) Tablahuespedes.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void TablahuespedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablahuespedesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablahuespedesMouseClicked

    private void ComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_ComboTipoActionPerformed

    private void JdateiniPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JdateiniPropertyChange
        // TODO add your handling code here:
        Date fecha1 = Jdateini.getDate();
        Jdateend.setMinSelectableDate(fecha1);

        if (Jdateend.getDate() != null && Jdateini.getDate() != null){
            
            Date fecha2 = Jdateend.getDate();

            LocalDate localDate1 = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();  //es para pasar date alocaldate
            LocalDate localDate2 = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();                  
            long dias = DAYS.toChronoUnit().between(localDate1, localDate2);
        

            Numdays.setText(Long.toString(dias));

        }
        CleanTablerooms();
        
        
    }//GEN-LAST:event_JdateiniPropertyChange

    private void JdateendPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JdateendPropertyChange
        // TODO add your handling code here:
        if (Jdateend.getDate() != null && Jdateini.getDate() != null){
            
            Date fecha2 = Jdateend.getDate();
            Date fecha1 = Jdateini.getDate();
            LocalDate localDate1 = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();  //es para pasar date alocaldate
            LocalDate localDate2 = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();                  
           
            long dias = DAYS.toChronoUnit().between(localDate1, localDate2);
           
            
            Numdays.setText(Long.toString(dias));
        }
        CleanTablerooms();

    }//GEN-LAST:event_JdateendPropertyChange

    private void TablahabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablahabitacionesMouseClicked
        // TODO add your handling code here:
        int fila = Tablahabitaciones.getSelectedRow();
        if (fila != -1){
       
            int numero = Integer.parseInt((String) Tablahabitaciones.getValueAt(fila,0).toString());            
            int piso =Integer.parseInt((String) Tablahabitaciones.getValueAt(fila,1).toString());     
            String tipo =  (String) Tablahabitaciones.getValueAt(fila,2);                    
            int numper = Integer.parseInt((String) Tablahabitaciones.getValueAt(fila,3).toString());            
            float valor = Float.parseFloat((String) Tablahabitaciones.getValueAt(fila,4).toString());     
            
            txtnumroom.setText(""+numero);
            txtpiso.setText(""+piso);
            txttipohab.setText(tipo);
            txtnumper.setText(""+numper);        

            //calcula el valor por noche
            float valornoche =  valor *numper ;            
            float valortotal = valornoche * Float.parseFloat(Numdays.getText());
            txtvalornoche.setText(""+ valornoche);
            txtvalortotal.setText(""+ valortotal);
            
            txtvalorfalta.setText(txtvalortotal.getText());            
        }        
    }//GEN-LAST:event_TablahabitacionesMouseClicked

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
       
       String  Result = Info_completa();
        if  (Result == "") {
            int a = JOptionPane.showConfirmDialog(null, "Esta seguro de realizar el proceso. ?", "Select",JOptionPane.YES_NO_OPTION);
            if (a==0){
                Crea_Registros();
                JOptionPane.showMessageDialog(new JFrame(), "Proceso Realizado con Exito","Informacion", JOptionPane.INFORMATION_MESSAGE);                            
                CleandataPanel();
            }            
        } else{
            JOptionPane.showMessageDialog(new JFrame(),Result,"Informacion", JOptionPane.INFORMATION_MESSAGE);                                    
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        CleandataPanel();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void JdateiniVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_JdateiniVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_JdateiniVetoableChange

    private void JdateiniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JdateiniKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JdateiniKeyTyped

    private void txtvalortotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalortotalKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtvalortotalKeyReleased

    private void txtvalornocheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalornocheKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalornocheKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTipo;
    private com.toedter.calendar.JDateChooser Jdateend;
    private com.toedter.calendar.JDateChooser Jdateini;
    private javax.swing.JLabel Numdays;
    private javax.swing.JPanel PageReserva;
    private javax.swing.JPanel PanelHabitaciones;
    private javax.swing.JPanel Panelhuespedes;
    private javax.swing.JTable Tablahabitaciones;
    private javax.swing.JTable Tablahuespedes;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnContacto;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btncrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblDateEnd;
    private javax.swing.JLabel lblDateEnd1;
    private javax.swing.JLabel lblDateIni;
    private javax.swing.JLabel lblNumper;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JLabel lblvalor1;
    private javax.swing.JLabel lblvalorabono1;
    private javax.swing.JLabel lblvalortotal1;
    private javax.swing.JScrollPane s1;
    private javax.swing.JTextField txtAbono;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtnumper;
    private javax.swing.JTextField txtnumroom;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtpiso;
    private javax.swing.JTextField txttipohab;
    private javax.swing.JTextField txtvalorfalta;
    private javax.swing.JTextField txtvalornoche;
    private javax.swing.JTextField txtvalortotal;
    // End of variables declaration//GEN-END:variables
}
