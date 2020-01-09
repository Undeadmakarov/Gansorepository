package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MultiplicandoX20
{

	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		boolean finalizar=false;
		final int VEINTE=20;
		int num1=0;
		int num2=0;
		int contador=1;
		String fin="";
		
		System.out.println("Introduzca un numero");
		num1=Integer.parseInt(bufferLectura.readLine());
		System.out.println("Introduzca otro numero");
		num2=Integer.parseInt(bufferLectura.readLine());
	
			while(contador<=num2||fin.equals("si"))
			{
				num1=num1*VEINTE;
				System.out.println("¿Desea Finalizar?");
				fin=(bufferLectura.readLine());
				contador=contador+1;
				System.out.println(num1);
			}
	
	}
}
