package clases;

import java.time.LocalDate;
import java.util.Date;

public class Alumno {
private String dni;
private String nom;
private String cita,mp;
private Date hora;
private int cod;
private double precio;
private LocalDate fechaIncripción;
private LocalDate fechavencimiento;
public Alumno(String dni, String nom, String cita, int cod, String mp) {
	this.dni = dni;
	this.nom = nom;
	this.cita = cita;
	this.cod=cod;
	this.mp=mp;
	this.fechaIncripción=LocalDate.now();
	this.fechavencimiento=calcularVencimiento(cita);
	this.precio=calcularPrecio(cita);
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
public int getCod() {
	return cod;
}
public void setCod(int cod) {
	this.cod = cod;
}

public LocalDate getFechaIncripción() {
	return fechaIncripción;
}
public void setFechaIncripción(LocalDate fechaIncripción) {
	this.fechaIncripción = fechaIncripción;
}
public LocalDate getFechavencimiento() {
	return fechavencimiento;
}
public void setFechavencimiento(LocalDate fechavencimiento) {
	this.fechavencimiento = fechavencimiento;
}
public String getMp() {
	return mp;
}
public void setMp(String mp) {
	this.mp = mp;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
private LocalDate calcularVencimiento(String plan) {
    int mesesAsumar;
    String planLimpio = plan.toLowerCase().trim();
    switch (planLimpio) {
        case "classic plus":
            mesesAsumar = 1;
            break;
        default:
            mesesAsumar = 0;
            break;
    }
    return this.fechaIncripción.plusMonths(mesesAsumar);
}
private double calcularPrecio(String plan) {
    double costo;
    String planLimpio = plan.toLowerCase().trim();
    switch (planLimpio) {
        case "classic plus":
            costo = 209.90;
            break;
        default:
            costo = 0.0; 
            break;
    }
    return costo;
}
}
