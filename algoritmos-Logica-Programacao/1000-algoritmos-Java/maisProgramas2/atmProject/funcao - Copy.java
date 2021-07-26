import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

class funcaofile{
    public static StringTokenizer stk;
    static File ficheiro = new File("contas.txt");

    public static void cadastrar(int conta,String nome,double valor,int senha){

		try {
            
            FileWriter fw = new FileWriter(ficheiro,true);
            BufferedWriter bw = new BufferedWriter(fw);

            // if file doesnt exists, then create it
            if (!ficheiro.exists()) {
                ficheiro.createNewFile();
            }
            bw.write(new Integer(conta).toString()+"\n");
            bw.write(nome+"\n");
            bw.write(new Double(valor).toString()+"\n");
            bw.write(new Integer(senha).toString()+"\n");
            bw.write(true+";");
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(null,"OBRIGADO");
        } catch (Exception e) {
            //TODO: handle exception
        }
		
    }
public static void imprimir(){
    
    try {
        
        FileReader fr= new FileReader(ficheiro);
		BufferedReader br = new BufferedReader(fr);
		
		String l = br.readLine();

        while (l!= null){
             stk = new StringTokenizer(l,";");
            
			while((stk.hasMoreTokens())){
                String a=stk.nextToken()+"";
                String b=stk.nextToken()+"";
                String c=stk.nextToken()+"";
                String d=stk.nextToken()+"";
                System.out.println(a+b+c+d);
                stk.nextToken();

                
            }                       
            l = br.readLine();
		}
  /*      int int1 = Integer.parseInt(stk.nextToken());
        String string1 = stk.nextToken();

        int int2 = Integer.parseInt(stk.nextToken());
        System.out.println(int2);
        int int3 = Integer.parseInt(stk.nextToken());
        System.out.println(int3);


        boolean validity = Boolean.parseBoolean(stk.nextToken());


        if(validity){
            System.out.println(int1);
        }else{
            System.out.println("Invalid string");
        }*/
       
		
        


    } catch (Exception e) {
        System.out.println(e);
        //TODO: handle exception
    }
}

}

public class funcao{
    public static void main(String[]args){
    Scanner entrada= new Scanner(System.in);

    funcaofile d = new funcaofile();
    //d.cadastrar(111000,"Samuel Maculuve",5000.0,10000);
    d.imprimir();

}
}