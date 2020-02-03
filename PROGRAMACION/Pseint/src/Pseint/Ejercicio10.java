package Pseint;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a,b,c,d,e,f,g;
		
		System.out.println("Introduce las calificaciones de las 6 asignaturas");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		g = (a+b+c+d+e+f)/6;
		
		if (g>=4) {
			System.out.println("Enhorabuena se va a ahorrar el 30% de la matricula en el siguiente curso!");
		}
		else {
			System.out.println("Lo siento, pero tendra que abonar la matricula al completo. El año que viene esfuercese mas!");
		}
	}

}
