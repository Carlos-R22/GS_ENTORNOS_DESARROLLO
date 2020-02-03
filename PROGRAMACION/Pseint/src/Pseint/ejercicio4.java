package Pseint;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Dame tres numeros y veremos cual es mayor");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if (a>b) {
			if (b>c)
				System.out.println("El numero mayor es " +a);
		} 
		else
		if (b>a) {
			if (b>c)
				System.out.println("El numero mayor es "+b);
		
				else 
					System.out.println("El numero mayor es" +c);
			}
	}

}
