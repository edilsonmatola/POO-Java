
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

class teste{

    public static String autenticar(String username,int senha,String nome[]){
        
        for(int i=0;i<nome.length;i++){
            if(username.equals(nome[i])){
                return username;
            }else{
                return "erro";
            }
        }

        return "Error";
      
    }

    public static String [] banco(){

        String nome[] = {"Samuel","Sigia","Ends?"};
        return nome;
    }
}




public class funcao{

    public static void main(String[]args){
    Scanner entrada= new Scanner(System.in);
    

        teste f = new teste();
        System.out.print(f.autenticar("Samuel",333,f.banco()));

     

}
}
