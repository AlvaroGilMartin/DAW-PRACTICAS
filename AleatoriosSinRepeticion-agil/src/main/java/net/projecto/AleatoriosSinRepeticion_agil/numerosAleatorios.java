package net.projecto.AleatoriosSinRepeticion_agil;
import java.util.*;

public class numerosAleatorios {
	
	
	public static int sacarnumeros(int numeros []) {
		
		int numero;
		numero = (int) (Math.random() *numeros[1]  + 1);
		return numero;

	}
	
	
	
	public static String numerosAle(int numeros []) {
		int  [] numerosAle = new int [numeros[0]];
		int numdenum= numeros[1];
		int pos = 0;

		boolean relleno = false;
	
		do {
			for( int i= 0; i<numerosAle.length;i++) {
				int numero = sacarnumeros(numeros);
				
				if (!(numero==numerosAle[i] && numero == numerosAle[i-pos])) {
					numerosAle[i]=numero;
					pos ++;
					
					
				}else {
					if (!(numerosAle[i]==0)) {
						relleno=true;
					}
					
				}
				
				
					
			}
			
			
		}while(relleno);
		 System.out.println(Arrays.toString(numerosAle));
		return Arrays.toString(numerosAle);
		
		
		
		
	}

	
	
}
