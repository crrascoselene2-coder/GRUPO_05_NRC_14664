package arreglo;

import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ArregloVenta {
    
    public void InsertarVenta(String dni, int idPlan, String metodo, double efectivo, double digital, double total, double saldoPendiente, String fechaVencimiento, String estado, int idSede, int idUsuario) {
        try {
            java.sql.Connection cn = utils.Conexion.conectar();
            java.sql.CallableStatement csta = cn.prepareCall("{call SP_INSERTAR_VENTA(?,?,?,?,?,?,?,?,?,?,?)}");
            
            csta.setString(1, dni);
            csta.setInt(2, idPlan);
            csta.setString(3, metodo);
            csta.setDouble(4, efectivo);
            csta.setDouble(5, digital);
            csta.setDouble(6, total);
            csta.setDouble(7, saldoPendiente);
            
            // Si la fecha viene nula (porque no hay deuda), mandamos nulo a MySQL
            if(fechaVencimiento == null) {
                csta.setNull(8, java.sql.Types.DATE);
            } else {
                csta.setString(8, fechaVencimiento);
            }
            
            csta.setString(9, estado);
            csta.setInt(10, idSede); 
            csta.setInt(11, idUsuario);
            
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar venta: " + e.getMessage());
        }
    }

    public void SaldarDeuda(int codigoVenta, double pagoEfectivo, double pagoDigital) {
        try {
            java.sql.Connection cn = utils.Conexion.conectar();
            java.sql.CallableStatement csta = cn.prepareCall("{call SP_ACTUALIZAR_DEUDA(?,?,?)}");
            csta.setInt(1, codigoVenta);
            csta.setDouble(2, pagoEfectivo);
            csta.setDouble(3, pagoDigital);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar deuda: " + e.getMessage());
        }
    }
    
    public void AnularVenta(int codigoVenta) {
        try {
            java.sql.Connection cn = utils.Conexion.conectar();
            java.sql.CallableStatement csta = cn.prepareCall("{call SP_ANULAR_VENTA(?)}");
            csta.setInt(1, codigoVenta);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al anular venta: " + e.getMessage());
        }
    }
}