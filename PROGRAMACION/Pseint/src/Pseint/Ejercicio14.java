package Pseint;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Dame dos numeros y veremos cuantos son positivos");
		a = input.nextInt();
		b = input.nextInt();
		
		if (a>0&&b>0)
			System.out.println("Son positivos");
		
		if (a>0&&b<0)
			System.out.println("Uno positivo y otro negativo");
		
		if (a<0&&b>0)
			System.out.println("Uno positivo y otro negativo");
		
		if (a<0&&b<0)
			System.out.println("Los dos son negativos");
	}
}


