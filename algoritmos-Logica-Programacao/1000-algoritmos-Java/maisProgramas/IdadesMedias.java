 //Eugenia Nhacuonga I11 
import java.util.Scanner;
public class IdadesMedias{
	public static void main(String[] args){
		int idade;
		double media=0,media1=0,media2=0,soma=0,soma1=0,soma2=0;
		String sexo;
		Scanner teclado=new Scanner(System.in);
		for(int i=1; i<=2; i++){
			System.out.print("Idade:");
			idade=teclado.nextInt();
			System.out.print("Insira o seu sexo:");
			sexo=teclado.nextLine();
			soma=soma+idade;
			media=soma/i;
			if(sexo.equalsIgnoreCase("feminino")){
				 i=i+1;
				 soma1=idade+soma1;
				 media1=soma1/i;
			}
			 
			else if(sexo.equalsIgnoreCase("masculino")){
				 i=i+1;
				 soma2=idade+soma2;
				 media2=soma2/i;
			 }
			 
		}
		System.out.println("A media e:"+media);
		System.out.println("A media do sexo feminino:"+media1);
		System.out.println("A media do sexo mascuino e:"+media2);
	}
}
				 
				 
				 
				 
				 
			
			
			

			
			
			
	