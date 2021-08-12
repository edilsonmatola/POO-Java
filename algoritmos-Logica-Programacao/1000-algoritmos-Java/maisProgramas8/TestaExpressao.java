import java.util.Scanner;
public class TestaExpressao{

	public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
        //1.Leitura da expressao.
        System.out.println("Insira uma expressao");
        String expressao=entrada.nextLine();
        //Variavel responsavel por armazenar o indice onde esta o "=".
        int igual=0;
        //Variavel que armazena o texto que apos o sinal de igualidade.
        String equacao="";
        //2. Ciclo que percorre toda string
        for(int i=0;i<expressao.length();i++)
        {
            //3. Condicao que procura o sinal de igualidade.
            if(expressao.charAt(i)=='=')
            {
                igual=i;
                //4. Ciclo que adiciona o texto apos a igualidade a variavel.
                for(int j=i+1;j<expressao.length();j++)
                { equacao=equacao+expressao.charAt(j);}
                equacao=equacao+"=";
                //5. Ciclo que adiciona o texto antes do sinal de igualidade a variavel. 
                for(int k=0;k<igual;k++)
                {  equacao=equacao+expressao.charAt(k);}
                
            }
        }
        //6. Impressao do resultado.
        System.out.println(equacao);
        System.out.println("____________Obrigado pela preferencia__________");

    }
}