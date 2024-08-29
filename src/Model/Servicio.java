
package Model;

import MySql.SQLConnect;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Servicio {
    
    public Servicio() {
        
    }
    public void fillcombobox(String tabla, String valor, JComboBox combo){
                String sql = "select * from " + tabla;
                Statement st;
                SQLConnect con = new SQLConnect();
                Connection conn = con.getConnection();
                try
                {

                    st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    while(rs.next())
                    {
                        combo.addItem(rs.getString(valor));
                    }

                }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "ERROR" + e.toString());

            }
        

     }
    public void IniciaCheckInReserva(String titulo ,JFrame window,JPanel page ,JPanel content ){
        
        window.setTitle(titulo);                        
        ShowPanel(page, content);   
    }
    public void IniciaCancelarReserva(String titulo ,JFrame window,JPanel page ,JPanel content ){
        
        window.setTitle(titulo);                        
        ShowPanel(page, content);   
    }
    public void IniciaCheckout(String titulo ,JFrame window,JPanel page ,JPanel content ){
        
        window.setTitle(titulo);                        
        ShowPanel(page, content);   
    }
    public void IniciaConsultaderegistros(String titulo ,JFrame window,JPanel page ,JPanel content ){
        
        window.setTitle(titulo);                        
        ShowPanel(page, content);   
    }
    
        
        
    public void ShowPanel(JPanel p, JPanel content){
        p.setSize(717,517);
	p.setLocation(0,0);
	content.removeAll();
	content.add(p,BorderLayout.CENTER);
	content.revalidate();
	content.repaint();
    }
    
    public boolean Autenticar(String nombre, String clave) throws SQLException{
        
        boolean valida = false;
        Connection conn  = new SQLConnect().getConnection();                                
        
        String sql = "SELECT * FROM usuario WHERE usuario = '" + nombre + "' AND  password = '" + clave + "'";
        try(PreparedStatement stm = conn.prepareStatement(sql)){
            stm.execute();
            ResultSet result = stm.executeQuery();
            while(result.next()){
                System.out.println(result.getString("usuario") + " " + result.getString("nombre") + " " + result.getString("correo") + " " + result.getInt("telefono"));
                valida = true;
            }
            if(result != null)
                result.close();
            if(stm != null)
                stm.close();            
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        if (conn != null)
            conn.close();
        return valida;
    }
    
    public List<Habitacion> ConsultarHabitaciones(){
        Connection conn  = new SQLConnect().getConnection();                                
        List<Habitacion> rooms = new ArrayList<Habitacion>();
        try {
            String sql = "SELECT * FROM habitacion";
            try(PreparedStatement stm = conn.prepareStatement(sql)){
                stm.execute();
                transformResultadoA(rooms, stm);
            }return rooms;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
    private void transformResultadoA(List<Habitacion> rooms, PreparedStatement statement) throws SQLException{
        try(ResultSet result = statement.executeQuery()) {
            while(result.next()){

                int num_room = result.getInt("numero");                
                int floor = result.getInt("piso");
                String type_room = result.getString("tipo");
                int num_people = result.getInt("num_person");
                float price = result.getFloat("valor");
                Habitacion obj = new Habitacion(num_room, floor, type_room, num_people, price);
                rooms.add(obj);
            }
        } catch (Exception e) {
        }
    }
    public List<UserEmploy> ConsultarUsuarios(){
        Connection conn  = new SQLConnect().getConnection();                                
        List<UserEmploy> usuarios = new ArrayList<UserEmploy>();
        try {
            String sql = "SELECT * FROM usuario";
            try(PreparedStatement stm = conn.prepareStatement(sql)){
                stm.execute();
                transformResultadoB(usuarios, stm);
            }

            return usuarios;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }   
    
    public void transformResultadoB(List<UserEmploy> usuarios, PreparedStatement statement) throws SQLException{
        try(ResultSet result = statement.executeQuery()) {
            while(result.next()){
                String usuario = result.getString("usuario");                
                String password = result.getString("password");
                String nombre = result.getString("nombre");
                String correo = result.getString("correo");
                int telefono = result.getInt("telefono");
                UserEmploy obj = new UserEmploy(usuario, password, nombre, correo, telefono);
                usuarios.add(obj);
            }
        } catch (Exception e) {
        }
    }
    
    public List<Habitacion> ConsultaHabitacionesDisponibles(LocalDate fecha_ini, LocalDate fecha_fin){
        boolean overlap = false;
        List<Registro> listregistros = ConsultaRegitroOcupados();  
        List<Integer> listroomoverlap = new ArrayList<Integer>();        
            
        for (Registro elementB: listregistros) {
            if (!((fecha_ini.isAfter(elementB.getFechasalida()) && fecha_fin.isAfter(elementB.getFechasalida())) || 
                (fecha_ini.isBefore(elementB.getFechaingreso()) && fecha_fin.isBefore(elementB.getFechaingreso())))) {
                listroomoverlap.add(elementB.getNumhabitacion());
            }
        }
        //SQLhabitacion objroom = new SQLhabitacion(conn);
        Servicio objroom = new Servicio();
        
        List<Habitacion> listroom = objroom.ConsultarHabitaciones();
        List<Habitacion> differences = new ArrayList<Habitacion>();
        
        for (Habitacion elementA: listroom){
            if (!listroomoverlap.contains(elementA.getnumero())) {
                differences.add(elementA);
            } else {
            }
        }
        return differences;
    }     
    
    private List<Registro> ConsultaRegitroOcupados(){
        Connection conn  = new SQLConnect().getConnection();                                                        
        List<Registro> registro = new ArrayList<Registro>();
        try {
            String sql = "SELECT * FROM registro WHERE (estado = 'OCUPADO' or estado = 'RESERVADO')";
            try(PreparedStatement stm = conn.prepareStatement(sql)){
                stm.execute();
                transformResultadorooms(registro, stm);
            }
            return registro;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }  
    private void transformResultadorooms(List<Registro> registro, PreparedStatement statement) throws SQLException{
        try(ResultSet result = statement.executeQuery()) {
            LocalDate date_cancel = null;
            LocalDate date_checkout = null;
            
            while(result.next()){
                int num_reg = result.getInt("idregistro");                
                String tiporegistro = result.getString("tiporegistro");                
                float valortotal = result.getFloat("valortotal");                
                float valorabono = result.getFloat("valorabono");                                
                String nombrecontacto = result.getString("nombrecontacto");                                
                long telefonocontacto = result.getLong("telefonocontacto");                                                                
                int habitacion = result.getInt("habitacion");                
                String estado = result.getString("estado");                                
                LocalDate date_ini = result.getDate("fecha_inicial").toLocalDate();
                LocalDate date_end = result.getDate("fecha_final").toLocalDate();
                
                if (result.getDate("fecha_cancel") != null){
                     date_cancel= result.getDate("fecha_cancel").toLocalDate();
                  }
                  else
                  {
                      date_cancel = null;    
                  }
                  if (result.getDate("fecha_checkout") != null){
                      date_checkout = result.getDate("fecha_checkout").toLocalDate();
                  }
                  else
                  {
                      date_checkout = null;            
                  }
                  Registro obj = new Registro(num_reg, tiporegistro, valortotal, valorabono, nombrecontacto, telefonocontacto, habitacion, estado, date_ini, date_end);
                  obj.setFechacancela(date_cancel);
                  obj.setFechacheckout(date_checkout);
                  registro.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("ERRRROOR");
            throw new RuntimeException();
        }
    }
    public List<Registro> ConsultaHabitacionesReservadas(LocalDate fecha_ini){
        Connection conn  = new SQLConnect().getConnection();                                                                 
        List<Registro> reservados= new ArrayList<Registro>();
        List<Registro> reservadover= new ArrayList<Registro>();     
        
        try {
            String sql = "SELECT * FROM registro WHERE (estado = 'RESERVADO')"; 
            try(PreparedStatement stm = conn.prepareStatement(sql)){
                stm.execute();
                transformResultadorooms(reservados, stm);
            }
            for (Registro elementB: reservados) {
            if (!((fecha_ini.isAfter(elementB.getFechasalida())))) {
                reservadover.add(elementB);
                }
        }
            return reservadover;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        
    }      
    public List<Registro> ConsultaHabitacionesCheckin(){
        Connection conn  = new SQLConnect().getConnection();                                                                         
         
        List<Registro>  checkins = new ArrayList<Registro>();
        try {
            String sql = "SELECT * FROM registro WHERE (estado = 'OCUPADO')"; 
            try(PreparedStatement stm = conn.prepareStatement(sql)){
                stm.execute();
                transformResultadorooms(checkins, stm);
            }
            return checkins;
        } catch (SQLException e) {
            throw new RuntimeException();
        }  
    }   
    public List<Registro> ConsultaRegistros(){
        Connection conn  = new SQLConnect().getConnection();                                                                         
        List<Registro> registro = new ArrayList<Registro>();
        try {
            String sql = "SELECT * FROM registro"
                    ;
            try(PreparedStatement stm = conn.prepareStatement(sql)){
                stm.execute();
                transformResultadorooms(registro, stm);
            }
            return registro;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

        
        
      
}
