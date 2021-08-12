public class ParImpar{
	public static void main(String[]args){
		int x=13;
		do{
			if(x%2==0){
				x=x/2;
			}else{
				x=3*x+1;
			}
			System.out.print(x+" ");
		}while(x!=1);
	}
}