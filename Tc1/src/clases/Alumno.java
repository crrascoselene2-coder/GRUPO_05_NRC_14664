package clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.Date;

public class Alumno {
private int código;
private String dni;
private String nom;
private String apellidos;
private String celular;
private String fecha_nacimiento;
private String estado;

public Alumno(String dni, String nom, String apellidos, String celular, String fecha_nacimiento, String estado) {
	super();
	this.dni = dni;
	this.nom = nom;
	this.apellidos = apellidos;
	this.celular = celular;
	this.fecha_nacimiento = fecha_nacimiento;
	this.estado = estado;
}
public Alumno(int código, String dni, String nom, String apellidos, String celular, String fecha_nacimiento,
		String estado) {
	super();
	this.código = código;
	this.dni = dni;
	this.nom = nom;
	this.apellidos = apellidos;
	this.celular = celular;
	this.fecha_nacimiento = fecha_nacimiento;
	this.estado = estado;
}
public int getCódigo() {
	return código;
}
public void setCódigo(int código) {
	this.código = código;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getCelular() {
	return celular;
}
public void setCelular(String celular) {
	this.celular = celular;
}
public String getFecha_nacimiento() {
	return fecha_nacimiento;
}
public void setFecha_nacimiento(String fecha_nacimiento) {
	this.fecha_nacimiento = fecha_nacimiento;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}


}

