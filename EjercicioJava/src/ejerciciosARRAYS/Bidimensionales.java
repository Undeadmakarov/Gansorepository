package ejerciciosARRAYS;

public class Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperaturas[][]= {{16,6,12},{15,4,10},{30,20,25},{14,-4,-3},{16,7,12},{14,-4,12},{30,-17,15}};
		String sopa[][]= {{"A","V","I","O","N"},
						  {"N","A","N","A","S"},
						  {"A","P","D","S","A"},
						  {"P","O","I","T","A"},
						  {"C","A","E","A","S"}
						  };
		temperaturas[1][1]=5;
		System.out.println(temperaturas[1][1]);
		System.out.println(sopa[0][2]+sopa[1][2]+sopa[2][2]+sopa[3][2]);
	}

}
