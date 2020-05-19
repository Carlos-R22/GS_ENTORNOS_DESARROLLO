package Pseint;
import java.util.Scanner; 

public class Ejercicio1 {

	
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			int base,base2;
			int altura,altura2;
			int area,area2;
			
			System.out.println("base del primero");
			base = input.nextInt();
			System.out.println("altura del primero");
			altura = input.nextInt();
			
			area=(base*altura)/2;
			
			System.out.println("el area del primero es " + area);
			
			System.out.println("Base del segundo");
			base2 = input.nextInt();
			System.out.println("Altura del segundo");
			altura2 = input.nextInt();
			
			area2 = (base2*altura2)/2;
			
			System.out.println("El area del segundo es " +area2);
			
			if (area > area2)
				System.out.println("El area del primero es mayor que el del segundo");
			else 
				System.out.println("El area del segundo es mayor");
				
	}

}
