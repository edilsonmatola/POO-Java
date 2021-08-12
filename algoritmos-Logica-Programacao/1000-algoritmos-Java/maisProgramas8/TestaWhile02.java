//Priscila Magia I12
import java.util.Scanner;
public class TestaWhile02{
  public static void main(String[] args) {
  	int contador=0;
  	Scanner leia=new Scanner(System.in);
  	int num1;
  	int num2;
  	System.out.println("insira o primeiro dado");
  	num1=leia.nextInt();
  	System.out.println("insira o limite");
  	num2=leia.nextInt();
      while(contador<num2){
      	contador=contador+num1;
      	System.out.println(contador);
	  }

	}
}