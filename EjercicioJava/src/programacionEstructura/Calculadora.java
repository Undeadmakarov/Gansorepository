package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calculadora
{

	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		boolean error=false;
		double num1=0;
		double num2=0;
		double total=0;
		String operacion="";
		String fraseOperacion="";
		
		System.out.println("Introduzca un numero");
		num1=Double.parseDouble(bufferLectura.readLine());
		System.out.println("Introduzca otro numero");
		num2=Double.parseDouble(bufferLectura.readLine());
		System.out.println("Introduzca la operacion ha realizar(+,-,*,/)");
		operacion=(bufferLectura.readLine());
		
			switch (operacion) 
			{
				case "+":
					total=num1+num2;	
				break;
				case "-":
					total=num1-num2;
				break;
				case "*":
					total=num1*num2;
				break;	
				case "/":
					total=num1/num2;
				break;
				default:
					error = true;	
				break;
			}
			if (error)
			{
			  fraseOperacion="Has elegido una operacion no valida";
			}
			else
			{
			  fraseOperacion="El primer numero es "+num1+" el segundo numero es "+num2+" la operacion que has elegido es "+operacion+" y el resultado es "+total; 
			}
			System.out.println(fraseOperacion);
	}
}