package primerosPasos;

public class NumerodecimalconString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numerodecimal=0;
		int posicionPunto =0;
		int posicionFinal=0;
		
		numerodecimal=Double.parseDouble(args[0]);
		String numero=Double.toString(numerodecimal);
		posicionPunto=numero.indexOf('.');
		posicionFinal=numero.length();
		String parteEntera=numero.substring(0,posicionPunto);
		String parteDecimal=numero.substring(posicionPunto,posicionFinal);
		System.out.println("El numero es   "+ numero +" su parte entera es "+parteEntera+" y su parte decimal es " +parteDecimal);
	}

}
