import java.util.*;
public class Operacoes{
	public static void main(String[]args){
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		System.out.print("Insira um numero: ");
		int numero=scan.nextInt();
		int aleatorio=random.nextInt(numero);
		System.out.println("o numero escolhido nesse intervalo eh: "+aleatorio);
		System.out.println("raiz quadrada("+aleatorio+")= "+Math.sqrt(aleatorio));
		System.out.println("potencia ("+aleatorio+"^"+aleatorio+")= "+Math.pow(aleatorio,aleatorio));
		Math.toDegrees(aleatorio);
		System.out.println("seno ("+aleatorio+")= "+Math.sin(aleatorio));
		System.out.println("cosseno ("+aleatorio+")= "+Math.cos(aleatorio));
		System.out.println("tangente ("+aleatorio+")= "+Math.tan(aleatorio));
	}
}