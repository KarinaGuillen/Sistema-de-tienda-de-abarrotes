/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemajava;
import java.sql.Connection;

/**
 *
 * @author LENOVO
 */
public class SistemaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Login().setVisible(true);
        
        // Creamos la conexión a la base de datos
        ConexionDB con = new ConexionDB();
        Connection re = con.getConnection();
        
        // Insertamos una transacción
        Transaccion tr = new Transaccion("Compra unitaria", "Pagado", 85.47f, "2022-11-24", 1, 1);
        
        // Registramos una transacción a la base de datos
        tr.insert_Transaction(re);
    }
    
}
