package primerosPasos;

public class TeoremaPitagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cateto1=0;
		double cateto2=0;
		double cateto1cuadrado=0;
		double cateto2cuadrado=0;
		double hipotenusa=0;
		double hipotenusa2=0;
		
		cateto1=Double.parseDouble(args[0]);
		cateto2=Double.parseDouble(args[1]);
		cateto1cuadrado=cateto1*cateto1;
		cateto2cuadrado=cateto2*cateto2;
		hipotenusa2=cateto1cuadrado*cateto2cuadrado;
		hipotenusa=Math.sqrt(hipotenusa2);
		System.out.println("El cateto 1 es  "+ cateto1 +" el cateto 2 es "+cateto2+" y la hipotenusa es  " + hipotenusa);
		
	}

}
