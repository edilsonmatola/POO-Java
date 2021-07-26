//Zenildo Turma I12
import java.util.*;
public class TestaFor{

	public static void main (String[]args){

       Scanner entrada=new Scanner(System.in);
       System.out.println("Insira o primeiro numero");
       int a=entrada.nextInt();
       System.out.println("Insira o numero Limite");
       int b=entrada.nextInt();
		int i;
		///Ciclo para imprimir numeros impares de xi a xn
		for(i=a;i<(b+1);i++){
			if(i==b){
				if(i%2!=0){
		     System.out.print(i);
		     }		
			}else{
		  if(i%2!=0){
		   System.out.print(i+",");
		     }
		   }
		}
  
	}
}
/*
////Crie um programa que permita somar 2 numeros passados por teclado.(TestaFor)
///Crie um programa que passa via teclado 3 valores decimais ou inteiros depois apresentar o menu
1. Achar maior valor
2. Achar menor valor
3. Sair
Considerar que termina ao clicar zero
aceitar comparaco de negativos e decimais
///Criar programa que permita realizar a divisao de 2 numeros se e so se a operacao de divisao for possivel
//Imprimir pares desse jeito "pares(15)=2_4_n"TestaWhile

Fazer dentro do TestaWhile TestadoWhile Testa For
Email: 2018_DF03_I12_Nome e Apelido.
Testa.1 2 e 3!
*/