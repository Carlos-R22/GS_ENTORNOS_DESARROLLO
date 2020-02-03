package Pseint;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nombre;
		double a,b,c,d,e;
		d = 1;
		
		while(d==1)
		{
		System.out.println("Introduce tu nombre");
		nombre = input.nextLine();
			
		System.out.println("Introduce tu nota practica");
		a = input.nextDouble();
		
		System.out.println("Introduce tu nota de problemas");
		b = input.nextDouble();
		
		System.out.println("Introduce tu nota de teoria");
		c = input.nextDouble();
		
		e = (a*0.1)+(b*0.4)+(c*0.5);
		
		if (e>=0&&e<=10)
		{
			System.out.println("El almuno "+nombre+ " tiene esta nota"+e);
		}	
			
		else 
		{
			System.out.println("No se puede hacer la media con esos numeros");	
		}
		
		
		
		System.out.println("Quiere añadir algun alumno mas?(1=Si/0=No)");
		d = input.nextInt();
		}
		
	}

}
