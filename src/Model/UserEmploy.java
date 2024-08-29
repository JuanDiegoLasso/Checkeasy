package Model;

import MySql.SQLConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

 
public class UserEmploy {
    
    private String usuario;
    private String clave;
    private String nombre;
    private String correo;
    private int telefono;

    public UserEmploy(String usuario, String clave, String nombre, String correo, int telefono) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public UserEmploy() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void CrearUsuario() throws SQLException{
        Connection conn  = new SQLConnect().getConnection();                        
        try {

            String sql = "INSERT INTO usuario(usuario, password, nombre, correo, telefono" 
             + ") VALUES(?,?,?,?,?)";
            try(
                 PreparedStatement stm = conn.prepareStatement(sql)){
                 stm.setString(1, this.usuario);
                 stm.setString(2, this.clave);
                 stm.setString(3, this.nombre);
                 stm.setString(4, this.correo);
                 stm.setInt(5, this.telefono);
                 stm.execute();
                 
                if(stm != null)
                    stm.close();                             
            }
        }   catch (SQLException e) {
             throw new RuntimeException();
            }
        if (conn != null)
            conn.close();
     }
     
    public void ActualizarUsuario() throws SQLException{
        Connection conn  = new SQLConnect().getConnection();                        
        String sql = "UPDATE usuario SET nombre =?, correo=?, telefono=? WHERE usuario=?";
        try(PreparedStatement stm = conn.prepareStatement(sql)){
            stm.setString(1, this.nombre);
            stm.setString(2, this.correo);
            stm.setInt(3, this.telefono);
            stm.setString(4, this.usuario);            
            stm.execute();
        }
        catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR USUARIO NO EXISTE");
            throw new RuntimeException(e);
        }
        if (conn != null)
            conn.close();
        
    }
   public void BorrarUsuario() throws SQLException{
        Connection conn  = new SQLConnect().getConnection();                               
        String sql = "DELETE FROM usuario WHERE usuario=?";
       
        try (PreparedStatement stm = conn.prepareStatement(sql)){
            stm.setString(1, this.usuario);            
            stm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (conn != null)
            conn.close();
    }
          
}
