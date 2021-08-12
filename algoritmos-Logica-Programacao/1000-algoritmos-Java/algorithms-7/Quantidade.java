//Parte 3
import java.util.Scanner;
public class Quantidade{
	static Scanner dx=new Scanner(System.in);
	public static void excluir(String nome){
        String letra="";
		int count=0;	
		for(int i=0;i<nome.length();i++){
			if(nome.charAt(i)==' '){
				
			}else{
			  	count++;	
			}
		}
		System.out.println(" quantidade de letras e de "+count);
	}
	public static void repetirLetra(String nome){
		//System.out.println(" insira letra ");
		char x='u';//inserindo variavel a minha escolha
		int count1=0;
		
		for(int i=0;i<nome.length();i++){
			if(nome.charAt(i)==x){
				count1++;
			}
		}
		System.out.println(" a letra "+x+" repetiu se "+count1+" vezes ");
	}
	public static void repetirLetraE(String nome){
		int count1=0;
		for(int i=0;i<nome.length();i++){
			if(nome.charAt(i)=='e'){
				count1++;
			}
		}
		System.out.println(" a letra e repetiu se "+count1+" vezes ");
	}
	
	public static void diferenciar(String nome){
		int vog=0;
		int cons=0;
		for(int i=0;i<nome.length();i++){
			if(nome.charAt(i)==' '){		
			}
			if(nome.charAt(i)=='a'||nome.charAt(i)=='e'||nome.charAt(i)=='i'||nome.charAt(i)=='o'||nome.charAt(i)=='u'){
				vog++;	
			}else{
				cons++;
			}
	     }
		
		System.out.println(" quantidade de vogais de "+vog);
		System.out.println(" quantidade de consoantes de "+cons);
		if(vog>cons){
			System.out.println(" a diferenca e de "+(vog-cons));
		}else{
			System.out.println(" a diferenca e de "+(cons-vog));
		}	
	}
	public static void main(String[]args){
		System.out.println(" insira palavra ");
		String nome=dx.nextLine(); 
		excluir(nome);
		System.out.println("  ");
		repetirLetra(nome);
		System.out.println("  ");
		repetirLetraE(nome);
		System.out.println(" ");
		diferenciar(nome);
	}
	
}