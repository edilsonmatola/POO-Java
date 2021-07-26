import java.lang.*;
import java.util.*;

public class razao{
	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		double numero , soma=1;

		int inicial=1,razao=2,an=1;


		int n=10;
		while(an<=inicial*Math.pow(razao,(n-1))){

			System.out.println(an);

			an+=razao;
			
		}
		}
}
