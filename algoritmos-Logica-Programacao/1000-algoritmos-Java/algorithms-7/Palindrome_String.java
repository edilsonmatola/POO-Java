import java.util.Scanner;
public class Palindrome_String{
	public static void main(String[]args){
		String original,inverso=" ";
		Scanner in=new Scanner(System.in);
		System.out.print("introduz uma palavra: ");
		original=in.nextLine();
		int tamanho=original.length();
		for(int i=tamanho-1;i>=0;i--){
			inverso=inverso+original.charAt(i);
		}
		if(original.equals(inverso)){
			System.out.println("palindrome");
		}else{
			System.out.println("n palindrome ");
		}

	}
} 