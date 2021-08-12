import java.util.Scanner;
public class Horas{
public static void main(String[]args){
	Scanner ler= new Scanner(System.in);
	
	System.out.println("Insira a hora");
	
	int hora=ler.nextInt();
	
	System.out.println("Insira os minutos");
	
	int minuto1=ler.nextInt();
	
	System.out.println("Insira os segundos");
	
	int segundo2=ler.nextInt();
	
	System.out.println(Seg.temp(hora,minuto1,segundo2)+" segundos");
}}