package primerosPasos;

public class CaracterToAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letra="";
		int ascii=0;
		
		letra=(args[0]);
		char caracter=letra.charAt(0);
		ascii=(int)caracter; 
		System.out.println("El caracter es "+ caracter +" y su numero ASCII es "+ascii);
		
	}

}
