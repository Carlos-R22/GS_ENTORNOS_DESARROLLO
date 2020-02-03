package Pseint;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Dame dos numeros y haremos su division, cambie el segundo numero");
		
		a = input.nextInt();
		b = input.nextInt();
		
		if (b==0)
			System.out.println("No se puede hacer la operacion");
		else 
			System.out.println(a/b);
	}

}
