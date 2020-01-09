package ejerciciosARRAYS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NotasArray {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
	 InputStreamReader manejadorEnt = new InputStreamReader(System.in);
	 BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
	 int alumnos=0;
	 double[] nota_alumno;
	 double nota=0;
	 double media=0;
	 System.out.println("¿De Cuantos alumnos quieres poner la nota ? ");
	 alumnos = Integer.parseInt(bufferLectura.readLine());
	 nota_alumno=new double[alumnos];
	 
	 for(int i = 0;i<alumnos;i++)
	 {
		 System.out.println("Dime la nota del alumno"+i+":");
		 nota = Integer.parseInt(bufferLectura.readLine());
		 nota_alumno[i]=nota;
		 media=media+nota_alumno[i];
		
	 }
	 media=((double)media)/alumnos;
	 System.out.println("La nota media de los alumnos es :"+media);
	 System.out.println("Los alumnos que superan la media son:");
	 for(int i = 0;i<alumnos;i++)
	 {
		 if(nota_alumno[i]>media)
		 {
			 System.out.println("El Alumno "+i+"con una nota de "+nota_alumno[i]);
		 }
	 }
	
	}

}
