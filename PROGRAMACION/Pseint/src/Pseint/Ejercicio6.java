package Pseint;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("Dime cuantos niños hay");
		a = input.nextInt();
		
		System.out.println("Dime cuantas niñas hay");
		b = input.nextInt();
		
		c = (a*100)/(a+b);
		d = 100 - c; 
		
		System.out.println("El porcentaje de chicos es de "+c);
		System.out.println("El porcentaje de chicas es de "+d);
	}

}
