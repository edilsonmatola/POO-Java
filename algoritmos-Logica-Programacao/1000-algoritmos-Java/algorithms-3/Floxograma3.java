public class Floxograma3{
	public static void main(String[]args){
		double n,i,y;
		n=5;
		System.out.println("Saida1:");
		i=1;
		while(i<=n){
			y=Math.pow(i,2);
			System.out.println(i+"--->"+y);
			i=i+1;
		}

		System.out.println("Saida2:");
		y=0;
		for(i=1;i<=n;i++){
			System.out.println(i+"");
			if(i<n)
			System.out.println("+");
			y=y+1;
		}
		System.out.println("="+y);
		System.out.println("Saida3:");
		i=0;


		do{
			y=n+i;
			System.out.println(n+"+"+i+"="+y);
		i=i+1;
		}
		while(i<=n);
		System.out.print("");
		System.out.println("Fim");
	}
}
