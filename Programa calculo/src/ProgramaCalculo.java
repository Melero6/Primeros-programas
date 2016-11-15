/*
 * Programa que compara 3 numeros. Si el primero es negativo los multiplica, si no los suma. 
 */
import java.util.Scanner;
public class ProgramaCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int num1,num2,num3;
		int suma,mult;
		System.out.print("Ingrese el primer valor: ");
		num1 = teclado.nextInt();
		System.out.println("El primer valor es: " + num1);
		
		System.out.print("Ingrese el segundo valor: ");
		num2 = teclado.nextInt();
		System.out.println("El segundo valor es: " + num2);
		
		System.out.print("Ingrese el tercer valor: ");
		num3 = teclado.nextInt();
		System.out.println("El tercer valor es: " + num3);
		
		//Mult si el primero es negativo
		if (num1<0){
			mult= num1*num2*num3;
			System.out.print ("El resultado de la multiplicacion es: " + mult);
		}
		//Si es positivo sumo
		else {
			suma= num1+num2+num3;
			System.out.print ("El resultado de la suma es: " + suma);
		}
		
	}

}
