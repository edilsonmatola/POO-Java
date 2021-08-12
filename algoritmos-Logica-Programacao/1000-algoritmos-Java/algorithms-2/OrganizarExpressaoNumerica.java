//Eugenia Nhacuonga-I11
import java.util.Scanner;
public class OrganizarExpressaoNumerica{
	public static void main(String args[]){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de organizacao de expressao linear ");
		System.out.println();
		System.out.println("Insira a expressao: ");
		String expressao=teclado.nextLine();
		String funcao="",funcao1="",resultado;
		int tamanho=expressao.length();
		for(int i=0; i<tamanho;i++){
			if(i==0){
				if(expressao.charAt(i)=='0'||expressao.charAt(i)=='1'||expressao.charAt(i)=='2'||expressao.charAt(i)=='3'||expressao.charAt(i)=='4'||expressao.charAt(i)=='5'||expressao.charAt(i)=='6'||expressao.charAt(i)=='7'||expressao.charAt(i)=='8'||expressao.charAt(i)=='9'){
					funcao=funcao+('+'+""+expressao.charAt(i));
				}
				else if(expressao.charAt(i)=='-'){
					funcao=funcao+(""+expressao.charAt(i));
					funcao=funcao+(""+expressao.charAt(i+1));
					i=i+1;
				}
				else if(expressao.charAt(i)=='x'){
					funcao1=funcao1+(""+expressao.charAt(i));
					i++;
				}
			}
			else if(expressao.charAt(i)!='x'){
				if(expressao.charAt(i)=='+'){
					funcao1=funcao1+(""+expressao.charAt(i+1));
					i=i+1;
				}
				else if(expressao.charAt(i)=='-'){
					funcao1=funcao1+(""+expressao.charAt(i));
					funcao1=funcao1+(""+expressao.charAt(i+1));
					i=i+1;
				}
			}
			else{
				funcao1=funcao1+(""+expressao.charAt(i));
			}
		}
		resultado="f(x)="+funcao1.concat(funcao);
		System.out.println(resultado);
		
	}
}
