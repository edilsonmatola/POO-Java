//Zenildo Nhabomba
//Imprimi o cambio de um valor para dolares

import java.util.Scanner;
public class Cambio{
   public static void main(String [] args){

   	Scanner input= new Scanner(System.in);

   	System.out.println("Por favor insira o valor em Metical que pretende cambiar");
   	double mzn=input.nextDouble();

   	System.out.println("Insira a taxa cambial do Dolar neste periodo");
   	double taxaUsd=input.nextDouble();

   	double usd = mzn*taxaUsd;
	System.out.println("O seu cambio e: "+usd);
		
   }   
}