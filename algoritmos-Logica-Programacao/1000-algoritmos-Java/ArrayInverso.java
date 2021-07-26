
import java.util.Scanner;
public class ArrayInverso{

public static void main(String[]args){

 Scanner entrada=new Scanner(System.in);
 
 String[] nome=new String[5];
 for(int i=0;i<nome.length;i++){
 	
 	System.out.println("Insira um nome");
 	nome[i]=entrada.nextLine();
 }
 System.out.println("Os nomes inseridos de tras para frente sao");
 System.out.println("__________________________");
 for(int j=nome.length-1;j>=0;j--){
 	
 	System.out.println("|=>"+nome[j]);

 } 
 
 
 	
}
}