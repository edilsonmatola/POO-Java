
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

class teste{

    public static double autenticar(String username,int senha,String nome[][]){
        
        for(int i=0;i<nome.length;i++){
            for (int o=0;o<nome.length;o++ ) {
            	if(username.equals(nome[i][o])){
            		double senhaa = Double.parseDouble(nome[i][2]) -100 ;

                return senhaa;
            }else{
                return 1;
            }
            }
        }

        return 2;
      
    }

    public static String [][] banco(){

        String nome[][] = {{"Samuel","111","500"},{"Sigia","000","400"}};
        return nome;
    }


}




public class testea{

    public static void main(String[]args){
    Scanner entrada= new Scanner(System.in);
    

        teste f = new teste();
        System.out.print(f.autenticar("Samuel",333,f.banco()));

     

}
}
