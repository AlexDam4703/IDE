package Vectores;

import java.util.Scanner;

public class VectoresBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int COLUMNAS = 2;
		final int FILAS = 2;
		Scanner sc = new Scanner(System.in);
		int [][] vectorBidimensional = new int [FILAS][COLUMNAS];
		for (int i = 0; i < FILAS; i++) {
			for (int j=0;j<COLUMNAS; j++) {
				System.out.printf("Valor de la fila %d colmuna %d%n",i,j);
				vectorBidimensional [i][j] = sc.nextInt();
			}
		}
		for (int k=0; k < FILAS ; k++) {
			for (int h=0; h<COLUMNAS; h++) {
				System.out.printf("%3d",vectorBidimensional[k][h]);
			}
			System.out.println();
		}

	}

}
