package Java1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("A que ejercicio quieres ir?");
		a = input.nextInt();
		
		
		EjerciciosJava Ej = new EjerciciosJava();

	
		switch (a)
		{
		case 1:
			Ej.SumaDosNumeros(input);
		break;
		case 2:
			Ej.EsPrimo(input);
		break;
		case 3:
			Ej.Factorial(input);
		break;
		case 4:
			Ej.OcurrenciaNumerica(input);
		break;
		case 5:
			Ej.DarVuelta(input);
		break;
		case 6:
			Ej.DecimalBinario(input);
		break;
		case 7:
			Ej.DecimalOctal(input);
		break;
		case 8:
			Ej.DecimalHex(input);
		break;
		case 9:
			Ej.PrimosAnteriores(input);
		break;
		case 10:
			Ej.FactorialesAnteriores(input);
		break;
		}
	}

}
