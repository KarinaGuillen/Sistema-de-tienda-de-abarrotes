/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemajava;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionDB {
    public static final String URL = "jdbc:mysql://localhost:3306/SistemaGestion";
    public static final String USER = "root";
    public static final String PASSWORD = "3%9Ib3M"; // <--- aqui va la contraseña de tu mysql

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Base de datos no encontrada", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}
