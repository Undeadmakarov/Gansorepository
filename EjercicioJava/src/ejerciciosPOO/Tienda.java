package ejerciciosPOO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tienda {
	static Producto Producto1;
	static Producto Producto2;
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
			System.out.println("Introduzca  la opcion que quieras 1)crear producto,2)comprar,3)vender,4)alquilar,5)devolver,6)reparar,7)modificar_precio,8)mostrar_producto o 9)salir");
			opcion = Integer.parseInt(bufferLectura.readLine());
			switch (opcion) {
			case 1:
				crear_producto();
				break;
			case 2:
				comprar();
				break;
			case 3:
				vender();
				break;
			case 4:
				alquilar();
				break;
			case 5:
				devolver();
			break;
			case 6:
				reparar();
			break;
			case 7:
				modificar_precio();
			break;
			case 8:
				mostrar_producto(); 
			break;
			case 9:
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
	public static void crear_producto()throws IOException 
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String texto_usuario="";
		String nombre_Producto = "";
		int codigo_Producto = 0;
		double precio = 0;
		String tipo_Producto = "";
		String estado ="";

		System.out.println("¿Quieres crear un producto?");
		texto_usuario = (bufferLectura.readLine());

		if (texto_usuario.equals("si")) {
			System.out.println("Introduzca  el nombre del producto:");
			nombre_Producto = (bufferLectura.readLine());
			System.out.println("Introduzca el codigo de producto:");
			codigo_Producto=Integer.parseInt(bufferLectura.readLine());
			System.out.println("Introduzca el precio:");
			precio = Double.parseDouble(bufferLectura.readLine());
			System.out.println("Introduzca el tipo de producto:");
			tipo_Producto=(bufferLectura.readLine());
			System.out.println("Introduzca el estado del producto:");
			estado=(bufferLectura.readLine());
			Producto1 = new Producto(nombre_Producto, codigo_Producto, precio,
					tipo_Producto,estado);
		}
		System.out.println("¿Quieres crear otro producto?");
		texto_usuario = (bufferLectura.readLine());
		if (texto_usuario.equals("si")) {
			System.out.println("Introduzca  el nombre del producto:");
			nombre_Producto = (bufferLectura.readLine());
			System.out.println("Introduzca el codigo de producto:");
			codigo_Producto=Integer.parseInt(bufferLectura.readLine());
			System.out.println("Introduzca el precio:");
			precio = Double.parseDouble(bufferLectura.readLine());
			System.out.println("Introduzca el tipo de producto:");
			tipo_Producto=(bufferLectura.readLine());
			System.out.println("Introduzca el estado del producto:");
			estado=(bufferLectura.readLine());
			Producto2 = new Producto(nombre_Producto, codigo_Producto, precio,
					tipo_Producto,estado);
		}
	}
		public static void comprar()throws IOException 
		{
			InputStreamReader manejadorEnt = new InputStreamReader(System.in);
			BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
			String Nombre_Producto = "";
			boolean comprar = false;
			String estado="";
			System.out.println("Introduzca  el nombre del producto:");
			Nombre_Producto = (bufferLectura.readLine());
			
			

			if (Producto1 != null) {
				if (Producto1.getNombre_Producto().equals(Nombre_Producto)) {
					estado=Producto1.getEstado();
					comprar = Producto1.Comprar(estado);
					System.out.println(comprar);
				}
			}
			if (!comprar && Producto2 != null) {
				if (Producto2.getNombre_Producto().equals(Nombre_Producto)) {
					estado=Producto2.getEstado();
					comprar = Producto2.Comprar(estado);
					System.out.println(comprar);
				}
			}

			if (comprar == true) {
				System.out.println("Se ha comprado el producto");
			} else {
				System.out.println("No se ha podido comprar el producto");
			}

		}
		
	public static void vender()throws IOException 
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String Nombre_Producto = "";
		boolean vender = false;
		String estado="";
		
		System.out.println("Introduzca  el nombre del producto:");
		Nombre_Producto = (bufferLectura.readLine());
	
		if (Producto1 != null) {
			if (Producto1.getNombre_Producto().equals(Nombre_Producto)) {
				estado=Producto1.getEstado();
				vender = Producto1.Vender(estado);
			}
		}
		if (!vender && Producto2 != null) {
			if (Producto2.getNombre_Producto().equals(Nombre_Producto)) {
				estado=Producto2.getEstado();
				vender = Producto2.Vender(estado);
			}
		}
	
		if (vender == true) {
			System.out.println("Se ha vendido el producto");
		} else {
			System.out.println("No se ha podido vender el producto");
		}
	
	}
	public static void alquilar()throws IOException 
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String Nombre_Producto = "";
		boolean alquilar = false;
		String estado="";

		System.out.println("Introduzca  el nombre del producto:");
		Nombre_Producto = (bufferLectura.readLine());

		if (Producto1 != null) {
			if (Producto1.getNombre_Producto().equals(Nombre_Producto)) {
				estado=Producto1.getEstado();
				alquilar = Producto1.Alquilar(estado);
			}
		}
		if (!alquilar && Producto2 != null) {
			if (Producto2.getNombre_Producto().equals(Nombre_Producto)) {
				estado=Producto2.getEstado();
				alquilar = Producto2.Alquilar(estado);
			}
		}

		if (alquilar == true) {
			System.out.println("Se ha alquilado el producto");
		} else {
			System.out.println("No se ha podido alquilar el producto");
		}

	}
	public static void devolver()throws IOException 
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String Nombre_Producto = "";
		String estado="";
		boolean devolver = false;

		System.out.println("Introduzca  el nombre del producto:");
		Nombre_Producto = (bufferLectura.readLine());

		if (Producto1 != null) {
			if (Producto1.getNombre_Producto().equals(Nombre_Producto)) {
				estado=Producto1.getEstado();
				devolver = Producto1.Devolver(estado);
			}
		}
		if (!devolver && Producto2 != null) {
			if (Producto2.getNombre_Producto().equals(Nombre_Producto)) {
				estado=Producto2.getEstado();
				devolver = Producto2.Devolver(estado);
			}
		}

		if (devolver == true) {
			System.out.println("Se ha devuelto el producto");
		} else {
			System.out.println("No se ha podido devolver el producto");
		}
	}
	public static void reparar()throws IOException 
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		String Nombre_Producto = "";
		String estado="";
		boolean reparar = false;

		System.out.println("Introduzca  el nombre del producto:");
		Nombre_Producto = (bufferLectura.readLine());

		if (Producto1 != null) {
			if (Producto1.getNombre_Producto().equals(Nombre_Producto)) {
				estado=Producto1.getEstado();
				reparar = Producto1.Reparar(estado);
			}
		}
		if (!reparar && Producto2 != null) {
			if (Producto2.getNombre_Producto().equals(Nombre_Producto)) {
				estado=Producto2.getEstado();
				reparar = Producto2.Reparar(estado);
			}
		}

		if (reparar == true) {
			System.out.println("Se ha reparado el producto");
		} else {
			System.out.println("No se ha podido reparado el producto");
		}
	}
	public static void modificar_precio()throws IOException 
	{
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int codigo_Producto = 0;
		String estado="";
		boolean modificar = false;

		System.out.println("Introduzca  el codigo del producto:");
		codigo_Producto =Integer.parseInt(bufferLectura.readLine());
		System.out.println("Introduzca el estado del producto");
		estado = (bufferLectura.readLine());
		if (Producto1 != null) {
			if (Producto1.getCodigo_Producto()==(codigo_Producto)) {
				modificar = Producto1.Modificacion_precio(codigo_Producto,estado);
			}
		}
		if (!modificar && Producto2 != null) {
			if (Producto2.getCodigo_Producto()==(codigo_Producto)) {
				modificar = Producto2.Modificacion_precio(codigo_Producto,estado);
			}
		}

		if (modificar == true) {
			System.out.println("Se ha mod1ificado el precio del producto");
		} else {
			System.out.println("No se ha podido modificar el precio del producto");
		}
	}
	public static void mostrar_producto()throws IOException
	{
			InputStreamReader manejadorEnt = new InputStreamReader(System.in);
			BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
			int codigo_Producto = 0;
			boolean infoMostrada = false;
			
			System.out.println("Introduzca  el codigo del producto:");
			codigo_Producto =Integer.parseInt(bufferLectura.readLine());
			
			if (Producto1!= null) {
				if (Producto1.getCodigo_Producto()==(codigo_Producto)) 
				{
					Producto1.mostrarProducto();
					infoMostrada = true;
				}
			}
			else if (Producto2!= null)
			{
				if (Producto2.getCodigo_Producto()==(codigo_Producto)) 
				{
					Producto2.mostrarProducto();
					infoMostrada = true;
				}
			
			
			}

	}
}




