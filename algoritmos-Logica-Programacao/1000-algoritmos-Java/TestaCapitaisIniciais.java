import java.util.Scanner;
public class TestaCapitaisIniciais{

	public static void main (String[]args){

        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira uma Palavra");
        String nome=entrada.nextLine(); 
        //conversao de todas letras a minusculas
        nome=nome.toLowerCase();
        //Conversao do primeiro caracter a maiuscula
        String a=nome.charAt(0)+"";
        String palavra=a.toUpperCase(); String caracter="";

        //Ciclo para pegar os caracterres apos o espaco
        for(int i=1;i<nome.length();i++)
        {
            //compara se antes do caracter actual tem ou nao espaco
         if(nome.charAt(i-1)==' ')
         {
         caracter=caracter+nome.charAt(i);_
         caracter=caracter.toUpperCase();
         palavra=palavra+caracter;caracter="";
         }else{
         palavra=palavra+nome.charAt(i);
         }
         
        }   
        System.out.println(palavra);
        
        

        
    
    }
}