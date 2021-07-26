import java.io.*;
public class TestaFicheiro{
	public static void main(String args []) throws IOException{
		
		ficheiroA();
		ficheiroB();
		ficheiroC();
	}
	
	public static void ficheiroA() throws IOException{
		//Indicamos o ficheirro
		File ficheiro = new File ("A.txt");

		//criamos o objecto de leitura
		FileReader fr= new FileReader(ficheiro);
		BufferedReader bf= new 	BufferedReader(fr);

		//objecto que lê AS LINHAS
		String l =  bf.readLine();
		System.out.println("\n\nA informacao contida no ficheiro A e' :");

		//Instrução para ler linhas de um ficheirp
		while (l!=null){
			System.out.println(l);
			l= bf.readLine();
		}
		
	}
	
	public static void ficheiroB() throws IOException{
		//Criaçao ou declaração do ficheiro a ser lido
		File ficheiro = new File ("B.txt");
		
		FileReader fr= new FileReader(ficheiro);
		BufferedReader bf= new 	BufferedReader(fr);
		
		String l =  bf.readLine();
		System.out.println("\n\nA informacao contida no ficheiro B e' :");
		
		while (l!=null){
			System.out.println(l);
			l= bf.readLine();
		}
		
	}
	
	public static void ficheiroC() throws IOException{
		
		File ficheiro = new File ("C.txt");
		
		FileReader fr= new FileReader(ficheiro);
		BufferedReader bf= new 	BufferedReader(fr);
		
		String l =  bf.readLine();
		System.out.println("\n\nA informacao contida no ficheiro C e' :");
		
		while (l!=null){
			System.out.println(l);
			l= bf.readLine();
		}
		
	}
}