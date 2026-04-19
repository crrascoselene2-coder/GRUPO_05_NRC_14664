package arreglo;

import java.time.LocalDate;
import java.util.ArrayList;
import clases.*;
public class ArregloPaciente {
private ArrayList<Paciente>paci;
public ArregloPaciente() {
	paci=new ArrayList<Paciente>();
    adicionar(new Paciente("75242678", "María", "Resfriado"));
    adicionar(new Paciente("78465534", "Andrea", "Fractura"));
    adicionar(new Paciente("89624352", "Enrique", "Dolor de cabeza"));
    adicionar(new Paciente("28364527", "Fiorella", "Náuseas"));
}
public void adicionar(Paciente x) {
	paci.add(x);
}
public int Tamaño() {
	return paci.size();
}

public Paciente Obtener(int x) {
	return paci.get(x);
}
public Paciente BuscarPorDni(String dni) {
	for(int i=0; i<Tamaño(); i++) {
		if(Obtener(i).getDni().equals(dni)) return Obtener(i);
	}
	return null;
}

public void Eliminar(Paciente x)
{ paci.remove(x);
	}
}
