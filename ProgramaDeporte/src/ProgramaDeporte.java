/*
 * Programa que en funcion de la temperatura te recomienda un deporte u otro.
 */
import java.util.Scanner;
public class ProgramaDeporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		/*
		 * Variable de temp para temperatura y constante de "Deporte recomendado: " para usarlo en los mensajes de salida.
		 */
		int temp;
		final String Dep = ("Deporte recomendado: ");
		
		System.out.print("¿Que temperatura hay?: ");
		temp = teclado.nextInt();
		System.out.println("La temperatura es " + temp);
		
		if (temp>29){
			System.out.print(Dep + "Natacion");
		}
		else if(temp>21){
			System.out.print(Dep + "Tenis");
		}
		else if(temp>0){
			System.out.print(Dep + "Golf");
		}
		else if(temp>=-12){
			System.out.print(Dep + "Esqui");
		}
		else if(temp<-12&&temp>-275){
			System.out.print(Dep + "Damas");
		}
		else if(temp<=-275){
			System.out.print("Esa temperatura no es posible");
		}
		
	}

}
