

import java.util.*;
public class andre{
	public static void main(String[]args){
		int y,i,d,x,s;
		y=0;
		Scanner output=new Scanner(System.in);
		for(i=1;i<=500;i++){
        System.out.println("Introduz um numero");
        d=output.nextInt();	
        y=y+d;
		}
		s=y/500;
		System.out.println(s);
	}
}