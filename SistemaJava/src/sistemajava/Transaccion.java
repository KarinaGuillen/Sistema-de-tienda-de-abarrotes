package sistemajava;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */

public class Transaccion {

    private int id_transaccion;
    private String descripcion;
    private String estado;
    private float monto;
    private String fecha;
    private int id_usuario;
    
    public Transaccion(int id_transaccion, String descripcion, String estado, float monto, String fecha, int id_usuario)
    {    
        this.id_transaccion = id_transaccion;
        this.descripcion = descripcion;
        this.estado = estado;
        this.monto = monto;
        this. fecha = fecha;
        this.id_usuario = id_usuario;
    }
    
    public int get_idTransaccion()
    {
        return id_transaccion;
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
    
    public float get_idUsuario()
    {
        return id_usuario;
    } 
    
    public void display_transaccion()
    {
        // Convertimos los numeros a cadenas de texto
        String str_idTransaccion = Integer.toString(id_transaccion);
        String str_monto = Float.toString(monto);
        String str_idUsuario = Integer.toString(id_usuario);
        
        String message = "Transaccion: \n"
                + "1) Id_transaccion: "
                + str_idTransaccion 
                + ", \n"
                + "2) Descripcion: "
                + descripcion 
                + ", \n"
                + "3) Estado: "
                + estado
                + ", \n"
                + "4) Monto: "
                + str_monto 
                + ", \n"
                + "5) Fecha: "
                + fecha 
                + ", \n"
                + "6) Id_usuario: "
                + str_idUsuario;
        
        JOptionPane.showMessageDialog(null, message);
    }
    
}