import javax.swing.JOptionPane;
import java.util.*;
public class exercici1
{
    public static void main(String[] args)
    {   
        Scanner d =new Scanner(System.in);

        System.out.println("Digite a quantidade dos numeros.");
        int quantidade = d.nextInt();
        int arrayTeste[] = new int[quantidade];
        
        for(int i = 0;i < quantidade;i ++)
        {

            System.out.println("Digite um o valor " + (i+1));
            arrayTeste[i]  = d.nextInt(); 
        }
        for(int i = 0;i < arrayTeste.length;i ++)
        {
            if(arrayTeste[i] % 2 == 0)
            {
                int novovalor = arrayTeste[i];

                int somanovo  = novovalor*novovalor;

                arrayTeste [i] = somanovo;
            }
            else
            {
                System.out.println("Posicao implar");
            }
        }

        for(int j = 0;j < arrayTeste.length;j ++)
        {
            System.out.println(arrayTeste[j]);
        }
            
    }

}