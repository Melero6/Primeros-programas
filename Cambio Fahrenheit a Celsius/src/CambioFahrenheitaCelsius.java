/*
 * Programa para cambiar de Fahrenheit a Celsius
 * 
 * Octubre 2016
 */
public class CambioFahrenheitaCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float far = 78F; //el 78 sin F seria un double por defecto y luego lo haria float
		float cels;
		cels = (float) ((far-(float)32) /1.8F);
		System.out.println("Celsius = " + cels);
		System.out.println("Farenheit = " + far);
	}

}
