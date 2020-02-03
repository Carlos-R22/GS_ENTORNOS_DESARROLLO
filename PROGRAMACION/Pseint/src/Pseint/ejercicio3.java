package Pseint;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Introduce dos numeros");
		a = input.nextInt();
		b = input.nextInt();
		
		a = b;
		b = a;
		
		System.out.println(+a);
		System.out.println(+b);

	}

}
