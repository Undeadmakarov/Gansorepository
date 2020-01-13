package parking;

// TODO: Auto-generated Javadoc
/**
 * La clase camping permite la creacion de un camping 
 */

public class Camping {
		
		/** The nombre. */
		private String nombre;
		
		/** The cif. */
		private double CIF;
		
		/** The plaza. */
		private int plaza;
		
		/** The precio. */
		private double precio;
		
	
		
		/**
		 * Instantiates a new camping.
		 *
		 * @param inCIF the in CIF
		 * @param inNombre the in nombre
		 * @param inPrecio the in precio
		 */
		public Camping(double inCIF, String inNombre, double inPrecio) {
			CIF=inCIF;
			nombre=inNombre;
			precio=inPrecio;
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
		 * Gets the cif.
		 *
		 * @return the cif
		 */
		public double getCIF() {
			return CIF;
		}

		/**
		 * Sets the cif.
		 *
		 * @param cIF the new cif
		 */
		public void setCIF(double cIF) {
			CIF = cIF;
		}



		/**
		 * Gets the precio.
		 *
		 * @return the precio
		 */
		public double getPrecio() {
			return precio;
		}

		/**
		 * Sets the precio.
		 *
		 * @param precio the new precio
		 */
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		/**
		 * Mostrar informacion camping.
		 */
		public void mostrarInformacionCamping() {
			System.out.println("Este es el CIF "+CIF+" el nombre "+nombre+" y el precio "+precio);
		}
	}


