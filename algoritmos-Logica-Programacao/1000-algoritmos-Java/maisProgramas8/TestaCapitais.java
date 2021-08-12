import java.util.Scanner;
public class TestaCapitais{

	public static void main (String[]args){

       //

        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira uma Palavra");
        String nome=entrada.nextLine();
        String letra="";
        for(int i=0;i<nome.length();i++)
        {
              letra=letra+nome.charAt(i);
              letra=letra.toUpperCase();
        }   
        System.out.println(letra);

        
    
    }
}