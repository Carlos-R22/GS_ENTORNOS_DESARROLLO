package Java2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EjerciciosJava2 
{
	

	public void RepeticionCaracter(Scanner input) 
	{
		
		String aa = new String("Hola mi gente, ando bien bacano por el caribe pirriando");
		
		String be=input.next();
		boolean s;
		int c=0;
		int j=aa.length();
		int cont=0;
		while (cont<j)
		{
			if (s=aa.contains(be))
			{
				aa=aa.replaceFirst(be, "");
				c = c+1;
			}
			cont = cont +1;
		}	
			
		System.out.println("El caracter "+be+" aparece "+c+ " veces en la frase ");
	}
	
	public void CuentaCadenas(Scanner input)
	{
		input.nextLine();
		String cade = input.nextLine();
		int f=cade.length();
		int cletras=0;
		int a=0;
		int c=1;
		int cnum=0;
		int cesp = 0;
		String cade1;
		
		
		
		while (c<=f) 
		{
			cade1=cade.substring(a,c);
			a++;
			c++;
			
	
		Pattern letra=Pattern.compile("[a-zA-Z]");
		Matcher letras=letra.matcher(cade1);
		Pattern espacio=Pattern.compile(" ");
		Matcher espacios=espacio.matcher(cade1);
		Pattern digi=Pattern.compile("\\d");
		Matcher digis=digi.matcher(cade1);
		
		if (letras.matches())
		{
			cletras++;
		}
		
		if (espacios.matches()) 
		{
			cesp++;
		}
		
		if (digis.matches()) 
		{
			cnum++;
		}
			
		}
		System.out.println("La frase tiene "+cletras+" letras, "+cesp+" espacios y "+cnum+" numeros");
		
		
	}

	
	public void InvertirCadena(Scanner input)
	{
//		System.out.println("Introduzca la cadena a invertir");
//		String cadena = input.nextLine();
		  		input.nextLine();
		        String palabra;
		        palabra=input.nextLine();
		        String palabrainvertida="";
		       
		        
		        for (int i = palabra.length()-1; i>=0; i--)
		        {
		            palabrainvertida += palabra.charAt(i);
		        }
		 
		        System.out.println("La palabra invertida es:\n"+ palabrainvertida);
		
	}
	
		public void CalculaPiramide (Scanner input)
		{
			System.out.println("Pulse 1, si sabe el numero de lados, la medida de estos y la altura");
			System.out.println("Pulse 2, si sabe la medida de las aristas y el numero de lados");
			int a = input.nextInt();
			
			
			switch (a)
			{
			case 1:
				System.out.println(Piramide1(a, input)+" metros cubicos");
			break;
			case 2:
				System.out.println(Piramide2(a, input)+" metros cubicos");
			break;
			}
		}
		
		public static double Piramide1(double resultado, Scanner input)
		{
			double lados, longitud, apotema, arista, altura, angC, area;
			System.out.println("Introduce el numero de lados");
			lados=input.nextDouble();
			System.out.println("Introduce la longitud de estos");
			longitud=input.nextDouble();
			System.out.println("Introduce la altura");
			altura=input.nextDouble();
			angC=360/lados;
			angC=Math.tan(angC);
			angC=angC*-1;
			apotema=longitud/(2*(angC/2));
			area=(lados*longitud*apotema)/2;
			resultado = (area*altura)/3;
			
			
			return resultado;
		}
		
		public static double Piramide2(double resultado, Scanner input)
		{
			double lados, longitud, apotema, arista, altura, angC, area;
			
			
			
			return resultado;
		}
	
	
	public void NumerosAzar(Scanner input)
	{
		int intento, contador=0, n=100;
		int azar=(int) (Math.random()*n)+1;

		while (contador<=6)
		{
			contador++;
			System.out.println("Introduce el numero");
			intento=input.nextInt();
			
			if (azar==intento)
			{
				System.out.println("Has acertado");
				contador=7;
			}
			if (azar>intento)
			{
				System.out.println("Es un numero mas grande");
			}
			if (azar<intento)
			{
				System.out.println("Es un numero mas pequeño");
			}
			else 
				System.out.println("Lo siento bro...");
		}
		
		
	}
	
	public void CadenaMayusculas(Scanner input)
	{
		
		System.out.println(Mayusculas (null, input));
		
	}
	public static String Mayusculas (String resultado, Scanner input)
	{
		System.out.println("Introduce una frase");
		String a = input.nextLine();
		System.out.println("Introduce una cadena que incluya algo de la anterior");
		String b = input.nextLine();
		
		boolean c = a.contentEquals(b);
		

		return resultado;
	}
	
	
	public void CadenaInversa(Scanner input)
	{
		String resultado="" ;
		System.out.println(Inversa(resultado, input));
		
	}
	
	public static String Inversa (String resultado, Scanner input) 
	{
		System.out.println("Introduce una palabra");
		input.nextLine();
        String palabra;
        palabra=input.nextLine();
        String palabrainvertida="";
        String total="";
        
        for (int i = palabra.length()-1; i>=0; i--)
        {
            palabrainvertida += palabra.charAt(i);
            String d;
            d = palabrainvertida.substring(0, 1);
           total=palabrainvertida.replace(d, "");
        }
 
        System.out.println("La palabra invertida es:\n"+palabra+total);	
		
		
	 return resultado;	
	}
	
	
	public void Coseno90 (Scanner input)
	{
		
		System.out.println(Coseno9(0, input));
	}
	
	public static double Coseno9( double resultado, Scanner input)
	{
		int cont=0;
		
		
		while (cont<=90)
		{
			
			resultado = Math.cos(cont);
			System.out.println(resultado);
			cont = cont+5;
		}
		
		return resultado;
	}
	
	public void RaizCuadrada(Scanner input)
	{
		double x,y,total,n;
		System.out.println("Introduce una variable x y una variable y");
		x=input.nextDouble();
		y=input.nextDouble();
		
		n=x+(4*(y*y*y));
		total=Math.sqrt(n);
		System.out.println("La raiz cuadrada es " +total);
	}
	
	public void RaizCubica(Scanner input)
	{
		double x,y,e,total,n;
		System.out.println("Introduce una variable x, una variable y y una variable e");
		x=input.nextDouble();
		y=input.nextDouble();
		e=input.nextDouble();
		
		n=x*y*e;
		total=Math.pow(n, 1.0/3.0);
		System.out.println("La raiz cuadrada es " +total);
	}
	
	public void SinEspacios (Scanner input)
	{
		System.out.println(Espacios("", input));
	}
	public static String Espacios (String resultado, Scanner input)
	{
		input.nextLine();
		System.out.println("Introduce una cadena");
		String cad;
		cad=input.nextLine();
		
		resultado=cad.replace(" ", "");
		
		return resultado;
	}
	
	public void Pitagoras(Scanner input)
	{
		System.out.println(Teoremas(0, input));
	}
	
	public static double Teoremas( double resultado, Scanner input)
	{
		System.out.println("Introduce los dos catetos y veremos la hipotenusa");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double f=((a*a)+(b*b));
		
		resultado = Math.sqrt(f);
		
		return resultado;
	}
	
	public void CadenaPalabrasInversas(Scanner input)
	{
		System.out.println(PalabrasInversas("", input));
	}
	public static String PalabrasInversas(String resultado, Scanner input)
	{
		input.nextLine();
		System.out.println("Escribe una cadena");
		String a = input.nextLine();
		
		String palabrainvertida="";
	    String total="";
	        
	        for (int a1 = a.indexOf(" ") ; a1>=0; a1--)
	        {
	            palabrainvertida += a.charAt(a1);
	            String d;
	            d = palabrainvertida.substring(0, 1);
	            total=palabrainvertida.replace(d, "");
	        }
	        System.out.println(a.strip());   
		return resultado;
	}
	
	public void CalcularEsfera(Scanner input )
	{
		String resultado="";
		System.out.println(Esfera( resultado, input));
	}
	public static String Esfera(String resultado, Scanner input)
	{
		System.out.println("Dame el radio de una esfera");
		double r=input.nextDouble();		
		
		double volumen=(3*Math.PI*(r*r*r))/4;
		double area=4*Math.PI*(r*r);
		System.out.println();
		return resultado="El area es "+area+" y el volumen es de "+volumen+" centimetros cubicos";
	}
	
	public void LetraDNI (Scanner input)
	{
		System.out.println(DNI( (char) 0, input));
	}
	public static char DNI(char resultado, Scanner input)
	{
		System.out.println("Introduce el numero de tu DNI (SIN LETRA)");
		int num=input.nextInt();
		String letra="TRWAGMYFPDXBNJZSQVHLCKE";
		
		int posicion = num % 23;
		resultado = letra.charAt(posicion);

		return resultado;
	}
	public void Dados (Scanner input)
	{
		System.out.println(DadosAzar("", input));
	}
	public static String DadosAzar(String resultado, Scanner input)
	{
		int dado1 = (int) (Math.random() * 6) + 1;
		int dado2 = (int) (Math.random() * 6) + 1;
		
		
		return resultado="Los numeros que han salido son "+dado1+" y "+dado2;
	}
	public void SectorCircular(Scanner input)
	{
		
	}
}
