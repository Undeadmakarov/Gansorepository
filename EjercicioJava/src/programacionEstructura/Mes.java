package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Mes 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		boolean error=false;
		final int DIAS_30=30;
		final int DIAS_31=31;
		final int DIAS_28=28;
		int numeromes=0;
		int num_dias=0;
		String mes="";
		String fraseMes="";
		
		System.out.println("Introduzca el numero de mes que quiera");
		numeromes=Integer.parseInt(bufferLectura.readLine());
		switch (numeromes) 
		{
				case 1:
					mes="Enero";
					num_dias=DIAS_31;
				break;
				case 2:
					mes="Febrero";	
					num_dias=DIAS_28;
				break;
				case 3:
					mes="Marzo";
					num_dias=DIAS_31;
				break;	
				case 4:
					mes="Abril";	
					num_dias=DIAS_30;
				break;
				case 5:
					mes="Mayo";	
					num_dias=DIAS_31;
				break;
				case 6:
					mes="Junio";
					num_dias=DIAS_30;
				break;
				case 7:
					mes="Julio";
					num_dias=DIAS_31;
				break;
				case 8:
					mes="Agosto";	
					num_dias=DIAS_31;
				break;
				case 9:
					mes="Septiembre";
					num_dias=DIAS_30;
				break;
				case 10:
					mes="Octubre";	
					num_dias=DIAS_31;
				break;
				case 11:
					mes="Noviembre";
					num_dias=DIAS_30;
				break;
				case 12:
					mes="Diciembre";	
					num_dias=DIAS_31;
				break;
				default:
					error = true;	
				break;
		}
		if(error==true)
		{
		   fraseMes="Mes invalido";
		   System.out.println(fraseMes);
		}
		else
		{
			fraseMes="Estas en el mes "+mes+" que tiene " + num_dias+" dias.";
		 System.out.println(fraseMes);
		}
	
	}
}

