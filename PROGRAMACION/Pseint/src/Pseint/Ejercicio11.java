package Pseint;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String turno;
		String dia;
		int a = 10;
		double b = 13.5;
		double d = b * 1.15;
		
		System.out.println("Indique en que turno ha trabajado");
		turno = input.nextLine();
		
		System.out.println("Indique si trabajo en festivo o no(si/no)");
		dia = input.nextLine();
		
		if (turno == "nocturno") {
			if (dia == "si")
			
			System.out.println(+d);
		}
		else {
			System.out.println(8*b);
		}
		if (turno == "diurno") {
			if (dia == "si")
			System.out.println(8*(a*1.1));
		}
		else {
			System.out.println(8*a);
		}
	}

}
