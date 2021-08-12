

import java.util.*;
public class Piramide{
    public static void main(String[] args){
              
        int numero,a,b;
              
        Scanner input=new Scanner(System.in);
              
        System.out.println("Insira o numero que pretende fazer a piramide");
        numero=input.nextInt();
                
            for(a=1; a<=numero; a++){
                for(b=1; b<=a; b++){
                    System.out.print(a);
                }System.out.println(" ");
            }
                    for(a=numero-1;a<=1;a--){
                    	for(b=01;b<=a;b++){
                    		System.out.print(a);
                    	}System.out.println(" ");
                    }
    }
}