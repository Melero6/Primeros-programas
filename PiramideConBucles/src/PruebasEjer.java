
public class PruebasEjer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,suma;
		i = 1;
		
		while ( i <= 40 ) {
			suma = 1;
			j = 0;
			while ( suma <= i ) {
				
				System.out.print(suma + " ");
				++suma;
			}
			System.out.println(" ");
			i++;
		}

	}
}

