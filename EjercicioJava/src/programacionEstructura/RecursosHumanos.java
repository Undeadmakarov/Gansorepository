package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RecursosHumanos 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		boolean error=false;
		final int COMPLEMENTO=450;
		int salariobase=0;
		String nombre_completo="";
		String letra_departamento="";
		String departamento="";
		String frase_Complemento="";
		
		System.out.println("Introduzca tu nombre y apellidos");
		nombre_completo=(bufferLectura.readLine());
		System.out.println("Introduzca tu salario base");
		salariobase=Integer.parseInt(bufferLectura.readLine());
		System.out.println("Introduzca la letra de tu departamento");
		letra_departamento=(bufferLectura.readLine());
		switch (letra_departamento) 
		{
				case "A":
					departamento="Desarrollo";	
				break;
				case "B":
					departamento="Finanzas";	
				break;
				case "C":
					departamento="RRHH";	
				break;	
				case "D":
					departamento="Mercad0";	
				break;
				default:
					error = true;	
				break;
		}
		
		if (error==true) 
		{
		 System.out.println("Departamento Erroneo");
		}
		else 
		{
			if (departamento=="Desarrollo")
			{
				frase_Complemento="Tienes un complemento de "+COMPLEMENTO+" € por ser desarrollador ";
			}
			else
			{
				frase_Complemento="Al no ser desarrollador no tienes complemento";
			}
			System.out.println(nombre_completo+" tienes un salario base de "+salariobase+" perteneces al departamento "+departamento+frase_Complemento );
		}
	}
}

