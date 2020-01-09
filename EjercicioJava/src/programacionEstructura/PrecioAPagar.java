package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PrecioAPagar 
{

	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		double preciofinal=0;
		int precioindividual=0;
		int unidades=0;
		double IVA=0;
		double impuesto=0;
		
		System.out.println("Introduzca un precio individual del producto");
		precioindividual=Integer.parseInt((bufferLectura.readLine()));
		System.out.println("Introduzca las unidades del producto");
		unidades=Integer.parseInt((bufferLectura.readLine()));
		System.out.println("Introduzca el IVA");
		IVA=Double.parseDouble((bufferLectura.readLine()))/100;
		
		impuesto=precioindividual*IVA;
		
	}
}
