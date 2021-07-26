public class fib{
	public static void main(String[]args){
		int proximo=0,atual=0,anterior=1;

      while(proximo<=100){

    	proximo=atual+anterior;
		System.out.print(proximo+",");
		anterior=atual;
		atual=proximo;
		
		}
	}
}