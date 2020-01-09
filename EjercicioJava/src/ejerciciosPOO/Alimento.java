package ejerciciosPOO;

public class Alimento {

	private String nombre_Alimento;
	private int lipidos;
	private int hidratos;
	private int proteinas;
	private String origen;
	private String vitaminas_Minerales;

	
	Alimento() {
		nombre_Alimento = "--------";
		lipidos = 0;
		hidratos = 0;
		proteinas =0;
		origen="";
		vitaminas_Minerales="";
	}
	Alimento(String inNombre_Alimento,int inLipidos,int inHidratos,int inProteinas,String inOrigen,String inVitaminas_Minerales)
	{
		
		nombre_Alimento=inNombre_Alimento ;
		lipidos = inLipidos;
		hidratos = inHidratos;
		proteinas =inProteinas;
		origen=inOrigen;
		vitaminas_Minerales=inVitaminas_Minerales;
	}
	public String getNombre_Alimento() {
		return nombre_Alimento;
	}
	public void setNombre_Alimento(String nombre_Alimento) {
		this.nombre_Alimento = nombre_Alimento;
	}
	public int getLipidos() {
		return lipidos;
	}
	public void setLipidos(int lipidos) {
		this.lipidos = lipidos;
	}
	public int getHidratos() {
		return hidratos;
	}
	public void setHidratos(int hidratos) {
		this.hidratos = hidratos;
	}
	public int getProteinas() {
		return proteinas;
	}
	public void setProteinas(int proteinas) {
		this.proteinas = proteinas;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getVitaminas_Minerales() {
		return vitaminas_Minerales;
	}
	public void setVitaminas_Minerales(String vitaminas_Minerales) {
		this.vitaminas_Minerales = vitaminas_Minerales;
	}
	private String toUpperCase(String inVitaminas_Minerales) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean comprobar_dietetico(int inLipidos,String inVitaminas_Minerales) {
		boolean resultado=false;
		int lipidos=inLipidos;
		String vitaminas_Minerales=toUpperCase(inVitaminas_Minerales);
		
		if (lipidos<20 && !vitaminas_Minerales.equals("B"))
		{
			 resultado=true;
		}
		else
		{
		 resultado=false;
		}
		return resultado;
	}
	public double calcular_contenido_energetico(int inLipidos,int inProteinas,int inHidratos) {
		
		int lipidos=inLipidos;
		int proteinas=inProteinas;
		int hidratos=inHidratos;
		double formulalipidos=(((double)lipidos)/100)*9.4;
		double formulaproteinas=((double)proteinas)*5.3;
		double formulahidratos=(((double)hidratos)/100)*4.1;
		double calorias=formulahidratos+formulalipidos+formulaproteinas;
		return calorias;
	}
	public boolean validar_alim_deportista(int inLipidos,int inProteinas,int inHidratos) {
		boolean resultado=false;
		this.lipidos=inLipidos;
		this.proteinas=inProteinas;
		this.hidratos=inHidratos;
		
		if ((lipidos>=10 && lipidos<=15)&&(proteinas>=30 && proteinas<=35)&&(hidratos>=55 && hidratos<=65))
		{
			resultado=true;
		}
		else
		{
			resultado=false;
		}
		return resultado;
	}
	public	void mostrar_informacion()
	{
		System.out.println("Informacion del Alimento: ");
		System.out.println("Nombre del Alimento: " + " " + nombre_Alimento + "\n" + "Porcentaje en Lipidos : " + " " + lipidos + "\n"
				+ "Porcentaje en hidratos : " + hidratos + "\n" + "Porcentaje de proteinas: "
				+ proteinas+ "\n" + "Origen Animal: "+origen+"\n"+"Contenido en Vitaminas y minerales"+vitaminas_Minerales);
	
	}
	
	 
}
