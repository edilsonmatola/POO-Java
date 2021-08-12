
import java.util.Scanner;
public class TestaString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String disciplina = "Programacao java I";
		int tamanho = disciplina.length();
		int contador = 0;
		while(contador<tamanho){
        char caracter = disciplina.charAt(contador);
        contador++;
        System.out.println(caracter);
    }
}
}