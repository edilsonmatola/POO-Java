import java.util.Scanner;

public class arrayTeste2 {
    
    public static void main(String[] args){
            float[] nota = new float[3];
            String nome;
            Scanner entrada = new Scanner(System.in);
           
            System.out.print("Nome do aluno: ");
            nome = entrada.nextLine();
           
            System.out.print("Primeira nota: ");
            nota[0] = entrada.nextFloat();
           
            System.out.print("Segunda nota: ");
            nota[1] = entrada.nextFloat();
           
            //média
            nota[2] = (nota[0] + nota[1])/2;
           
            System.out.printf("O aluno %s tirou %.1f e %.1f, obtendo média final %.2f",nome,nota[0],nota[1],nota[2]);
	}
}

              
    
	
