package View;

import Model.Registro;
import Model.Servicio;
import MySql.SQLConnect;
import static View.Panelcheckout.textofacturahabitacion;
import static View.Panelcheckout.textofacturahuesped;
import static View.Panelcheckout.textofacturaid;
import static View.Panelcheckout.textofacturaingreso;
import static View.Panelcheckout.textofacturasalida;
import static View.Panelcheckout.textofacturatelefono;
import static View.Panelcheckout.textofacturavalor;
import java.awt.GridLayout;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Paneltakealook extends javax.swing.JPanel {
      DefaultTableModel dl;
      DefaultTableModel ld;
      private Servicio servicio;
    
    public Paneltakealook() {
       initComponents();
       servicio = new Servicio();  // Inicialización de la instancia
       Tablahabitaciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       servicio.fillcombobox("habitacion", "numero", jcomboestado1);
       CreateColumns();

    }      
      
    private void CreateColumns() {
        dl = (DefaultTableModel) Tablahabitaciones.getModel();
        ld = (DefaultTableModel) tablahabitacion.getModel();
    }
    
    
   
    
    private void CleanTableRooms() {
         DefaultTableModel model = (DefaultTableModel) Tablahabitaciones.getModel();    
        while (Tablahabitaciones.getRowCount() >0){
            model.removeRow(0);
        }
    }    
  private void CleanTableRoom() {
         DefaultTableModel model = (DefaultTableModel) tablahabitacion.getModel();    
        while (tablahabitacion.getRowCount() >0){
            model.removeRow(0);
        }
    }    
    private void FillTablerooms() {
        Servicio objregistro = new Servicio(); // Logger.getLogger(PanelCheckin.class.getName()).log(Level.SEVERE, null, ex);
        Date fecha1 = Jdateini.getDate();
        Date fecha2 = Jdateend.getDate();
        LocalDate startA = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endA = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<Registro> registros = objregistro.ConsultaRegistros();
        CleanTableRooms();
        for (Registro obj : registros) {
            
            LocalDate startB = obj.getFechaingreso();
            LocalDate endB = obj.getFechasalida();
            
            if ((startA.isBefore(endB) || startA.isEqual(endB)) && 
                    (endA.isAfter(startB) || endA.isEqual(startB))) {
                
                var model = (DefaultTableModel) Tablahabitaciones.getModel();
                model.addRow(new Object[]{
                    obj.getNumero(), obj.getTiporegistro(), obj.getValortotal(),
                    obj.getValorabono(), obj.getNombrecontacto(), obj.getTelefonocontacto(),
                    obj.getNumhabitacion(), obj.getEstado(), obj.getFechaingreso(), obj.getFechasalida(),
                    obj.getFechacancela(),obj.getFechacheckout()
                });
            }
        }
    }


    private void FillTableroom() {
        Servicio objregistro = new Servicio(); // Logger.getLogger(PanelCheckin.class.getName()).log(Level.SEVERE, null, ex);
        List<Registro> registros = objregistro.ConsultaRegistros();
        var model = (DefaultTableModel) tablahabitacion.getModel();
        CleanTableRoom();
        Date fecha1 = Jdateini.getDate();
        Date fecha2 = Jdateend.getDate();
        LocalDate startA = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endA = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int habitacionSeleccionada = Integer.parseInt((String) jcomboestado1.getSelectedItem());
        List<Registro> registrosFiltrados = registros.stream()
                .filter(obj -> obj.getNumhabitacion() == habitacionSeleccionada &&
                        ((obj.getFechaingreso().isBefore(endA) || obj.getFechasalida().isEqual(endA)) &&
                                (obj.getFechasalida().isAfter(startA) || obj.getFechasalida().isEqual(startA))))
                .sorted((r1, r2) -> r1.getFechaingreso().compareTo(r2.getFechasalida()))
                .collect(Collectors.toList());
        LocalDate freeStart = startA;
        for (Registro obj : registrosFiltrados) {
            LocalDate occupiedStart = obj.getFechaingreso();
            LocalDate occupiedEnd = obj.getFechasalida();
            
            
            if (freeStart.isBefore(occupiedStart)) {
                model.addRow(new Object[]{
                    habitacionSeleccionada, "LIBRE", freeStart, occupiedStart.minusDays(1)
                });
            }
            
            
            freeStart = occupiedEnd.plusDays(1);
        }
        if (freeStart.isBefore(endA) || freeStart.isEqual(endA)) {
            model.addRow(new Object[]{
                habitacionSeleccionada, "LIBRE", freeStart, endA
            });
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPiso = new javax.swing.JLabel();
        lblNumper2 = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();
        lblNumper3 = new javax.swing.JLabel();
        lblNumper4 = new javax.swing.JLabel();
        Jdateend = new com.toedter.calendar.JDateChooser();
        btnLimpiar = new javax.swing.JButton();
        jcomboestado1 = new javax.swing.JComboBox<>();
        jcomboestado = new javax.swing.JComboBox<>();
        Jdateini = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablahabitaciones = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablahabitacion = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        Mostrarfactura = new javax.swing.JButton();
        Mostrarhuesped = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();

        jPanel1.setBackground(new java.awt.Color(234, 234, 213));

        jPanel4.setBackground(new java.awt.Color(234, 234, 213));
        jPanel4.setPreferredSize(new java.awt.Dimension(712, 517));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 255));
        titulo.setText("Consulta EasyCheck");

        jPanel2.setBackground(new java.awt.Color(234, 234, 213));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(234, 234, 213));

        lblPiso.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblPiso.setText("habitacion");

        lblNumper2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumper2.setText("estado");

        consultar.setBackground(new java.awt.Color(21, 95, 133));
        consultar.setForeground(new java.awt.Color(255, 255, 255));
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        lblNumper3.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumper3.setText("fecha inicial");

        lblNumper4.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumper4.setText("fecha final");

        Jdateend.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JdateendPropertyChange(evt);
            }
        });
        Jdateend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JdateendKeyTyped(evt);
            }
        });
        Jdateend.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                JdateendVetoableChange(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(21, 95, 130));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jcomboestado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODAS" }));
        jcomboestado1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboestado1ItemStateChanged(evt);
            }
        });

        jcomboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "TODOS", "OCUPADO", "CHECKOUT", "RESERVADO", "CANCELADO" }));
        jcomboestado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboestadoItemStateChanged(evt);
            }
        });

        Jdateini.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JdateiniPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumper3)
                    .addComponent(lblNumper4))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jdateend, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(Jdateini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboestado1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNumper2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNumper3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumper4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNumper2)
                                .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Jdateini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jdateend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPiso)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcomboestado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Tablahabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "tiporegistro", "valortotal", "valorabono", "contacto", "telefono", "habitacion", "estado", "fecha inicio", "fecha final", "fecha cancel", "fecha checkout"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tablahabitaciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tablahabitaciones);

        tablahabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "habitacion", "estado", "fecha inicio", "fecha final"
            }
        ));
        jScrollPane4.setViewportView(tablahabitacion);

        Mostrarfactura.setText("Mostrar factura");
        Mostrarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarfacturaActionPerformed(evt);
            }
        });

        Mostrarhuesped.setText("Mostrar info huesped");
        Mostrarhuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarhuespedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mostrarfactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mostrarhuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(265, 265, 265))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Mostrarfactura)
                        .addGap(18, 18, 18)
                        .addComponent(Mostrarhuesped)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void Cleandataroom(){
    }
    private void CleandataPanel(){
        
        jcomboestado.setSelectedItem(PanelCheckin.TypeProcess.CHECKIN.name());
        Jdateini.setDate(null);
        Jdateend.setDate(null);
        jcomboestado.setSelectedItem(null);
        jcomboestado1.setSelectedItem(null);
        DefaultTableModel dm = (DefaultTableModel)Tablahabitaciones.getModel();
        while(dm.getRowCount() > 0)
        {
        dm.removeRow(0);
        }
        DefaultTableModel md = (DefaultTableModel)tablahabitacion.getModel();
        while(md.getRowCount() > 0)
        {
        md.removeRow(0);
        }
    }
   
    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
        
       if (jcomboestado1.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(new JFrame(), "seleccione una habitacion. Intente de nuevo","Informacion", JOptionPane.INFORMATION_MESSAGE);
        } else{
          
       }
        if (jcomboestado.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(new JFrame(), "seleccione un estado. Intente de nuevo","Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        }
         if (Jdateend.getDate() == null || Jdateini.getDate() == null){
            JOptionPane.showMessageDialog(new JFrame(), "Ingrese las fechas. Intente de nuevo","Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        }
        if (Jdateend.getDate() != null && Jdateini.getDate() != null && jcomboestado.getSelectedItem() != null  && jcomboestado1.getSelectedItem() != null ){
             FillTablerooms();
             Cleandataroom();
             
        }
        if (Jdateend.getDate() != null && Jdateini.getDate() != null && jcomboestado.getSelectedItem() != null && jcomboestado1.getSelectedItem() != null && jcomboestado.getSelectedItem() != ("TODOS") && jcomboestado1.getSelectedItem() != ("TODAS")) {
            FillTablerooms();
            Cleandataroom();
           
        } else{

        }
        if (Jdateend.getDate() != null && Jdateini.getDate() != null && jcomboestado.getSelectedItem() != null && jcomboestado1.getSelectedItem() != null && jcomboestado1.getSelectedItem() != "TODAS"){
           FillTableroom();
           
        }  
       
        String query = jcomboestado1.getSelectedItem().toString() ;
        String query1 =  jcomboestado.getSelectedItem().toString();
        Date query2 = Jdateini.getDate();
        Date query3 = Jdateend.getDate();
        
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dl);
            Tablahabitaciones.setRowSorter(tr);
            

            if(query2 != null && query3 != null && "TODOS".equals(query1)&& query != null && !"ELIGE".equals(query) && !"TODAS".equals(query) ){
                tr.setRowFilter(RowFilter.regexFilter(query, 6));
                Tablahabitaciones.setRowSorter(tr);
            }
            
            if(query2 != null && query3 != null && "TODAS".equals(query) && query1 != null && !"ELIGE".equals(query1) && !"TODOS".equals(query1) ){
                tr.setRowFilter(RowFilter.regexFilter(query1, 7));
                 Tablahabitaciones.setRowSorter(tr);
            }
            
          
            if(query2 != null && query3 != null && query != null && !"ELIGE".equals(query) && !"TODAS".equals(query) && !"ELIGE".equals(query1) && !"TODOS".equals(query1) && query1 != null ){
            List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
            filters.add(RowFilter.regexFilter(query));
            filters.add(RowFilter.regexFilter(query1));
            RowFilter<Object, Object> queryquery1Filter = RowFilter.andFilter(filters);
            tr.setRowFilter(queryquery1Filter);
                }
           

       
    }//GEN-LAST:event_consultarActionPerformed
    


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        CleandataPanel();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jcomboestado1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboestado1ItemStateChanged
     
        
    }//GEN-LAST:event_jcomboestado1ItemStateChanged
    

    private void JdateendPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JdateendPropertyChange
        // TODO add your handling code here:
          if (Jdateend.getDate() != null && Jdateini.getDate() != null){
            
            Date fecha2 = Jdateend.getDate();
            Date fecha1 = Jdateini.getDate();
            LocalDate localDate1 = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();  //es para pasar date alocaldate
            LocalDate localDate2 = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();                  
            
            Period period = Period.between(localDate1, localDate2);
            Integer dias= Math.abs(period.getDays());
           
        }
        
    }//GEN-LAST:event_JdateendPropertyChange

    private void JdateendVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_JdateendVetoableChange
         
    }//GEN-LAST:event_JdateendVetoableChange

    private void JdateendKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JdateendKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JdateendKeyTyped

    private void jcomboestadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboestadoItemStateChanged
               }//GEN-LAST:event_jcomboestadoItemStateChanged

    private void JdateiniPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JdateiniPropertyChange
        // TODO add your handling code here:
        Date fecha1 = Jdateini.getDate();     
        Jdateend.setMinSelectableDate(fecha1);

        if (Jdateend.getDate() != null && Jdateini.getDate() != null){
            
            Date fecha2 = Jdateend.getDate();

            LocalDate localDate1 = fecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();  //es para pasar date alocaldate
            LocalDate localDate2 = fecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();                  
            
            Period period = Period.between(localDate1, localDate2);
            Integer dias= Math.abs(period.getDays());
        }
    }//GEN-LAST:event_JdateiniPropertyChange

    private void MostrarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarfacturaActionPerformed
           
    Mostrarfactura.setEnabled(false);

   ListSelectionModel seleccionDeFilas = Tablahabitaciones.getSelectionModel();

seleccionDeFilas.addListSelectionListener(event -> {
    if (!event.getValueIsAdjusting()) {
        int row = Tablahabitaciones.getSelectedRow();
        if (row >= 0) {
            String estado = Tablahabitaciones.getValueAt(row, 7).toString();
            
            // Habilitar el botón si el estado es "CHECKOUT"
            if ("CHECKOUT".equals(estado)) {
                Mostrarfactura.setEnabled(true);

                // Asignar valor a textofacturatelefono para usarlo cuando se presione el botón
                textofacturatelefono = Tablahabitaciones.getValueAt(row, 5).toString();
                textofacturahuesped = Tablahabitaciones.getValueAt(row, 4).toString();
                textofacturasalida = Tablahabitaciones.getValueAt(row, 9).toString();
                textofacturaingreso = Tablahabitaciones.getValueAt(row, 8).toString();
                textofacturahabitacion = Tablahabitaciones.getValueAt(row, 6).toString();
                textofacturavalor = Tablahabitaciones.getValueAt(row, 2).toString();
                textofacturaid= Tablahabitaciones.getValueAt(row, 0).toString();            }
        }
    }
});
Mostrarfactura.addActionListener(e -> {
    // Crear y mostrar el nuevo frame con la factura
    facturacheckout newframe = new facturacheckout();
    newframe.setVisible(true);

    // Aquí puedes pasar `textofacturatelefono` a `facturacheckout` si es necesario
});
            }//GEN-LAST:event_MostrarfacturaActionPerformed

    private void MostrarhuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarhuespedActionPerformed
       Mostrarhuesped.setEnabled(false);

   ListSelectionModel seleccionDeFilas = Tablahabitaciones.getSelectionModel();

seleccionDeFilas.addListSelectionListener(event -> {
    if (!event.getValueIsAdjusting()) {
        int row = Tablahabitaciones.getSelectedRow();
        if (row >= 0) {
            String estado = Tablahabitaciones.getValueAt(row, 7).toString();
                Mostrarhuesped.setEnabled(true);
                    if (row >= 0 && !"CHECKOUT".equals(estado)) {
                // Asignar valor a textofacturatelefono para usarlo cuando se presione el botón
               textofacturatelefono = Tablahabitaciones.getValueAt(row, 5).toString();
                textofacturahuesped = Tablahabitaciones.getValueAt(row, 4).toString();
                textofacturahabitacion = Tablahabitaciones.getValueAt(row, 6).toString();
                textofacturaid= Tablahabitaciones.getValueAt(row, 0).toString();            }
        }
    }
});

Mostrarhuesped.addActionListener(e -> {
    // Crear un nuevo JFrame para mostrar la información
    JFrame newFrame = new JFrame("Detalles del huesped");
    newFrame.setSize(400, 300);
    newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Crear un JPanel para contener los datos
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 2)); // Usar un GridLayout para organizar los componentes

    // Agregar etiquetas y valores al panel
    panel.add(new JLabel("ID:"));
    panel.add(new JLabel(textofacturaid));

    panel.add(new JLabel("Huésped:"));
    panel.add(new JLabel(textofacturahuesped));

    panel.add(new JLabel("Teléfono:"));
    panel.add(new JLabel(textofacturatelefono));

    panel.add(new JLabel("Habitación:"));
    panel.add(new JLabel(textofacturahabitacion));

    // Agregar el panel al frame
    newFrame.add(panel);

    // Mostrar el nuevo frame
    newFrame.setVisible(true);
});
    }//GEN-LAST:event_MostrarhuespedActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Jdateend;
    private com.toedter.calendar.JDateChooser Jdateini;
    private javax.swing.JButton Mostrarfactura;
    private javax.swing.JButton Mostrarhuesped;
    private javax.swing.JTable Tablahabitaciones;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton consultar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox<String> jcomboestado;
    private javax.swing.JComboBox<String> jcomboestado1;
    private javax.swing.JLabel lblNumper2;
    private javax.swing.JLabel lblNumper3;
    private javax.swing.JLabel lblNumper4;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JTable tablahabitacion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
