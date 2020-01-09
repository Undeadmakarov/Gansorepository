package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Divisibleentre4
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int i=0;
		int numeropedido_1=0;
		int numeropedido_2=0;

		
		System.out.println("Introduzca un numero");
		numeropedido_1=Integer.parseInt(bufferLectura.readLine());
		System.out.println("Introduzca otro numero");
		numeropedido_2=Integer.parseInt(bufferLectura.readLine());
		
		for(i=numeropedido_1;i<=numeropedido_2;i++)
		{
			if((i%4==0) &&  (i%5!=0))
			{
			System.out.println(i);
			}
		}
		
		
	}

}
