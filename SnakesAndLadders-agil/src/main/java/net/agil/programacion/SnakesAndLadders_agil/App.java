package net.agil.programacion.SnakesAndLadders_agil;

public class App {
	public static void main(String[] args)

	{
		 if(args.length == 0) {
		int posjugador1 = 1;
		int posjugador2 = 1;

		tablero2.turno(posjugador1, posjugador2);}
		 else {

			 String [] tiradas = args[0].split(",");
			 int [] posiciones = new int [tiradas.length];
			 try {
			 for ( int i =0 ; i  < tiradas.length; i++) {
				 
				 posiciones[i]= Integer.parseInt(tiradas[i]);
				 if (posiciones[i] >6 || posiciones[i]<=0) {
					 System.out.println("Alguna tirada no es válida");
					 return;
				 }
		
			 }
			 }catch(Exception e) {
				System.out.println("Algun tirada no es válida");
				return;
			 }
				
			 tablero3.turno(posiciones);
		 }

		
	}

}
