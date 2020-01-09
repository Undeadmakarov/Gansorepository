package ejerciciosPOO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Taller 
{

	public static void main(String[] args)throws IOException  
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		String peticion_matricula="";
		String peticion_color="";
		int peticion_anio=0;
		int num=1;
		String disponibilidad="";
		
		
		System.out.println("Introduzca  matricula coche:");
		peticion_matricula=(bufferLectura.readLine());
		System.out.println("Introduzca el color del coche:");
		peticion_color=(bufferLectura.readLine());
		System.out.println("Introduzca el año del coche:");
		peticion_anio=Integer.parseInt(bufferLectura.readLine());
		System.out.println("¿Esta el coche  disponible? ");
		disponibilidad=(bufferLectura.readLine());
		System.out.println(disponibilidad);
		
		Vehiculo coche1= new Vehiculo(peticion_matricula,peticion_color,peticion_anio,disponibilidad);
		coche1.mostrarInfo();
		coche1.setColor("rojo_berbellon");
		coche1.mostrarInfo();
		
		System.out.println("\n"+"Introduzca  matricula coche:");
		peticion_matricula=(bufferLectura.readLine());
		System.out.println("Introduzca el color del coche:");
		peticion_color=(bufferLectura.readLine());
		System.out.println("Introduzca el año del coche:");
		peticion_anio=Integer.parseInt(bufferLectura.readLine());
		System.out.println("¿Esta el coche  disponible? ");
		disponibilidad=(bufferLectura.readLine());
		System.out.println(disponibilidad);
		
		Vehiculo coche2= new Vehiculo(peticion_matricula,peticion_color,peticion_anio,disponibilidad);
		coche2.mostrarInfo();
		coche2.setMatricula("ESP-1999");
		coche2.mostrarInfo();
	}
}
