package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumeroANumeroPares
{

	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int num1=0;
		int num2=0;
		final String fraseError="El primer numero introducido es mayor que el segundo numero introducido";
		
		System.out.println("Introduzca un numero");
		num1=Integer.parseInt(bufferLectura.readLine());
		System.out.println("Introduzca otro numero");
		num2=Integer.parseInt(bufferLectura.readLine());
		
		if(num1>num2)
		{
			System.out.println(fraseError);
		}
		else
		{
			while(num1<=num2)
			{
			  if(num1%2==0) 
			  {
				System.out.println(num1);
				
			  }
			 num1=num1+1;
			}
		}
	}
}