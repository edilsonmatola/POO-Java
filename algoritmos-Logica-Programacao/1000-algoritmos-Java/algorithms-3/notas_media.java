import java.util.Scanner;

public class notas_media{
	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		byte pri_numero,seg_numero,maior=0,i;

		double soma=0,media,nota;


		for(i=0;i<3;i++){

			System.out.println("Digite o Primeiro numero");
			nota = ler.nextDouble();

			soma = soma + nota;
		}
			media = soma/3;


		if(media<10){

			System.out.println("Excluido");
		}else{
			if(media>=10 && media<=14){

				System.out.println("Admitido");

			}else{
				if (media>=14) {
					System.out.println("Dispensado");	
				}
			}
		}
	}
}