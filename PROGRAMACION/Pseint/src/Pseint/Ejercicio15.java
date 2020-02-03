package Pseint;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a,b;
		
		System.out.println("Para acceder a grado superior necesitas, bachillerato o la prueba de acceso.");
		System.out.println("¿Tienes bachillerato?(Si/No)");
		a = input.nextLine();
		
		if (a.contentEquals("Si")) 
		{
			System.out.println("Bienvenido a formacion profesional de grado superior");
		}
		else {
			System.out.println("Tienes la prueba de acceso?(Si/No)");
			b = input.nextLine();
			if (b.contentEquals("Si"))
				System.out.println("Bienvenido a formacion profesional de grado superior");
			else 
				System.out.println("No puedes acceder");
		}

	}

}
