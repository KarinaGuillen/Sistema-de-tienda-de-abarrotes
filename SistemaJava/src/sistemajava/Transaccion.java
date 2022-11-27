package sistemajava;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */

public class Transaccion {

    private final String descripcion;
    private final String estado;
    private final float monto;
    private final String fecha;
    private final int id_usuario;
    
    public Transaccion(String descripcion, String estado, float monto, String fecha, int id_usuario)
    {    
        
        this.descripcion = descripcion;
        this.estado = estado;
        this.monto = monto;
        this. fecha = fecha;
        this.id_usuario = id_usuario;
    }
    
    
    public String get_descripcion()
    {
        return descripcion;
    }
    
    public String get_estado()
    {
        return estado;
    }
    
    public float get_monto()
    {
        return monto;
    }
    
    public String get_fecha()
    {
        return fecha;
    }
    
    public int get_idUsuario()
    {
        return id_usuario;
    } 
    
    
    public void insert_Transaction(Connection re)
    {     
          // Declaramos la Query para insertar datos
          Statement rg;
          
          try{
              // Ejecuta la declaracion insert SQL
              rg = re.createStatement();
              rg.executeUpdate("INSERT INTO transaccion(Descripcion, Estado, Monto, Fecha, id_usuario) VALUES ('"+ descripcion + "', '" + estado + "', '" + monto + "', '" + fecha + "', '" + id_usuario + "')");
              
              // Imprimimos un mensaje
              JOptionPane.showMessageDialog(null, "La transacción se ha registrado con exito!");
              
              // Cerramos la conexión de la base de datos
              re.close();
              
          }catch(SQLException e){
              // En caso de error se imprime un mensaje
               JOptionPane.showMessageDialog(null, e, "No existen datos", JOptionPane.ERROR_MESSAGE);
          }
    }
}