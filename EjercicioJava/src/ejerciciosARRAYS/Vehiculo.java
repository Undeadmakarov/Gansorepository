package ejerciciosARRAYS;

public class Vehiculo 
{
  private String matricula="";
  private String color="";
  private int anio=0;

  public Vehiculo()
  {
	 matricula ="--------";
	 color="---";
	 anio=0;

  }
  
  public Vehiculo(String inMatricula, String inColor,int inAnio)
  {
	matricula=inMatricula;
	color=inColor;
	anio=inAnio;
  } 
  
public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getAnio() {
	return anio;
}

public void setAnio(int anio) {
	this.anio = anio;
}

public void mostrarInfo()
  {


	 System.out.println("Informacion del vehiculo: ");
	 System.out.println("Matricula: " +" " + matricula + "\n" + "Color: "+ " "+color +"\n"+ "Año: "+ anio+"\n" );
	 
  }
}

