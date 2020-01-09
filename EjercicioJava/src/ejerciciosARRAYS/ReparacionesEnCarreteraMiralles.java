package ejerciciosARRAYS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReparacionesEnCarreteraMiralles  {
	
	static carretera carretera[];
	static Persona responsable[];
	
	public static void main(String[] args) throws IOException  {
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
					"Introduzca  la opcion que quieras 1)Contratar_Empleados, 2) Crear carreteras 3)Pedir carreteras por ultima reparacion ,"
					+ "4)Pedir carreteras por clima,5)mostrar material carreteras , 6)mostrar_informacion_empleados, 7)mostrar_informacion_carreteras o  8)salir");
			opcion = Integer.parseInt(bufferLectura.readLine());
			switch (opcion) {
			case 1:
				contratar_Empleados();
			break;
			case 2:
				crear_Carretera();
				break;
			case 3:
				pedir_Carretera_Ult_Reparacion();
				break;
			case 4:
				pedir_Carretera_Clima();
				break;
			case 5:
				mostrar_material();
			break;
			case 6:
				mostrar_informacion_empleados();
			break;
			case 7:
				mostrar_informacion_carreteras();
			break;
			case 8:
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
	public static void contratar_Empleados()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		String nombre_Persona;
		int edad;
		int num_empleados;
		String dni;
		System.out.println("¿Cuantos empleados quieres contratar?");
		num_empleados=Integer.parseInt(bufferLectura.readLine());
		responsable = new Persona[num_empleados];
		for(int i=0;i<num_empleados;i++)
		{
			System.out.println("Introduzca el nombre de la persona interesada: ");
			nombre_Persona=(bufferLectura.readLine());
			System.out.println("Introduzca el DNI de la persona: ");
			dni=(bufferLectura.readLine());
			System.out.println("Introduzca  la edad de la persona: ");
			edad=Integer.parseInt(bufferLectura.readLine());
			System.out.println(edad+nombre_Persona);
			responsable[i]=new Persona(nombre_Persona,dni,edad);
		}
	}
	public static void crear_Carretera()throws IOException  
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);

		String nombre_Carretera;
		Double kilometros;
		String materiales;
		String clima;
		int ultimaReparacion;
		int num_Carreteras;
		int puesto;
		
		System.out.println("¿Cuantas carreteras quieres crear?");
		num_Carreteras=Integer.parseInt(bufferLectura.readLine());
		carretera = new carretera[num_Carreteras];
		for(int i=0;i<num_Carreteras;i++)
		{
			System.out.println("Introduzca el nombre de la carretera:");
			nombre_Carretera=(bufferLectura.readLine());
			System.out.println("Introduzca  el numero de KM de la carretera:");
			kilometros=Double.parseDouble(bufferLectura.readLine());
			System.out.println("Introduzca los materiales de la carretera:");
			materiales=(bufferLectura.readLine());
			System.out.println("Introduzca el clima de la carretera:");
			clima=(bufferLectura.readLine());
			System.out.println("Introduzca el año de reparacion:");
			ultimaReparacion = Integer.parseInt(bufferLectura.readLine());
			System.out.println("Introduzca a la persona a Asignar:");
			puesto = Integer.parseInt(bufferLectura.readLine());
			carretera[i]=new carretera(nombre_Carretera, kilometros, materiales,
					clima,ultimaReparacion,responsable[puesto]);
		}
	}
	public static void pedir_Carretera_Ult_Reparacion()throws IOException  
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int ultimaReparacion;
		int longitud=carretera.length;
		System.out.println("Introduzca el Año de reparacion que quieres mostrar");
		ultimaReparacion=Integer.parseInt(bufferLectura.readLine());
		
		for(int i=0;i<longitud;i++)
		{
			if(carretera[i] != null)
			{
				if(carretera[i].getUltimaReparacion()==ultimaReparacion)
				{
					carretera[i].mostrar_informacion();
					System.out.println("-----------");
				}
			}
			else
			{
				System.out.println("No se ha creado carreteras");
				i=longitud;
			}
		}
	}
	
	public static void pedir_Carretera_Clima()throws IOException  
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String clima;
		int longitud=carretera.length;
		System.out.println("Introduzca el Clima que quieres mostrar");
		clima=(bufferLectura.readLine());
		
		for(int i=0;i<longitud;i++)
		{
			if(carretera[i] != null)
			{
				if(carretera[i].getClima().equals(clima))
				{
					carretera[i].mostrar_informacion();
					System.out.println("-----------");
				}
			}
			else
			{
			  System.out.println("No se ha creado carreteras");
			  i=longitud;
			}
		}
	}
	public static void mostrar_material()throws IOException  
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String material;
		int longitud=carretera.length;
		System.out.println("Introduzca el material que quieres mostrar");
		material=(bufferLectura.readLine());
		
		for(int i=0;i<longitud;i++)
		{
			if(carretera[i] != null)
			{
				if(carretera[i].getMateriales()==(material))
				{
					carretera[i].mostrar_informacion();
					System.out.println("-----------");
				}
			}
		}
	}
	
	public static void mostrar_informacion_empleados()throws IOException  
	{

		
		int longitud=responsable.length;
	
		for(int i=0;i<longitud;i++)
		{				
			if(responsable[i] != null)
			{
			responsable[i].mostrar_informacion();
			System.out.println("-----------");
			}
		}

	}
	public static void mostrar_informacion_carreteras()throws IOException  
	{

		
		int longitud=carretera.length;
	
		for(int i=0;i<longitud;i++)
		{				
			if(carretera[i] != null)
			{
			carretera[i].mostrar_informacion();
			System.out.println("-----------");
			}
			else
			{
			  System.out.println("No se ha creado carreteras");
			  i=longitud;
			}	
		}

	}
}
