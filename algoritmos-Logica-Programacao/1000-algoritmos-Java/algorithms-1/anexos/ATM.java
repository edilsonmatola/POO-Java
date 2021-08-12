/*

class multiDimensional 
{ 
    public static void main(String args[]) 
    { 
        // declaring and initializing 2D array 
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
  
        // printing 2D array 
        for (int i=0; i< 3 ; i++) 
        { 
            for (int j=0; j < 3 ; j++) 
                System.out.print(arr[i][j] + " "); 
  
            System.out.println(); 
        } 
    } 
}


class Test 
{     
    public static void main(String args[])  
    { 
        int intArray[] = {1,2,3}; 
          
        int cloneArray[] = intArray.clone(); 
          
        // will print false as deep copy is created 
        // for one-dimensional array 
        System.out.println(intArray == cloneArray); 
          
        for (int i = 0; i < cloneArray.length; i++) { 
            System.out.print(cloneArray[i]+" "); 
        } 
    } 
}


class Test 
{     
    public static void main(String args[])  
    { 
        int intArray[][] = {{1,2,3},{4,5}}; 
          
        int cloneArray[][] = intArray.clone(); 
          
        // will print false 
        System.out.println(intArray == cloneArray); 
          
        // will print true as shallow copy is created 
        // i.e. sub-arrays are shared 
        System.out.println(intArray[0] == cloneArray[0]); 
        System.out.println(intArray[1] == cloneArray[1]); 
          
    } 
}*/

import java.util.StringTokenizer;
import java.util.Scanner;
public class ATM{


    ///Fazer menu jobar e transferencia de uma conta para a outra.  Ate quarta
    //Os atributos de vem estar todos nos dados do cliente.  

        public static String autenticarUtilizador(String credencial,String senha)
        {
            //receber true se existir o numero e false caso contrario
            boolean evalidaCredenciais=validarCredenciais(credencial,bancodedados);
            String testadados="";
	    	String numeroconta="";
	    	Scanner entrada=new Scanner(System.in);

            StringTokenizer token1=new StringTokenizer(bancodedados,",");
            

            if(evalidaCredenciais)
            {
            String x="";
		    StringTokenizer temp;
		    String contaactual="",valoractual="",nomeactual="",senhaactual="";

		    StringTokenizer st = new StringTokenizer (bancodedados,";");
		    boolean pode=false;
            while (st.hasMoreTokens()){
			x= st.nextToken();
			temp= new StringTokenizer(x,",");
			contaactual=temp.nextToken();
			nomeactual=temp.nextToken();
			valoractual=temp.nextToken();
            senhaactual=temp.nextToken();
           
           if(contaactual.equals(credencial)){
               if(senha.equals(senhaactual))
               {
           	    numeroContaClienteLogado=contaactual;
               return nomeactual;
               }else return "Erro";
               
			}

            }
                
            }

           return "Erro! Senha incorrecta";

          }
            private static boolean validarCredenciais(String credencial,String dados){

             if(dados.contains(credencial)){
                 return true;
             }
             return false;

            }
  
            
    public static void imprimir(String informacao){
        System.out.println(informacao);
    }
               public static void login()
            {
            	Scanner entrada=new Scanner(System.in);
                imprimir("Bem vindo ao Credit Bank Insira seu numero de Cartao");
                String numero=entrada.next();
                imprimir("Insira a sua senha");
                String senha=entrada.next();
                Metodos.imprimir("Bem vindo "+Metodos.autenticarUtilizador(numero,senha));
       
            } 
	public static String bancodedados= "1192,Helio Nhantumbo,200,1234;1122,Lidia Marcos,200,4321;1212,Zenildo Nhambomba,100,3215;";
    public static String numeroContaClienteLogado="";

        public static String transferenciaConta(String nome,String destinatario,double valortransferir){
		
	
		String dadosfinais="";
		String x="";
		StringTokenizer temp;
		String contaactual="",valoractual="",nomeactual="",senhaactual="";

		StringTokenizer st = new StringTokenizer (bancodedados,";");
		boolean pode=false;
        while (st.hasMoreTokens()){
			x= st.nextToken();//conta,nome,saldo,senha
			temp= new StringTokenizer(x,",");
			contaactual=temp.nextToken();
			nomeactual=temp.nextToken();
			valoractual=temp.nextToken();
            senhaactual=temp.nextToken();
           
           if(contaactual.equals(nome)){
               if(Double.parseDouble(valoractual)>valortransferir)
               {
				valoractual=((Double.parseDouble(valoractual)-valortransferir))+"";
                pode=true;
               }
			}
			if(contaactual.equals(destinatario)){
                if(pode==true)
                {
				valoractual=((Double.parseDouble(valoractual)+valortransferir))+"";
                pode=true;
                }

			}
            if(pode==false) return "A quantia que deseja enviar nao existe na sua conta"; 

			x= contaactual+","+nomeactual+","+valoractual;
			dadosfinais=(dadosfinais+x)+";";
		}
		bancodedados=dadosfinais;

		return bancodedados;
	}

            

        

// Criacao do Menu
    public static void menu(){
    	Scanner entrada=new Scanner(System.in);
        System.out.println("===========================Bem vindo ao Credit Bank===========================");
        System.out.println("  ");
        System.out.println("____________________________MENU_____________________________");
        System.out.println("|1-Consultar Saldo                         |2-Transferencia");
        System.out.println("|3-Consultar Movimento                     |4-Levantamento");
        System.out.println("|5-Deposito                                |6-Recarga");
        System.out.println("|7-Compra                                  |8-Servicos");
        System.out.println("|Escolha uma opcao ");
        int n=entrada.nextInt();
        switch (n)
        {
            case 1:
            break;
            case 2:
            System.out.println("Insira o numero de conta!");
            String numeroConta=entrada.next();
            System.out.println("Insira o valor a transferir");
            double valorTransferencia=entrada.nextDouble();
            String x="";
		    StringTokenizer temp;
		    String contaactual="",valoractual="",nomeactual="",senhaactual="";

		    StringTokenizer st = new StringTokenizer (bancodedados,";");
		    boolean pode=false;
            while (st.hasMoreTokens()){
			x= st.nextToken();
			temp= new StringTokenizer(x,",");
			contaactual=temp.nextToken();
			nomeactual=temp.nextToken();
			valoractual=temp.nextToken();
            senhaactual=temp.nextToken();
           
           if(contaactual.equals(numeroConta))
           {
               imprimir("Deseja realmente transferir "+valorTransferencia+ " Mt para "+nomeactual+"?");
               imprimir("1-Sim 2-Nao");
               int nn=entrada.nextInt();
               switch (nn){
               case 1:
               imprimir(numeroContaClienteLogado);
               imprimir(transferenciaConta(numeroContaClienteLogado,numeroConta,valorTransferencia));
               break;
               case 2:
               break;
               default:
               imprimir("Opcao invalida!");
               break;
              // default:
               //imprimir("A opcao e invalida!");
              // break;
        }

    }
   }
  }
 }
}





