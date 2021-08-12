//Zenildo Nhabomba I12
//Imprimi o resto de uma divisao entre dois valores

import java.util.Scanner;
public class Resto{
  public static void main(String [] args){

    Scanner input=new Scanner(System.in);

    System.out.println("Por favor insira os valores que pretende fazer a divisao");
    double a = input.nextDouble();
    double b = input.nextDouble();
         
    double resto= a%b;
    System.out.println("O resto e= " + resto);
       }

      
      

}
