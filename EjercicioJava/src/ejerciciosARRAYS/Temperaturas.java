package ejerciciosARRAYS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Temperaturas 
{
	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);

		int filas=0;
		int columnas=0;
		int[][] temperaturas;
		
		System.out.println("Introduzca las filas: ");
		filas=Integer.parseInt(bufferLectura.readLine());
		System.out.println("Introduzca las columnas: ");
		columnas=Integer.parseInt(bufferLectura.readLine());
		temperaturas=new int [filas][columnas];
		pedir_temperatura(temperaturas);
		calcular_maxima_minima(temperaturas);
	}
	private static void pedir_temperatura(int temperaturas[][])throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		int temperatura[][]=temperaturas;
		for(int i=0;i<temperatura.length;i++)
		{
			for(int j=0;j<temperatura[i].length;j++)
			{
				System.out.println("Dame la temperatura: ");
				temperatura[i][j]=Integer.parseInt(bufferLectura.readLine());
			}	
		}	
	}		
	private static void calcular_maxima_minima(int temperaturas[][])throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int temperatura[][]=temperaturas;
		int temperaturamaxima=temperatura[0][0];
		int temperaturaminima=temperatura[0][0];;
			for(int i=0;i<temperatura.length;i++)
			{
				for(int j=0;j<temperatura[i].length;j++)
				{
					if(temperaturamaxima<temperaturas[i][j])
					{
						temperaturamaxima=temperaturas[i][j];
					}
					else if (temperaturaminima>temperaturas[i][j])
					{
						temperaturaminima=temperaturas[i][j];
					}
				}	
			}
			System.out.println("La temperatura maxima es "+temperaturamaxima);
			System.out.println("La temperatura minima es "+temperaturaminima);			
	}
}	
