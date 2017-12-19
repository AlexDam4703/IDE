package Vectores;

import java.util.ArrayList;
import java.util.Arrays;

public class ColeccionAleatoria {

	public static void main(String[] args) {
		int vector1 [] = new int [100];
		for (int i =0 ; i<100 ; i++) {
			vector1 [i] = (int) (101 * Math.random());
	}
		System.out.println("El valor de la media es: " + ColeccionAleatoria.valorMedio(vector1));
		System.out.println("El vector ordenado quedaria asi :");ColeccionAleatoria.vectorOrdenado(vector1);
		/* Es interesante saber que al aplicarle este metodo el vector cambia y se quedaria ordenado, lo que se
		conoce como un metodo mutante, para solventar esto se podria hacer una copia original del vector original de la siguinte forma:
		int[] copiaOriginal []=vector1.clone(); coiando asi el original en otro vector, en este caso no lo hariamos dado que no es necesario 
		para el ejercicio en cuestion. Asi mismo el metodo carece de sentido dado que se podria efectuar directamente sin la necesidad de hacer un metodo
		quedando de la siguiente forma syso(""+Arrays.sort(vector1))*/
		
		System.out.println("El valor de la desviacion tipica es de: "+ DesviacionTipica(vector1));
		int minimoMaximo [] = valorMaximoMinimo(vector1);
		System.out.printf("El valor mas pequeño es: %d y el valor mas grande es: %d",minimoMaximo[0],minimoMaximo[1]);
		
}
	public static double valorMedio (int vector1 []) {
		double suma =0;
		for (int i=0; i <100 ; i ++) {
			suma += vector1[i];
		}
		
		double media = suma /100;
		return  media;
	}
	public static void vectorOrdenado (int vector1 []) {
	     
	  Arrays.sort(vector1);
	  System.out.println(Arrays.toString(vector1));
	}
	public static int [] vecotorPares (int vector1 []) {
		ArrayList listaPares = new ArrayList(); 
		for (int i =0; i <100; i++) {
			if (vector1[i]%2==0) {
			listaPares.add(vector1[i]);
			}
		}
		
		int vectorPares [] = new int [100];
		return vectorPares;
	}
	public static double DesviacionTipica (int vector1 []) {
		double suma = 0;
		for (int i : vector1) {
			suma += Math.pow(i - valorMedio(vector1), 2);
		}
		return suma / vector1.length; 
	}
	public static int[] valorMaximoMinimo (int vector1 []) {
		int [] vectorDevuelto = new int [2];
			vectorDevuelto [0] = vector1 [0];
			vectorDevuelto [1] = vector1 [vector1.length-1];
			return vectorDevuelto;
	}
}
