import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

class funcaofile{

    public static void cadastrar(int conta,String nome,double valor,int senha){

		try {
            File ficheiro = new File("contas.txt");
            FileWriter fw = new FileWriter(ficheiro,true);
            BufferedWriter bw = new BufferedWriter(fw);

            // if file doesnt exists, then create it
            if (!ficheiro.exists()) {
                ficheiro.createNewFile();
            }
            bw.write(new Integer(conta).toString());
            bw.write(nome);
            bw.write(new Double(valor).toString());
            bw.write(new Integer(senha).toString()+";");
           // bw.nextLine();
            bw.close();
            JOptionPane.showMessageDialog(null,"OBRIGADO");
        } catch (Exception e) {
            //TODO: handle exception
        }
		
    }
}

public class funcao{
    public static void main(String[]args){
    Scanner entrada= new Scanner(System.in);

    funcaofile d = new funcaofile();
    d.cadastrar(111000,"Samuel Maculuve",5000.0,10000);

}
}