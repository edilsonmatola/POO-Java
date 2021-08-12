import java.util.Scanner;

public class Extenso{
	public static void main(String args[]){

	Scanner Input = new Scanner(System.in);

	System.out.println("Insira o numero");
	String numero = Input.next();

	int total = numero.length();

	String numero2 = "";

	char chara = 'a';

	for(int i = numero.length() - 1;i >= 0;i--){
		//System.out.print(numero.charAt(total - 1 - i));
		//numero2 = numero2 + numero.charAt(total - 1 - i) ;

		chara = numero.charAt(total - 1 - i);
	
		if(chara == '0'){System.out.println("zero");};
		if(chara == '1'){System.out.println("um");};
		if(chara == '2'){System.out.println("dois");};
		if(chara == '3'){System.out.println("tres");};
		if(chara == '4'){System.out.println("quatro");};
		if(chara == '5'){System.out.println("cinco");};
		if(chara == '6'){System.out.println("seis");};
		if(chara == '7'){System.out.println("sete");};
		if(chara == '8'){System.out.println("oito");};
		if(chara == '9'){System.out.println("nove");};

	}


	
	}
}