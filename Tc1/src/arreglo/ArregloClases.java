package arreglo;

import java.sql.CallableStatement;
import java.sql.Connection;

public class ArregloClases {

    public void InsertarClase(String turno, int cantidad, String calificacion, int idProfesor, int idDisciplina, int idSede) {
        try {
            Connection cn = utils.Conexion.conectar();
            CallableStatement csta = cn.prepareCall("{call SP_INSERTAR_CLASE(?,?,?,?,?,?)}");
            csta.setString(1, turno);
            csta.setInt(2, cantidad);
            csta.setString(3, calificacion);
            csta.setInt(4, idProfesor);
            csta.setInt(5, idDisciplina);
            csta.setInt(6, idSede);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al registrar clase: " + e.getMessage());
        }
    }

    public void ModificarClase(int idClase, String turno, int cantidad, String calificacion, int idProfesor, int idDisciplina) {
        try {
            Connection cn = utils.Conexion.conectar();
            CallableStatement csta = cn.prepareCall("{call SP_MODIFICAR_CLASE(?,?,?,?,?,?)}");
            csta.setInt(1, idClase);
            csta.setString(2, turno);
            csta.setInt(3, cantidad);
            csta.setString(4, calificacion);
            csta.setInt(5, idProfesor);
            csta.setInt(6, idDisciplina);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al modificar clase: " + e.getMessage());
        }
    }
}