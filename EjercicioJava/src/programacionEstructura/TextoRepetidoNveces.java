package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TextoRepetidoNveces
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int i=0;
		int repeticiones=0;
		String palabra="";
		
		System.out.println("Introduzca la palabra");
		palabra=(bufferLectura.readLine());
		System.out.println("Introduzca el numero de repeticiones");
		repeticiones=Integer.parseInt(bufferLectura.readLine());
		
		for(i=1;i<=repeticiones;i++)
		{
			System.out.println(palabra);
		}
		
		
	}

}
