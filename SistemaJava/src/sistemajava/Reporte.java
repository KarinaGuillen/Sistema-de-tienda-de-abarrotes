/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemajava;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class Reporte {
    
    private final String tipo_transaccion;  
    private final String fecha_inicio;
    private final String fecha_final;
    
    public Reporte(String tipo_transaccion, String fecha_inicio, String fecha_final)
    {
        this.tipo_transaccion = tipo_transaccion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }
    
    public String get_tipo_transaccion()
    {
        return tipo_transaccion;
    }
    
    public String get_fecha_inicio()
    {
        return fecha_inicio;
    }
    
    public String get_fecha_final()
    {
        return fecha_final;
    }
    
    public void display_report(Connection re)
    {
            // Declaramos la Query para consultar datos
            Statement rg;
            ResultSet res;
            String sql;
            
            try{
                  // Ejecuta la declaracion select SQL
                  rg = re.createStatement();
                  
                  // Consulta: id_transaccion, descripcion, estado, fecha, monto
                  //sql = "SELECT id_transaccion, Descripcion, Estado, Fecha, Monto, Tipo_transaccion FROM Transaccion";                  
                  sql = "SELECT id_transaccion, Descripcion, Estado, Fecha, Monto, Tipo_transaccion FROM Transaccion WHERE tipo_transaccion = "+ tipo_transaccion + " AND Fecha BETWEEN \" " + fecha_inicio + "\" AND  \" " + fecha_final + "\"";
                 //sql = "SELECT id_transaccion, Descripcion, Estado, Fecha, Monto, Tipo_transaccion FROM Transaccion WHERE id_transaccion = "+ String.valueOf(tipo_transaccion);
                  res = rg.executeQuery(sql);
                  res.first();
                  
                  do
                  {
                      String[] fila = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)};
                      System.out.println(Arrays.toString(fila));
                  }while (res.next());
                  

                  // Cerramos la conexión de la base de datos
                  re.close();

              }catch(Exception e){
                  // En caso de error se imprime un mensaje
                   JOptionPane.showMessageDialog(null, e, "No existen datos", JOptionPane.ERROR_MESSAGE);
              }
    }
    
    /*
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        while (modelo.getRowCount() > 0)
        {
            modelo.removeRow(0);
        }
        
        Conectar cn = new Conectar();
        Connection ret = cn.getConnection();
        
        try {
            //Conectar con = new Conectar();
            Statement rg = ret.createStatement();
            ResultSet res = rg.executeQuery("SELECT cliente.id_cliente,cliente.nombre,cliente.edad,cliente.sexo,cliente.problema,empleado.nombre,empleado.cargo,cliente.fecha,empleado.sueldo from cliente,empleado where cliente.id_empleado=empleado.id_empleado");
            res.first();
            
            do 
            {
                String[] fila = {res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7),res.getString(8),res.getString(9)};
                modelo.addRow(fila);
            } while (res.next());
            ret.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "No existen datos", JOptionPane.ERROR_MESSAGE);
        }
    }*/

}
