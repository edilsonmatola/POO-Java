import java.util.*;
public class ss{
	public static void main(String[]args){
		double x,y,s;
		 Scanner calc=new Scanner(System.in);
		 
		 System.out.println("      1-Adicao");
		 System.out.println("      2-Subtracao");
		 System.out.println("      3-Divisao");
		 System.out.println("      4-Multiplicaco");
		 System.out.println("      5-Funcoes Extras");
		 System.out.println("Excolha a Opcao da Operacao de deseja Efectuar");
		 
	int a=calc.nextInt ();
		 
		 switch(a){
		 	
		 	case 1:
		 	    System.out.println("Quntos  Numeros deseja adicionar?");
		 	    double q=calc.nextDouble();
		 	    for(int t=0;t<=q;t++){
		 	    System.out.println("Introduza o Primeiro Numero");
		 		a=calc.nextInt();
		 	 	System.out.println("Introduza o Segundo Numero");
		 		double b=calc.nextDouble();
		 	 	double p=a+b;
		 	 	System.out.println(p);
		 	    }
		 	  	
		 	  break;
		 	  
		 	  case 2:
		 	   	System.out.println("Introduza o Primeiro Numero");
		 	   	double c=calc.nextDouble();
		 	    System.out.println("Introduza o Segundo Numero");
		 	    double f=calc.nextDouble();
		 	    double o=c-f;
		 	    System.out.println(c);
		 	  break;
		 	     
		 	     case 3:
		 	     
		 	     	System.out.println("introduz um numero");
		 	    	double  d=calc.nextDouble();
		 	       	System.out.println("introduza outro numero");
		 	       	double m=calc.nextDouble();
		 	       	double n=d/m;
		 	        System.out.println(n);
		 	       break;
		 	        
		 	        case 4:
		 	        System.out.println("1-dois numeros");
		 	     System.out.println("2-dois numeros");
		 	     System.out.println("3-tres numeros");
		 	        System.out.println("quntos numeros deseja multiplicar?");
		 	        int ar=calc.nextInt();
		 	        switch (ar){
		 	        	case 1:
		 	     System.out.println("introduza o primeiro");
		 	     int kj=calc.nextInt();
		 	     System.out.println("introduza o segundo");
		 	     int nm=calc.nextInt();
		 	     System.out.println("introduza o terceiro");
		 	     int cv=calc.nextInt();
		 	     int tr=kj*nm*cv;
		 	     System.out.println(tr);
		 	     break;
		 	      default:
		 	           System.out.println("Tente novamente");
		 	        }
		 	    		
		 	           default:
		 	           System.out.println("Tente novamente");
		 }
		 
	
	}
}