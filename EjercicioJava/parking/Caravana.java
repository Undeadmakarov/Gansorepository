package parking;
	import java.util.Date;
	// TODO: Auto-generated Javadoc

	/**
	 *La clase caravana la cual permite crear el objeto caravana.
	 */
	public class Caravana {

		/** The matricula. */
		private String matricula;
		
		/** The año. */
		private int año;
		
		/** The ocupantes. */
		private int ocupantes[];
		
		/** The hora entrada. */
		private Date horaEntrada= new Date();
		
		/** The hora salida. */
		private Date horaSalida=null;
		
		/**
		 * Instantiates a new caravana.
		 */
		public Caravana() {
			matricula="";
			año=0;
			ocupantes=null;
			horaEntrada=null;
			horaSalida=null;
		}
		
		/**
		 * Instantiates a new caravana.
		 *
		 * @param inMatricula the in matricula
		 * @param inAño the in año
		 * @param inOcupantes the in ocupantes
		 * @param inHoraEntrada the in hora entrada
		 * @param inHoraSalida the in hora salida
		 */
		public Caravana(String inMatricula,int inAño, int inOcupantes[], Date inHoraEntrada,Date inHoraSalida) {
			matricula=inMatricula;
			año=inAño;
			ocupantes=inOcupantes;
			horaEntrada=inHoraEntrada;
			horaSalida=inHoraSalida;
		}

		/**
		 * Gets the matricula.
		 *
		 * @return the matricula
		 */
		public String getMatricula() {
			return matricula;
		}

		/**
		 * Sets the matricula.
		 *
		 * @param matricula the new matricula
		 */
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		/**
		 * Gets the año.
		 *
		 * @return the año
		 */
		public int getAño() {
			return año;
		}

		/**
		 * Sets the año.
		 *
		 * @param año the new año
		 */
		public void setAño(int año) {
			this.año = año;
		}

		/**
		 * Gets the ocupantes.
		 *
		 * @return the ocupantes
		 */
		public int[] getOcupantes() {
			return ocupantes;
		}

		/**
		 * Sets the ocupantes.
		 *
		 * @param ocupantes the new ocupantes
		 */
		public void setOcupantes(int ocupantes[]) {
			this.ocupantes = ocupantes;
		}

		/**
		 * Gets the hora entrada.
		 *
		 * @return the hora entrada
		 */
		public Date getHoraEntrada() {
			return horaEntrada;
		}

		/**
		 * Sets the hora entrada.
		 *
		 * @param horaEntrada the new hora entrada
		 */
		public void setHoraEntrada(Date horaEntrada) {
			this.horaEntrada = horaEntrada;
		}

		/**
		 * Gets the hora salida.
		 *
		 * @return the hora salida
		 */
		public Date getHoraSalida() {
			return horaSalida;
		}

		/**
		 * Sets the hora salida.
		 *
		 * @param horaSalida the new hora salida
		 */
		public void setHoraSalida(Date horaSalida) {
			this.horaSalida = horaSalida;
		}
		
		/**
		 * Mostrar caravana.
		 */
		public void mostrarCaravana() {
			System.out.println("La matricula de la caravana es "+matricula+" el año es "+año+" los ocupantes "+ocupantes.length
					+" la hora de entrada "+horaEntrada+" y la hora de salida es "+horaSalida);
		}
	}

