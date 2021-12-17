package net.projecto.AleatoriosSinRepeticion_agil;

public class App {
	public static void main(String[] args) {
		String[] tiradas = args[0].split(",");
		int[] numeros = new int[tiradas.length];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(tiradas[i]);
		}
		if (args.length > 1) {
			return;
		} else {
			if (args.length <= 0) {
				System.out.println("PARAMETROS: <numero-de-enteros-a-generar> <maximo-entero>");
			}

			numerosAleatorios.numerosAle(numeros);

		}

	}
}
