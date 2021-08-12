import java.util.Scanner;
public class Palindrome{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		String palav = in.next();
		int count = 0;
		for (int i = 0; i<palav.length(); i++){
			if(palav.charAt(i)==palav.charAt(palav.length()-(i+1))){
				count = count +1;
			}
		}
		if(palav.length() == count){
			System.out.println("A palavra eh um Palindrome");
		}
		else{
			System.out.println("A palavra nao eh um Palindrome");
		}
	}	
}
