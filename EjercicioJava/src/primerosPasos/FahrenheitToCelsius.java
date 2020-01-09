package primerosPasos;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahrenheit=0;
		double celsius=0;	
		
		fahrenheit=Double.parseDouble(args[0]);
		celsius=((fahrenheit-32)*5)/9;
		
		System.out.println("Tenemos "+ fahrenheit +" º Fahrenheit y tenemos  "+celsius+" º celsius");
	         	
	}

}
