
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {      
                
        Scanner reader = new Scanner(System.in);

        System.out.println("Operacao: ");

        String txt = reader.next();

        int numero1 = 0, numero2 = 0, resultado = 0;

        for (int i = 0; i < txt.length(); i++) {

            if (txt.charAt(i) == '+') {

                String digitos[] = txt.split("[+]");
                numero1 = Integer.parseInt(digitos[0]);
                numero2 = Integer.parseInt(digitos[1]);
                resultado = numero1 + numero2;

            }

            if (txt.charAt(i) == '-') {

                String digitos[] = txt.split("[-]");
                numero1 = Integer.parseInt(digitos[0]);
                numero2 = Integer.parseInt(digitos[1]);
                resultado = numero1 - numero2;

            }

            if (txt.charAt(i) == '*') {

                String digitos[] = txt.split("[*]");
                numero1 = Integer.parseInt(digitos[0]);
                numero2 = Integer.parseInt(digitos[1]);
                resultado = numero1 * numero2;

            }

            if (txt.charAt(i) == '/') {

                String digitos[] = txt.split("[/]");
                numero1 = Integer.parseInt(digitos[0]);
                numero2 = Integer.parseInt(digitos[1]);
                resultado = numero1 / numero2;

            }

        }

        System.out.println("Resultado: " + resultado);

    }

}
