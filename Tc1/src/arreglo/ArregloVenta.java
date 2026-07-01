package arreglo;

import java.sql.CallableStatement;
import java.sql.Connection;

public class ArregloVenta {
    public void InsertarVenta(String dni, int idPlan, String metodo, double efectivo, double digital, double total, int idSede, int idUsuario) {
        try {
            java.sql.Connection cn = utils.Conexion.conectar();
            java.sql.CallableStatement csta = cn.prepareCall("{call SP_INSERTAR_VENTA(?,?,?,?,?,?,?,?)}");
            
            csta.setString(1, dni);
            csta.setInt(2, idPlan);
            csta.setString(3, metodo);
            csta.setDouble(4, efectivo);
            csta.setDouble(5, digital);
            csta.setDouble(6, total);
            csta.setInt(7, idSede); 
            csta.setInt(8, idUsuario); // <-- Enviamos el usuario logueado a MySQL
            
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }
}