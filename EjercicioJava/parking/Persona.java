package parking;

// TODO: Auto-generated Javadoc
/**
 *la clase persona permite crear objetos de la clase persona.
 */
public class Persona {

	/** The dni. */
	private String DNI;
	
	/** The nombre. */
	private String nombre;
	
	/** The edad. */
	private int edad;
	
	/** The nacionalidad. */
	private String nacionalidad;
	
	/** The conductor. */
	private boolean conductor;
	
	/**
	 * Instantiates a new persona.
	 */
	public Persona() {
		DNI="";
		nombre="";
		edad=0;
		nacionalidad="";
		conductor=true;
	}
	
	/**
	 * Instantiates a new persona.
	 *
	 * @param inDNI the in DNI
	 * @param inNombre the in nombre
	 * @param inEdad the in edad
	 * @param inNacionalidad the in nacionalidad
	 * @param inConductor the in conductor
	 */
	public Persona(String inDNI,String inNombre, int inEdad, String inNacionalidad, boolean inConductor) {
		DNI=inDNI;
		nombre=inNombre;
		edad=inEdad;
		nacionalidad=inNacionalidad;
		conductor=inConductor;
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Sets the dni.
	 *
	 * @param dNI the new dni
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Sets the edad.
	 *
	 * @param edad the new edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Gets the nacionalidad.
	 *
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Sets the nacionalidad.
	 *
	 * @param nacionalidad the new nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	/**
	 * Checks if is conductor.
	 *
	 * @return true, if is conductor
	 */
	public boolean isConductor() {
		return conductor;
	}

	/**
	 * Sets the conductor.
	 *
	 * @param conductor the new conductor
	 */
	public void setConductor(boolean conductor) {
		this.conductor = conductor;
	}

	/**
	 * Mostrar persona.
	 */
	public void mostrarPersona() {
		System.out.println("El DNI es "+DNI+" el nombre es"+nombre+" la edad es "+edad+" la nacionalidad es "+nacionalidad+" es conductor "+conductor);
	}
}