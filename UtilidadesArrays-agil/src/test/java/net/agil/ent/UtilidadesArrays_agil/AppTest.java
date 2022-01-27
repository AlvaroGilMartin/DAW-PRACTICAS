package net.agil.ent.UtilidadesArrays_agil;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coop.gsd.daw.prog.UtilidadesArrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	@DisplayName("Comprueba la media")
	public void CompruebaMedia() {
		int[] array = { 3, 5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double notaMedia = Ua1.media(array);
		assertEquals(5, notaMedia, 0.001);
	}

	@Test
	@DisplayName("Comprueba  la media con negativos")
	public void CompruebaMediaNegativos() {
		int[] array = { 3, -5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double notaMedia = Ua1.media(array);
		assertEquals(2.5, notaMedia, 0.001);
	}

	@Test
	@DisplayName("Comorueba el numero maximo")
	public void CompruebaMaximo() {
		int[] array = { 3, 5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double maxNum = Ua1.maximo(array);
		assertEquals(8, maxNum, 0.001);
	}

	@Test
	@DisplayName("Comprueba el numero maximo con negativos")
	public void CompruebaMaxNegativo() {
		int[] array = { 3, -5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double numMax = Ua1.maximo(array);
		assertEquals(8, numMax, 0.001);
	}

	@Test
	@DisplayName("Comrpueba indice del maximo numero")
	public void CompruebaMaxIndice() {
		int[] array = { 3, 5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double maxIndice = Ua1.maximoIndice(array);
		assertEquals(2, maxIndice, 0.001);
	}

	@Test
	@DisplayName("Comprueba indice del maximo numero con negativos")
	public void CompruebaMaxIndiceNegativo() {
		int[] array = { 3, -5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double maxIndice = Ua1.maximoIndice(array);
		assertEquals(2, maxIndice, 0.001);
	}

	@Test
	@DisplayName("Comprueba minimo numero")
	public void CompruebaNumMinimo() {
		int[] array = { 3, 5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double minNum = Ua1.minimo(array);
		assertEquals(3, minNum, 0.001);
	}

	@Test
	@DisplayName("Comprueba minimo numero con negativos")
	public void CompruebaMinimoNumNegativo() {
		int[] array = { 3, -5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double minNum = Ua1.minimo(array);
		assertEquals(-5, minNum, 0.001);
	}

	@Test
	@DisplayName("Comprueba indice minimo numero")
	public void CompruebaMinimoNumIndice() {
		int[] array = { 3, 5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double minNum = Ua1.minimoIndice(array);
		assertEquals(0, minNum, 0.001);
	}

	@Test
	@DisplayName("Comprueba indice minimo numero negativo")
	public void CompruebaMinimoIndiceNegativo() {
		int[] array = { 3, -5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		double minNum = Ua1.minimoIndice(array);
		assertEquals(1, minNum, 0.001);
	}

	@Test
	@DisplayName("Comprueba inremento nuevo array")
	public void CompruebaIncrementar() {
		int [] array = { 3, 5, 8, 4 };
		int num = 1;
		int [] sol = {4,6,9,5};
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		int [] arrayb = Ua1.incrementar(array, num);
		assertArrayEquals(sol, arrayb);	
	}
	@Test
	@DisplayName("Comprueba incremento con negativos")
	public void CompruebaIncrementarNegativo() {
		int [] array = { 3, -5, 8, 4 };
		int num = 1;
		int [] sol = {4,-4,9,5};
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		int [] arrayb = Ua1.incrementar(array, num);
		assertArrayEquals(sol, arrayb);	
		
	}
	@Test
	@DisplayName("Comprueba incremento array orginal")
	public void CompruebaIncrementarArray() {
		int [] array = { 3, 5, 8, 4 };
		int num = 1;
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		Ua1.incrementarArray(array, num);
		assertArrayEquals(new int []{4,6,9,5},array);
	}
	@Test
	@DisplayName("Comprueba incremento array con negativos")
	public void CompruebaIncrementarArraynegativo() {
		int [] array = { 3, -5, 8, 4 };
		int num = 1;
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		Ua1.incrementarArray(array, num);
		assertArrayEquals(new int [] {4,-4,9,5},array);	
	}
	@Test
	@DisplayName("Comprueba invertir array en nuevo array")
	public void CompruebaInvertir() {
		int [] array = { 3, 5, 8, 4 };
		int num = 1;
		int [] sol = {4,8,5,3};
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		int [] arrayb = Ua1.invertir(array);
		assertArrayEquals(sol, arrayb);	
	}
	@Test
	@DisplayName("Comprueba invertir con negativos")
	public void CompruebaInvertirNegativo() {
		int [] array = { 3, -5, 8, 4 };
		int num = 1;
		int [] sol = {4,8,-5,3};
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		int [] arrayb = Ua1.invertir(array);
		assertArrayEquals(sol, arrayb);	
	}
	@Test
	@DisplayName("Comprueba invertir mismo array")
	public void CompruebaInvertirArray() {
		int [] array = { 3, 5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		Ua1.invertirArray(array);
		assertArrayEquals(new int [] {4,8,5,3},array);	
	}
	@Test
	@DisplayName("Comprueba invertir con negativos array original")
	public void CompruebaInvertirArrayNegativo() {
		int [] array = { 3, -5, 8, 4 };
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		Ua1.invertirArray(array);
		assertArrayEquals(new int [] {4,8,-5,3},array);	
	}
	@Test
	@DisplayName("Comprueba mutabilidad en incrementar")
	public void CompruebaMutabilidadIncrementar() {
		int [] array = { 3, 5, 8, 4 };
		int [] arrayb = {3,5,8,4};
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		 Ua1.incrementar(array, 1);
		assertArrayEquals(array,arrayb);
	}
	@Test
	@DisplayName("Comprueba mutabilidad en invertir")
	public void CompruebaMutabilidadInvertir() {
		int [] array = { 3, 5, 8, 4 };
		int [] arrayb = {3,5,8,4};
		UtilidadesArrays Ua1 = new UtilidadesArrays();
		 Ua1.invertir(array);
		assertArrayEquals(array,arrayb);
	}
	
}
