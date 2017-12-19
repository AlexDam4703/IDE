package Vectores;

import java.util.ArrayList;

public class Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList listaCadenas = new ArrayList();
		listaCadenas.add("juan");
		listaCadenas.add("pedro");
		listaCadenas.add("alex");
		listaCadenas.add("tomas");
		listaCadenas.add("miguel");
		System.out.println("Tamaño de la cadena: "+ listaCadenas.size());
		System.out.println("Elemento 0 de la lista: "+listaCadenas.get(0));
		//recorrer una lista
		for (int i =0; i<listaCadenas.size();i++) {
			System.out.printf("Elemento %d de la lista %S%n",i,listaCadenas.get(i));
		}
		listaCadenas.remove(0);
		System.out.println(listaCadenas);
		listaCadenas.add(0, "joselito");
		System.out.println(listaCadenas);
	}

}
