public class igualcaracter{
	public static void main (String []args){
		/*
			criar programa em java que recebe duas palavras e compara e no fim diz nos quais sao os caracteres iquais
		*/
		String nomenone = "Maculuve";

		String nometow = "Macul";

		String aux = "";

		if (nomenone.equals(nometow)) {
			System.out.println("As palavras"+nometow+" e "+nomenone);
		}else{
			System.out.println("As palavras"+nometow+" e "+nomenone);
		}

		for (int i=1;i<nomenone.length() ;i++ ) {
			for (int j=1; j<nometow.length();j++ ) {
				
				if(nomenone.charAt(i) == nometow.charAt(j)){

					aux = aux +nomenone.charAt(i);
				}
			}
		}

		System.out.println("As palavras"+"/n"+aux);

	}
}