package programacionEstructura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Dados1000 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader manejadorEnt = new InputStreamReader(System.in);
		BufferedReader bufferLectura = new BufferedReader(manejadorEnt);
		final int MIL=1000;
		int peticion_Amano=0;
		int numero_Repeticiones=0;
		int dado=0;
		int i=0;
		int num_Veces_1=0,total_Veces_1=0;
		int num_Veces_2=0,total_Veces_2=0;
		int num_Veces_3=0,total_Veces_3=0;
		int num_Veces_4=0,total_Veces_4=0;
		int num_Veces_5=0,total_Veces_5=0;
		int num_Veces_6=0,total_Veces_6=0;
		int fila_principio=0;

	
	
		
		System.out.println("Introduzca el numero de tiradas que comprobara el amaño");
		peticion_Amano=Integer.parseInt(bufferLectura.readLine());
		System.out.println("Introduzca el numero de repeticiones por tirada");
		numero_Repeticiones=Integer.parseInt(bufferLectura.readLine());
		
		for (i=1;i<=MIL;i++)
		{ 
			dado=(int)(6*(Math.random()))+1;
			fila_principio=(i-peticion_Amano);
			switch(dado)
				{ 
					case 1:
					num_Veces_1++;
					total_Veces_1++;
					if((i%peticion_Amano==0)&&(num_Veces_1>numero_Repeticiones))
					{
					 System.out.println("El numero 1 se repite "+num_Veces_1+" en la fila"+fila_principio+" y la "+i);
					}
					break;
					case 2:
					num_Veces_2++;
					total_Veces_2++;
					if((i%peticion_Amano==0)&&(num_Veces_2>numero_Repeticiones))
					{
					 System.out.println("El numero 2 se repite "+num_Veces_2+" en la fila"+fila_principio+" y la "+i);
					}
					break;
					case 3:
					num_Veces_3++;	
					total_Veces_3++;
					if((i%peticion_Amano==0)&&(num_Veces_3>numero_Repeticiones))
					{
					System.out.println("El numero 3 se repite "+num_Veces_3+" en la fila"+fila_principio+" y la "+i);
					}
					break;
					case 4:
					num_Veces_4++;
					total_Veces_4++;
					if((i%peticion_Amano==0)&&(num_Veces_4>numero_Repeticiones))
					{
					 System.out.println("El numero 4 se repite "+num_Veces_4+" en la fila"+fila_principio+" y la "+i);
					}
					break;
					case 5:
					num_Veces_5++;
					total_Veces_5++;
					if((i%peticion_Amano==0)&&(num_Veces_1>numero_Repeticiones))
					{
					 System.out.println("El numero 5 se repite "+num_Veces_5+" en la fila"+fila_principio+" y la "+i);
					}
					break;
					case 6:
					num_Veces_6++;
					total_Veces_6++;
					if((i%peticion_Amano==0)&&(num_Veces_1>numero_Repeticiones))
					{	
					 System.out.println("El numero 6 se repite "+num_Veces_6+" en la fila"+fila_principio+" y la "+i);
					}
					break;
					
					default:
						System.out.println("Este dado no tiene tantas caras");	
					break;
				}
			if(i%peticion_Amano==0)
			{
				num_Veces_1=0;
				num_Veces_2=0;
				num_Veces_3=0;
				num_Veces_4=0;
				num_Veces_5=0;
				num_Veces_6=0;
			}
			
		}
		System.out.println("De mil tiradas han salido los siguientes resultados ");	
		System.out.println("Cara 1:"+total_Veces_1);
		System.out.println("Cara 2:"+total_Veces_2);	
		System.out.println("Cara 3:"+total_Veces_3);	
		System.out.println("Cara 4:"+total_Veces_4);	
		System.out.println("Cara 5:"+total_Veces_5);	
		System.out.println("Cara 6:"+total_Veces_6);
   }
}
