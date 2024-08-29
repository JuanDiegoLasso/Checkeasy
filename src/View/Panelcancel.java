
package View;
import Model.Registro;
import Model.Servicio;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;
public class Panelcancel extends javax.swing.JPanel {
    LocalDate x = LocalDate.now();
    
    public Panelcancel() {
        initComponents();
         FillTablereg();
         Tablareg.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablareg = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtnum = new javax.swing.JTextField();
        txtfloor = new javax.swing.JTextField();
        txttype = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        lblNumero2 = new javax.swing.JLabel();
        lblContacto = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        lblContacto1 = new javax.swing.JLabel();
        lblContacto2 = new javax.swing.JLabel();
        lblContacto3 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        txtel = new javax.swing.JTextField();
        dateini = new javax.swing.JTextField();
        datefin = new javax.swing.JTextField();
        lblContacto4 = new javax.swing.JLabel();
        lblContacto5 = new javax.swing.JLabel();
        txtabono = new javax.swing.JTextField();
        txtsaldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        btnLimpiar.setBackground(new java.awt.Color(21, 95, 130));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jTextField11.setText("jTextField11");

        jPanel3.setBackground(new java.awt.Color(243, 242, 225));
        jPanel3.setPreferredSize(new java.awt.Dimension(717, 517));

        Tablareg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "numero", "valor", "contacto", "telefono", "fecha de llegada", "fecha de salida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Long.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tablareg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaregMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tablareg);
        if (Tablareg.getColumnModel().getColumnCount() > 0) {
            Tablareg.getColumnModel().getColumn(0).setPreferredWidth(35);
            Tablareg.getColumnModel().getColumn(1).setPreferredWidth(55);
            Tablareg.getColumnModel().getColumn(2).setPreferredWidth(50);
            Tablareg.getColumnModel().getColumn(3).setPreferredWidth(70);
            Tablareg.getColumnModel().getColumn(4).setPreferredWidth(70);
            Tablareg.getColumnModel().getColumn(5).setPreferredWidth(110);
            Tablareg.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jPanel4.setBackground(new java.awt.Color(243, 242, 225));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtnum.setEditable(false);
        txtnum.setBackground(new java.awt.Color(238, 238, 218));
        txtnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumActionPerformed(evt);
            }
        });

        txtfloor.setEditable(false);
        txtfloor.setBackground(new java.awt.Color(238, 238, 218));
        txtfloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfloorActionPerformed(evt);
            }
        });

        txttype.setEditable(false);
        txttype.setBackground(new java.awt.Color(238, 238, 218));
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });

        lblNumero.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumero.setText("Numero");

        lblNumero1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumero1.setText("Habitacion");

        lblNumero2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumero2.setText("Tipo");

        lblContacto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto.setText("Contacto");

        txtcontact.setEditable(false);
        txtcontact.setBackground(new java.awt.Color(238, 238, 218));

        lblContacto1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto1.setText("Telefono");

        lblContacto2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto2.setText("fecha de reserva");

        lblContacto3.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto3.setText("Valor total");

        txtvalor.setEditable(false);
        txtvalor.setBackground(new java.awt.Color(238, 238, 218));

        txtel.setEditable(false);
        txtel.setBackground(new java.awt.Color(238, 238, 218));
        txtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelActionPerformed(evt);
            }
        });

        dateini.setEditable(false);
        dateini.setBackground(new java.awt.Color(238, 238, 218));

        datefin.setEditable(false);
        datefin.setBackground(new java.awt.Color(238, 238, 218));

        lblContacto4.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto4.setText("Abono");

        lblContacto5.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto5.setText("Saldo");

        txtabono.setEditable(false);
        txtabono.setBackground(new java.awt.Color(238, 238, 218));

        txtsaldo.setEditable(false);
        txtsaldo.setBackground(new java.awt.Color(238, 238, 218));
        txtsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaldoActionPerformed(evt);
            }
        });
        txtsaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsaldoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 95, 130));
        jLabel1.setText("INFORMACION");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblContacto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumero1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfloor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumero2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblContacto1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblContacto2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateini, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(datefin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContacto3)
                                    .addComponent(lblContacto4)
                                    .addComponent(lblContacto5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtvalor)
                                    .addComponent(txtabono)
                                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(22, 30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(lblNumero1)
                    .addComponent(lblNumero2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContacto)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContacto3)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContacto1)
                    .addComponent(txtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContacto4)
                    .addComponent(txtabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContacto2)
                    .addComponent(dateini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datefin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContacto5)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btnLimpiar1.setBackground(new java.awt.Color(21, 95, 130));
        btnLimpiar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(21, 95, 130));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar Reserva");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelar.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 95, 130));
        jLabel2.setText("HABITACIONES RESERVADAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(205, 205, 205))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(8, 8, 8)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

   
    private void FillTablereg(){
        
        Servicio objregroom = new Servicio();
        List<Registro> reservados = objregroom.ConsultaHabitacionesReservadas(x);
        var model = (DefaultTableModel) Tablareg.getModel();
        CleanTablereg();
        for(Registro obj: reservados ){
            model.addRow(new Object[]{
                obj.getNumero(),obj.getNumhabitacion(),obj.getValortotal() ,obj.getNombrecontacto(), obj.getTelefonocontacto(), obj.getFechaingreso(),obj.getFechasalida()});                
        }
    }
    
    private void CleanTablereg(){
        DefaultTableModel model = (DefaultTableModel) Tablareg.getModel();    
        while (Tablareg.getRowCount() >0){
            model.removeRow(0);
        }
    }    
    
    private void Modifica_Registro(){
        int idregistro= Integer.parseInt(txtnum.getText());
        String tiporegistro= txttype.getText();
        Float valortotal= Float.valueOf(txtvalor.getText());
        Float valorabono=Float.valueOf(txtabono.getText());
        String contacto=  txtcontact.getText();
        Long telefono=Long.valueOf(txtel.getText());
        int numroom= Integer.parseInt(txtfloor.getText());
        String estado = "CANCELADO";
        LocalDate fecha_cancel = LocalDate.now();
        Registro objreg = new Registro(idregistro, tiporegistro, valortotal, valorabono, contacto, telefono, numroom, estado,null  ,null  );
        objreg.setFechacancela(fecha_cancel);
        objreg.showInfo();
        
        
        objreg.ActualizarCancela();
    }
    
    private void Cleandata(){
        txtnum.setText("");
        txtfloor.setText("");
        txttype.setText("");
        txtcontact.setText("");
        txtel.setText(""); 
        dateini.setText("");
        datefin.setText("");
        txtvalor.setText("");
        txtabono.setText("");
        txtsaldo.setText("0");
    }
    
    private String infocompleta(){
        String info="";
        boolean valida=true;
        
        if(txtnum.getText().isEmpty() ||txtfloor.getText().isEmpty()||txttype.getText().isEmpty()||txtcontact.getText().isEmpty()
            ||txtel.getText().isEmpty()||txtvalor.getText().isEmpty()||txtabono.getText().isEmpty()||txtsaldo.getText().isEmpty()
            ||dateini.getText().isEmpty()||datefin.getText().isEmpty()){
            valida = false;
            info = "Información Incompleta. Verifique";
        }
        
        if (valida){
            if (txtsaldo.getText().equals("0")){
                info = "Digite el valor del Abono";
            } 
        }
        return info;
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    private void txtnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumActionPerformed

    private void txtfloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfloorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfloorActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtelActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        String  Result = infocompleta();
        if  (Result == "") {
            int a = JOptionPane.showConfirmDialog(null, "Esta seguro de realizar el proceso. ?", "Select",JOptionPane.YES_NO_OPTION);
            if (a==0){
                Modifica_Registro();
                JOptionPane.showMessageDialog(new JFrame(), "Proceso Realizado con Exito","Informacion", JOptionPane.INFORMATION_MESSAGE);                            
                Cleandata();
                CleanTablereg();
                FillTablereg();
            }            
        } else{
            JOptionPane.showMessageDialog(new JFrame(),Result,"Informacion", JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
         Cleandata();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void TablaregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaregMouseClicked
        Servicio objregroom = new Servicio();
        List<Registro> reservados = objregroom.ConsultaHabitacionesReservadas(x);
        
        int fila = Tablareg.getSelectedRow();
        if (fila != -1){
            int id = Integer.parseInt((String) Tablareg.getValueAt(fila,0).toString());            
            int numero =Integer.parseInt((String) Tablareg.getValueAt(fila,1).toString()); 
            String contacto =  (String) Tablareg.getValueAt(fila,3);                    
            long telefono =Long.parseLong((String) Tablareg.getValueAt(fila,4).toString());   
            
            for(Registro obj: reservados ){
                if(obj.getNumero()==id){
                    txttype.setText("" + obj.getTiporegistro());
                    dateini.setText("" + obj.getFechaingreso());
                    datefin.setText("" + obj.getFechasalida());
                    txtvalor.setText("" + obj.getValortotal());
                    txtabono.setText("" + obj.getValorabono());
                    float total = obj.getValortotal() ;
                    float abono= obj.getValorabono();
                    float saldo =total-abono;
                    txtsaldo.setText("" + saldo);
                    
                }
            }
            
            txtnum.setText(""+id);
            txtfloor.setText(""+numero);
            txtcontact.setText(""+contacto);        
            txtel.setText(""+telefono); 
        }
    }//GEN-LAST:event_TablaregMouseClicked

    private void txtsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaldoActionPerformed
        Servicio objregroom = new Servicio();
        List<Registro> reservados = objregroom.ConsultaHabitacionesReservadas(x);
        float Saldo =  Float.parseFloat((String) txtabono.getText());
        for(Registro obj: reservados ){
            if(obj.getValortotal()== Float.parseFloat(txtvalor.getText())){
                float ValorAbono= obj.getValorabono();
                float debe =ValorAbono-Saldo;
                txtabono.setText("" + debe);
            }
        }
    }//GEN-LAST:event_txtsaldoActionPerformed

    private void txtsaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsaldoKeyTyped
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtsaldoKeyTyped

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablareg;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField datefin;
    private javax.swing.JTextField dateini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblContacto1;
    private javax.swing.JLabel lblContacto2;
    private javax.swing.JLabel lblContacto3;
    private javax.swing.JLabel lblContacto4;
    private javax.swing.JLabel lblContacto5;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JTextField txtabono;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtel;
    private javax.swing.JTextField txtfloor;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txttype;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
