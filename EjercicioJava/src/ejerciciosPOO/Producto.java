package ejerciciosPOO;
// TODO: Auto-generated Javadoc
/**
 * Esta clase Producto define una serie de metodos para creacion ,alquiler,devolver,vender,reparar y mostrar info de un producto . <br>
 * Ultima fecha de modificacion: 11/11/2019
 * 
 * @author Pablo Caceres Blanco
 * 
 * @version 1.0
 * 
 */

public class Producto {
	

	/** The nombre producto. */
	private String nombre_Producto = "";
	

	/** The codigo producto. */
	private int codigo_Producto =0;
	

	/** The precio. */
	private double precio = 0;
	

	/** The tipo producto. */
	private String tipo_Producto = "";
	

	/** The estado. */
	private String estado="";
	

	 /**
 	 * Instantiates a new producto.
 	 */
 	Producto() {
		nombre_Producto = "--------";
		codigo_Producto = 0;
		precio = 0;
		tipo_Producto = "---";
		estado="";
	}
	 

 
 	/**
	  * Instantiates a new producto.
	  *
	  * @param inNombre_Producto the in nombre producto
	  * @param inCodigo_Producto the in codigo producto
	  * @param inPrecio the in precio
	  * @param inTipo_Producto the in tipo producto
	  * @param inEstado the in estado
	  */
	 Producto(String inNombre_Producto,int inCodigo_Producto,double inPrecio,String inTipo_Producto,String inEstado) {
		nombre_Producto = inNombre_Producto;
		codigo_Producto = inCodigo_Producto;
		precio = inPrecio;
		tipo_Producto = inTipo_Producto;
		estado=inEstado;
		
	}
 	

	/**
	 * Instantiates a new producto.
	 *
	 * @param inProducto the in producto
	 */
	Producto(final Producto inProducto){
		nombre_Producto = inProducto.nombre_Producto;
		codigo_Producto = inProducto.codigo_Producto;
		precio =  inProducto.precio;
		tipo_Producto =  inProducto.tipo_Producto;
		estado= inProducto.estado;
	}


	public String getNombre_Producto() {
		return nombre_Producto;
	}



	public void setNombre_Producto(String nombre_Producto) {
		this.nombre_Producto = nombre_Producto;
	}



	public int getCodigo_Producto() {
		return codigo_Producto;
	}



	public void setCodigo_Producto(int codigo_Producto) {
		this.codigo_Producto = codigo_Producto;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getTipo_Producto() {
		return tipo_Producto;
	}



	public void setTipo_Producto(String tipo_Producto) {
		this.tipo_Producto = tipo_Producto;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * Vender.
	 *
	 * @return true, if successful
	 */
	public boolean Comprar(String inEstado)
	{
		String estado=inEstado;
		boolean resultado;
		if (estado.equals("Nuevo")||estado.equals("SegundaMano")||estado.equals("Reacondicionado"))
		{
			resultado=true;
			setEstado("Vendido");
		}
		else
		{
			
			 resultado=false;
		}
		return resultado;
	
	}
	public boolean Vender(String inEstado)
	{
		String estado=inEstado;
		boolean resultado;
		if (estado.equals("Roto")||estado.equals("Vendido"))
		{
			
			resultado=false;
		}
		else
		{
			resultado=true;
			setEstado("SegundaMano");
		}
		return resultado;
	}
	/**
	 * Alquilar.
	 *
	 * @return true, if successful
	 */
	public boolean Alquilar(String inEstado)
	{
		String estado=inEstado;
		boolean resultado=false;
		 if (estado.equals("Nuevo")||estado.equals("SegundaMano")||estado.equals("Reacondicionado"))
		{
			 resultado=true;
			setEstado("Alquilado");
		}
		else
		{
			resultado=false;
			
		}

		return resultado;
	}
	/**
	 * Devolver.
	 *
	 * @return true, if successful
	 */
	public boolean Devolver(String inEstado)
	{
		String estado=inEstado;
		boolean resultado=false;
		if (estado.equals("Roto")||estado.equals("Vendido"))
		{
			resultado=false;
		}
		else
		{
			 resultado=true;
			 setEstado("SegundaMano");

		}

		return resultado;
	}
	public boolean Reparar(String inEstado)
	{
		String estado=inEstado;
		boolean resultado=false;
		if (getEstado().equals("En_Reparacion"))
		{
			resultado=true;
			estado="Reacondicionado";
		}
		else
		{
			 resultado=false;
			 
		}

		return resultado;
	}
	public boolean Modificacion_precio( int inCodigo_Producto, String inEstado )
	{
		boolean resultado=false;
		String estado=inEstado;
		
		
		switch (estado)
		{
			case "Nuevo":
			setPrecio(69.99);
			break;
			case "Segundamano":
			setPrecio(35.99);
			break;
			case "Alquilado":
			setPrecio(10);
			break;
			case "En_Reparacion":
			setPrecio(0);
			break;
			case "Reacondicionado":
			setPrecio(30);
			break;
			case "Vendido":
			setPrecio(0);
			break;
			default:
				System.out.println("No se puede modificar el precio");
			break;
			}

		return resultado;
	}
	public void mostrarProducto() {
		System.out.println("Informacion del Producto: ");
		System.out.println("Nombre del Producto: " + " " + nombre_Producto + "\n" + "Codigo_Producto: " + " " + codigo_Producto + "\n"
				+ "Precio: " + precio + "\n" + "Tipo de producto: "
				+ tipo_Producto+ "\n" + "Estado del Producto: "+estado);

	}

}
