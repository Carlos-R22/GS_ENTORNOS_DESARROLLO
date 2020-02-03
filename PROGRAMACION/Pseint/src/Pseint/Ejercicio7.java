package Pseint;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mes;
		double importe; 
	
		System.out.println("Indique en que mes hizo la compra (el numero)");
		mes = input.nextInt();
		
		System.out.println("Indique el importe de esta");
		importe = input.nextDouble();
		
		if (mes == 10) 
			{
			importe = importe * 0.85;
			System.out.println("El importe de su compra ha quedado en " +importe);
			}
		else 
			{
			System.out.println("Lo siento pero no se le puede aplicar ningun descuento");
			}
		
	}

}
