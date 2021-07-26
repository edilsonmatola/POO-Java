import java.util.Scanner;
public class TestaNumero{
public static void main(String args[]){
Scanner leia=new Scanner(System.in);
int n1=0;int n2=0;
System.out.println("Digite o 1º numero: ");
n1=leia.nextInt();System.out.println("Digite o 2º numero: ");
n2=leia.nextInt();
if (n1  > n2){
System.out.println(n2+", "+n1);
}else{
System.out.println(n1+", "+n2);
}
}
}