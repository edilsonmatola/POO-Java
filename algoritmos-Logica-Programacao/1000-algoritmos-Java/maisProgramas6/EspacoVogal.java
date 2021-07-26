import java.util.Scanner;
public class EspacoVogal{
	public static void contar(String palavra){
		int contaEspaco=0;
		int contaVogal=0;
		for (int i=0;i<palavra.length() ;i++ ) {
			if(palavra.charAt(i)==' '){
				contaEspaco++;
			}
			else {
				if((palavra.charAt(i)=='a')||(palavra.charAt(i)=='e')||(palavra.charAt(i)=='i')||(palavra.charAt(i)=='o')||(palavra.charAt(i)=='u')){
					contaVogal++;
				}
			}
			System.out.print("Espacos em branco: "+contaEspaco);
			System.out.print("Numero de Vogais: "+contaVogal);
		}
	}

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Insira uma frase ou palavra: ");
			String palavra=scan.nextLine();
			contar(palavra);
		}
}
	
	