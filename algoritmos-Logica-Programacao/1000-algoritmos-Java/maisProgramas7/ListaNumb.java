//Parte 4
import java.util.*;
public class ListaNumb{
	static ArrayList <String>N=new ArrayList<String>();
	static Scanner dx=new Scanner(System.in);
	public static void preencher(){
		System.out.println(" insira valor ");
		String valor=dx.nextLine();
		while(!valor.equals("fim")){
			System.out.println(" insira valor ");
			 valor=dx.nextLine();
			N.add(valor);
		}
		N.remove(N.size()-1);
	}
	public static void eliminar(){
		int soma=0;
		double media;
		for(int i=0;i<N.size();i++){
			soma=soma+Integer.parseInt(N.get(i));
		}
		
		media=soma/N.size();
		System.out.println(" ");
		System.out.println(" a sua media e de "+media);
		//verificando se o numero e maior ou menor que a variavel
		for(int i=0;i<N.size();i++){
			if(Integer.parseInt(N.get(i))<media||Integer.parseInt(N.get(i))==media){
				N.remove(N.get(i));
			}
		}	
	}
	public static void imprimir(){
		//System.out.println(Arrays.toString(N.toArray()));
		for(int i=0;i<N.size();i++){
			System.out.print(N.get(i)+",");
		}
	}
	public static void main(String[]args){
		preencher();
		System.out.println(" ");
		eliminar();
		System.out.println(" ");
		imprimir();
	}
}