package programacionEstructura;

public class IfTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temperatura=0;
		temperatura=Double.parseDouble(args[0]);
		if (temperatura>=20 ) 
		{
			System.out.println("Hace mas calor que en la comunion de charmander");
		}
		else
		{
			System.out.println("Hace bastante frio");
		}
			
	}

}
