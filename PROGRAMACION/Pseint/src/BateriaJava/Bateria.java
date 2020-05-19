package BateriaJava;
import java.util.Scanner;




public class Bateria 
{
	
	public void Suma10(Scanner input)
	{
		System.out.println(S10(0, input));
	}
	public static int S10(int resultado, Scanner input)
	{
		input.nextDouble();
		System.out.println("Introduce 10 numeros");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		int e =input.nextInt();
		int f=input.nextInt();
		int g=input.nextInt();
		int h=input.nextInt(); 
		int i=input.nextInt();
		int j=input.nextInt(); 
		 
		return resultado = a+b+c+d+e+f+g+h+i+j;
	}
	public void SumaN (Scanner input)
	{
		System.out.println("Cuantos numeros quieres sumar?");
		int cant= input.nextInt();
		int total = 0; 
		
		
		for (int cont = 0; cont <=cant; cont++)
		{
			System.out.println("Ingrese el numero");
			int num = input.nextInt();
			total = total + num;
			
		}
		System.out.println("El resultado es: "+total);
	}
	public void Bisiesto(Scanner input)
	{
		System.out.println(CalculoBisiesto("", input));
	}
	public static String CalculoBisiesto(String resultado, Scanner input)
	{
		System.out.println("Hola! Introduce el año");
		int año = input.nextInt();
		
		if (año%100==0 && año%400==0) 
		{
			System.out.println(año+" es bisiesto :)");
		}
		if (año%4==0)
		{
				System.out.println(año+" es bisiesto :)");
		}

		else
		{
				System.out.println("No es bsiesto bro");
		}
		return resultado;
		
	}
	
	public void DiaSiguiente(Scanner input)
	{
		System.out.println(NextDay("", input));
	}
	public static String NextDay(String resultado, Scanner input)
	{
		return resultado;
	}
	
	public void Conversion(Scanner input)
	{
		System.out.println("Vamos a ver que quieres convertir");
		System.out.println("1. Galones a litros");
		System.out.println("2. Litros a galones ");
		System.out.println("3. Pies a otra medida");
		System.out.println("Introduce el numero del men´´ú que quieras para transformar");
		int a = input.nextInt();
		System.out.println(Convertido(a, a, input));
	}
	public static double Convertido (int a, double resultado, Scanner input)
	{
		switch (a)
		{
			case 1:
				System.out.println("Introduce la cantidad de galones");
				double b= input.nextInt();
				
				resultado=b*3.7854;
				
			
			break;
			case 2:
				System.out.println("Introduce la cantidad de litros");
				double c= input.nextInt();
				
				resultado=c/3.7854;
				
			break;
			case 3:
				System.out.println("A que quieres convertir los pies?");
				System.out.println("1. Pulgadas");
				System.out.println("2. Yardas");
				System.out.println("3. Metros");
				System.out.println("4. Centimetros");
				System.out.println("Introduce el numero del menu para acceder a el");
				int d = input.nextInt();
				
				switch (d)
				{
				case 1:
					System.out.println("Introduce la medida en pies");
					int pies= input.nextInt();
					
					resultado=pies * 12;
				break;
				case 2:
					System.out.println("Introduce la medida en pies");
					int pes= input.nextInt();
					
					resultado=((pes*12)*2.54)/94;
				break;
				case 3:
					System.out.println("Introduce la medida en pies");
					int pis= input.nextInt();
					
					resultado=((pis*12)*2.54)/100;
				break;
				case 4:
					System.out.println("Introduce la medida en pies");
					int pie= input.nextInt();
					
					resultado=(pie*12)*2.54;
				break;
				}
			
		}
		
		return resultado;
	}
	public void Conversion2(Scanner input)
	{
		int cont=0;
		int fin=100;
		
		while(cont<=fin)
		{
			cont++;
			double gal=cont*3.7854;
			System.out.println(gal);
			if (cont%10==0)
			{
				System.out.println("");
			}
		}
	}
	public void Fibonacci1(Scanner input) 
	{
	
		System.out.println("Cuantos numeros de la sucesión de Fibonacci sacamos");
		int n=input.nextInt();
		int f = 0, m=0;
		int c1=1;
		int c2;
		
		for (int cn=0;cn<=n;cn++)
		{
			c2 = f;
			f=c1+f;
			c1=c2;
				
			System.out.println(c1);
			
		}
			
	}
	
	public void Pares100(Scanner input)
	{
		for (int con=1; con<=100;con++)
			if (con%2==0)
				System.out.println(con);
	}
	public void Impares100(Scanner input) 
	{
		for (int con=1; con<=100;con=con+2)
			
				System.out.println(con);
	}
	
	public void Suma1050(Scanner input)
	{
		
			int suma = 10;
			for (int i = 10; i <= 50; ++i)
			{
				if (i % 2 == 0)
				{
					suma += i;
				}
			}
			System.out.println("Suma comprendida "+suma);
			
	}
	public void MCM(Scanner input)
	{
		int num1, num2, n1, n2, mod = 0, mcm=0;
		
		num1 =input.nextInt();
		num2 =input.nextInt();
		
		n1=num1;
		n2=num2;
		
		while (num1 != num2) 
		{
			if (num1>num2)
			{
				num1 = num1-num2;
			}
			else 
			{
				num2 = num2-num1;
			}
		}
		mod=num2;
		mcm=n1*n2/mod;
		System.out.println(mcm);
		
	}
//	public void boolean esPrimo(int numero){
//		System.out.println("Introduce el numero"); 
//	
//		int contador = 2;
//
//		  boolean primo=true;
//		  while ((primo) && (contador!=numero)){
//		    if (numero % contador == 0)
//		      primo = false;
//		    contador++;
//		  }
//		  return primo;
//	}
	public void Primo100(Scanner input)
	{
		int con =0, n=2;
		String s = "";
		int c=100;
		while (n>2&&con<c)		
		{
			s+=n+" ";
			con++;
		}
		n++;
	}
			 
	public void FacturaIVA(Scanner input)
	{
		System.out.println("introduce el importe de la factura");
		int imp = input.nextInt();
		System.out.println("Ahora vamos a añadir el iva. Indique cuanto de iva (4, 10, 21)");
		int a = input.nextInt();
		switch (a) {
		case 4:
			System.out.println(imp*1.04);
		break;
		case 10:
			System.out.println(imp*1.10);
		break;
		case 21:
			System.out.println(imp*1.21);
		break;
		}
	}
	public void Capital3(Scanner input)
	{
		System.out.println("Introduce el capital a invertir");
		double cap = input.nextDouble();
		int meses = 0;
		while (cap < cap*3) {
			
		meses ++;
		cap = cap*1.06;
		}
		System.out.println("La cantidad invertida tardara "+meses+" en triplicarse");
	}
	public void ProductoFactores(Scanner input)
	{
		System.out.println("introduce un numero mayor que 2");
		int num = input.nextInt();
		
		
			for (int i = 1; i < num/2; i++)
			
				for (int j = 1; j < num/2; j++)
				{
					if (i*j == num)
					{
						System.out.println(i+" x "+j+" = "+num);
					}				
				}

	}
	public void PGeometrica(Scanner input)  
	{
		System.out.println("Introduce el numero de terminos");
		int nt = input.nextInt();
		System.out.println("Introduce el primer termino");
		int pt = input.nextInt();
		System.out.println("Introduce la razon");
		int r = input.nextInt();
		int res = 0;
		int a=0;
		for (int con = 0;con<=nt;con++) 
		{
			
			res = pt * r;
			a = res;
			con++;
		
		}
		System.out.println(a);
	}
	public void NPerfecto (Scanner input)
	{
		System.out.println("Introduce un numero");
		int N = input.nextInt();
		int aux = 0;
		for (int i = 0; i < N; i++)
		{
			if (N % i == 0)
			{
				aux += i;
			}
		}
		if (aux == N)
		System.out.println(aux+ N); 
		
	}
	public void ProductoSumas(Scanner input) 
	{
		int producto = 0;
		int a,b;
		a = input.nextInt();
		b = input.nextInt();
		do 
		{
			producto += a;
			--b;
		} while (b > 0);
		input.close();
		System.out.println(producto);
	}
	public void DivisionRestas (Scanner input)
	{
		int resultado = 0;
		double a,b;
		a = input.nextDouble();
		b = input.nextDouble();
		while (a > b)
		{
			a -= b;
			++resultado;
		}
		input.close();
		System.out.println(resultado);
	}
//	//public String cifradoCesar(String acifrar)
//	{
//		String abcdario="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
//		String cifrada="";
//		for (int i=0;i<acifrar.length();i++)
//			
//		return acifrar;
//		
//	}
	
}
