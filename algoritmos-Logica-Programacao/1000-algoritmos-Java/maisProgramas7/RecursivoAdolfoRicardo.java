import java.util.Scanner;
public class RecursivoAdolfoRicardo{
	public static int menor_num(int []array, int tamanho){ // criacao do metodo com retorno de dado inteiro
		if(tamanho >= 0){ 
			if(array[tamanho]< array[0]){
				array[0] = array[tamanho]; // na posicao 0 do array sera armazenada o menor elemento
				return menor_num(array, (tamanho-1)); // retorno do proprio metodo
			}
		}
		return array[0]; //retorno do menor 
	}
	
	
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		System.out.println("Quantos elementos desejas para o Array:");
		int tamanho = in.nextInt(); //introducao do tamanho para o array
		int[] array = new int[tamanho]; // criacao do array com elementos inteiros
		for (int count = 0; count< tamanho; count++){ // ciclo de repeticao para introducao dos elementos no array
			System.out.println("Digite o seu valor");
			array[count] = in.nextInt(); // o usuario introduz os elementos para o array
		}
		System.out.println(menor_num(array, tamanho-1)); // 
	}
}