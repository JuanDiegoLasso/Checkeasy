package Model;

import MySql.SQLConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroHuesped {
    Connection conn; 
    
    private int numero;
    private long numid;
    private String nombre;
    private long telefono;    

    
    public RegistroHuesped(int numero, long numid, String nombre, long telefono) {
        this.numero = numero;
        this.numid = numid;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public RegistroHuesped() {
    }

    public int getNumreg() {
        return numero;
    }

    public void setNumreg(int numero) {
        this.numero = numero;
    }

    public long getNumid() {
        return numid;
    }

    public void setNumid(long numid) {
        this.numid = numid;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public long getPhone() {
        return telefono;
    }

    public void setPhone(long telefono) {
        this.telefono = telefono;
    }

    public void CrearRegistroHuesped(){
        try {
            
            this.conn = new SQLConnect().getConnection();                             
            String sql = "INSERT INTO registro_huesped(idregistro, identificacion, nombre, telefono" 
             + ") VALUES(?,?,?,?)";
            try(
                 PreparedStatement stm = conn.prepareStatement(sql)){
                 stm.setInt(1, this.numero);
                 stm.setLong(2, this.numid);                 
                 stm.setString(3, this.nombre);
                 stm.setLong(4, this.telefono);                 
                 stm.execute();
                if(stm != null)
                    stm.close();                             
            }
        }   catch (SQLException e) {
             throw new RuntimeException();
            }         
     }
   
 
    public void showInfo(){
        
        System.out.println("Registroguest:  " + numero + "," + numid + "," + nombre + "," + telefono);
    }
    
}
