import java.util.Scanner;

public class idademasculinofeme{
	public static void main(String args[]){

	Scanner ler = new Scanner(System.in);
	/*Fca um rpograma que recebe a idade e o sexo de 10 pessoas , 
	e calcule e mostre a idade media do grupo a idade media das 
	mulhres e a idade media dos homens
	*/
	int idade;
	String sexo;
	int contm = 0;
	int contf = 0;
	double allidade = 0;
	double allidademelh = 0;
	double allidadefemin = 0;
	for (int s=0;s<=10; s++) {

		System.out.println("Digite a Idade da "+s+" "+"Pessoa");
		idade = ler.nextInt();

		System.out.println("Digite Sexo "+s+" "+"Pessoa");
		sexo= ler.next();
		
		allidade = allidade + idade;
		if (sexo.equals("Masculino")) {

			allidademelh = allidademelh + idade;

			contm = contm + 1;
		}else{

			allidadefemin = allidadefemin + idade;
			contf = contf + 1;	
		}
	}
		double medm = allidademelh/contm;
		double medf = allidadefemin/contf; 
		double medg = allidade/10;

		System.out.println("A idade media do grupo e :=>"+medg);
		System.out.println("A idade media das mulheres  e :=>"+medf);
		System.out.println("A idade media das homens  e :=>"+medm);

	
	}
}