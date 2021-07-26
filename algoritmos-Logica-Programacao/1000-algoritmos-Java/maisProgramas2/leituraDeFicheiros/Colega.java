/*
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Colega {
 
  public static void main(String[] args) throws IOException {


  	File ficheiro = new File("tabuada.txt");

     FileReader fr= new FileReader(ficheiro);
		BufferedReader br = new BufferedReader(fr);
		
		String l = br.readLine();
		
		while (l!= null){
			System.out.println(l);
			l = br.readLine();
		}




    Scanner ler = new Scanner(System.in);
    int i, n;
 
    System.out.printf("Informe o número para a tabuada:\n");
    n = ler.nextInt();
 
    FileWriter arq = new FileWriter("tabuada.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
 
    gravarArq.printf("+--Resultado--+%n");
    for (i=1; i<=10; i++) {
      gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
    }
    gravarArq.printf("+-------------+%n");
 
    arq.close();
 
    System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n", n);


  } 
}


*/
import java.io.*;
import java.util.Scanner;
public class Colega{
	public static void main(String args[]) throws IOException{
		
		nomeColegas();
		
	}
	
	public static void nomeColegas() throws IOException{
		
		Scanner entrada= new Scanner(System.in);
		
		File ficheiro = new File("colegas.txt");
		FileWriter fw = new FileWriter(ficheiro,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String resposta = "sim";
		
		while( resposta.equalsIgnoreCase("sim") ){
			
			System.out.println("Introduza o nome de um colega");
			String nome = entrada.next();
			
			bw.write(nome+";");
			
			System.out.println("Deseja Introduzir o nome de outro colega? sim ou nao");
			resposta= entrada.next();
		}
		
		bw.close();
		fw.close();
		
		FileReader fr= new FileReader(ficheiro);
		BufferedReader br = new BufferedReader(fr);
		
		String l = br.readLine();
		
		while (l!= null){
			System.out.println(l);
			l = br.readLine();
		}
	}
	
	
}