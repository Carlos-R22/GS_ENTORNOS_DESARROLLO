package Pseint;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double horas;
		double salario;
		double extras;
		double salex;
		double total1;
		double total2;
		
		System.out.println("Horas que haces semanalmente");
		horas = input.nextDouble();
		
		System.out.println("Introduce tu salario (por horas)");
		salario = input.nextDouble();
		
		if (horas > 40) {
			extras = (horas - 40);
			salex = salario*1.5;
			total1  = ((horas*salario)+extras*salex);
			System.out.println("Tu salario semanal es de "+total1);
		}
		
			else 
			{
			total2= (salario*horas);
			System.out.println("Tu salario semanal es de "+total2);
			}
		}


}
