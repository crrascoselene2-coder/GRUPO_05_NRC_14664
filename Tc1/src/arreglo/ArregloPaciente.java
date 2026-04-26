package arreglo;

import java.time.LocalDate;
import java.util.ArrayList;
import clases.*;
public class ArregloPaciente {
private ArrayList<Paciente>paci;
public ArregloPaciente() {
	paci=new ArrayList<Paciente>();
    adicionar(new Paciente("75242678", "María", "Classic Plus 1m"));
    adicionar(new Paciente("78465534", "Andrea", "Classic Plus 2m"));
    adicionar(new Paciente("89624352", "Enrique", "Classic Plus 1m"));
    adicionar(new Paciente("28364527", "Fiorella", "Classic Plus 3m"));
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
		if(Obtener(i).getDni().equals(dni)) 
			return Obtener(i);
	}
	return null;
}

public void Eliminar(Paciente x)
{ paci.remove(x);
	}


public void actualizar (Paciente x)

{
	for(int i = 0; i < Tamaño(); i++)
	{
		if (Obtener(i).getDni().equals(x.getDni()))
		{
			Obtener(i).setNom(x.getNom());
			Obtener(i).setCita(x.getCita());
			break; 	
		}
	}

}


}

