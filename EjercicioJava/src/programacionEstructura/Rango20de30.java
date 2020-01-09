package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Rango20de30
{

	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		final int NUM_INFERIOR=20;
		final int NUM_SUPERIOR=30;

		int num_dado=0;
		
		System.out.println("Introduzca un numero");
		num_dado=Integer.parseInt(bufferLectura.readLine());
	
		while((num_dado<NUM_INFERIOR) || (num_dado>NUM_SUPERIOR))
		{
			if(num_dado<NUM_INFERIOR)
			{
				System.out.println("El numero es menor al rango inferior");
			}
			else
			{
				System.out.println("El numero es mayor al rango superior");
			}
			System.out.println("Introduzca otro numero");
			num_dado=Integer.parseInt(bufferLectura.readLine());
		}
		System.out.println("Bravo acertaste");
	}
}