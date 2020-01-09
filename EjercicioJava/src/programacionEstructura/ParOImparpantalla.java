package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ParOImparpantalla {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		
		int numero=0;

		System.out.println("Introduzca un numero");
		numero=Integer.parseInt(bufferLectura.readLine());
		
		if (numero%2==0) {
			System.out.println("Su numero es par y es el " + numero );
						}
		else {
			System.out.println("Su numero es impar y es el " + numero );
			 }
	}

}
