package ejercicioCarrera;

public class Apuestas
{
	private int id_apuestas;
	private String dni;
	private String piloto;
	private int dinero;
	

	public int getId_apuestas() {
		return id_apuestas;
	}



	public void setId_apuestas(int id_apuestas) {
		this.id_apuestas = id_apuestas;
	}



	public String getPiloto() {
		return piloto;
	}



	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}



	Apuestas(String inDni,String inPiloto ,int inDinero,int inId_apuestas)
	{
		piloto=inPiloto;
		dni=inDni;
		dinero=inDinero;
		id_apuestas=inId_apuestas;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}





	public int getDinero() {
		return dinero;
	}


	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
}
