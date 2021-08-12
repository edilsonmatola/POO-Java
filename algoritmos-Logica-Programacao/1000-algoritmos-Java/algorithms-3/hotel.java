import java.util.*;
public class hotel{
	public static void main(String[]args){
float salario=0;
	Scanner d=new Scanner(System.in);
    System.out.println(                "||          ||  ||----------||   -------------- |-------| ||  ");
    System.out.println(                "||          ||  ||----------||   -------------- | ------| ||      ");
    System.out.println(                "||----------||  ||          ||         ||       | |----|  ||      ");
    System.out.println(                "||----------||  ||----------||         ||       | |----|  ||------|     ");
    System.out.println(                "||          ||  ||----------||         ||       | ------| ||------|    ");
    System.out.println(                "                                                |-------|          ");                                                             
    System.out.println("                              SATARYMAC                                   ");
    System.out.println("");
	System.out.println("                    Introduza horas de trabalho diario");
	int horas=d.nextInt();
	if(horas<=5){
		System.out.println("  Atensao tempo de trabalho nao permitido, por favor dirija-se a direcao");
	}
	else{
		for(int a=1;a<=horas;a++){
		float extra=200;
		salario=salario+extra;
	}
	}
	System.out.println("                  O seu salario e de "+salario);
    System.out.println("               1-Deseja transferir para uma conta?");
    System.out.println("               2-Receber o dinheiro");
    System.out.println("           Escolha a opcao para receber o salario");
    int s=d.nextInt();
		switch (s){
    	case 1:
   System.out.println("                3-Conta bancaria");
   System.out.println("                4-M-Pesa ou M-Cash");
   System.out.println("          Deseja receber atraveis de?");
   int ta=d.nextInt();
    switch (ta){
    	case 3:
   System.out.println("          Digite o numero de conta");
   int es=d.nextInt();
   System.out.println("          A transferecia foi efectuada com sucesso");
    	break;
     case 4:
    System.out.println("        Digite o numero de celular");
    int nu=d.nextInt();
   System.out.println("         A transfericia foi efectuada com sucesso");
   break;
   default:
   System.out.println("Opcao errada por favor tente novamente");
    }
    case 2:
    System.out.println("Digite o nome");
    String nome=d.next();
   
    }	
	System.out.println("                  Obrigado por fazer parte do Hotel Mac");
	}
}