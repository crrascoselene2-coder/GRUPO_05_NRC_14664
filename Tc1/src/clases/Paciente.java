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

}
