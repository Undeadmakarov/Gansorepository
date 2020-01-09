package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pedir10numeros 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		final int NUM_VALORES=10;
		int numeropedido=0;
		int numeromayor=0;
		int numeromenor=0;
		int i=0;
		
		System.out.println("Introduzca un numero");
		numeropedido=Integer.parseInt(bufferLectura.readLine());
		numeromayor=numeropedido;
		numeromenor=numeropedido;
		System.out.println("El numero mayor es "+numeromayor);
		System.out.println("El numero menor es "+numeromenor);
		System.out.println("Tu numero es "+numeropedido);
		for(i=1;i<NUM_VALORES;i++)
		{
			System.out.println("Introduzca un numero");
			numeropedido=Integer.parseInt(bufferLectura.readLine());
		
			if(numeropedido>numeromayor)
			{
				numeromayor=numeropedido;
				
			}
			else if (numeropedido<numeromenor)
			{
				numeromenor=numeropedido;
			
			}
			System.out.println("El numero mayor es "+numeromayor);
			System.out.println("El numero menor es "+numeromenor);
			System.out.println("Tu numero es "+numeropedido);
		}
	}

}
