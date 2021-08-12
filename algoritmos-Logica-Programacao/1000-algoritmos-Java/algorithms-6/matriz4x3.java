/*Alberto Matola I13
este programa faz uma matriz 4x3 e faz a soma de numeros positivos entre eles
e negativos entre eles*/
import java.util.*;
public class matriz4x3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double matriz[][]=new double[4][3];
        double somaPositivos=0;
        double somaNegativos=0;
        for (int a=0; a<4; a++){
            for (int b=0; b<3; b++){
                System.out.print("Insira o valor na "+(a+1)+" x "+(b+1));
                matriz[a][b]=scan.nextDouble();
                if (matriz[a][b]>0) {
                        somaPositivos=somaPositivos+matriz[a][b];
                }
                else {
                    somaNegativos=somaNegativos+matriz[a][b];
                }
            }
        }
        System.out.print("Somatorio dos numeros positivos: "+somaPositivos);
        System.out.print("Somatorio dos numeros negativos: "+somaNegativos);
    }
}

