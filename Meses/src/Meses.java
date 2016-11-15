//Introducimos un numero entero que y mostramos el mes al que corresponde

import java.util.Scanner;
public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int mes;
		System.out.print("Escribe el numero de mes: ");
		mes= teclado.nextInt();
		if (mes>12||mes<1)
			System.out.println("Ese mes no existe.");
		else
		{
			System.out.print("Switch: El numero " + mes + ", corresponde al mes: ");
			switch (mes)
			{
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			}
			System.out.print("If: El numero " + mes + ", corresponde al mes: ");
		if (mes==1)
			System.out.println("Enero");
		else if (mes==2)
			System.out.println("Febrero");
		else if (mes==3)
			System.out.println("Marzo");
		else if (mes==4)
			System.out.println("Abril");
		else if (mes==5)
			System.out.println("Mayo");
		else if (mes==6)
			System.out.println("Junio");
		else if (mes==7)
			System.out.println("Julio");
		else if (mes==8)
			System.out.println("Agosto");
		else if (mes==9)
			System.out.println("Septiembre");
		else if (mes==10)
			System.out.println("Octubre");
		else if (mes==11)
			System.out.println("Noviembre");
		else if (mes==12)
			System.out.println("Diciembre");
		}
		
	}

}
