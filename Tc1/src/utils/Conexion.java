package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    // 1. Definimos las credenciales de tu servidor local
    private static final String URL = "jdbc:mysql://localhost:3306/truesports_bd";
    private static final String USUARIO = "root";
    
    // ¡OJO! Cambia el texto entre comillas por tu contraseña de MySQL
    private static final String CLAVE = "Princesa2208@"; 
    
    // 2. Método mágico para abrir la puerta a la base de datos
    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Intentamos cruzar el puente usando el archivo .jar que instalaste
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("¡Éxito! Conectado a bd_truesports");
            
        } catch (SQLException e) {
            // Si algo falla, que nos avise en la consola de Eclipse
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }
    

}