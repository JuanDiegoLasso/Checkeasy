package View;

import Model.Habitacion;
import Model.Servicio;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelRooms extends javax.swing.JPanel {
    
    public PanelRooms() {
       enum Typeroom {
            DOBLE,
            SENCILLA,
            SUIT,
            DOBLEEXTRA,
            ;
        }

        initComponents();

        jComboTipo.addItem(Typeroom.DOBLE.name());
        jComboTipo.addItem(Typeroom.SENCILLA.name());
        jComboTipo.addItem(Typeroom.SUIT.name());
        jComboTipo.addItem(Typeroom.DOBLEEXTRA.name());
        
        FillTableRooms();
        txtnumero.requestFocus();                
        
    }

    private boolean Existehabitacion (){
        boolean valida = false;
        for (int i = 0; i < Tablahabitaciones.getRowCount(); i++) {
            if (Tablahabitaciones.getValueAt(i, 0).toString().equals(txtnumero.getText()) ){
                valida = true;
                break;
            }    
        }
        return valida;
    }   
    
    private void FillTableRooms(){
        Servicio objListroom = new Servicio();
        List<Habitacion> habitaciones = objListroom.ConsultarHabitaciones();
        var model = (DefaultTableModel) Tablahabitaciones.getModel();
        limpiarTabla();
        for(Habitacion obj: habitaciones){
            model.addRow(new Object[]{
                obj.getnumero(), obj.getpiso(), obj.gettipo(), obj.getnum_personas(),obj.getprecio()
            });
            
        }
    }
    
    private void limpiarTabla(){
        DefaultTableModel model = (DefaultTableModel) Tablahabitaciones.getModel();    
        while (Tablahabitaciones.getRowCount() >0){
            model.removeRow(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PageConfig = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        lblPiso = new javax.swing.JLabel();
        txtpiso = new javax.swing.JTextField();
        lblNumper = new javax.swing.JLabel();
        txtnumper = new javax.swing.JTextField();
        lbltipo = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox<>();
        lblvalor = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        bntInsertar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tablahabitaciones = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(717, 517));

        PageConfig.setBackground(new java.awt.Color(234, 234, 213));
        PageConfig.setPreferredSize(new java.awt.Dimension(516, 465));
        PageConfig.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PageConfigFocusGained(evt);
            }
        });
        PageConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 234, 213));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(234, 234, 213));

        lblNumero.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumero.setText("Numero");

        txtnumero.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtnumero.setForeground(new java.awt.Color(102, 102, 102));
        txtnumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        lblPiso.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblPiso.setText("Piso");

        txtpiso.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtpiso.setForeground(new java.awt.Color(102, 102, 102));
        txtpiso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtpiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpisoActionPerformed(evt);
            }
        });

        lblNumper.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumper.setText("Numero de personas");

        txtnumper.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtnumper.setForeground(new java.awt.Color(102, 102, 102));
        txtnumper.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtnumper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumperActionPerformed(evt);
            }
        });

        lbltipo.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lbltipo.setText("Tipo");

        jComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoActionPerformed(evt);
            }
        });

        lblvalor.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblvalor.setText("Valor");

        txtvalor.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtvalor.setForeground(new java.awt.Color(102, 102, 102));
        txtvalor.setText("0");
        txtvalor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumero)
                        .addGap(9, 9, 9)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblPiso)
                        .addGap(18, 18, 18)
                        .addComponent(txtpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumper, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbltipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblvalor)
                        .addGap(18, 18, 18)
                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPiso)
                        .addComponent(txtpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNumper)
                        .addComponent(txtnumper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbltipo)
                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblvalor)
                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        PageConfig.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 610, 100));

        btnActualizar.setBackground(new java.awt.Color(21, 95, 130));
        btnActualizar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        PageConfig.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 80, 40));

        btnLimpiar.setBackground(new java.awt.Color(21, 95, 130));
        btnLimpiar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        PageConfig.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 80, 40));

        bntInsertar.setBackground(new java.awt.Color(21, 95, 130));
        bntInsertar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        bntInsertar.setForeground(new java.awt.Color(255, 255, 255));
        bntInsertar.setText("Agregar");
        bntInsertar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntInsertarActionPerformed(evt);
            }
        });
        PageConfig.add(bntInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 70, 40));

        btnBorrar.setBackground(new java.awt.Color(21, 95, 130));
        btnBorrar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        PageConfig.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 110, -1));

        Tablahabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "piso", "Tipo", "Personas", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tablahabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablahabitacionesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tablahabitaciones);

        PageConfig.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 630, 220));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 255));
        titulo.setText("Configurar Habitaciones");
        PageConfig.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PageConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PageConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtpisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpisoActionPerformed

    private void bntInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntInsertarActionPerformed
        if (txtnumero.getText().isEmpty() || txtpiso.getText().isEmpty() || txtnumper.getText().isEmpty() || txtvalor.getText().isEmpty() ||jComboTipo.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos. Intente de nuevo","Informacion", JOptionPane.INFORMATION_MESSAGE);            
        }            
        else {
            if (!Existehabitacion()){            
                int ninteger = Integer.parseInt(txtnumero.getText());
                int pinteger=Integer.parseInt(txtpiso.getText());
                int perteger=Integer.parseInt(txtnumper.getText());
                Float pricefloat= Float.valueOf(txtvalor.getText());
                String type=String.valueOf(jComboTipo.getSelectedItem());
                Habitacion p5 = new Habitacion (ninteger,pinteger,type,perteger,pricefloat);
                p5.CrearHabitacion();
                //adiciona a la tabla
                DefaultTableModel model = (DefaultTableModel) Tablahabitaciones.getModel();
                model.addRow(new Object[]{p5.getnumero(),p5.getpiso(), p5.gettipo(), p5.getnum_personas(), p5.getprecio()});            
                txtnumero.setText("");
                txtpiso.setText("");
                txtnumper.setText("");
                txtvalor.setText("");
                jComboTipo.setSelectedItem(p5.gettipo());
                JOptionPane.showMessageDialog(null, "Habitacion Insertada","Informacion", JOptionPane.INFORMATION_MESSAGE);                                                                            
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario ya existe","Informacion", JOptionPane.INFORMATION_MESSAGE);                                                        
            }
        }
        
    }//GEN-LAST:event_bntInsertarActionPerformed


    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        int row = Tablahabitaciones.getSelectedRow();
        if (row <0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione una Fila","Informacion", JOptionPane.INFORMATION_MESSAGE);                        
        }
        else
        {
            if (Existehabitacion()){
                int ninteger = Integer.parseInt(txtnumero.getText());
                int pinteger=Integer.parseInt(txtpiso.getText());
                int perteger=Integer.parseInt(txtnumper.getText());
                Float pricefloat= Float.valueOf(txtvalor.getText());
                String type=String.valueOf(jComboTipo.getSelectedItem());
                Habitacion p5 = new Habitacion (ninteger,pinteger,type,perteger,pricefloat);
                try {
                    p5.ActualizarHabitacion();
                } catch (SQLException ex) {
                    Logger.getLogger(PanelRooms.class.getName()).log(Level.SEVERE, null, ex);
                }
                FillTableRooms();                    
                txtnumero.setText("");
                txtpiso.setText("");
                txtnumper.setText("");
                txtvalor.setText("");
                jComboTipo.setSelectedItem(p5.gettipo());
                JOptionPane.showMessageDialog(null, "Habitacion Actualizada","Informacion", JOptionPane.INFORMATION_MESSAGE);                                                            
             }
            else{
                JOptionPane.showMessageDialog(null, "No Existe habitacion","Informacion", JOptionPane.INFORMATION_MESSAGE);                                            
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        int fila = Tablahabitaciones.getSelectedRow();
        if (fila <0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione una Fila","Informacion", JOptionPane.INFORMATION_MESSAGE);                        
        }
        else
        {
            int a = JOptionPane.showConfirmDialog(null, "Esta seguro de borrar habitacion " +  Tablahabitaciones.getValueAt(fila,0)+ "?", "Select",JOptionPane.YES_NO_OPTION);                        
            if (a==0){
                int habitacion = Integer.parseInt((String) Tablahabitaciones.getValueAt(fila,0).toString());
                int piso = Integer.parseInt((String) Tablahabitaciones.getValueAt(fila,1).toString());
                int numper = Integer.parseInt((String) Tablahabitaciones.getValueAt(fila,3).toString());       
                Float valor = Float.valueOf((String) Tablahabitaciones.getValueAt(fila,4).toString());                
                Habitacion p5 = new Habitacion (habitacion,piso,"", numper, valor);
                try {
                    p5.BorrarHabitacion();
                } catch (SQLException ex) {
                    Logger.getLogger(PanelRooms.class.getName()).log(Level.SEVERE, null, ex);
                }
                FillTableRooms();                    
                txtnumero.setText("");
                txtpiso.setText("");
                txtnumper.setText("");
                txtvalor.setText("");
                JOptionPane.showMessageDialog(null, "habitacion Borrada","Informacion", JOptionPane.INFORMATION_MESSAGE);                                                            
            }
        }
                
    }//GEN-LAST:event_btnBorrarActionPerformed
                        
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtnumero.setText("");
        txtpiso.setText("");
        txtnumper.setText("");
        txtvalor.setText("");
        jComboTipo.setSelectedItem(null);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorActionPerformed

    private void TablahabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablahabitacionesMouseClicked
        // TODO add your handling code here:
        int fila = Tablahabitaciones.getSelectedRow();
        if (fila == -1){
                JOptionPane.showMessageDialog(null, "Por favor seleccione una Fila","Informacion", JOptionPane.INFORMATION_MESSAGE);                        
        }else{
            int habitacion = Integer.parseInt((String) Tablahabitaciones.getValueAt(fila,0).toString());
            int piso = Integer.parseInt((String) Tablahabitaciones.getValueAt(fila,1).toString());
            int numper = Integer.parseInt((String) Tablahabitaciones.getValueAt(fila,3).toString());       
            Float valor = Float.valueOf((String) Tablahabitaciones.getValueAt(fila,4).toString());
            String type=String.valueOf(Tablahabitaciones.getValueAt(fila,2).toString());
            txtnumero.setText(""+habitacion);
            txtpiso.setText(""+piso);
            txtnumper.setText(""+numper);
            txtvalor.setText(""+valor);
            jComboTipo.setSelectedItem(""+type);
        
        }
    }//GEN-LAST:event_TablahabitacionesMouseClicked

    private void PageConfigFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PageConfigFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_PageConfigFocusGained

    private void txtnumperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumperActionPerformed

    private void jComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PageConfig;
    private javax.swing.JTable Tablahabitaciones;
    private javax.swing.JButton bntInsertar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumper;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtnumper;
    private javax.swing.JTextField txtpiso;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
