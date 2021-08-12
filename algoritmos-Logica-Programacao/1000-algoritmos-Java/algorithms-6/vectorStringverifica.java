/*Alberto Matola I13
Este programa le 5 strings e as coloca em um vector e verfica
se uma determinada string existe em uma posicao ou nao.*/
import java.util.*;
public class vectorStringverifica {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String vector []= new String[5];
        for (int a=0; a<5;a++){
            System.out.print("Insira a cadeia de caracteres que deseja na "+(a+1)+"a posicao :");
            vector[a]=scan.nextLine();
        }
        System.out.print("Insira a string que deseja verificar a sua existencia: ");
        String verifica=scan.nextLine();
        int cont=0;
        for (int a= 0; a< 5; a++){
            if (vector[a].equals(verifica)){
                System.out.println("Existe na posicao: "+a);
            }
            else{
                cont++;
            }
        }
        if (cont==5){
            System.out.println("Nao existe.");
        }
    }
}