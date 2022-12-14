package sistemajava;
import java.sql.Connection;
import java.sql.Date;
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
    private final Date fecha;
    private final int id_usuario;
    private final int tipo_transaccion;
    
    public Transaccion(String descripcion, String estado, float monto, Date fecha, int id_usuario, int tipo_transaccion)
    {    
        
        this.descripcion = descripcion;
        this.estado = estado;
        this.monto = monto;
        this. fecha = fecha;
        this.id_usuario = id_usuario;
        this.tipo_transaccion=tipo_transaccion;
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
    
    public Date get_fecha()
    {
        return fecha;
    }
    
    public int get_idUsuario()
    {
        return id_usuario;
    } 
      public int get_tipo_transaccion()
    {
        return tipo_transaccion;
    } 
    
    public void insert_Transaction(Connection re)
    {     
          // Declaramos la Query para insertar datos
          Statement rg;
          
          try{
              // Ejecuta la declaracion insert SQL
              rg = re.createStatement();
              //comentar cuando ya no se ocupe(despues de implementar los insert de ingresos y egresos
              rg.executeUpdate("INSERT INTO transaccion(Descripcion, Estado, Monto, Fecha, id_usuario, Tipo_transaccion) VALUES ('"+ descripcion + "', '" + estado + "', '" + monto + "', '" + fecha + "', '" + id_usuario + "', '" + tipo_transaccion + "')");
              
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