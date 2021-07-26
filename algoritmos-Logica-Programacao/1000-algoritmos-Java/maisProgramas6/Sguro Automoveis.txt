import java.util.*;
public class seguroAutomoveis{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int idade,plan,alcool,oculos,doenca;
		double plano,taxa,tx;
		String nome;
		System.out.print("Nome:");
		nome=scan.next();
		System.out.print("Para o seguro de ampla cobertura digite 1\nPara o seguro de danos a terceiros digite 2\n:");
		plan=scan.nextInt();

		if(plan==1){
			System.out.print("Consome alcool?\nDigite 1 para Sim\nDigite 2 para Nao:\n");
			alcool=scan.nextInt();
			if (alcool==1) {
				tx=4200*0.1;
				taxa=4200+tx;
			}

			else{
				taxa=4200;
			}

			System.out.print("Usa oculos de vista?\nDigite 1 para Sim\nDigite 2 para Nao:\n");
			oculos=scan.nextInt();
			if (oculos==1) {
				tx=4200*0.05;
				taxa=4200+tx;
			}

			else{
				taxa=4200;
			}

			System.out.print("Sofre de alguma doenca?\nDigite 1 para Sim\nDigite 2 para Nao:\n");
			doenca=scan.nextInt();
			if (doenca==1) {
				tx=4200*0.05;
				taxa=4200+tx;
			}

			else{
				taxa=4200;
			}

			System.out.print("Idade:");
			idade=scan.nextInt();
			if (idade>40) {
				tx=4200*0.2;
				taxa=4200+tx;
			}

			else{
				tx=4200*0.1;
				taxa=4200+tx;
			}
				System.out.print("Caro Sr(a)."+nome+",para contratar o seguro de Danos a Terceiros tera de pagar:"+taxa+"Mt.");
		}

		else if (plan==2) {
			System.out.print("Consome alcool?\nDigite 1 para Sim\nDigite 2 para Nao:\n");
			alcool=scan.nextInt();
			if (alcool==1) {
				tx=1150*0.1;
				taxa=1150+tx;
			}

			else{
				taxa=1150;
			}

			System.out.print("Usa oculos de vista?\nDigite 1 para Sim\nDigite 2 para Nao:\n");
			oculos=scan.nextInt();
			if (oculos==1) {
				tx=1150*0.05;
				taxa=1150+tx;
			}

			else{
				taxa=1150;
			}

			System.out.print("Sofre de alguma doenca?\nDigite 1 para Sim\nDigite 2 para Nao:\n");
			doenca=scan.nextInt();
			if (doenca==1) {
				tx=1150*0.05;
				taxa=1150+tx;
			}

			else{
				taxa=1150;
			}

			System.out.print("Idade:");
			idade=scan.nextInt();
			if (idade>40) {
				tx=1150*0.2;
				taxa=1150+tx;
			}

			else{
				tx=1150*0.1;
				taxa=1150+tx;
			}
			
			System.out.print("Caro Sr(a)."+nome+",para contratar o seguro de Danos a Terceiros tera de pagar:"+taxa+"Mt.");
		}
	}
}