package arreglo;

import java.time.LocalDate;
import java.util.ArrayList;
import clases.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
public class ArregloAlumno {
private ArrayList<Alumno>paci;
public ArregloAlumno() {
	paci=new ArrayList<Alumno>();
   cargarDesdeArchivoTxt();
}
public void adicionar(Alumno x) {
	paci.add(x);
}
public void adicionar(String dni, String nom, String cita, int cod, String mp){
    Alumno nuevoPaciente = new Alumno(dni, nom, cita, cod,mp);
    paci.add(nuevoPaciente);
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


public void actualizar (Alumno x)

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
public int generarCodigoCorrelativo() {
    if (paci.isEmpty()) {
        return 1;
    }
    int codigoMasAlto = 0;
    for (int i = 0; i < paci.size(); i++) {
        Alumno alumnoActual = paci.get(i);
        if (alumnoActual.getCod() > codigoMasAlto) {
            codigoMasAlto = alumnoActual.getCod();
        }
    }
    return codigoMasAlto + 1;
}
public void guardarEnArchivoTxt() {
	try {
		PrintWriter pw = new PrintWriter(new FileWriter("alumnos.txt"));
		
		for (int i = 0; i < Tamaño(); i++) {
			Alumno p = Obtener(i);
			pw.println(p.getCod() + ";" + 
			           p.getDni() + ";" + 
			           p.getNom() + ";" + 
			           p.getCita() + ";" + 
			           p.getPrecio() + ";" + 
			           p.getMp() + ";" + 
			           p.getFechaIncripción() + ";" + 
			           p.getFechavencimiento());      
		}
		pw.close(); 
	} catch (Exception e) {
		System.out.println("Error al guardar el archivo: " + e.getMessage());
	}
}
public void cargarDesdeArchivoTxt() {
	try {
		File archivo = new File("alumnos.txt");
		if (!archivo.exists()) {
			return; 
		}

		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String linea;
		
		while ((linea = br.readLine()) != null) {
			String[] partes = linea.split(";");
			
			int cod = Integer.parseInt(partes[0]);
			String dni = partes[1];
			String nom = partes[2];
			String cita = partes[3];
			double precio = Double.parseDouble(partes[4]);
			String mp = partes[5];
			LocalDate fi = LocalDate.parse(partes[6]);
			LocalDate fv = LocalDate.parse(partes[7]);
			
			Alumno pCargado = new Alumno(dni, nom, cita, cod, mp); 
			
			pCargado.setPrecio(precio); 
			pCargado.setFechaIncripción(fi); 
			pCargado.setFechavencimiento(fv);
			
			paci.add(pCargado); 
		}
		br.close();
	} catch (Exception e) {
		System.out.println("Error al cargar el archivo: " + e.getMessage());
	}
}
}

