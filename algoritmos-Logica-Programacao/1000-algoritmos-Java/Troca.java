import java.util.Scanner;
public class Troca{

	public static void main (String[]args){

    Scanner entrada=new Scanner(System.in);
    System.out.println("Insira uma palavra");
    String nome=entrada.nextLine();

    String palavra="";
    if(nome.length()%2==0)
    {
        int indice=nome.length()/2;
        System.out.println(nome.charAt(indice-1)+" - "+nome.charAt(indice));
        palavra=palavra+nome.charAt(indice-1);
        for(int i=1;i<nome.length()-1;i++)
            palavra=palavra+nome.charAt(i);
        palavra=palavra+nome.charAt(indice);
        System.out.println(palavra);

    }else{System.out.println("A palavra nao tem caracterres pares!");}



    }
}