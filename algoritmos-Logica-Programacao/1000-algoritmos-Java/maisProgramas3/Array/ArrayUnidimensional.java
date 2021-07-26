import java.util.Scanner;
public class ArrayUnidimensional{
	public static void preencherArray(){
		int notas[]=new int[10];
		/*notas[1]=50;
		notas[0]=100;
		notas[5]=200;
		notas[9]=notas[0];*/
		//System.out.print(notas);

		
		/*System.out.println("Elemento na posicao 1="+notas[1]);
		System.out.println("Elemento na posicao 0="+notas[0]);
		System.out.println("Elemento na posicao 5="+notas[5]);
		System.out.println("Elemento na posicao 9="+notas[9]);*/
		for (int i=0;i<notas.length ;i++ ) {
			//System.out.println("Elemento na posicao"+i+"="+notas[i]);
			notas[i]=i+1;
			System.out.println("Elemento na posicao"+i+"="+notas[i]);
			
		}
	}
}

/*
Dois Metodos
1-Preecher dados com n numeros;
2-Imprimir o array preenchido;
*/