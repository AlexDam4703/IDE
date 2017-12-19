package com.iesviergendelcarmen.matematicas;

public class Geometria {
	public static double areaTriangulo (double base, double altura) {
		
		return (base * altura) / 2;
	}
	public static double areaHexagonoRegular (double lado) {
		return  ((lado*6)*(lado/1.15))/2;
	}
	public static double areaPentagono (double lado) {
		
		return ((lado*5)*(lado/1.45))/2;
	}
}
