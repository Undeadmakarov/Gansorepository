package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SalarioNeto 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		float bruto=0;
		int hijos=0;
		float retencion=0;
		float salario=0;
		
		System.out.println("Introduzca el salario bruto");
		bruto=Float.parseFloat(bufferLectura.readLine());
		System.out.println("Introduzca el numero de hijos");
		hijos=Integer.parseInt(bufferLectura.readLine());
		
		if (bruto<0 || hijos<0) 
		{
			System.out.println("Has introducido datos que  no pueden ser negativos");
		}
		else 
		{
			if (hijos<=2) 
			{
			 retencion=(bruto*0.20f);
			
			}
			else if (hijos >=3 && hijos<=5)
			{
				 retencion=(bruto*0.15f);
				 
			}
			else if (hijos >=6 && hijos<=7) 
			{
				 retencion=(bruto*0.10f);
				
			}
			else if (hijos>8)
			{
				retencion=(bruto*0.05f);
				
			}
			salario=bruto-retencion;
			System.out.println("El salario bruto es "+bruto+" tienes "+hijos+" hijos y la retencion por ello es "+retencion+" tu salario neto es "+salario  );
	    }
		
	
	}
}
