package programacionEstructura;

public class LetrasASCII 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FINASCII=121;
		int posicion_letra=0;
		int contador=0;
		String letras="";
		char letra=0;
		
		do
		{
			letra=(char)posicion_letra;
			letras=letras+letra;
			contador++;
			if ((contador%10==0)||posicion_letra==FINASCII)
			{
				System.out.println(letras);
				contador=0;
				letras="";
			}	
			
			
			posicion_letra++;
		}while (posicion_letra<=FINASCII);
		
	}
}
