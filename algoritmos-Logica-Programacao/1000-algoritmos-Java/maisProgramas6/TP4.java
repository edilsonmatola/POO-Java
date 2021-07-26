//Alberto Matola
//Este programa e de um dos trabalhos praticos de programacao1.
public class TP4{
	
	static String Primeira="Os estudantes aplicados";
	static String Segunda="Tem mais chances de se tornarem bons Programadores";
	
	public static void Nr_Vogais(String Primeira){
		int vogais=0;
		Primeira.toLowerCase();
		for(int i=0; i<Primeira.length(); i++){
			char letra=Primeira.charAt(i);
			if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
                vogais++;
			}
        }
		System.out.println("A primeira cadeia tem :"+vogais+" vogais.");
	}
	public static void Tamanho(String Segunda){
		int Tamanho=Segunda.length();
		System.out.println("O tamanho da segunda cadeia: "+Tamanho);
	}
	public static void Inversao(String Primeira){
		char inversao='0';
		int i;
		
		for(i=Primeira.length()-1; i>=0; i--){
			inversao=Primeira.charAt(i);
			System.out.print(inversao);
		}
		System.out.println(" ");
	}
	public static void Uniao(String Primeira, String Segunda){
		String Uniao=Primeira.concat(Segunda);
		System.out.println("Uniao: "+Uniao);
	}
	public static void Caracter(String Segunda){
		char posicao=Segunda.charAt(2);
		System.out.println("O caracter na terceira posicao: "+posicao);
	}
	public static void Maiusculas_Minusculas(String Primeira, String Segunda){
		String Primeira_Maiuscula=Primeira.toUpperCase();
		String Primeira_Minuscula=Primeira.toLowerCase();
		String Segunda_Maiuscula=Segunda.toUpperCase();
		String Segunda_Minuscula=Segunda.toLowerCase();
		System.out.println(Primeira_Maiuscula);
		System.out.println(Primeira_Minuscula);
		System.out.println(Segunda_Maiuscula);
		System.out.println(Segunda_Minuscula);
	}
	
	public static void main(String args[]){
		Nr_Vogais(Primeira);
		Tamanho(Segunda);
		Inversao(Primeira);
		Uniao(Primeira, Segunda);
		Caracter(Segunda);
		Maiusculas_Minusculas(Primeira, Segunda);
	}
}