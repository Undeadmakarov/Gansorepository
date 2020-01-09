package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MientrasNoFIN
{

	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);

		String palabros="";
		
		System.out.println("Introduzca un palabro");
		palabros=(bufferLectura.readLine());
	
		while((!palabros.equals("FIN")) && (!palabros.equals("FINAL")) )
		{
			System.out.println(palabros);
			System.out.println("Introduzca otro palabro");
			palabros=(bufferLectura.readLine());
		}
		System.out.println("Fin del programa");
	}
}