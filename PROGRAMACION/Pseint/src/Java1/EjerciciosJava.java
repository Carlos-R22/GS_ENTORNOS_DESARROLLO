 package Java1;
import java.util.Scanner;

public class EjerciciosJava 
{

	
	public void SumaDosNumeros(Scanner input) //vamos a sumar dos numeros dados
	{
	int a,b;
	
	System.out.println("Introduce dos numeros y daremos la suma");
	a = input.nextInt();
	b = input.nextInt();
	
	System.out.println("El resultado de la suma es "+(a+b));
	}
	
	public void EsPrimo(Scanner input)
	{
		int a,b,n;
		System.out.println("Introduce un numero");
		a = input.nextInt();
		b = 0;
		n = 0;
		
		while (n<=a) 
		{
			n = n+1;
			if (a%n==0)
				b = b+1;
		}
		if (b<=2) 
			System.out.println("Es primo");
		else
			System.out.println("No es primo");
		} 
	
	
	
	public void Factorial(Scanner input)
	{
		int a,b,n;
		System.out.println("Introduce un numero");
		a = input.nextInt();
		b = 1;
		n = 0;
		
		while (n<a) 
		{
		n++;
		b = b*n	;
		System.out.println(b);
		}
	}	
	
	
	public void OcurrenciaNumerica(Scanner input) 
	{
		
	}
	
	public void DarVuelta(Scanner input)
	{
	 int a, b=0, resto;
	 System.out.println("Dame un numero y le daremos la vuelta");
	 
	 a = input.nextInt();
	 
	 while (a>0)
	 {
		 resto = a % 10;
		 b = b * 10 + resto;
		 a /= 10; 
	 }
	 System.out.println("El numero invertido es "+b);
	 
	}
		
	public void DecimalBinario(Scanner input)
	{
		int a,b;
		String binario = "";
		
		System.out.println("Dame un numero decimal y lo transformaremos a binario");
		a = input.nextInt();
		if (a > 0) 
		{
            while (a > 0)
            {
                if (a % 2 == 0)
                {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                a =  a / 2;
            }
        } 
		else if (a == 0)
		{
            binario = "0";
        } 
		else 
		{
            binario = "No se pudo convertir el numero. Ingrese solo números positivos";
        }
        System.out.println("El número convertido a binario es: " + binario);
    }
	
	
	public void DecimalOctal(Scanner input)
	{
		System.out.println("Introduce un numero en decimal y lo pasaremos a octal");
		int a = input.nextInt();
		String Octal = Integer.toOctalString(a);
		System.out.println("El numero en octal es "+Octal);
		
	}

	public void DecimalHex(Scanner input)
	{
		System.out.println("Introduce un numero en decimal y lo pasaremos a hexadecimal");
		int a = input.nextInt();
		String hex = Integer.toHexString(a);
		System.out.println("El numero en hexadecimal es "+hex);
	}
	
	public void PrimosAnteriores(Scanner input) 
	{
		int a,b,n,c;
		System.out.println("Introduce un numero");
		a = input.nextInt();
		b = 0;
		n = 0;
		
		
			while (n<a) 
			{
				n = n+1;
				System.out.println(n);
//				if (a%n==0)
//					b = b+1;
			}
//			if (b<=2) 
//				System.out.println(n+"Es primo");
//			else
//				System.out.println(n+"No es primo");
		
					
	}
	
	
	public void FactorialesAnteriores(Scanner input)
	{
		int a,b,n,c;
		System.out.println("Introduce un numero");
		a = input.nextInt();
		b = 1;
		n = 0;
		c = 0;
		while (c<a)
		{
			while (n<a) 
			{
				n++;
				b = b*n	;
				System.out.println(b);
			}
		}
	}
	
	
	
}
