package ejerciciosPOO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Esta clase Biblioteca define una serie de metodos para creacion
 * ,prestar,devolver y mostrar info de la clase Libro. <br>
 * Ultima fecha de modificacion: 08/11/2019
 * 
 * @author Pablo Caceres Blanco
 * 
 * @version 1.0
 * 
 */
public class Biblioteca {
	static Libro libro1;
	static Libro libro2;

	/**
	 * Clase main Biblioteca la cual permitira decidir cual de los metodos quieres
	 * realizar
	 */
	public static void main(String[] args) throws IOException {
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
					"Introduzca  la opcion que quieras 1)crear libro, 2)prestar ,3)devolver,4)mostrarinfo o 5)salir");
			opcion = Integer.parseInt(bufferLectura.readLine());
			switch (opcion) {
			case 1:
				crear_libro();
				break;
			case 2:
				prestar();
				break;
			case 3:
				devolver();
				break;
			case 4:
				mostrarLibro();
				break;
			case 5:

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

	/**
	 * El metodo Auxiliar crear_libro permite mediante la peticion de parametros la
	 * creacion de un objeto de la clase libro mediante el constructor
	 * 
	 * @throws IOException
	 */
	private static void crear_libro() throws IOException {
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);

		String texto_usuario = "";
		String peticion_nombre_libro = "";
		String peticion_autor_libro = "";
		int peticion_ejemplares = 0;
		int peticion_ejemplares_prestados = 0;

		System.out.println("¿Quieres crear un libro?");
		texto_usuario = (bufferLectura.readLine());

		if (texto_usuario.equals("si")) {
			System.out.println("Introduzca  el nombre del libro:");
			peticion_nombre_libro = (bufferLectura.readLine());
			System.out.println("Introduzca el autor del libro:");
			peticion_autor_libro = (bufferLectura.readLine());
			System.out.println("Introduzca el numero de ejemplares:");
			peticion_ejemplares = Integer.parseInt(bufferLectura.readLine());
			System.out.println("Introduzca el numero de ejemplares prestados:");
			peticion_ejemplares_prestados = Integer.parseInt(bufferLectura.readLine());
			libro1 = new Libro(peticion_nombre_libro, peticion_autor_libro, peticion_ejemplares,
					peticion_ejemplares_prestados);
		}

		System.out.println("¿Quieres crear otro libro?");
		texto_usuario = (bufferLectura.readLine());

		if (texto_usuario.equals("si")) {
			System.out.println("Introduzca  el nombre del libro 2 :");
			peticion_nombre_libro = (bufferLectura.readLine());
			System.out.println("Introduzca el autor del libro 2:");
			peticion_autor_libro = (bufferLectura.readLine());
			System.out.println("Introduzca el numero de ejemplares del libro 2:");
			peticion_ejemplares = Integer.parseInt(bufferLectura.readLine());
			System.out.println("Introduzca el numero de ejemplares prestados del libro 2:");
			peticion_ejemplares_prestados = Integer.parseInt(bufferLectura.readLine());
			libro2 = new Libro(peticion_nombre_libro, peticion_autor_libro, peticion_ejemplares,
					peticion_ejemplares_prestados);
			System.out.println("Metodo Crear libro correcto");
		} else {
			System.out.println("Has decicido no crear otro libro");
		}
	}

	/**
	 * El metodo Auxiliar prestar permite mediante la peticion de parametros el
	 * prestamo de un objeto de la clase libro mediante el metodo creado en Libro
	 * 
	 * @throws IOException ;
	 */
	public static void prestar() throws IOException {
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String titulo_libro = "";
		boolean prestado = false;

		System.out.println("Introduzca  el nombre del libro:");
		titulo_libro = (bufferLectura.readLine());
		if (libro1 != null) {
			if (libro1.getTitulo().equals(titulo_libro)) {
				prestado = libro1.presta();
			}
		}
		if (!prestado && libro2 != null) {
			if (libro2.getTitulo().equals(titulo_libro)) {
				prestado = libro2.presta();
			}
		}

		if (prestado) {
			System.out.println("Se ha prestado el libro");
		} else {
			System.out.println("No se ha podido prestar el libro");
		}

	}

	/**
	 * El metodo devolver permite mediante la peticion de parametros la devolucion
	 * un objeto de la clase libro mediante el metodo creado en Libro
	 * 
	 * @throws IOException
	 */
	public static void devolver() throws IOException {
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String titulo_libro = "";
		boolean devolver = false;

		System.out.println("Introduzca  el nombre del libro:");
		titulo_libro = (bufferLectura.readLine());

		if (libro1 != null) {
			if (libro1.getTitulo().equals(titulo_libro)) {
				devolver = libro1.retornar();
			}
		}
		if (!devolver && libro2 != null) {
			if (libro2.getTitulo().equals(titulo_libro)) {
				devolver = libro2.retornar();
			}
		}

		if (devolver == true) {
			System.out.println("Se ha devuelto el libro");
		} else {
			System.out.println("No se ha podido devolver el libro");
		}

	}

	/**
	 * El metodo mostrar permite mediante la peticion de parametros mostrar un
	 * objeto de la clase libro mediante el metodo creado en Libro
	 * 
	 * @throws IOException
	 */
	public static void mostrarLibro() throws IOException {
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String titulo_libro = "";
		boolean infoMostrada = false;
		System.out.println("Introduzca  el nombre del libro:");
		titulo_libro = (bufferLectura.readLine());
		if (libro1 != null) {
			if (libro1.getTitulo().equals(titulo_libro)) {
				libro1.mostrarLibro();
				infoMostrada = true;
			}
		}

		if (libro2 != null && !infoMostrada) {
			if (libro2.getTitulo().equals(titulo_libro)) {
				libro2.mostrarLibro();
			}
		}

	}
}