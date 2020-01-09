package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Computer
{

	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		final int MALLA_ROLLO=25;
		final int MALLA_PLANA=40;
		final double DESCUENTO_PLANA=0.08;
		final double DESCUENTO_ROLLO=0.06;
		String tipo_Malla="";
		String fraseAntiguedad="";
		String finalizar="";
		double precioTotal=0;
		int precioMetros=0;
		int metros=0;
		int antiguedad=0;
		double descuento=0;
		
		while(!finalizar.equals("si"))
		{
			System.out.println("Introduzca el tipo de malla que quieres (rollo o plana)");
			tipo_Malla=(bufferLectura.readLine());
		
			if (tipo_Malla=="rollo")
			{
				System.out.println("Introduzca la cantidad de metros que quiera");
				metros=Integer.parseInt(bufferLectura.readLine());
				precioMetros=MALLA_ROLLO*metros;
				System.out.println("Introduzca tu antiguedad");
				antiguedad=Integer.parseInt(bufferLectura.readLine());
				if(antiguedad<5)
				{
					fraseAntiguedad="Al no tener al menos 5 años comprado malla en rollo no dispone de un descuento";
				}
				else
				{
					fraseAntiguedad="Al tener al menos 5 años comprado malla en rollo  dispone de un descuento"+DESCUENTO_ROLLO;
					descuento=precioMetros*DESCUENTO_ROLLO;
				}
			}
			else if (tipo_Malla=="plana")
			{
				System.out.println("Introduzca la cantidad de metros que quiera");
				metros=Integer.parseInt(bufferLectura.readLine());
				precioMetros=MALLA_PLANA*metros;
				System.out.println("Introduzca tu antiguedad");
				antiguedad=Integer.parseInt(bufferLectura.readLine());
				if(antiguedad<6)
				{
					fraseAntiguedad="Al no tener al menos 6 años comprado malla en rollo no dispone de un descuento";
				}
				else
				{
					fraseAntiguedad="Al tener al menos 6 años comprado malla en rollo  dispone de un descuento"+DESCUENTO_PLANA;
					descuento=precioMetros*DESCUENTO_PLANA;
				}	
			}
			else
			{
				System.out.println("Tipo de malla erroneo");
			}
			precioTotal=precioMetros-descuento;
			System.out.println("El precio total de la malla es "+precioTotal);
			System.out.println("¿Quiere finalizar");
			finalizar=(bufferLectura.readLine());
		}
	}
}