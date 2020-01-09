package primerosPasos;

public class ConversorMedidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pies=0;
		double yardasPies=0;
		double metrosPies=0;
		double metrosPulgadas=0;
		
		pies=Double.parseDouble(args[0]);
		yardasPies=pies/3;
		metrosPies=pies/3.28;
		metrosPulgadas=metrosPies*39.37;
		System.out.println("De pies a yardas "+yardasPies+" de pies a metros "+metrosPies+" de metros a pulgadas "+metrosPulgadas);
		
	}

}
