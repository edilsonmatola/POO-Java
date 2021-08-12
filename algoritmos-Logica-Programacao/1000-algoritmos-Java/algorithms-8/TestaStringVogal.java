
//Crie um programa que transforma uma palavra em letras capitais
//crie um programa que passado por teclado uma sequencia de caracteres converte apenas
//em letras capitais as iniciais de cada palavra insirida por teclado

import java.util.Scanner;
public class TestaStringVogal{

	public static void main (String[]args){

         Scanner entrada=new Scanner(System.in);
         String palavra="";
         do{
         System.out.println("==============Testa Vogais=================");
         System.out.println("Escreva uma Palavra");
         palavra=entrada.next();
         int count=0;
         for(int i=0;i<palavra.length();i++)
         {
          if(palavra.charAt(i)=='a'||palavra.charAt(i)=='e'||palavra.charAt(i)=='i'||palavra.charAt(i)=='o'||palavra.charAt(i)=='u'||palavra.charAt(i)=='A'||palavra.charAt(i)=='E'||palavra.charAt(i)=='O'||palavra.charAt(i)=='U'||palavra.charAt(i)=='I')
          count++;
         }
         System.out.println(" A Palavra tem "+count+" vogais");
         }while(palavra!="");
    }
}