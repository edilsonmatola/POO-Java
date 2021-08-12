public class Recurs{
	public static int f(int n){
		if(n==1 || n==0){
			return n;
		}
		else{
			return f(n-1)+f(n-2);
		}
	} 
	public static void main (String[] args){
		//System.out.println(f(20));
		
		for (int i=20; i>1;i--){
			System.out.println((i-1)+(i-2));
		}
		
	}
}