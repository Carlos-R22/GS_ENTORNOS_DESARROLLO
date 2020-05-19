package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import Excepciones.CargoExcepcion;
import Excepciones.MesesTrabajoExcepcion;
import Excepciones.NombreEmpleadoExcepcion;
import Excepciones.NumeroEmpleadoExcepcion;

public class EMPLETest {

	Empleado e = new Empleado();
	
	@Test
	public void test1_NombreCorrecto() 
	{
		
		try
		{
			e.estableceNombreEmpleado("CarlosRomeral");
		}
		catch (NombreEmpleadoExcepcion e2) 
		{
			fail();
		}
		
		assertTrue(e.getNombreEmpleado().contains("CarlosRomeral"));
	}
	
	
	
	@Test(expected=NombreEmpleadoExcepcion.class)
	public void test_NombreIncorrecto() throws NombreEmpleadoExcepcion
	{
	         
		e.estableceNombreEmpleado("Car");
	}
	
//	@Test
//	public void test2_NombreIncorrecto() 
//	{
//		
//		try
//		{
//			e.estableceNombreEmpleado("Car");
//		}
//		catch (NombreEmpleadoExcepcion e2) 
//		{
//			System.out.println("Nombre incorrecto");
//		}
//		
//		assertEquals("Car",e.getNombreEmpleado());
//	}
	
	@Test
	public void test3_numemplecorrecto()
	{
		
		
		try 
		{ 
			e.establecerNumeroEmpleado("222");
			
		} 
		catch (NumeroEmpleadoExcepcion e2)
		{
			fail();
		}
			
		assertEquals(222, e.getNumeroEmpleado());
		
	}
	
	
	@Test
	(expected=NumeroEmpleadoExcepcion.class)
	public void test_NumEmpleIncorrecto() throws NumeroEmpleadoExcepcion
	{
	         
		e.establecerNumeroEmpleado("w2");
	}
	
//	@Test
//	public void test4_numempleincorrecto()
//	{
//		
//		
//		try 
//		{ 
//			e.establecerNumeroEmpleado("w2");
//			
//		} 
//		catch (NumeroEmpleadoExcepcion e2)
//		{
//			System.out.println("Numero de empleado incorrecto");
//		}
//			
//		assertEquals("w2",e.getNumeroEmpleado()>0);
//	}
	
	@Test
	public void test5_mesescorrecto()
	{
				
		try 
		{ 
			e.estableceMesesTrabajo("020");
			
		} 
		catch (MesesTrabajoExcepcion  e2)
		{
			fail();
		}
			
		assertEquals("020",e.getMesesTrabajo());
		
	}
	
	@Test(expected=MesesTrabajoExcepcion.class)
	public void test_nombreTest() throws MesesTrabajoExcepcion
	{
	         
		e.estableceMesesTrabajo("-89");
	}
//	@Test
//	public void test6_mesesincorrecto()
//	{
//		
//		
//		try 
//		{ 
//			e.estableceMesesTrabajo("-89");
//			
//		} 
//		catch (MesesTrabajoExcepcion e2)
//		{
//			System.out.println("Meses trbajados es incorrecto");
//		}
//			
//		assertEquals("-89",e.getMesesTrabajo());	
//	}
	
	@Test
	public void test7_directivocorrecto()
	{
		
		
		try 
		{ 
			e.establecerSerDirectivo("+");
			
		} 
		catch (CargoExcepcion e2)
		{
			fail();
		}
			
		assertTrue(e.getDirectivo());	
	}
	
	
	
	@Test(expected=CargoExcepcion.class)
	public void test_DirectivoIncorrecto() throws CargoExcepcion
	{
	         
		e.establecerSerDirectivo("-");
	}
	
//	@Test
//	public void test8_directivoincorrecto()
//	{
//		
//		
//		try 
//		{ 
//			e.establecerSerDirectivo("-");
//			
//		} 
//		catch (CargoExcepcion e2)
//		{
//			System.out.println("Directivo es incorrecto");
//		}
//			
//		assertTrue(e.getDirectivo());	
//	}
	
	@Test
	public void CalcularP1()
	{
		try
		{
			e.calcularPrima("222", "CarlosRomeral", "020", "+");
		} catch (NumeroEmpleadoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (NombreEmpleadoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (MesesTrabajoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (CargoExcepcion e2) 
		{
			e2.printStackTrace();
		}
		
	}
	@Test
	public void CalcularP2()
	{
		try
		{
			e.calcularPrima("222", "Carlos", "020", "-");
		} catch (NumeroEmpleadoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (NombreEmpleadoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (MesesTrabajoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (CargoExcepcion e2) 
		{
			e2.printStackTrace();
		}
		
	}
	
	@Test
	public void CalcularP3()
	{
		try
		{
			e.calcularPrima("222", "Carlos", "010", "+");
		} catch (NumeroEmpleadoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (NombreEmpleadoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (MesesTrabajoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (CargoExcepcion e2) 
		{
			e2.printStackTrace();
		}
		
	}
	
	@Test
	public void CalcularP4()
	{
		try
		{
			e.calcularPrima("222", "Carlos", "010", "-");
		} catch (NumeroEmpleadoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (NombreEmpleadoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (MesesTrabajoExcepcion e2) 
		{
			e2.printStackTrace();
		}catch (CargoExcepcion e2) 
		{
			e2.printStackTrace();
		}
		
	}
}


