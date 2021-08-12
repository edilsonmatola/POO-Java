import javax.swing.JOptionPane;
import java.util.*;
public class asa 
{
    public static void main(String[] args)
    {   
        Scanner d =new Scanner(System.in);

        String saidaindpar       = "Indices que possuem valores pares >> ";
        String saidaindimpar     = "Indices que possuem valores impares >> ";
        String saidavalindpar    = "Valores que estÃ£o em indices pares >> ";
        String saidavalindimpar  = "Valores que estÃ£o em indices ipares >>";
        String elementos         = "Valores fornecidos >> ";
        String saidafinal        = "";
        System.out.println("Digite um numero");
        int quantidade = d.nextInt();
        int array[] = new int[quantidade];
        
        for(int i = 0;i < quantidade;i ++)
        {

            System.out.println("Digite um o valor " + (i+1));
            array[i]  = d.nextInt();
            elementos = elementos + " - " + array[i]; 
        }
        for(int i = 0;i < array.length;i ++)
        {
            if(array[i] % 2 == 0)
            {
                saidaindpar = saidaindpar + " - " + i;
                saidavalindpar = saidavalindpar + " - " + array[i];
            }
            else
            {
                saidaindimpar = saidaindimpar + " - " + i;
                saidavalindimpar = saidavalindimpar + " - " + array[i];
            }
        }
        saidafinal = "Numero de elementos >> "     + quantidade + "\n";
        saidafinal = saidafinal + elementos        + "\n";
        saidafinal = saidafinal + saidaindpar      + "\n";
        saidafinal = saidafinal + saidaindimpar    + "\n";
        saidafinal = saidafinal + saidavalindpar   + "\n";
        saidafinal = saidafinal + saidavalindimpar + "\n";
            
        JOptionPane.showMessageDialog(null, saidafinal);        
    }

}