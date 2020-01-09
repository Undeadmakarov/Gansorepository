package ejercicioCarrera;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ejerciciosARRAYS.Persona;
public class Competicion {
	static Coche participantes[];
	static Apuestas[] apuestas;
	static Circuito circuito;
	static int limite;
	public static void main(String[] args)throws IOException, InterruptedException 
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int opcion = 0;
		int dorsal_carrera;
		boolean errorInput = false;
		boolean finalizar = false;

		String resultado_operacion = "";
		do {
			/*
			 * Crearemos un bucle en el cual mientras errorinput sea false y finalizar sea
			 * false permitira seguir eligiendo el metodo a realizar
			 */
			System.out.println(
					"Introduzca  la opcion que quieras 1)Generar participantes,2)Generar circuito 3)Iniciar Carrera , 4)Fijar limite de Apuesta,5)Crear apuestas o 6) salir");
			opcion = Integer.parseInt(bufferLectura.readLine());
			switch (opcion) {
			case 1:
				generar_Participante();
			break;
			case 2:
				generar_Circuito();
			break;
			case 3:
				gestionar_Carrera();
			break;	
			case 4:
				fijar_limite_apuesta();
			break;
			case 5:
				crear_apuesta();
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

	public static void generar_Participante()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		String piloto;
		String marca;
		String modelo;
		int dorsal;
		int num_participantes;
		String logo;
		String dni;
		System.out.println("¿Cuantos participantes quieren participar?");
		num_participantes=Integer.parseInt(bufferLectura.readLine());
		participantes = new Coche[num_participantes];
		for(int i=0;i<num_participantes;i++)
		{
			System.out.println("Introduzca el nombre del piloto: ");
			piloto=(bufferLectura.readLine());
			System.out.println("Introduzca el modelo del coche : ");
			modelo=(bufferLectura.readLine());
			System.out.println("Introduzca la marca del coche: ");
			marca=(bufferLectura.readLine());
			System.out.println("Introduzca el dorsal del coche : ");
			dorsal=Integer.parseInt(bufferLectura.readLine());
			System.out.println("Introduzca el logo del coche : ");
			logo=(bufferLectura.readLine());
			participantes[i]=new Coche(piloto,modelo,marca,dorsal,logo);
		}
	}
	public static void generar_Circuito()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		String nombre_Circuito;
		int distancia;


		System.out.println("Introduzca el nombre del circuito: ");
		nombre_Circuito=(bufferLectura.readLine());
		System.out.println("Introduzca la distancia : ");
		distancia=Integer.parseInt(bufferLectura.readLine());;
		circuito=new Circuito(nombre_Circuito,distancia);
		
		
	
	}


	public static void crear_apuesta()throws IOException, InterruptedException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);

		String dni;
		String piloto;
		int dinero;
		int id_apuestas;
		apuestas = new Apuestas[limite];
		for(int i=0;i<limite;i++)
		{
			System.out.println("Introduzca el DNI: ");
			dni=(bufferLectura.readLine());
			for(int y=0;y<participantes.length;y++)
			{
				participantes[y].mostrar_info_coche();
			}
			System.out.println("Introduzca el piloto a apostar: ");
			piloto=(bufferLectura.readLine());
			System.out.println("Introduzca el dinero a apostar : ");
			dinero=Integer.parseInt(bufferLectura.readLine());
			id_apuestas=i;
			System.out.println("Apuesta realizada su id de apuesta es: "+id_apuestas);
			apuestas[i]=new Apuestas(dni,piloto,dinero,id_apuestas);
		}
		
		
	}
	public static int fijar_limite_apuesta()throws IOException, InterruptedException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		System.out.println("¿A cuantas apuestas quieres limitar esta carrera?");
		limite=Integer.parseInt(bufferLectura.readLine());
		return limite;
	}
	public static void ganadores_apuestas(String piloto_ganador)throws IOException, InterruptedException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		System.out.println("Los ganadores de las apuestas son: ");
		limite=Integer.parseInt(bufferLectura.readLine());
		int ganancias=0;
		int ganadores_apuestas=0;
		for(int i=0;i<limite;i++)
		{
			ganancias=ganancias+apuestas[i].getDinero();
			if(piloto_ganador.equals(apuestas[i].getPiloto()))
			{
				System.out.println(apuestas[i].getDni());
				ganadores_apuestas++;
			}
		}
		ganancias=ganancias/ganadores_apuestas;
		System.out.println("Cada uno recibira: "+ganancias+" €");
	
	}
	public static void gestionar_Carrera()throws IOException, InterruptedException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		int distancia=0;
		int metros_recorridos;
		int distanciarecorrida;
		int distanciamaxima = 0;
		String piloto_ganador = " ";
		String piloto;
		
		do {
			for(int i=0;i<participantes.length;i++)
			{
				distanciarecorrida=participantes[i].getDistancia_recorrida();
				piloto=participantes[i].getPiloto();
				distancia=circuito.getDistancia();
				metros_recorridos=(int)(Math.floor(Math.random()*10)+1);
				distanciarecorrida=distanciarecorrida+metros_recorridos;
				participantes[i].setDistancia_recorrida(distanciarecorrida);
				if (distanciamaxima<distanciarecorrida)
				{
					distanciamaxima=distanciarecorrida;
					piloto_ganador=participantes[i].getPiloto();
				}
			}
			circuito.mostrar_carrera(participantes);
			Thread.sleep(3000);
		}while(distanciamaxima<=distancia);
		System.out.println("Ha ganado la carrera "+piloto_ganador);
		ganadores_apuestas(piloto_ganador);
	}
	
}