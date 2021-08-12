// Priscila Magia; i12
import java.util.Scanner;
public class TestaStrings{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String disciplina = "Programacao java I";
		int tamanho = disciplina.length();
        char caracter = ' ';
        for (int i = disciplina.length();i>=0;i--){
        System.out.print(disciplina.charAt(i));
    }
}
}