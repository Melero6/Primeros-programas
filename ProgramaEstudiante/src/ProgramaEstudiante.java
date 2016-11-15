/*
 * Programa de calculo de faltas, para ver si un alumno a perdido el derecho a la evalucion continua.
 */

import java.util.Scanner;

public class ProgramaEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		int alu; //ID del alumno.
		int faltas,horas; //Faltas en horas y horas totales de la asignatura.
		int porc; //Porcentaje de faltas.
		
		System.out.println("Introduzca el ID del alumno: ");
		alu = teclado.nextInt();
		System.out.println("El ID del alumno es: "+alu);
		
		System.out.println("Introduzca el numero de horas que tiene la asignarura: ");
		horas = teclado.nextInt();
		System.out.println("La asignatura tiene: "+horas+" Horas");
		
		System.out.println("Introduzca el numero de horas que ha faltado el alumno: ");
		faltas = teclado.nextInt();
		
		porc=(faltas*100)/horas;
		
		if (porc>=15){
			System.out.println("- AVISO: Pierde derecho a la evalucion continua.");
			System.out.println("- El alumno: "+ alu);
			System.out.println("- En una asignatura que tiene: "+horas+" Horas");
			System.out.println("- Ha faltado: "+faltas+" Horas");
			System.out.println("- Corresponde con un: "+ porc +"% de faltas");

		}
		else if (porc>=10){
			System.out.println("- AVISO: Ya ha faltado un 10%");
			System.out.println("- El alumno: "+ alu);
			System.out.println("- En una asignatura que tiene: "+horas+" Horas");
			System.out.println("- Ha faltado: "+faltas+" Horas");
			System.out.println("- Corresponde con un: "+ porc +"% de faltas");

		}
		else if (porc>=5){
			System.out.println("- AVISO: Ya ha faltado un 5%");
			System.out.println("- El alumno: "+ alu);
			System.out.println("- En una asignatura que tiene: "+horas+" Horas");
			System.out.println("- Ha faltado: "+faltas+" Horas");
			System.out.println("- Corresponde con un: "+ porc +"% de faltas");

		}
		
	}

}
