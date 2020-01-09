package primerosPasos;

public class cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion=0;
		int longitud=0;
		
	
		posicion=Integer.parseInt(args[0]);
		String palabra=(args[1]);
		longitud=palabra.length();
		char letra=palabra.charAt(posicion);
		
		System.out.println("La palabra es "+palabra+" la longitud de la palabra es "+longitud+" la letra que esta en la posicion  "+posicion+" es " + letra );
	}

}
