package Java2;

import java.util.Scanner;

import Java1.EjerciciosJava;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	
		
		int a;
		System.out.println("A que ejercicio quieres ir?");
		a = input.nextInt();
		
		
		EjerciciosJava2 Ej2 = new EjerciciosJava2();

	
		switch (a)
		{
		case 1:
			Ej2.RepeticionCaracter(input);
		break;
		case 2:
			Ej2.CuentaCadenas(input);
		break;
		case 3:
			Ej2.InvertirCadena(input);
		break;
		case 4:
			Ej2.CalculaPiramide(input);
		break;
		case 5:
			Ej2.NumerosAzar(input);
		break;
		case 6:
			Ej2.CadenaMayusculas(input);
		break;
		case 7:
			Ej2.CadenaInversa(input);
		break;
		case 8:
			Ej2.Coseno90(input);
		break;
		case 9:
			Ej2.RaizCuadrada(input);
		break;
		case 10:
			Ej2.RaizCubica(input);
		break;
		case 11:
			Ej2.SinEspacios(input);
		break;
		case 12:
			Ej2.Pitagoras(input);
		break;
		case 13:
			Ej2.CadenaPalabrasInversas(input);
		break;
		case 14:
			Ej2.CalcularEsfera(input);
		break;
		case 15:
			Ej2.LetraDNI(input);
		break;
		case 16:
			Ej2.Dados(input);
		break;
		}
		input.close();
	}

}
