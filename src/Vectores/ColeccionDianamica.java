package Vectores;

import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionDianamica {

	public static void main(String[] args) {
		ArrayList <String> listaCadena = new ArrayList();
		int salir = 0; 
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println("Intruzca la cadena");
			String cadena = lector.nextLine();
			
			if (cadena.equalsIgnoreCase("final"))
				salir = 1;
				else 
					listaCadena.add(cadena);
		} while (salir == 0);
		System.out.println("las cadena mas larga: " + cadenaMasLarga(listaCadena));
		System.out.println("¿la Cadena contiene \"hola\"?: "+contieneCadena(listaCadena,"hola"));
		System.out.println("Intruzca la cadena nueva que quiere intruducir");
		añadirCadena(listaCadena, lector.nextLine());
		System.out.println("la nueva lista queda asi: "+ listaCadena);
		System.out.println("Intruduzca la cadena que quiera eliminar: ");
		borrarCadena (listaCadena,lector.nextLine());
		System.out.println("la lista queda asi: "+ listaCadena);
		lector.close();
	}
	public static ArrayList <String> cadenaMasLarga (ArrayList<String> listaCadena){
		int nuevoMaximo = 0;
		for (int i =0; i < listaCadena.size() ; i++ ) {
			if (listaCadena.get(i).length() >= nuevoMaximo ) {
				nuevoMaximo = listaCadena.get(i).length();
			}
		}
		ArrayList <String> cadenaMasLarga = new ArrayList ();
		for (int k=0 ; k < listaCadena.size() ; k ++ ) {
			if (listaCadena.get(k).length() >= nuevoMaximo) {
				cadenaMasLarga.add(listaCadena.get(k));
			}
		}
		return cadenaMasLarga;
		
	}
	public static boolean contieneCadena (ArrayList <String> listaCadena , String comparar) {
		
		return listaCadena.contains(comparar);
		
	}
	public static void añadirCadena (ArrayList<String> listaCadena , String nuevo) {
		if (!nuevo.equalsIgnoreCase("final")){
			listaCadena.add(nuevo);
		}
	}
	public static void borrarCadena (ArrayList<String> listaCadena , String borrar) {
		if (listaCadena.contains(borrar))
			listaCadena.remove(borrar);
		else 
			System.out.println("La cadena no se encuentra en la lista");
			
		
	}
}
