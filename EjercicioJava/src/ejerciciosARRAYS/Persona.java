package ejerciciosARRAYS;

public class Persona {
	private String nombre_Persona;
	private int edad;
	private String dni;
	Persona()
	{
		nombre_Persona="";
		dni="";
		edad=0;
		
	}
	Persona (String inNombre_Persona,String inDni,int inEdad)
	{
		nombre_Persona=inNombre_Persona;
		dni=inDni;
		edad=inEdad;
		
	}
	public String getNombre_Persona() {
		return nombre_Persona;
	}

	public void setNombre_Persona(String nombre_Persona) {
		this.nombre_Persona = nombre_Persona;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	public	void mostrar_informacion()
	{
		System.out.println("Informacion de la Persona: ");
		System.out.println("Nombre de Persona:"+" "+nombre_Persona+"\n"+ " Dni de la persona: " + " " + dni + "\n" + "Edad de la persona : " + " " + edad + "\n");
	
	}

}
