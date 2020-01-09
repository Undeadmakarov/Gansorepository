package ejercicioCarrera;

import java.io.IOException;

public class Circuito 
{

	private String nombre_Circuito;
	private static int distancia;
	
	Circuito(String inNombre_Circuito,int inDistancia)
	{
		nombre_Circuito=inNombre_Circuito;
		distancia=inDistancia;
	}

	public String getNombre_Circuito() {
		return nombre_Circuito;
	}

	public void setNombre_Circuito(String nombre_Circuito) {
		this.nombre_Circuito = nombre_Circuito;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public static void mostrar_carrera(Coche participantes[])  
	{
		String logo;
		int dorsal;
		String cadena="";
		int distancia_recorrida;
		for(int i=0;i<=participantes.length-1;i++)
		{	
			distancia_recorrida=participantes[i].getDistancia_recorrida();
			logo=participantes[i].getLogo();
			dorsal=participantes[i].getDorsal();
			for(int y=0;y<distancia_recorrida;y++)
			{		
				cadena=cadena+logo;		
			
			}
			System.out.println(dorsal+cadena);
			cadena="";
		}
			
	}
}