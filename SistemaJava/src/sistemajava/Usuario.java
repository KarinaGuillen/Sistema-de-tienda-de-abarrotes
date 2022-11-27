
package sistemajava;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Karina Guillen
 */
public class Usuario {
    private final String usuario;
    private final String clave;
    
    public Usuario(String usuario, String clave)
    {    
        
        this.usuario = usuario;
        this.clave = clave;
           
    }
    
    public String get_usuario()
    {
        return usuario;
    }
    
    public String get_clave()
    {
        return clave;
    }
    
    public void acceder(Connection ret)
    {
                //Preparamos la query select para obtener el usuario
        String sql;
        sql = "SELECT id_usuario FROM usuario WHERE Nombre = '" +usuario + "' AND Contrasena = '" + clave + "' ;";
        System.out.println(sql);
       
        //Se agrega try catch para la consulta en sql
        try{
            Statement rg = ret.createStatement();
            ResultSet res = rg.executeQuery(sql);
                 
            if(res.first())
            {
              //  this.dispose();
                JOptionPane.showMessageDialog(null, "Ingreso exitoso");
                new Interfaz().setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existen usuarios");
        }
    }
    
}
