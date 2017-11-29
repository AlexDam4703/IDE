/**
 * Clase que proporciona metodos relacionados con calculos de un péndulo
 * @author Alex
 *@version 1.0
 */
public class Pendulo {
	/**
	 * Constante que representa la aceleración de la gravedad terrestre.
	 */
	public static final double GRAVEDAD = 9.8;
	/**
	 * Método que calcula el periodo del péndulo
	 * @param longitud que es la longitud de dicho pendulo
	 * @return double reprenstado e periodo de oscilacion
	 */
	public static double calcularPeriodo(double longitud) {
		
		return 2*Math.PI*Math.sqrt(longitud/GRAVEDAD);
		
	}
}
