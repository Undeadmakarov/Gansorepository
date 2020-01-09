package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Producto 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		int producto=0;
		int edad=0;
		double descuento=0;
		double precio=0;
		double preciounidad=0;
		
		System.out.println("Introduzca cuantos productos quieres");
		producto=Integer.parseInt(bufferLectura.readLine());
		System.out.println("Introduzca tu edad");
		edad=Integer.parseInt(bufferLectura.readLine());
		
		if (producto<10)
		{
			precio=200;
			preciounidad=precio/producto;
		}
		else 
		{
			precio=150;
			preciounidad=precio/producto;
		}
		
		if (edad<20) 
		{
			descuento=precio*0.10;
			precio=precio-descuento;
			preciounidad=precio/producto;
		}
		
		System.out.println("Has comprado  "+producto+" productos su precio es "+precio+" su precio por unidad es "+preciounidad );
	}

}
