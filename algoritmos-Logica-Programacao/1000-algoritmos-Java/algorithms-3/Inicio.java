import java.util.*;
public class Inicio{
	public static void main(String[]args){
	String l,d;
	String []j=new String [20];
	int []da=new int [20];
		Scanner lab=new Scanner(System.in);
		System.out.println("");
		//Colocar palavra pass!
		System.out.println("             Clique 1 para iniciar");
		int sa=lab.nextInt();
		if(sa==1){
		switch(sa){
			case 1:
		System.out.println("              Introduz o seu Nome");
		String n=lab.next();
		j[0]=n;
		System.out.println("           Introduz a sua Palavra Pass");
		int m=lab.nextInt();
		System.out.println(j[0]+"  Inicio com Sucesso");
		break;
		}
		}else{
		System.exit(0);	
		}
		//iniciando!
		System.out.println("");
		System.out.println("                 1-Registo de livros");
		System.out.println("                 2-Consultas livros disponiveis");
		System.out.println("                 3-Pesquizar por livro");
		System.out.println("                 4-Trocar liguagem Liguam");
		System.out.println("                        Por favor escolha a opcao!!!");
		int s=lab.nextInt();
		switch (s){
			//Registando!
			
			case 1:
	  		System.out.println("Deseja registar quantos Livros?");
		    int a=lab.nextInt();
		 	for(int b=1;b<=a;b++){
			
		    System.out.println("    Introduza o titulo do livro");
		    l=lab.next();
		    System.out.println("    Introduza o nome/s do autor/s");
		    d=lab.next();
		    j[1]=d;
		    System.out.println("    Introduza o codico");
		    int e=lab.nextInt();
		    da[1]=e;
		    System.out.println("    Introduza numero da pratileira");
		    int f=lab.nextInt();
		    da[2]=f;
		    System.out.println("O livro:"+l+"");
		    System.out.println("Autor :"+d);
		    System.out.println("Codico:"+e);
		    System.out.println("Registado na pratileira:"+f);
		    System.out.println("rejistado com sucesso");
			}
			
	        break;
	        case 2:
	        System.out.println("Historia de Mocabimque");
	        System.out.println("Vida e obra de Isac Newton");
	        System.out.println("Biologia 10");
	        System.out.println("Biologia 11");
	        System.out.println("Biologia 12");
	        System.out.println("Matematica 10");
	        System.out.println("Matematica 11");
	        System.out.println("Matematica 12");
	        System.out.println("Portugues 10 classe"); 
	        System.out.println("Portugues 11 classe");
	        System.out.println("Historia de Mocabimque Volume II");
	        System.out.println("Vida e obra de Isac Newton Pimeiora edicao");
	        System.out.println("Biologia 8 classe");
	        System.out.println("Biologia 9 classe");
	        System.out.println("Biologia Volume II");
	        System.out.println("Matematica 9 classe");
	        System.out.println("Matematica 8 classe");
	        System.out.println("Matematica Volume 	II");
	        System.out.println("Portugues vOLUME I");
	        System.out.println("Portugues Volume II");
	        System.out.println("Para mais Manuais Consulte o Nosso Endereco Digital em www.MacBibliotec.co.mz");
	        break;
	        case 3:
	        System.out.println("Introduz o nome do livro:");
	        String t=lab.next();
	        if(t=="case 2"){
	        System.out.println("Portugues Volume II");
	        }else{
	        	System.exit(0);
	        }
		}
		System.out.println("© COPYRIGHT 2016 - Samuelmac NETWORK LTDA, TODOS OS DIREITOS RESERVADOS.");
	}
}