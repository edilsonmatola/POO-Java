import java.util.*;
public class Piramide{
      
         public static void main(String[] args){
              int n,a,b;
              Scanner in=new Scanner(System.in);
              System.out.println("Ingrese un numero");
              n=in.nextInt();
                
               for(a=01; a<=n; a++){
                   for(b=01; b<=a; b++){
                       System.out.print(a);
                   }
                   System.out.println(" ");
                }
                     for(a=n-1;a<=1;a--){
                    	 for(b=01;b<=a;b++){
                    		System.out.print(a+" ");
                    	 }
                    	 System.out.println(" ");
                     }
         }
	}