//Zenildo Nhabomba I12
import java.util.Scanner;

public class TestaMetodos
{      ///metodo que retorna a soma
 
       //metodo princpal para a execucao dos outros metodos
	public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
        Metodos metodos=new Metodos();
        metodos.header();
        int sair=1;
        while(sair==1){
        metodos.Menu();
        int opcao=entrada.nextInt();
        
        
        switch(opcao)
        {
            case 1:
         System.out.println("Insira o primeiro numero");
         double a=entrada.nextDouble();
         System.out.println("Insira o segundo numero");
         double b=entrada.nextDouble();
         //chamada do metodo de soma
         System.out.println("Resultado =>"+metodos.Soma(a,b));
         metodos.footer();
         sair=entrada.nextInt();
         break;
            case 2:
         System.out.println("Insira o primeiro numero");
         double num1=entrada.nextDouble();
         System.out.println("Insira o segundo numero");
         double num2=entrada.nextDouble();
         //chamada do metoto de produto
         System.out.println("Resultado =>"+metodos.Produto(num1,num2));
         metodos.footer();
         sair=entrada.nextInt();
         break;
            case 3:
         System.out.println("Insira o numero");
         num1=entrada.nextDouble();
         //chamada do metodo de raiz
         System.out.println("Resultado =>"+metodos.RaizQuadrada(num1));
         metodos.footer();
         sair=entrada.nextInt();
         break;
         case 4:
         System.out.println("Insira o numero que deseja ver o produto do seu n-esimo");
         int numm1=entrada.nextInt();
         System.out.println(metodos.ProdutoNesimo(numm1));
        metodos.footer();
         sair=entrada.nextInt();
         break;
         case 5:
         System.out.println("Insira uma expressao");
         String expressao=entrada.next();
         System.out.println(metodos.CalculadoraExtenso(expressao));
         metodos.footer();
         sair=entrada.nextInt();
         break;
         case 6:
         System.out.println("___________Obrigado pela preferencia__________");
         sair=0;
         break;

         /*
         System.out.println("A Tech Geniuos e uma empresa de Software criada por Zenildo Nhabomba!");
         System.out.println("___________*Todos Direitos Reservados*__________");
         System.out.println("**Presione 0 para Sair e 1 para Continuar!");
         sair=entrada.nextInt();
         */

        }
       }
    }
}