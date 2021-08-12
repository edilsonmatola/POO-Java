import java.util.Scanner;
public class TestaNumeroPrimo{

	public static void main (String[]args){

        Scanner entrada=new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Insira um Numero");
        int numero=entrada.nextInt();int count=0;
        for(int i=1;i<=numero;i++)
        if(numero%i==0) count=count+1;

        if(count==2) System.out.println("O numero "+numero+" e primo");
        else System.out.println("O numero "+numero+" nao e primo");
        System.out.println("=============FIM===============");


    }
}
