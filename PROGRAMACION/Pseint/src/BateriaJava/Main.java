package BateriaJava;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Bateria bat = new Bateria();
		
		
		System.out.println("A que ejercicio quieres ir?");
		int con = input.nextInt();
		
		
		
		switch (con)
		{
		case 1:
			bat.Suma10(input);
		break;
		case 2:
			bat.SumaN(input);
		break;
		case 3:
			bat.Bisiesto(input);
		break;
		case 4:
			bat.DiaSiguiente(input);
		break;
		case 5:
			bat.Conversion(input);
		break;
		case 6:
			bat.Conversion2(input);
		break;
		case 7:
			bat.Fibonacci1(input);
		break;
		case 8:
			bat.Pares100(input);
		break;
		case 9:
			bat.Impares100(input);
		break;
		case 10:
			bat.Suma1050(input);
		break;
		case 11:
			bat.MCM(input);
		break;
//		case 12:
//			bat.esPrimo(input);
//		break;
		case 13:
			bat.Primo100(input);
		break;
		case 14:
			bat.Capital3(input);
		break;
		case 17:
			bat.ProductoFactores (input);
		break;
		case 18:
			bat.PGeometrica (input);
		break;
		case 19:
			bat.NPerfecto(input);
		break;
		case 20:
			bat.ProductoSumas(input);
		break;
		case 21:
			bat.DivisionRestas(input);
		break;
		}
		input.close();
	}

}
