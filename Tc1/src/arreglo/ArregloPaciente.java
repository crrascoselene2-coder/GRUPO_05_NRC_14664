package arreglo;

import java.util.ArrayList;
import clases.*;
public class ArregloPaciente {
private ArrayList<Paciente>paci;
public ArregloPaciente() {
	paci=new ArrayList<Paciente>();
	
}
public void adicionar(Paciente x) {
	paci.add(x);
}
public int Tamaño() {
	return paci.size();
}
}
