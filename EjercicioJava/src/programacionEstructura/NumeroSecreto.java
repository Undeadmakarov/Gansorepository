package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumeroSecreto 
{

	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		final int NUMERO_SECRETO=47;
		int numero_Introducido=0;
		final String NUMERO_ES_MAYOR="El numero introducido es mayor que el numero secreto";
		final String NUMERO_ES_MENOR="El numero introducido es menor que el numero secreto";

		System.out.println("Introduzca un numero");
		numero_Introducido=Integer.parseInt((bufferLectura.readLine()));
		do
		{
			if(numero_Introducido<NUMERO_SECRETO)
			{
				System.out.println(NUMERO_ES_MENOR);
			}
			else
			{
				System.out.println(NUMERO_ES_MAYOR);
			}
			System.out.println("Introduzca otro numero");
			numero_Introducido=Integer.parseInt((bufferLectura.readLine()));
		}while (numero_Introducido!=NUMERO_SECRETO);
		
		System.out.println("Acertaste");
	}
}
