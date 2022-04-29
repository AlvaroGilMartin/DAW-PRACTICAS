package net.projecto.CsvToDb_agil;
import java.util.*;
import java.io.File;
import java.util.ArrayList;

public class Lectura {
	public void leer (File f) {
		ArrayList<String> alum =new ArrayList<String>();
		try {
		Scanner inputFile = new Scanner(f);
		while(inputFile.hasNext()) {
			String l = inputFile.nextLine();
			alum.add(l);
		}
		Escritor escribe = new Escritor();
		escribe.insertar(alum);
		inputFile.close();
		
	}catch(Exception e) {
		System.err.println("Error al escribir el fichero");
	}
	}
}
