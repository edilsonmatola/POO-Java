//Zenildo Nhabomba
import java.util.Scanner;
public class CaracterIguais{
	public static void main(String[] args){
		String palavra1="";
		String palavra2="";
		Scanner teclado=new Scanner(System.in);
		System.out.print("Insira uma palavra:");
		palavra1=teclado.next();
		System.out.print("Insira uma palavra:");
		palavra2=teclado.next();
		if(palavra1.equals(palavra2)){
			System.out.print("As palavras sao iguais");
		}
		else{
			System.out.print("As palavras sao diferentes");
		}
	}
}
		