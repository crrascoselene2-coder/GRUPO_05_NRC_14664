package arreglo;

import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ArregloVenta {
    
	public void InsertarVenta(clases.Venta obj) {
	    try {
	        java.sql.Connection cn = utils.Conexion.conectar();
	        java.sql.CallableStatement csta = cn.prepareCall("{call SP_INSERTAR_VENTA(?,?,?,?,?,?,?,?,?,?,?)}");
	        
	        csta.setString(1, obj.getDniAlumno());
	        csta.setInt(2, obj.getIdPlan());
	        csta.setString(3, obj.getMetodoPago());
	        csta.setDouble(4, obj.getMontoEfectivo());
	        csta.setDouble(5, obj.getMontoDigital());
	        csta.setDouble(6, obj.getTotalPagado());
	        csta.setDouble(7, obj.getSaldoPendiente());
	        
	        if(obj.getFechaVencimiento() == null) {
	            csta.setNull(8, java.sql.Types.DATE);
	        } else {
	            csta.setString(8, obj.getFechaVencimiento());
	        }
	        
	        csta.setString(9, obj.getEstado());
	        csta.setInt(10, obj.getIdSede()); 
	        csta.setInt(11, obj.getIdUsuario());
	        
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