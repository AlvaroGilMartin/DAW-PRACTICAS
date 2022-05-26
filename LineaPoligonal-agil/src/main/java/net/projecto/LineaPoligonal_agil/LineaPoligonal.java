package net.projecto.LineaPoligonal_agil;

import java.util.ArrayList;

public class LineaPoligonal implements Debugable {
	private ArrayList <Punto> puntos;
 	public LineaPoligonal() {
 		this.puntos=new ArrayList<Punto>();
 	}
 
	@Override
	public void debug() {
		for(int i = 0 ; i<puntos.size();i++) {
			puntos.get(i).debug();		}
	}
	public void addPunto(Punto p) {
		puntos.add(p);
	}

}
