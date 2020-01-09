package primerosPasos;

public class NumerodecimalSinclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero_Decimal = 0;
		int parte_Entera =0;
		double parte_Decimal =0;
		
		numero_Decimal=Double.parseDouble(args[0]);
		parte_Entera = (int) numero_Decimal;
		parte_Decimal = numero_Decimal - parte_Entera;
		System.out.println("El numero es   "+ numero_Decimal +" su parte entera es "+parte_Entera+" y su parte decimal es " +parte_Decimal);
	}

}
