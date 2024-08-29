
package View;

import Model.Registro;
import Model.Servicio;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Panelcheckout extends javax.swing.JPanel {
LocalDate x = LocalDate.now();
 public Panelcheckout() {

     initComponents();
        cancelar.setEnabled(false); // Deshabilita el botón al inicio

        FillTablereg();
        Tablareg.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
 } 
 public static String textofacturatelefono = "";
 public static String textofacturahuesped = "";
 public static String textofacturaingreso = "";
 public static String textofacturasalida = "";
 public static String textofacturahabitacion = "";
 public static String textofacturavalor = "";
 public static String textofacturaid = "";
 
 
 private void FillTablereg(){
        Servicio objregroom = new Servicio();
        List<Registro> checkins = objregroom.ConsultaHabitacionesCheckin();
        var model = (DefaultTableModel) Tablareg.getModel();
        CleanTablereg();
        for(Registro obj: checkins ){
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
              
     private void Modifica_Registro(){
        int idregistro= Integer.parseInt(txtnum.getText());
        String tiporegistro= txttype.getText();
        Float valortotal= Float.valueOf(txtvalor.getText());
        Float valorabono=Float.valueOf(txtabono.getText());
        String contacto=  txtcontact.getText();
        Long telefono=Long.valueOf(txtel.getText());
        int numroom= Integer.parseInt(txtfloor.getText());
        String estado = "CHECKOUT";
        LocalDate fecha_checkout = LocalDate.now();
        
        Registro  objreg = new Registro(idregistro, tiporegistro, valortotal, valorabono, contacto, telefono, numroom, estado,null  ,null  );
        objreg.showInfo();
        objreg.setFechacheckout(fecha_checkout);
        objreg.Actualizarcheckout();
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
        
        
        return info;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        checkpago = new javax.swing.JCheckBox();
        btnfactura = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiar2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(234, 234, 213));

        jPanel2.setBackground(new java.awt.Color(234, 234, 213));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 136, -1, -1));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(243, 242, 225));
        jPanel3.setPreferredSize(new java.awt.Dimension(717, 517));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 478, 142));

        jPanel4.setBackground(new java.awt.Color(243, 242, 225));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnum.setEditable(false);
        txtnum.setBackground(new java.awt.Color(238, 238, 218));
        txtnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumActionPerformed(evt);
            }
        });
        jPanel4.add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 90, -1));

        txtfloor.setEditable(false);
        txtfloor.setBackground(new java.awt.Color(238, 238, 218));
        txtfloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfloorActionPerformed(evt);
            }
        });
        jPanel4.add(txtfloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 90, -1));

        txttype.setEditable(false);
        txttype.setBackground(new java.awt.Color(238, 238, 218));
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });
        jPanel4.add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 90, -1));

        lblNumero.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumero.setText("Numero:");
        jPanel4.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 43, -1, -1));

        lblNumero1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumero1.setText("Habitacion:");
        jPanel4.add(lblNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        lblNumero2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblNumero2.setText("Tipo:");
        jPanel4.add(lblNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        lblContacto.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto.setText("Contacto:");
        jPanel4.add(lblContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 83, -1, -1));

        txtcontact.setEditable(false);
        txtcontact.setBackground(new java.awt.Color(238, 238, 218));
        jPanel4.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 79, 140, -1));

        lblContacto1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto1.setText("Telefono:");
        jPanel4.add(lblContacto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 123, -1, -1));

        lblContacto2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto2.setText("fecha de checkin/checkout:");
        jPanel4.add(lblContacto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 163, -1, -1));

        lblContacto3.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto3.setText("Valor total:");
        jPanel4.add(lblContacto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        txtvalor.setEditable(false);
        txtvalor.setBackground(new java.awt.Color(238, 238, 218));
        jPanel4.add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 79, 80, -1));

        txtel.setEditable(false);
        txtel.setBackground(new java.awt.Color(238, 238, 218));
        txtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelActionPerformed(evt);
            }
        });
        jPanel4.add(txtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 119, 132, -1));

        dateini.setEditable(false);
        dateini.setBackground(new java.awt.Color(238, 238, 218));
        jPanel4.add(dateini, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 98, -1));

        datefin.setEditable(false);
        datefin.setBackground(new java.awt.Color(238, 238, 218));
        jPanel4.add(datefin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 98, -1));

        lblContacto4.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto4.setText("Abono:");
        jPanel4.add(lblContacto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        lblContacto5.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        lblContacto5.setText("Saldo:");
        jPanel4.add(lblContacto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        txtabono.setEditable(false);
        txtabono.setBackground(new java.awt.Color(238, 238, 218));
        jPanel4.add(txtabono, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 119, 80, -1));

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
        jPanel4.add(txtsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 159, 80, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 95, 130));
        jLabel1.setText("INFORMACION");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 7, 90, 20));

        checkpago.setText("Saldo pago");
        checkpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkpagoActionPerformed(evt);
            }
        });
        jPanel4.add(checkpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 670, 200));

        btnfactura.setBackground(new java.awt.Color(21, 95, 130));
        btnfactura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnfactura.setForeground(new java.awt.Color(255, 255, 255));
        btnfactura.setText("Factura");
        btnfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturaActionPerformed(evt);
            }
        });
        jPanel3.add(btnfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 100, 40));

        cancelar.setBackground(new java.awt.Color(21, 95, 130));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Checkout");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel3.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 100, 40));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 134, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 133, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 95, 130));
        jLabel2.setText("HABITACIONES EN USO");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 20));

        btnLimpiar2.setBackground(new java.awt.Color(21, 95, 130));
        btnLimpiar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar2.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 100, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void TablaregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaregMouseClicked
        Servicio objregroom = new Servicio();
        List<Registro> reservados = objregroom.ConsultaHabitacionesCheckin();

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

    private void btnfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturaActionPerformed
        textofacturatelefono = txtel.getText(); 
        textofacturahuesped = txtcontact.getText(); 
        textofacturasalida = datefin.getText(); 
        textofacturaingreso = dateini.getText(); 
        textofacturahabitacion = txtfloor.getText();
        textofacturavalor = txtvalor.getText();
        textofacturaid= txtnum.getText();
        
       
        
        facturacheckout newframe = new facturacheckout();    
        newframe.setVisible(true);
        
        
   
    }//GEN-LAST:event_btnfacturaActionPerformed

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

    private void checkpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkpagoActionPerformed
                                          
    // Verifica si el JCheckBox está seleccionado
    if (checkpago.isSelected()) {
        cancelar.setEnabled(true);  // Habilita el JButton
    } else {
        cancelar.setEnabled(false); // Deshabilita el JButton
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_checkpagoActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
       Cleandata();    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablareg;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnfactura;
    private javax.swing.JButton cancelar;
    private javax.swing.JCheckBox checkpago;
    private javax.swing.JTextField datefin;
    private javax.swing.JTextField dateini;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
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
