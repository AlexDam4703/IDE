package com.iesvirgendelcarmen.test;
import com.iesviergendelcarmen.matematicas.*;

import java.util.Scanner;

public class TestMatematicas {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		System.out.println("Intruzca la base y la altura del triangulo");
		double base = lector.nextDouble();
		double altura = lector.nextDouble();
		System.out.println("Introdzca el lado del pentagono regular o del hexagono");
		double lado = lector.nextDouble();
		lector.close();
		System.out.printf("El area del tringualo de base %.0f y de altura %.0f es: %.2f%n" ,base, altura, Geometria.areaTriangulo(base,altura));
		System.out.printf("El area del pentagono de lado %.0f es de : %.3f%nEl area del Hexagono de lado %.0f es de: %.3f",lado, Geometria.areaPentagono(lado),lado,Geometria.areaHexagonoRegular(lado));
	}

}
