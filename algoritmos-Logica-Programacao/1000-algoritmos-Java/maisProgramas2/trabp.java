class notas{

	public static String nota(double n1,double n2,double n3,int fal){

		double soma = n1+n2+n3;

		double media = soma/3;

		if(media < 10){
			return "Reprovado por media";
		}else if (fal == 10) {
			return "Reprovado por faltas";
		}

		return "Aprovado";
	}
	
}