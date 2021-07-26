import java.util.Scanner;

public class matri{
	public static void main(String[]args){

		Scanner matriz_entrada = new Scanner(System.in);
		
		int rows, columns;

		System.out.println("Digite o elemento da m11");
		rows=matriz_entrada.nextInt();
		System.out.println("Digite o elemento da m12");
		columns=matriz_entrada.nextInt();

		if(rows!=0 && columns!=0){

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	System.out.println("Digite o elemento da m11");
                sum[i][j] = matriz_entrada.nextInt();
            }
        }

        
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }

    }else{
    	System.out.println("Nao e Possivel");
    }
        
		
	}
}