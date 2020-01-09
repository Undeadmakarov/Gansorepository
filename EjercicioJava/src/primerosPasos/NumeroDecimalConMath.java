package primerosPasos;

public class NumeroDecimalConMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero=0;
		double decimal=0;
		int entero=0;
		numero=Double.parseDouble(args[0]);
		entero=(int) Math.abs(numero);
		decimal=numero-entero;
		System.out.println("El numero es   "+ numero +" su parte entera es "+entero+" y su parte decimal es " +decimal);
	}

}
