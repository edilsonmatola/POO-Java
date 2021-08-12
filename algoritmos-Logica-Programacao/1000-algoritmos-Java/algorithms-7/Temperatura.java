import java.util.*;
public class Temperatura{
	static String v[]={"janeiro","fevereiro","marco","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
	static ArrayList<Integer>T=new ArrayList<Integer>();
	
	public static void sortearTemp(){
		Random t=new Random();
		int cont=0;
		int temp=t.nextInt(46);
		do{
			if(temp>14 && temp<46){
				cont++;
				T.add(temp);
			}
			temp=t.nextInt(46);
		}while(cont<12);
	}
	public static void imprimir(){
		for(int i=0;i<T.size();i++){
		System.out.println(v[i]+" teve temperatura de "+T.get(i)+" graus ");
		}
	}
	
	public static void calcularmedia(){
		int soma=0;
		float media;
		for(int i=0;i<T.size();i++){
			soma=soma+T.get(i);
		}
		media=soma/12;
		System.out.println(" a temperatura media e de "+media+" graus ");
	}
	
	
	public static void main(String[]args){
		sortearTemp();
		imprimir();
		System.out.println(" ");
		calcularmedia();
	}
	
	
	
}