package primerosPasos;

public class CalculoCircunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio=0;
		double diametro=0;
		double longitudCircunferencia=0;
		double superficieCirculo=0;
		double superficiedelaesferoide=0;
		
		
		radio=Double.parseDouble(args[0]);
		diametro=radio*2;
		longitudCircunferencia=Math.PI*diametro;
		superficieCirculo=(2*Math.PI)*diametro;
		superficiedelaesferoide=(4*Math.PI)*diametro;
		System.out.println("El radio es "+radio+" el diametro es "+diametro+" la longitud de la circunferencia es "+longitudCircunferencia+" la superficie del circulo es "+ superficieCirculo+" la superficie del esfera es "+ superficiedelaesferoide);
	}

}
