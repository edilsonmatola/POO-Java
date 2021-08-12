public class figurailustrada {
	public static void main (String []args){
		/*
			Com base na figura ilustrada no quadro criar
			 um programa em java que calcule a ultura maxima
			  atingida pelo veiculo e a distancia percorrida pelo mesmo
		*/
		final byte angulo = 30;
		final byte catad = 2;

		double altura = Math.tan(angulo)*2;

		double hipotenusa = Math.pow(altura,2)*Math.pow(2,2);

		System.out.println("Altura igual a:"+altura);

		System.out.println("Altura igual a:"+hipotenusa);

	}
}