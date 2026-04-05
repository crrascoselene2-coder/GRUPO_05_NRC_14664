package arreglo;

import java.time.LocalDate;
import java.util.ArrayList;
import clases.*;
public class ArregloPaciente {
private ArrayList<Paciente>paci;
public ArregloPaciente() {
	paci=new ArrayList<Paciente>();
    adicionar(null);
}
public void adicionar(Paciente x) {
	paci.add(x);
}
public int Tamaño() {
	return paci.size();
}
}
