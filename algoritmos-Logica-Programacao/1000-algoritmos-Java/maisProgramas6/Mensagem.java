import java.util.Scanner;
 class Mensagem{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		String mensagem=" ";
		System.out.print("Insira a mensagem que deseja: ");
		mensagem=scan.nextLine();
		for(int i=mensagem;i<mensagem.lenght;i--){
			mensagem=mensagem.charAt(i);
		}System.out.print(mensagem);
	}
 }