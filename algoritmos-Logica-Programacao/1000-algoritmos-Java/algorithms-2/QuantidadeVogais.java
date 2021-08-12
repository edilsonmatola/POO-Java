//Eugenia Nhacuonga I11
import java.util.Scanner;
public class QuantidadeVogais{
	public static void main(String args[]){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Bem Vindo ao sistema de contagem de vogais em palavras!");
		String opccao=" ";
		do{
			if(opccao.isEmpty()==false){
				System.out.println(" ");
				System.out.println("Insira 1 para continuar");
				System.out.println("Insira enter para sair");
				System.out.println("Introduza a opccao desejada");
				opccao=teclado.nextLine();
				if(opccao.isEmpty()==false){
					String vogais="aeiou";
					System.out.println("Insira a palavra");
					String palavra1=teclado.nextLine();
					String palavra=palavra1.toLowerCase();
					//palavra.equalsIgnoreCase();
					char letra=' ';
					int cont=0;
					for(int x=0;x<vogais.length(); x++ ){
						char vogal=vogais.charAt(x);
						for(int i=0; i<palavra1.length(); i++){
							letra=palavra.charAt(i);
							if(vogal==letra){
									cont++;
							}
				
						}
					}
					if(cont==0){
						System.out.println("A palavra "+palavra1+" nao contem vogais.");
					}
					else if(cont>1){
					System.out.println("A palavra "+palavra1+" contem "+cont+" vogais.");
					}
					else{
						System.out.println("A palavra "+palavra1+" contem "+cont+" vogal.");
					}
				}
			}
		}while(opccao.isEmpty()==false);
		if(opccao.isEmpty()==true){
			System.out.println("Obrigado!");
		}
		
	}
}