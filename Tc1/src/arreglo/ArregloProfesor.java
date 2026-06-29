package arreglo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import reportes.ReporteProfesor;
import utils.Conexion;

public class ArregloProfesor {

    public ArrayList<ReporteProfesor> ListarTodosProfesores() {
        ArrayList<ReporteProfesor> lista = new ArrayList<ReporteProfesor>();
        try {
            String sql = "SELECT * FROM VW_REPORTE_PROFESORES ORDER BY CALIFICACION_PROMEDIO DESC";            
            PreparedStatement psta = Conexion.conectar().prepareStatement(sql);
            ResultSet rs = psta.executeQuery();            
            ReporteProfesor rep;
            while (rs.next()) {
                rep = new ReporteProfesor(
                    rs.getString(1),  
                    rs.getString(2),  
                    rs.getString(3),  
                    rs.getString(4),  
                    rs.getInt(5),     
                    rs.getDouble(6)  
                );
                lista.add(rep);
            }
        } catch (Exception e) {
            System.out.println("Error al listar profesores: " + e.getMessage());
        }
        return lista;
    }

    public ArrayList<ReporteProfesor> FiltrarProfesores(String mesFiltro, String profesorFiltro) {
        ArrayList<ReporteProfesor> lista = new ArrayList<ReporteProfesor>();
        try {
            String sql = "SELECT * FROM VW_REPORTE_PROFESORES WHERE MES = ? AND PROFESOR = ? ORDER BY CALIFICACION_PROMEDIO DESC";            
            PreparedStatement psta = Conexion.conectar().prepareStatement(sql);
            psta.setString(1, mesFiltro);
            psta.setString(2, profesorFiltro);          
            ResultSet rs = psta.executeQuery();            
            ReporteProfesor rep;
            while (rs.next()) {
                rep = new ReporteProfesor(
                    rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getInt(5), rs.getDouble(6)
                );
                lista.add(rep);
            }
        } catch (Exception e) {
            System.out.println("Error al filtrar profesores: " + e.getMessage());
        }
        return lista;
    }
}
