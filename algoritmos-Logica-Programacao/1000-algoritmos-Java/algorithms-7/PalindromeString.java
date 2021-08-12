import java.util.*;
public class PalindromeString{
	public static void main(String[]args){
		/*String palavra , inverso="";
		Scanner in=new Scanner(System.in);
		System.out.print("Insira uma palavra: ");
		palavra=in.nextLine();*/
		for(int i=(palavra.length())-1 ; i>=0 ; i--){
			inverso=inverso+palavra.charAt(i);
		}
		if(palavra.equals(inverso)){
			System.out.println("Eh palindrome");
		}else{
			System.out.println("n eh palindrome");
		}
	}
}