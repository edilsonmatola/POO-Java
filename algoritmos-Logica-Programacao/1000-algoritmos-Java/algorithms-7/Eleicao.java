import java.util.*;
public class Eleicao{
	static ArrayList<String>P=new ArrayList<String>();
	static int v[]=new int[4];
	static Scanner dx=new Scanner(System.in);
	public static void contar(){
		P.add("Nyusi");
		P.add("Ossufo");
		P.add("Daviz");
		P.add("Amusi");
		int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0,n,c;
		System.out.println(" 1 para Nyusi ");
		System.out.println(" 2 para Ossufo ");
		System.out.println(" 3 para Daviz ");
		System.out.println(" 4 para Amusi ");
		System.out.println(" insira nr de eleitores ");
		 n=dx.nextInt();
		 for(int i=0;i<n;i++){
			System.out.println(" escolha seu canditado ");
			c=dx.nextInt();
			if(c==1){
				cont1++;
			}
			if(c==2){
				cont2++;
			}
			if(c==3){
				cont3++;
			}
			if(c==4){
				cont4++;
			}
			if(c==5){
				cont5++;
			}
			if(c==6){
				cont6++;
			}
			
		 }
		    v[0]=cont1;
			v[1]=cont2;
			v[2]=cont3;
			v[3]=cont4;
			System.out.println(" quantidade de votos em brancos "+cont5);
			System.out.println(" quantidade de votos em nulos "+cont6);
	}
         public static void imprimir(){
			 for(int i=0;i<P.size();i++){
				System.out.println(P.get(i)+" teve "+v[i]+" votos "); 
			 }
		 }	
	
	public static void main(String[]args){
		contar();
		imprimir();
	}
	
}