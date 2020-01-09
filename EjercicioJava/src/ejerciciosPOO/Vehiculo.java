package ejerciciosPOO;

public class Vehiculo 
{
  private String matricula="";
  private String color="";
  private String disponibilidad="";
  private int anio=0;
  private boolean disponible=false;

  public Vehiculo()
  {
	 matricula ="--------";
	 color="---";
	 anio=0;
	 disponibilidad="";
	 disponible=false;
  }
  
  public Vehiculo(String inMatricula, String inColor,int inAnio,String inDisponibilidad)
  {
	matricula=inMatricula;
	color=inColor;
	anio=inAnio;
	if(inDisponibilidad.equals("si"))
	{
	  disponible=true;
	}
	else
	{
	  disponible=false;
	}
	
  } 
  public void setMatricula(String inMatricula)
  {
	matricula=inMatricula;
  }  
  public String getMatricula()
  {
	  return matricula;
  }
  public void setColor(String inColor) 
  {
	color = inColor;
  }
  public String getColor() 
  {
	return color;
  }
  public void setAnio(int inAnio) 
  {
  	anio = inAnio;
  }
  public int getAnio() 
  {
	return anio;
  }
  public void setDisponibilidad(String inDisponibilidad) 
  {
		disponibilidad = inDisponibilidad;
  }
  public String getDisponibilidad() 
  {
	return disponibilidad;
  }

public void mostrarInfo()
  {
	 if (disponible)
	 {
		 disponibilidad="El vehiculo esta disponible";
	 }
	 else
	 {
		 disponibilidad="El vehiculo no esta disponible";
	 }

	 System.out.println("Informacion del vehiculo: ");
	 System.out.println("Matricula: " +" " + matricula + "\n" + "Color: "+ " "+color +"\n"+ "Año: "+ anio+"\n" +"Disponibilidad: "+disponibilidad );
	 
  }
}
