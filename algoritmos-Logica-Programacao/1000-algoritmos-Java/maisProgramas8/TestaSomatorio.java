import java.util.Scanner;
public class TestaSomatorio{

	public static void main (String[]args){

         Scanner entrada=new Scanner(System.in);
         System.out.println("==============Testa Somatorio=================");
         System.out.println("Introduza o nome do Estudante");
         String nome=entrada.next();
         double Teste1,Teste2,Teste3;
         System.out.println("Insira a nota do Teste 1");Teste1=entrada.nextDouble();
         System.out.println("Insira a nota do Teste 2");Teste2=entrada.nextDouble();
         System.out.println("Insira a nota do Teste 3");Teste3=entrada.nextDouble();
         double media=(Teste1+Teste2+Teste3)/3; String situacao="";
         System.out.println("++++++++++++++Pauta Final++++++++++++++");
         System.out.println("**|Nome do Aluno : "+nome);
         System.out.println("**|Media Final : "+media);
         if(media>=14) situacao="Dispensado";
         else if(media<10)situacao="Excluido"; else situacao="Admitido";
         System.out.println("**|Situacao do Aluno :"+situacao);


         
         
    }
}