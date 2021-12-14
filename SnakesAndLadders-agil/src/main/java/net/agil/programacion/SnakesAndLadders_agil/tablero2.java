package net.agil.programacion.SnakesAndLadders_agil;

import java.util.Scanner;

public class tablero2 {

	public static void tablero(int posjugador1, int posjugador2) {
		System.out.println("Bienvenido a Snakes and Ladders, juega XX contra ##, empieza XX");
		System.out.println("Tablero Inicial, ambos jugadores están en la casilla 01");
		for (int i = 1; i <= 25; i++) {
			int posicion = i;
			if (posicion == posjugador1 && posicion == posjugador2) {
				System.out.print("X# ");
				continue;
			}
			if (posicion == posjugador1) {
				System.out.print("XX ");
				continue;
			}
			if (posicion == posjugador2) {
				System.out.print("## ");
				continue;
			}
			System.out.printf("%02d ", i);

			if (i % 5 == 0) {
				System.out.println("");
			}
		}
		System.out.println("Escaleras: 02->18 13->17 15->23");
		System.out.println("Serpientes: 18->04 20->06 23->14");
		System.out.println("------------------------------------------------------------");

	}

	public static void tableroJugar(int posjugador1, int posjugador2) {
		System.out.println("Tirada del Jugador XX - pulsa enter");
		int avanza = tirarDado();
		for (int i = 1; i <= 25; i++) {
			int posicion = i;
			if (posicion == posjugador1 && posicion == posjugador2) {
				System.out.print("X# ");
				if (i % 5 == 0) {
					System.out.println("");
				}

				continue;
			}
			if (posicion == posjugador1) {
				System.out.print("XX ");
				if (i % 5 == 0) {
					System.out.println("");
				}

				continue;
			}
			if (posicion == posjugador2) {
				System.out.print("## ");
				if (i % 5 == 0) {
					System.out.println("");
				}
				continue;
			}
			System.out.printf("%02d ", i);

			if (i % 5 == 0) {
				System.out.println("");
			}
			
		}
		System.out.println("Escaleras: 02->18 13->17 15->23");
		System.out.println("Serpientes: 18->04 20->06 23->14");
		System.out.println("------------------------------------------------------------");
		
		

	}

	public static void tableroJugar2(int posjugador1, int posjugador2) {	
		System.out.println("Tirada del Jugador ## - pulsa enter");
		int avanza = tirarDado();
		for (int i = 1; i <= 25; i++) {
			int posicion = i;
			if (posicion == posjugador1 && posicion == posjugador2) {
				System.out.print("X# ");
				if (i % 5 == 0) {
					System.out.println("");
				}
				continue;
			}
			if (posicion == posjugador1) {
				System.out.print("XX ");
				if (i % 5 == 0) {
					System.out.println("");
				}
				continue;
			}
			if (posicion == posjugador2) {
				System.out.print("## ");
				if (i % 5 == 0) {
					System.out.println("");
				}
				continue;
			}
			System.out.printf("%02d ", i);
			if (i % 5 == 0) {
				System.out.println("");
			}
			

		}
		System.out.println("Escaleras: 02->18 13->17 15->23");
		System.out.println("Serpientes: 18->04 20->06 23->14");
		System.out.println("------------------------------------------------------------");
	}

	public static int tirarDado() {

		int numero;
		numero = (int) (Math.random() * 6 + 1);
		return numero;

	}
	public static int serpienteEscalera (int posjugador) {
		switch (posjugador) {
		case 2:
			System.out.println("Has caido en una escalera");
			posjugador=18;
			return posjugador;
		case 13:
			System.out.println("Has caido en una escalera");
			posjugador=17;
			return posjugador;
		case 15:
			System.out.println("Has caido en una escalera");
			posjugador=23;
			return posjugador;
		case 18:
			System.out.println("Has caido en una serpiente");
			posjugador=4;
			return posjugador;
		case 20:
			System.out.println("Has caido en una serpiente");
			posjugador=6;
			return posjugador;
		case 26:
			System.out.println("Has caido en una serpiente");
			posjugador=14;
			return posjugador;

		default:
			return posjugador;
		}
		
		
	}

	
	

	public static void turno(int posjugador1, int posjugador2) {
		boolean ganada = false;
		tablero(posjugador1, posjugador2);
		Scanner keyboard = new Scanner(System.in);
		String space = keyboard.nextLine();
		int turno = 1;
		while (!ganada) {
			if (turno % 2 == 0) {
				 
					System.out.println("Turno: "+turno);
					int avanza = tirarDado();
					turno++;
					
					System.out.println("Has sacado un "+ avanza);
					posjugador2 = posjugador2 + avanza;
					posjugador2=serpienteEscalera(posjugador2);
					System.out.println("Avanzas a la casilla "+ posjugador2);
					tableroJugar2(posjugador1, posjugador2);
					if (posjugador2 >= 25) {
						ganada = true;
						System.out.println("¡Ganaste!");
						System.out.println("Fin de partida, gana ##");
						break;

					}
					Scanner teclado = new Scanner(System.in);
					String name = teclado.nextLine();
				

			} else {
				
				System.out.println("Turno: "+turno);
				int avanza = tirarDado();
				turno++;
				System.out.println("Has sacado un "+ avanza);
				posjugador1 = posjugador1 + avanza;
				posjugador1=serpienteEscalera(posjugador1);
				System.out.println("Avanzas a la casilla "+ posjugador1);
				tableroJugar(posjugador1, posjugador2);
				if (posjugador1 >= 25) {
					ganada = true;
					System.out.println("¡Ganaste!");
					System.out.println("Fin de partida, gana XX");
					break;
				}
				Scanner teclado = new Scanner(System.in);
				String name = teclado.nextLine();
			}
		

		}

	}

}
