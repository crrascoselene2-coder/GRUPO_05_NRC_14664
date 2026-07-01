package arreglo;

import java.time.LocalDate;
import java.util.ArrayList;
import clases.*;
import utils.Conexion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
public class ArregloAlumno {
private ArrayList<Alumno>paci;
public ArregloAlumno() {
	paci=new ArrayList<Alumno>();
}
public void adicionar(Alumno x) {
	paci.add(x);
}
public boolean InsertarAlumno(clases.Alumno alu, int idSede) {
	boolean exito = false;
	try {
		java.sql.Connection cn = utils.Conexion.conectar();
		java.sql.CallableStatement csta = cn.prepareCall("{call SP_INSERTAR_ALUMNO(?,?,?,?,?,?,?)}");
		
		csta.setString(1, alu.getDni());
		csta.setString(2, alu.getNom());
		csta.setString(3, alu.getApellidos());
		csta.setString(4, alu.getCelular());
		csta.setString(5, alu.getFecha_nacimiento());
		csta.setString(6, alu.getEstado());
		csta.setInt(7, idSede); 
		
		csta.executeUpdate();
		exito = true;
	} catch (Exception e) {
		System.out.println("Error al insertar: " + e.getMessage());
	}
	return exito;
}

public void InsertarApoderado(String dniAlumno, String dniApo, String nom, String ape, String cel, String parentesco) { 
    try {
        Connection cnx = utils.Conexion.conectar();
        CallableStatement csta = cnx.prepareCall("{call SP_INSERTAR_APODERADO(?,?,?,?,?,?)}");
        
        csta.setString(1, dniAlumno);
        csta.setString(2, dniApo);
        csta.setString(3, nom);
        csta.setString(4, ape);
        csta.setString(5, cel);
        csta.setString(6, parentesco);
        
        csta.executeUpdate();
    } catch (Exception e) {
        System.out.println("Error al insertar apoderado: " + e);
    }
}

public ArrayList<Alumno> ListarAlumnos(){
	ArrayList<Alumno>lista=new ArrayList<Alumno>();
	try {
		CallableStatement csta=Conexion.conectar().prepareCall("{call SP_LISTAR()}");
		ResultSet rs=csta.executeQuery();
		Alumno acce;
		while(rs.next()) {
			acce=new Alumno(rs.getInt(1), 
			        rs.getString(2), 
			        rs.getString(3), 
			        rs.getString(4), 
			        rs.getString(5), 
			        rs.getString(6), 
			        rs.getString(7));
			lista.add(acce);
		}
	} catch (Exception e) {}
	return lista;
}
public ArrayList<Alumno> ConsultarAlumno(String nom){
	ArrayList<Alumno> lista = new ArrayList<Alumno>();
    try {
        CallableStatement csta = Conexion.conectar().prepareCall("{call CONSULTAR_DNI(?)}");
        csta.setString(1, nom);
        ResultSet rs = csta.executeQuery();
        Alumno acce;
        while(rs.next()) {
            acce = new Alumno(
                rs.getInt(1), 
                rs.getString(2), 
                rs.getString(3), 
                rs.getString(4), 
                rs.getString(5), 
                rs.getString(6), 
                rs.getString(7)
            );
            lista.add(acce);
        }
    } catch (Exception e) {}
    return lista;
}

public int Tamaño() {
	return paci.size();
}

public Alumno Obtener(int x) {
	return paci.get(x);
}
public Alumno BuscarPorDni(String dni) {
	for(int i=0; i<Tamaño(); i++) {
		if(Obtener(i).getDni().equals(dni)) 
			return Obtener(i);
	}
	return null;
}

public void Eliminar(Alumno x)
{ paci.remove(x);
	}



}

