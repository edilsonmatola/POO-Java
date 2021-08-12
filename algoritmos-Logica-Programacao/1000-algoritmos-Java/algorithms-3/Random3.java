import java.util.Random;
 
public class Random3 {
 
    public static void main(String[] args) {
 
        //instância um objeto da classe Random especificando a semente
        Random gerador = new Random(19700621);
         
        //imprime sequência de 10 números inteiros aleatórios entre 0 e 25
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt(26));
         }
    }
}