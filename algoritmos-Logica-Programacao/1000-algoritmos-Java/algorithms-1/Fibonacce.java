import java.util.Scanner;
public class Fibonacce {
    public static void main(String[] args){
        int num1 = 1, num2 = 0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira o numero limite para a serie");
        int numero=entrada.nextInt();
        System.out.println(num2);
        System.out.println(num1);
        
        for(int i = 0; i <=numero; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
    
}