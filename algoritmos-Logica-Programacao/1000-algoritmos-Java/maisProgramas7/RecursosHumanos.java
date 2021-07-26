import java.util.*;
public class RecursosHumanos{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.print("quantos funcionarios tem: ");
		int func=in.nextInt();
		String nome="";
		float salarioLiquido;
		for(int i=0 ; i<func ; i++){
			System.out.print("insira o seu salario: ");
			int salariobase=in.nextInt();
			System.out.print("insira o seu nome: ");
			nome=in.next();
			if(salariobase<=30){
				salarioLiquido=(float)(salariobase+(salariobase-0.09)+(salariobase-0.03));
				System.out.println("o funcionario "+nome+" tem como salario Liquido "+salarioLiquido+"\n");
			}else{
				if(salariobase>30 && salariobase<=80){
					salarioLiquido=(float)(salariobase+(salariobase-0.13)+(salariobase-0.03));
					System.out.println("o funcionario "+nome+" tem como salario Liquido "+salarioLiquido+"\n");
				}else{
					if(salariobase>80 && salariobase<=300){
						salarioLiquido=(float)(salariobase+(salariobase-0.16)+(salariobase-0.03));
						System.out.println("o funcionario "+nome+" tem como salario Liquido "+salarioLiquido+"\n");
					}
					else{
						System.out.print("Nao trabalhas aqui");
					}
				}
			}
			
		}
	}
} 