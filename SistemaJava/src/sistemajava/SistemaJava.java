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
        
        ConexionDB con = new ConexionDB();
        Connection re = con.getConnection();
        
        //Transaccion tr = new Transaccion(1, "No se", "Pagado", 8.58f, "28/oct/2022", 1);
        //tr.display_transaccion();
    }
    
}
