package ejercicioCarrera;

public class Coche
{

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	public int getDistancia_recorrida() {
		return distancia_recorrida;
	}

	public void setDistancia_recorrida(int distancia_recorrida) {
		this.distancia_recorrida = distancia_recorrida;
	}
	private String piloto;
	private String marca;
	private String modelo;
	private int dorsal;
	private String logo;
	private int distancia_recorrida;
	

	Coche(String inPiloto , String inMarca ,String inModelo,int inDorsal,String inLogo)
	{
		piloto=inPiloto;
		marca=inMarca;
		modelo=inModelo;
		dorsal=inDorsal;
		logo=inLogo;
	
	}
	void mostrar_info_coche()
	{
		System.out.println("Lista de participantes de la carrera: ");
		System.out.println("Piloto: "+piloto+ " dorsal: "+dorsal);
	}


}
