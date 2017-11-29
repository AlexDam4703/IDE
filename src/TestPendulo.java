import java.util.Scanner;

public class TestPendulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Intruduce la longitud del péndulo:");
		Scanner sc = new Scanner(System.in);
		double longitud = sc.nextDouble();
		sc.close();
		double periodo = Pendulo.calcularPeriodo(longitud);
		System.out.printf("El periodo de un pendulo de longitud %.2f "
				+ "vale %.2f%n",longitud,periodo);
	}

}
