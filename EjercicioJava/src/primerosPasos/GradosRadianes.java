package primerosPasos;

public class GradosRadianes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double radianes=0;
			double gradosradianes=0;
			double grados=0;
			double minutos=0;
			double minutoscondecimales=0;
			double segundos=0;
			double decimalesGrados=0;
			double decimalesMinutos=0;
		
			
			radianes=Double.parseDouble(args[0]);
			gradosradianes=(radianes*180)/Math.PI;
			decimalesGrados=Math.abs(grados);
			grados=gradosradianes-decimalesGrados;
			minutoscondecimales=decimalesGrados*60;
			decimalesMinutos=Math.abs(minutoscondecimales);
			minutos=minutoscondecimales-decimalesMinutos;
			segundos=decimalesMinutos*60;
			
			System.out.println("El Angulo en radianes es  "+ radianes +" en grados es "+grados+" en minutos es " +minutos+" en segundos es "+segundos );
	}

}
