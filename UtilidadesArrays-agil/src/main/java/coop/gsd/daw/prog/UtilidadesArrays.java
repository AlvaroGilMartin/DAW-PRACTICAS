package coop.gsd.daw.prog;

import java.util.Arrays;

public class UtilidadesArrays {
	/**
	 * La funcion media  recoge un array de enteros y devuelve la media de la suma de los numeros guardados en el array.
	 * @param array: array de enteros que nos pasan.
	 * @return media que guarda el resultado de hacer toda la operación.
	 */


public static double media (int [] array) {

	     double media = 0;
	     for (int i = 0; i< array.length; i++) {
	    	 media+=array[i];
	    	 
	     }
	     media/=array.length;
	    return media;   
	    }       
/**
 * La función maximo recoge un array de enteros y 
 * devuleve el mayor numero de los numeros guardados en el array.
 * @param array: array de enteros que nos pasan.
 * @return max que devuelve el mayor numero que esta almacenado en el array.
 */
	


public static int maximo ( int [] array){
	int max = -40000;
	for (int i = 0; i< array.length; i++){
	if (array[i] > max) {
		max = array[i];
		
	}
	}
	return max;
}
/**
 * La funcion maximoIndice recoge un array de enteros y 
 * devuelve la posicion donde se encuentra el mayor numero de los numeros almacenados en el array.
 * @param array: array de enteros que nos pasan.
 * @return indice que devuelve la posicion donde se encuenta el numero mayor del array.
 */


public static int maximoIndice ( int [] array){
	int max = -40000;
	int indice = 0;
	for (int i = 0; i< array.length; i++){
	if (array[i] > max) {
		max = array[i];
		indice = i;
	}
	}
	return indice;
}
/**
 * La funcion minimo recoge un array de enteros y devuelve el menor numero de todos los numeros almacenados en el array.
 * @param array:array de enteros que nos pasan.
 * @return min devuelve el menor numero del array.
 */


public static int minimo ( int [] array){
	int min = 40000;
	for (int i = 0; i< array.length; i++){
	if (array[i] < min) {
		min = array[i];
		
	}
	}
	return min;
}
/**
 * La funcion minimoIndice recoge un array de enteros y 
 * devuelve la posicion donde se encuentra el menor numero de todos los almacenados en el array.
 * @param array: array de enteros que nos pasan.
 * @return indice devuelve la posicion donde se encuentra el menor numero del array.
 */
public static int minimoIndice ( int [] array){
	int min = 40000;
	int indice = 0;
	for (int i = 0; i< array.length; i++){
	if (array[i] < min) {
		min = array[i];
		indice = i;
	}
	}
	return indice;
}
/**
 * La funcion incrementar recoge un array de enteros y el numero que le vamos a sumar a cada una de las posiciones del array 
 * y devuelve un array nuevo.
 * @param array: array de enteros que nos pasan.
 * @param num: numero entero que nos pasan para sumar.
 * @return  arraysuma devuelve un nuevo array con los numeros ya sumados.
 */

public static int[] incrementar (int [] array, int num) {
	int [] arraysuma  = new int [array.length];
	for (int i = 0; i< array.length; i++){
		arraysuma[i]=array[i]+num;
		
	}return arraysuma;

}
/**
 * La funcion incrementarArray recoge un array de enteros y el numero que le vamos a sumar a cada una de las posiciones del array 
 * y cambia el mismo array pero con la suma ya realizada.
 * @param array: array de enteros que nos pasan.
 * @param num: numero entero que nos pasan para sumar.
 */


public static void  incrementarArray (int [] array, int num) {
	for (int i = 0; i< array.length; i++){
		array[i]=array[i]+num;
	
	}	
}
/**
 * La funcion invertir recoge un array de enteros y devuelve un array nuevo con las posiocnes al reves.
 * @param array: array de enteros que nos pasan.
 * @return arrayinverso devuelve el array introducido pero al intercambiando los numeros al reves en un nuevo array
 */

public static int [] invertir (int [] array) {
	int arrayinverso[] = new int [array.length];
	int u=0;
	 for (int i = array.length-1; i>=0; i--){
		 arrayinverso[u]=array[i];
		 u++;
	 }return arrayinverso;
	
	
}
/**
 * La funcion invertirArray recibe un array y cambia las posiones del array hasta invertirlo
 * @param array: array que nos pasan
 */

	
public static void  invertirArray (int [] array) {
	int u = 0;
	int aux= 0;
	for (int i = array.length -1; i >=array.length/2; i--) {
		aux = array[u];
		array[u]= array[i];
		array[i]=aux;
		u++;
	}
	
	
}





}


