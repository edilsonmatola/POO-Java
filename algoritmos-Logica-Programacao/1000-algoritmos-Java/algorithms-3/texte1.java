import java.util.Scanner;
 public class texte1 {
 public static void main(String[] args) {
    int n;
    int t=1;
 Scanner saida=new Scanner(System.in);
    System.out.println("INTRODUZA NUMERO");
    n =saida.nextInt();
 
    while (n>0){
        t= t*n;
        n--;
    }
    System.out.println("Total: "+t);
    }
 
}