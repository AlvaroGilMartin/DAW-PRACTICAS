package net.projecto.examen;

public class Punto implements Debugable{
	private int x;
	private int y;
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	@Override
	public void debug() {
		System.out.println("["+x+","+y+"]");
	}
	
	

}
