package ejerciciosARRAYS;

public class carretera {
	private String nombre_Carretera;
	private Double kilometros;
	private String materiales;
	private String clima;
	private int ultimaReparacion;
	private  Persona responsable;


	
	carretera() {
		nombre_Carretera="";
		kilometros =0.0;
		materiales = "";
		clima = "";
		ultimaReparacion =0;
		responsable= null;

	}
	carretera(String inNombre_Carretera,double inKilometros,String inMateriales,String inClima,int inUltimaReparacion,Persona inPersona)
	{
		nombre_Carretera=inNombre_Carretera;
		kilometros=inKilometros ;
		materiales = inMateriales;
		clima = inClima;
		ultimaReparacion =inUltimaReparacion;
		responsable=inPersona;
	}
	public String getNombre_Carretera() {
		return nombre_Carretera;
	}
	public void setNombre_Carretera(String nombre_Carretera) {
		this.nombre_Carretera = nombre_Carretera;
	}
	public Double getKilometros() {
		return kilometros;
	}
	public void setKilometros(Double kilometros) {
		this.kilometros = kilometros;
	}
	public String getMateriales() {
		return materiales;
	}
	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public int getUltimaReparacion() {
		return ultimaReparacion;
	}
	public void setUltimaReparacion(int ultimaReparacion) {
		this.ultimaReparacion = ultimaReparacion;
	}
	public Persona getResponsable() {
		return responsable;
	}
	public void setResponsable(Persona responsable) {
		this.responsable = responsable;
	}
	public	void mostrar_informacion()
	{
		System.out.println("Informacion de la Carretera: ");
		System.out.println("Nombre de Carreteras:"+" "+nombre_Carretera+"\n"+ " Kilometros de la Carretera: " + " " + kilometros + "\n" + "Materiales utilizados : " + " " + materiales + "\n"
				+ "Clima en carretera : " + clima + "\n" + "Ultimo Año de reparacion: "
				+ ultimaReparacion);
	
	}
	 
}
