import java.util.Scanner;
public class Inversor{

	public static void main (String[]args){

	    Scanner entrada=new Scanner(System.in);
        
		System.out.println("Insira  uma Palavra ");
		String palavra=entrada.next();
        String nome="";
        for(int i=palavra.length()-1;i>=0;i--)
        {
            nome=nome+palavra.charAt(i);
        }
        //String teste= nome.toUpperCase();
       // System.out.println(teste);
         String a=nome.charAt(0)+"";
         String inicial=a.toUpperCase();
         String b=nome.charAt(palavra.length()-1)+"";
         String fim=b.toLowerCase();
         String name=inicial;
        for(int j=palavra.length()-2;j>=1;j--)
        {
            name=name+palavra.charAt(j);
        }
        name=name+fim;
        System.out.println(name);



	}
}