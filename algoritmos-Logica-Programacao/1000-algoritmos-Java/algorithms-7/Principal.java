import java.util.Scanner;
class ContaBancaria{
	String dono;/*Nunca devo criar novas classes*/
	long numeroConta;
	String tipoConta;
	double saldo;
	
	double depositarValor(double quantidade){
		saldo=saldo+quantidade;
		return saldo;
	}
	
	void levantar(double quantidade ){
		if (quantidade>saldo){
			System.out.print("Nao e possivel levantar q uantia desejada");
		}
		else{
			saldo=saldo-quantidade;
			System.out.print("O peracao realizada com sucesso-- ficou com:"+saldo);
		}
	}
	
	
}
public class Principal{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		ContaBancaria y= new ContaBancaria();
		System.out.print("Digite o nome:");
		y.dono=input.nextLine();
		System.out.print("Digite o Numero da conta");
		y.numeroConta=input.nextLong();
		System.out.print("Digite o Tipo de conta:");
		y.tipoConta=input.next();
		y.saldo=0.0;
		System.out.print("Digite   de valor a depositar 1o:");
		double quantidade=input.nextDouble();
		y.depositarValor(quantidade);
		System.out.print("Que opercao deseja realizar:\n1-DEPOSITAR;\n2-LEVANTAR");//n salta linha
		byte opc=input.nextByte();
		switch (opc){
			case 1:
				System.out.print("Digite   de valor a depositar 1o:");
				quantidade=input.nextDouble();		
				System.out.print("A conta tem como novo valor de "+	y.depositarValor(quantidade));break;
			case 2:
				System.out.print("Digite o valor a levantar:");
				quantidade=input.nextDouble();
				y.levantar( quantidade );
		}
		
			
	}
}