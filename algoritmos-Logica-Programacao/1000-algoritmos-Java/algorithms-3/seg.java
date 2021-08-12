import java.util.Scanner;

class notas{

	public static String nota(int hora,int minuto,int segundo){

		int newhora = hora*3600;

		int newminuto = minuto*60;

		String tudojunto = newhora+newminuto+segundo+"(s)";

		return tudojunto;
	
  }

}



public class seg{

	public static void main(String[] args){

		Scanner f = new Scanner(System.in);

		notas h = new notas();

		System.out.println("Digite a hora");
		int o = f.nextInt();

		System.out.println("Digite os minuto");
		int m = f.nextInt();

		System.out.println("Digite os segundo");
		int n = f.nextInt();

		System.out.println(h.nota(o,m,n));
		
	}
}