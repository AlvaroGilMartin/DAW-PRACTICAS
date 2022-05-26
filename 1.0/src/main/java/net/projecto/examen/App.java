package net.projecto.examen;

public class App 
{
    public static void main( String[] args ){
    	for(int i = 0; i < args.length; i++) {
    		String [] parejas = args[i].split(";");
    		
    		String pareja = parejas[i].toString();
    		String pareja2 = parejas[i+1].toString();
    		
    		String[] x  =pareja.split(",");
    		String [] y =pareja2.split(",");
    		
    		int xe = Integer.parseInt(x[0]);
    		int ye =  Integer.parseInt(x[1]);
    		
    		Punto p = new Punto(xe,ye);
    		
    		int x2 = Integer.parseInt(y[0]);
    		int y2 =  Integer.parseInt(y[1]);
    		
    		Punto p2 = new Punto(x2,y2);
    		
    		LineaPoligonal linea = new LineaPoligonal();
    		linea.addPunto(p);
    		linea.addPunto(p2);
    		 
    		linea.debug();
    		  }
    	}
    	
    	
    }

