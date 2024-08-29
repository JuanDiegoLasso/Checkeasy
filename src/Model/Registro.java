package Model;

import MySql.SQLConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;


public class Registro {
    private int numero;
    private String tiporegistro;
    private float valortotal;
    private float valorabono;
    private String nombrecontacto;
    private long telefonocontacto;
    private int numhabitacion;
    private String estado;
    private LocalDate fechaingreso;
    private LocalDate fechasalida;    
    private LocalDate fechacancela;
    private LocalDate fechacheckout;    

    public Registro() {
    }

    public Registro(int numero, String tiporegistro, float valortotal, float valorabono, String nombrecontacto, long telefonocontacto, int numhabitacion, String estado, LocalDate fechaingreso, LocalDate fechasalida) {
        this.numero = numero;
        this.tiporegistro = tiporegistro;
        this.valortotal = valortotal;
        this.valorabono = valorabono;
        this.nombrecontacto = nombrecontacto;
        this.telefonocontacto = telefonocontacto;
        this.numhabitacion = numhabitacion;
        this.estado = estado;
        this.fechaingreso = fechaingreso;
        this.fechasalida = fechasalida;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTiporegistro() {
        return tiporegistro;
    }

    public void setTiporegistro(String tiporegistro) {
        this.tiporegistro = tiporegistro;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public float getValorabono() {
        return valorabono;
    }

    public void setValorabono(float valorabono) {
        this.valorabono = valorabono;
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    public long getTelefonocontacto() {
        return telefonocontacto;
    }

    public void setTelefonocontacto(long telefonocontacto) {
        this.telefonocontacto = telefonocontacto;
    }

    public int getNumhabitacion() {
        return numhabitacion;
    }

    public void setNumhabitacion(int numhabitacion) {
        this.numhabitacion = numhabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(LocalDate fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public LocalDate getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(LocalDate fechasalida) {
        this.fechasalida = fechasalida;
    }

    public LocalDate getFechacancela() {
        return fechacancela;
    }

    public void setFechacancela(LocalDate fechacancela) {
        this.fechacancela = fechacancela;
    }

    public LocalDate getFechacheckout() {
        return fechacheckout;
    }

    public void setFechacheckout(LocalDate fechacheckout) {
        this.fechacheckout = fechacheckout;
    }


   public void CrearRegistro(){
        try {
            Connection conn  = new SQLConnect().getConnection();                                            
            //registro.showInfo();
            String sql = "INSERT INTO registro(idregistro, tiporegistro, valortotal, valorabono, nombrecontacto, telefonocontacto,habitacion, estado, fecha_inicial, fecha_final" 
             + ") VALUES(?,?,?,?,?,?,?,?,?,?)";
            numero = getgeneratekey();
            
            try(PreparedStatement stm = conn.prepareStatement(sql)){
                 stm.setInt(1,numero + 1);
                 stm.setString(2, this.tiporegistro);
                 stm.setFloat(3, this.valortotal);
                 stm.setFloat(4, this.valorabono);
                 stm.setString(5, this.nombrecontacto);
                 stm.setLong(6, this.telefonocontacto);
                 stm.setInt(7, this.numhabitacion);
                 stm.setString(8, this.estado);
                 stm.setObject(9, this.fechaingreso);
                 stm.setObject(10, this.fechasalida);   //ese numero es para cada signo de interrogacion 
                 stm.execute();
                if(stm != null)
                    stm.close();                             
            }
        }   catch (SQLException e) {
            System.out.println("SQLException");
             throw new RuntimeException();
             }        
    }
    
    private int getgeneratekey(){ // busca el numero mas grande de idregistro en la db y lo mete en una variable y lo retorna.
        try {
            Connection conn  = new SQLConnect().getConnection();                                                        
            int maxreg= 0;

            String sql = "SELECT MAX(idregistro) maximo FROM registro";
            try(PreparedStatement stm = conn.prepareStatement(sql)){
                stm.execute();
                try(ResultSet result = stm.executeQuery()){
                    while(result.next()){
                        maxreg = result.getInt("maximo");                                        
                    }
                }
                if(stm != null)
                    stm.close();                             
            }
            return maxreg;
        }   catch (SQLException e) {
             throw new RuntimeException();
            }        
        
    }    
    public void showInfo(){
        System.out.println("Objeto Registro :  " + numero + "," + tiporegistro + "," + valortotal + "," + valorabono + "," + nombrecontacto + "," + telefonocontacto);
        System.out.println(": " + numhabitacion + "," + estado + "," + fechaingreso + "," + fechasalida );        
    }
    
    public void ActualizarCancela(){
        Connection conn  = new SQLConnect().getConnection();                                                                
        String sql = "UPDATE registro SET estado=?,fecha_cancel=? WHERE idregistro=?" ;
         System.out.println(" fecha" + fechacancela + "numero " + numero + " estado " + estado);       
        try(PreparedStatement stm = conn.prepareStatement(sql)){
            stm.setString(1, this.estado);
            stm.setObject(2, this.fechacancela);
            stm.setInt(3, this.numero);
            
            stm.execute();
        }
        catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR ");
            throw new RuntimeException(e);
        }         
    }
    public void Actualizarcheckout(){
        Connection conn  = new SQLConnect().getConnection();                                                                         
        String sql = "UPDATE registro SET estado=?,fecha_checkout=? WHERE idregistro=?" ;
        System.out.println(" fecha" + fechacheckout + "numero " + numero + " estado " + estado);
        try(PreparedStatement stm = conn.prepareStatement(sql)){
            stm.setString(1, this.estado);
            stm.setObject(2, this.fechacheckout);
            stm.setInt(3, this.numero);
            stm.execute();
        }
        catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR ");
            throw new RuntimeException(e);
        }         
    }     

    
 }
    
