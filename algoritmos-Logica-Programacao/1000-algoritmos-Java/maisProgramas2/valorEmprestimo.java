import java.util.Scanner;
public class valorEmprestimo{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        /*fazer um programa em java que deve ler apartir do teclado o valor de emprestimo bancario em metical, 
        uma duracao em anos e uma taxa de juros anual(uma percetagem ou seja um valor entre 0 e 1) o aut put 
        deve mostrar o valor da mensalidade a pagar e o valor total a pagar usando as seguintes formulas*/

        System.out.println("Digite o valor do emprestimo");
        double valor_emprestimo = ler.nextDouble();

        System.out.println("Digite a duracao do Emprestimo");
        double duracao_mes = ler.nextDouble();

        System.out.println("Digite o valor do Juros");
        double taxa_juros = ler.nextDouble();

        double juros_mes = taxa_juros/12.0;

        double base_mes = (1.0 + juros_mes);

        double mensalidade = (juros_mes *base_mes * valor_emprestimo)/(base_mes - 1);

        double total_pagar = mensalidade * duracao_mes;



    }
}