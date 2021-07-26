import java.util.Scanner;
public class Metodos{
    
    public static void Menu(){
        System.out.println("===============Tech Genious *Software*============");
        System.out.println("MENU");
        System.out.println("_____________________________________");
        System.out.println("| 1-Soma  de 2 Numeros");
        System.out.println("| 2-Produto  de 2 Numeros");
        System.out.println("| 3-Raiz Quadrada de um Numero");
        System.out.println("| 4-Produto do n-esimo numero");
        System.out.println("| 5-Soma por Extenso");
        System.out.println("| 6-Sair");
        System.out.println("_____________________________________");
        System.out.println("Escolha uma opcao!");
    }
      public double Soma(double a, double b)
       { return a+b;}
       //metodo que retorna o produto
       public double Produto(double a, double b)
       { return a*b;}

       /////////////////Modificar o produto e colocar no header o nome dos membros e a turma.Criar metodo chamado MENU
       ///Criar metodo que se digita um+dois e diz =tres com resultados ate cinco(tudo por extenos) Todos metodos estaticos
       //metodo que retorna a raiz quadrada
       public double RaizQuadrada(double a)
       { return Math.sqrt(a);}
         //metodo que recebe valores por teclado e retorna o produto  
        public static double ProdutoNesimo(double a)
       {

          double produto=1;
           for(int i=1;i<=a;i++){
             produto=produto*i;
           }
           return produto;
       }
      public static void header(){
         System.out.println("___________Programadores____________");
         System.out.println(" |=> Zenildo Nhabomba I12");
         System.out.println(" |=> Nassir Betuel  I12");System.out.println(" ");
       }
       public static void footer(){
         System.out.println("___________Obrigado pela preferencia__________");
         System.out.println("**Presione 0 para Sair e 1 para Continuar!");
       }
       public static String CalculadoraExtenso(String expressao)
       {
           int sinal=0;String primeiro="",segundo="";
           for(int i=0;i<expressao.length();i++){
               if(expressao.charAt(i)=='+'){
                   sinal=i;
                   segundo=expressao.substring(i+1,expressao.length());
                   primeiro=expressao.substring(0,i);
               }
           }
           int num1=0;int num2=0;
           if(primeiro.equals("zero")){num1=0;}
           if(primeiro.equals("um")){num1=1;}
           if(primeiro.equals("dois")){num1=2;}
           if(primeiro.equals("tres")){num1=3;}
           if(primeiro.equals("quatro")){num1=4;}
           if(primeiro.equals("cinco")){num1=5;}
          

           if(segundo.equals("zero")){num2=0;}
           if(segundo.equals("um")){num2=1;}
           if(segundo.equals("dois")){num2=2;}
           if(segundo.equals("tres")){num2=3;}
           if(segundo.equals("quatro")){num2=4;}
           if(segundo.equals("cinco")){num2=5;}
           
           int resultado=num1+num2;
           if(resultado==0){return expressao+"=zero";}
           if(resultado==1){return expressao+"=um";}
           if(resultado==2){return expressao+"=dois";}
           if(resultado==3){return expressao+"=tres";}
           if(resultado==4){return expressao+"=quatro";}
           if(resultado==5){return expressao+"=cinco";}

           return "Invalida!";

           

         }


}