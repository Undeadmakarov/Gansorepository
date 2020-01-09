package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioNotas 
{

	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);

		int nota=0;
		
		System.out.println("Introduzca una nota");
		nota=Integer.parseInt(bufferLectura.readLine());
		
		if (nota<0 || nota>10) 
		{
			System.out.println("La nota no puede ser inferior a 0 o superior a 10");
		}
		else
		{
			if(nota<5)
			{
				System.out.println("Necesitas Mejorar ");
			}
			else if (nota>5)
			{
				System.out.println("Progresa Adecuadamente");
			}
			else if (nota==5)
			{
				System.out.println("Podria mejorar");
			}
		
	     }   

    }
}
