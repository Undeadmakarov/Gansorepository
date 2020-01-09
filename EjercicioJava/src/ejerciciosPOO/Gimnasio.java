package ejerciciosPOO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class Gimnasio.
 */
public class Gimnasio {
	
	/** The Alimento 1. */
	static Alimento Alimento1;
	
	/** The Alimento 2. */
	static Alimento Alimento2;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
	InputStreamReader manejadorEnt = new InputStreamReader(System.in);
	BufferedReader bufferLectura = new BufferedReader(manejadorEnt);

	int opcion = 0;
	boolean errorInput = false;
	boolean finalizar = false;
	String resultado_operacion = "";
	do 
	{
	System.out.println("Introduzca  la opcion que quieras 1)crear alimento,2)comprobar_dietetico,3)calcular_contenido_energetico,4)validez_deportista,5)mostrar_informacion o 6)salir");
	opcion = Integer.parseInt(bufferLectura.readLine());
	switch (opcion) 
	{
	case 1:
		crear_alimento();
		break;
	case 2:
		comprobar_dietetico();
		break;
	case 3:
		calcular_contenido_energetico();
		break;
	case 4:
		validar_alim_deportista();
		break;
	case 5:
		mostrar_informacion();
	break;
	case 6:
	finalizar=true;
	break;
	default:
		errorInput = true;
		resultado_operacion = "Opcion no valida Saliendo";
		break;
	}
	System.out.println(resultado_operacion);
	} while ((!errorInput) || (!finalizar));
}
	/**
	 * Crear alimento.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void crear_alimento()throws IOException 
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String texto_usuario="";
		String nombre_Alimento="";
		boolean comprobar;
		int lipidos = 0;
		int hidratos = 0;
		int proteinas = 0;
		String origen ="";
		String vitaminas_Minerales="";
		
		System.out.println("¿Quieres crear un producto?");
		texto_usuario = (bufferLectura.readLine());
		
		if (texto_usuario.equals("si")) {
			System.out.println("Introduzca  el nombre del Alimento:");
			nombre_Alimento = (bufferLectura.readLine());
			do
			{
				System.out.println("Introduzca el porcentaje de lipidos:");
				lipidos=Integer.parseInt(bufferLectura.readLine());
				comprobar=comprobar_0_A_100(lipidos);
			}while(comprobar==false);
			do
			{
				System.out.println("Introduzca el porcentaje de hidratos:");
				hidratos=Integer.parseInt(bufferLectura.readLine());
				comprobar=comprobar_0_A_100(hidratos);
			}while(comprobar==false);
			do
			{
				System.out.println("Introduzca el el porcentaje de proteinas:");
				proteinas=Integer.parseInt(bufferLectura.readLine());
				comprobar=comprobar_0_A_100(proteinas);
			}while(comprobar==false);
			
			System.out.println("¿Es de origen animal o vegetal?:");
			origen=(bufferLectura.readLine());
			comprobar=comprobar_origen(origen);
		
			System.out.println("Introduzca el contenido en vitaminas (A alto, M medio o B bajo)");
			vitaminas_Minerales=(bufferLectura.readLine());
			Alimento1 = new Alimento (nombre_Alimento, lipidos, hidratos,
					proteinas,origen,vitaminas_Minerales);
		}
	}
	
	/**
	 * Comprobar dietetico.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void comprobar_dietetico()throws IOException 
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String nombre_Alimento="";
		int lipidos=0;
		String vitaminas_Minerales ="";
		System.out.println("Introduzca  el nombre del alimento:");
		nombre_Alimento = (bufferLectura.readLine());
		boolean comprobar=false;
		
		if (Alimento1!= null) 
		{
			if (Alimento1.getNombre_Alimento().equals(nombre_Alimento)) 
			{
				lipidos=Alimento1.getLipidos();
				vitaminas_Minerales = Alimento1.getVitaminas_Minerales();
				comprobar=Alimento1.comprobar_dietetico(lipidos,vitaminas_Minerales);
			
			}
		}
		if (comprobar == true) {
			System.out.println("Es dietetico");
		} else {
			System.out.println("No es dietetico");
		}
	}	
	
	/**
	 * Calcular contenido energetico.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void calcular_contenido_energetico()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String nombre_Alimento="";
		int lipidos=0;
		int proteinas=0;
		int hidratos=0;
		System.out.println("Introduzca  el nombre del alimento:");
		nombre_Alimento = (bufferLectura.readLine());
		double calorias=0;
		boolean comprobar=false;
		if (Alimento1!= null) 
		{
			if (Alimento1.getNombre_Alimento().equals(nombre_Alimento)) 
			{
				lipidos=Alimento1.getLipidos();
				proteinas=Alimento1.getProteinas();
				hidratos=Alimento1.getHidratos();
				calorias=Alimento1.calcular_contenido_energetico(lipidos,proteinas,hidratos);
				comprobar=true;
			}
		}
		if (comprobar == true) {
			System.out.println("El contenido energetico es"+calorias);
		} else {
			System.out.println("No se puede calcular el contenido energetico");
		}
	}	
	
	/**
	 * Validar alim deportista.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void validar_alim_deportista()throws IOException
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String nombre_Alimento="";
		int lipidos=0;
		int proteinas=0;
		int hidratos=0;
		boolean comprobar=false;
		System.out.println("Introduzca  el nombre del alimento:");
		nombre_Alimento = (bufferLectura.readLine());
		
		if (Alimento1!= null) 
		{
			if (Alimento1.getNombre_Alimento().equals(nombre_Alimento)) 
			{
				lipidos=Alimento1.getLipidos();
				proteinas=Alimento1.getProteinas();
				hidratos=Alimento1.getHidratos();
				comprobar=Alimento1.validar_alim_deportista(lipidos,proteinas,hidratos);
				
			}
		}
		if (comprobar == true) {
			System.out.println("El alimento es apto para deportistas");
		} else {
			System.out.println("El alimento no es apto para deportistas");
		}
	}	
	

	
	/**
	 * Mostrar informacion.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void mostrar_informacion()throws IOException
	{
			InputStreamReader manejadorEnt = new InputStreamReader(System.in);
			BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
			String nombre_Alimento="";
	
			System.out.println("Introduzca  el nombre del alimento:");
			nombre_Alimento = (bufferLectura.readLine());
			if (Alimento1!= null) 
			{
				if (Alimento1.getNombre_Alimento().equals(nombre_Alimento)) 
				{
					Alimento1.mostrar_informacion();
				}
			}
			
		
	}
	private static boolean comprobar_0_A_100(int inParametro)
	{
		boolean resultado=false;
		int parametro=0;
		parametro=inParametro;
		if((parametro>=0) && (parametro<=100))
		{
			resultado=true;
		}
		else
		{
			resultado=false;
		}
		return resultado;
	}
	private static boolean comprobar_origen(String inParametro)
	{
		boolean resultado=false;
		String parametro="";
		parametro=inParametro;
		switch (parametro)
		{
		case "s":
		resultado=true;
		break;
		case "n":
		resultado=false;
		break;
		default:
		System.out.println("Origen erroneo");
		break;
		}
		return resultado;
	}
	

	
}
