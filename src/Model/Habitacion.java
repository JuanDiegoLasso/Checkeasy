
package Model;

import MySql.SQLConnect;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Habitacion {
    
    private int numero;
    private int piso;   
    private String tipo;
    private int num_personas;
    private float precio;


    public Habitacion(int numero, int piso, String tipo, int num_personas, float precio) {
        this.numero = numero;
        this.piso = piso;
        this.tipo = tipo;
        this.num_personas = num_personas;
        this.precio = precio;
    }

    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public int getpiso() {
        return piso;
    }

    public void setpiso(int piso) {
        this.piso = piso;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnum_personas() {
        return num_personas;
    }

    public void setnum_personas(int num_personas) {
        this.num_personas = num_personas;
    }

    public float getprecio() {
        return precio;
    }

    public void setprecio(float precio) {
        this.precio = precio;
    }

    public void CrearHabitacion(){
        try {
            Connection conn  = new SQLConnect().getConnection();                
            String sql = "INSERT INTO habitacion(numero, piso, tipo, num_person, valor" 
             + ") VALUES(?,?,?,?,?)";
            try(
                 PreparedStatement stm = conn.prepareStatement(sql)){
                 stm.setInt(1, this.numero);
                 stm.setInt(2, this.piso);
                 stm.setString(3, this.tipo );
                 stm.setInt(4, this.num_personas);
                 stm.setFloat(5, this.precio);
                 stm.execute();
                if(stm != null)
                    stm.close();                             
            }
            if (conn != null)
                conn.close();
            
        }   catch (SQLException e) {
             throw new RuntimeException();
            }
     }
    public void ActualizarHabitacion() throws SQLException{
        Connection conn  = new SQLConnect().getConnection();                
        String sql = "UPDATE habitacion SET piso =?, tipo=?, num_person=? ,valor = ? WHERE numero=?";
        try(PreparedStatement stm = conn.prepareStatement(sql)){
            stm.setInt(1, this.piso);
            stm.setString(2, this.tipo);
            stm.setInt(3, this.num_personas);
            stm.setFloat(4, this.precio);
            stm.setInt(5, this.numero);            
            stm.execute();
        }
        catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR USUARIO NO EXISTE");
            throw new RuntimeException(e);
        }         
        if (conn != null)
            conn.close();
    }
    public void BorrarHabitacion() throws SQLException{
        Connection conn  = new SQLConnect().getConnection();                
        try {    

            String sql = "DELETE FROM habitacion WHERE numero=?";

            try (PreparedStatement stm = conn.prepareStatement(sql)){
                stm.setInt(1, this.numero) ;            
                stm.execute();
            }
        }   catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (conn != null)
            conn.close();
    }


}
