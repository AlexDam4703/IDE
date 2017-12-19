package Vectores;

import java.util.Arrays;
public class Colecciones {

	public static void main(String[] args) {
		int [] vector1 = new int [10];
		int [] vector2 = new int [10];
		for (int i =0 ; i < 10; i ++) {
			vector1[i] = 3 ;
	}
		
		for (int j=0; j<10; j++ ) 
			Arrays.fill(vector2, 5);
		Colecciones.mostrar(vector1, vector2);
	}
	
	public static void mostrar (int vector1 [], int vector2 []) {
		for (int k=0; k<10 ; k++)
		System.out.printf("%d %10d%n",vector1[k],vector2[k]);
	}
}
