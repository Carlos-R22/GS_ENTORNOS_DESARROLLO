package Pseint;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dia;
		int mes;
		int a�o;
		
		System.out.println("Dame un dia");
		dia = input.nextInt();
		
		
		while (dia>=1&&dia<=31) 
		{
			System.out.println("Dame un mes (numero)");
			mes = input.nextInt();
			
			while (mes>=1&&mes<=12)
			{
				System.out.println("Dame un a�o");
				a�o = input.nextInt();
				
				switch (mes)
				{
				case 1:
					System.out.println(dia+"enero" +a�o);
					break;
				case 2:	
					System.out.println(dia+ "de febrero de "+a�o);
					break;
				case 3:	
					System.out.println(dia+ "de marzo de "+a�o);
					break;
				case 4:	
					System.out.println(dia+ "de abril de "+a�o);
					break;
				case 5:	
					System.out.println(dia+ "de mayo de "+a�o);
					break;
				case 6:	
					System.out.println(dia+ "de junio de "+a�o);
					break;
				case 7:	
					System.out.println(dia+ "de julio de "+a�o);
					break;
				case 8:	
					System.out.println(dia+ "de agosto de "+a�o);
					break;
				case 9:	
					System.out.println(dia+ "de septiembre de "+a�o);
					break;
				case 10:	
					System.out.println(dia+ "de octubre de "+a�o);
					break;
				case 11:	
					System.out.println(dia+ "de noviembre de "+a�o);
					break;
				case 12:	
					System.out.println(dia+ "de diciembre de "+a�o);
					break;
					
				default:
						System.out.println("Yo k se tio, no te rayes");
						break;
				}
			}
				
		}
		 
			
	}

}
