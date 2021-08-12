import java.util.*;
public class DadoLista{
	static ArrayList<Integer>L=new ArrayList<Integer>();
	public static void lancar(){
		Random r=new Random();
		int cont=0;
		int valor=r.nextInt(7);
		do{if (valor!=0) {
			cont++;
			}L.add(valor);
			valor=r.nextInt(7);
		}while(cont<10);
	}

	public static void imprimir(){
		System.out.print(Arrays.toString(L.toArray()));
	}

	public static void main(String[] args) {
		lancar();
		imprimir();
	}
}