package Pseint;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c,d,e;
		
		System.out.println("Introduce tres numeros y haremos una operacion. Si el primer numero es negativo haremos una multiplicacion, sino lo es, haremos una suma.");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		d = a*b*c;
		e = a+b+c;
		
		if (a<0) {
			System.out.println("El resultado de la multiplicacion es " +d ); 
			}	
		else {
			System.out.println("El resultado de la suma es " +e);
		}
	}

}
