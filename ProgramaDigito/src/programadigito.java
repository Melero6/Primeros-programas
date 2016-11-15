//introduce una letra y te da el numero que corresponde al teclado del movil

import java.util.Scanner;

public class programadigito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean est = false; //Asigno un valor inicial para que empieze el bucle
		String letra; //variable que va a guardar el valor que ponemos por el teclado
		int error=0; //variable que contara los errores que se ecriben
		int h=0; //variable que contara las veces que se introduce h
		final String nu ="El numero que corresponde a la letra es: "; //constante para escribir menos cada vez que se muestra un resultado
		
		while (est==false) //bucle siempre que est==false
		{
			System.out.print("Escriba una letra: ");
			Scanner teclado= new Scanner(System.in);
			letra = teclado.next(); //esta parte para el bucle porque espera que le pongamos el dato y presionemos "enter" para continuar


			switch (letra)
			{
			case "a": //comparamos la entrada con las posibilidades
			case "b":
			case "c":
				System.out.println(nu+"2"); //imprime nu + 2, nu es igual a "El numero que corresponde a la letra es: "
				break;
			case "d":
			case "e":
			case "f":
				System.out.println(nu+"3");
				break;
			case "h":
				++h; //suma mas uno al la variable h
			case "g":
			case "i":
				System.out.println(nu+"4");
				break;
			case "j":
			case "k":
			case "l":
				System.out.println(nu+"5");
				break;
			case "m":
			case "n":
			case "ñ":
			case "o":
				System.out.println(nu+"6");
				break;
			case "p":
			case "q":
			case "r":
			case "s":
				System.out.println(nu+"7");
				break;
			case "t":
			case "u":
			case "v":
				System.out.println(nu+"8");
				break;
			case "w":
			case "x":
			case "y":
			case "z":
				System.out.println(nu+"9");
				break;
			case "0": //en caso 0 mostramos el conteo de errores y h y finalizamos el programa
				System.out.println("Ha cometido: "+error+" errores");
				System.out.println("Ha escrito h: "+h+" veces");
				System.out.println("- Finalizando programa -");
				est=true; //ponemos est=true para que el bucle se termine
				break;
			default:
				System.out.println(nu+"Nulo");
				++error; //suma uno a la variable error
				break;


			}//final del switch (letra)

		}//final del while (est==false)

	}

}
