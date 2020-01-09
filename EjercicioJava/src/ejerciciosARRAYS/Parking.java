package ejerciciosARRAYS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ejerciciosPOO.Libro;
public class Parking {
	
	static Vehiculo vehiculo;
	static Vehiculo[][] garaje;
	private static  int pisos=0;
	private static int plazas=0;
	private static int total_plazas=0;
	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int opcion = 0;
		boolean errorInput = false;
		boolean finalizar = false;
		String resultado_operacion = "";
		
		do {
			/*
			 * Crearemos un bucle en el cual mientras errorinput sea false y finalizar sea
			 * false permitira seguir eligiendo el metodo a realizar
			 */
			System.out.println(
					"Introduzca  la opcion que quieras 1)Generar_Parking, 2) Aparcar_Coche 3)Seleccionar coches por antiguedad ,"
					+ "4)Encontrar Ubicacion de coches,5)mostrar coches aparcar o 6)salir");
			opcion = Integer.parseInt(bufferLectura.readLine());
			switch (opcion) {
			case 1:
				generar_Parking();
			break;
			case 2:
				aparcar_Coche();
				break;
			case 3:
				pedir_Coches_Por_Antiguedad();
				break;
			case 4:
				pedir_Ubicacion_Coche();
				break;
			case 5:
				mostrar_coches();
			break;
			case 6:
				finalizar = true;
			break;
			default:
				errorInput = true;
				resultado_operacion = "Opcion no valida Saliendo";
				break;
			}
			System.out.println(resultado_operacion);
		} while ((!errorInput) || (!finalizar));
	}
	public static void generar_Parking()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
	
	
		System.out.println("Introduzca los pisos: ");
		pisos=Integer.parseInt(bufferLectura.readLine());
		System.out.println("Introduzca las plazas: ");
		plazas=Integer.parseInt(bufferLectura.readLine());
		total_plazas=pisos*plazas;
		garaje=new Vehiculo[pisos][plazas];
		
	}
	public static void aparcar_Coche()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
	
		int piso_solicitado;
		int plaza_solicitada;
		String matricula;
		String color;
		int ano;
		int contador_coches=0;
		
		System.out.println("Introduzca los siguientes datos del vehiculo: ");
		System.out.println("Introduzca la matricula del coche:");
		matricula = (bufferLectura.readLine());
		System.out.println("Introduzca el color del coche:");
		color = (bufferLectura.readLine());
		System.out.println("Introduzca el año de matriculacion:");
		ano = Integer.parseInt(bufferLectura.readLine());
		vehiculo= new Vehiculo(matricula, color, ano);
		contador_coches++;
		System.out.println("Vehiculo registrado");
		do
		{
			do
			{
			System.out.println("Introduzca el piso en el que quiera aparcar(0 a "+(pisos-1)+")");
			piso_solicitado=Integer.parseInt(bufferLectura.readLine());
			System.out.println(piso_solicitado);
			}while(piso_solicitado>pisos || piso_solicitado<0);
			do
			{
				
			System.out.println("Introduzca la plaza en la que quiera aparcar(0 a "+(plazas-1)+")");
			plaza_solicitada=Integer.parseInt(bufferLectura.readLine());
			System.out.println(plaza_solicitada);
			}while(plaza_solicitada>plazas || plaza_solicitada<0);
		}while( garaje[piso_solicitado][plaza_solicitada]!=null);
		garaje[piso_solicitado][plaza_solicitada]=vehiculo;
	}
	public static void pedir_Coches_Por_Antiguedad()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int aniomatriculacion;
		System.out.println("Introduzca el Año de matriculacion que quieres mostrar");
		aniomatriculacion=Integer.parseInt(bufferLectura.readLine());
		
		for(int i=0;i<garaje.length;i++)
		{
			for(int y=0;y<garaje[i].length;y++)
			{
				if(garaje[i][y] != null)
				{
					if(garaje[i][y].getAnio()==aniomatriculacion)
					{
						garaje[i][y].mostrarInfo();
						System.out.println("-----------");
					}
				}
				
			}
		}
	}

	public static void pedir_Ubicacion_Coche()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);	
	
		String matricula;
		System.out.println("Introduzca la matricula de su coche");
		matricula=(bufferLectura.readLine());
		
		for(int i=0;i<garaje.length;i++)
		{
			for(int y=0;y<garaje[i].length;y++)
			{
				if(garaje[i][y] != null)
				{
					if(garaje[i][y].getMatricula()==matricula)
					{
						
						System.out.println("Tu vehiculo esta en el piso" + i + " y en la plaza " + y);
					}
				}
			
			}
		}
	}
	public static void mostrar_coches()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		for(int i=0;i<garaje.length;i++)
		{	
			for(int y=0;y<garaje[i].length;y++)
			{
				if(garaje[i][y] != null)
				{
					garaje[i][y].mostrarInfo();
					System.out.println("-----------");
				}
			
			}
		}
	}
}
