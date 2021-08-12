
import java.util.Scanner;
public class converb
    {
    	public static void main(String[]args){
    		Scanner l = new Scanner(System.in);
    		System.out.println("Digite");
    		int num= l.nextInt();

            

            int c=0;
        int b;


        while ( num!=0){
            b = num% 2;
            num= num/ 2 ;


            System.out.print (b);
            

            c--;
        }
        


        /*StringBuffer binario = new StringBuffer(); // guarda os dados
        while (num> 0) {
            int b = num% 2;
            binario.append(b);
            num= num>> 1; // é a divisão que você deseja
        }
        System.out.println(binario.reverse().toString());*/
    	}
        
    }