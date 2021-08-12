
import java.util.Scanner;
public class TestaArray{

public static void main(String[]args){

 Scanner entrada=new Scanner(System.in);
 
 String[] nome=new String[5];
 nome[0]="Zeny";
 for(int i=0;i<nome.length;i++){
 	
 	System.out.println("Insira um nome");
 	nome[i]=entrada.nextLine();
 }
 System.out.println("Os nomes inseridos sao");
 System.out.println("__________________________");
 for(int j=0;j<nome.length;j++){
 	
 	System.out.println("|=>"+nome[j]);

 } 
 
 
 	
}
}