package Pseint;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Dame un numero y veremos si es par o impar");
		
		a = input.nextInt();
		
		if (a==0)
			System.out.println("El numero no es par ni impar");
		else
			
			if (a%2==0)	{
				System.out.println("El numero es par");
			
						}
			else
				System.out.println("El numero es impar");
	
		
	}

}
