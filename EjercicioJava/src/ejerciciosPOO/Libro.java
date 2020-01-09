package ejerciciosPOO;

/**
 * Esta clase Libro define una serie de metodos para creacion ,prestar,devolver y mostrar info de un libro . <br>
 * Ultima fecha de modificacion: 11/11/2019
 * 
 * @author Pablo Caceres Blanco
 * 
 * @version 1.0
 * 
 */
public class Libro {
	private String titulo = "";
	private String autor = "";
	private int num_ejemplares = 0;
	private int num_prestados = 0;
	private boolean prestamo = false;
	private boolean retornar = false;
	/**
	 * Este metodo sirve para la creacion del constructor por defecto
	 */
	public Libro() {
		titulo = "--------";
		autor = "---";
		num_ejemplares = 0;
		num_prestados = 0;

	}
	/**
	 * Este metodo sirve para la creacion del constructor mediante parametros
	 * @param inTitulo (String)
	 * @param inAutor (String  )
	 */
	public Libro(String inTitulo, String inAutor, int inNum_Ejemplares, int inNum_prestados) {
		titulo = inTitulo;
		autor = inAutor;
		num_ejemplares = inNum_Ejemplares;
		num_prestados = inNum_prestados;
	}

	public void setTitulo(String inTitulo) {
		titulo = inTitulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String inAutor) {
		autor = inAutor;
	}

	public String getAutor() {
		return autor;
	}

	public int getNum_ejemplares() {
		return num_ejemplares;
	}

	public void setNum_ejemplares(int inNum_ejemplares) {
		num_ejemplares = inNum_ejemplares;
	}

	public void setNum_prestados(int inNum_prestados) {
		num_prestados = inNum_prestados;
	}

	public int getNum_prestados() {
		return num_prestados;
	}

	public boolean presta() {
		if (num_prestados >= num_ejemplares) {
			prestamo = false;
		} else {
			prestamo = true;
			num_prestados = num_prestados + 1;
		}
		return prestamo;
	}

	public boolean retornar() {
		if (num_prestados == 0) {
			retornar = false;
		} else {
			retornar = true;
			num_prestados = num_prestados - 1;
		}
		return retornar;
	}

	public void mostrarLibro() {
		System.out.println("Informacion del Libro: ");
		System.out.println("Titulo del libro: " + " " + titulo + "\n" + "Autor: " + " " + autor + "\n"
				+ "Numero de ejemplares en la biblioteca: " + num_ejemplares + "\n" + "Numero de ejemplares prestados: "
				+ num_prestados);

	}

}