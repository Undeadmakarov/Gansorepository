package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumeroA1
{

	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int num=0;
	
		System.out.println("Introduzca un numero");
		num=Integer.parseInt(bufferLectura.readLine());
	
		while(num>=1)
		{
			System.out.println(num);
			num=num-1;
		}
	}

}
