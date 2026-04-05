package clases;

import java.util.Date;

public class Paciente {
private String dni;
private String nom;
private String cita;
private Date hora;
public Paciente(String dni, String nom, String cita, Date hora) {
	super();
	this.dni = dni;
	this.nom = nom;
	this.cita = cita;
	this.hora = hora;
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
public String getCita() {
	return cita;
}
public void setCita(String cita) {
	this.cita = cita;
}
public Date getHora() {
	return hora;
}
public void setHora(Date hora) {
	this.hora = hora;
}

}
