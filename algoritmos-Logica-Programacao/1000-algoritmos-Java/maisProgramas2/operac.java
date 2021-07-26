/*Criar uma classe calculadora onde a mesma tera 4 metodos +,-*,/
todos os metodos recebem 2 valores reias com  parametros e retornam o resultado da operacao

ex2:criar outra classe com o metodo main para testar a calculadora;
criar um objecto calculadora e realize a 4 operacoes

*/




public class operac{
	public static void main(String[]args){
	met f = new met();


	System.out.println("O valor da soma:->"+f.mais(3,5));
	System.out.println("O valor da multi:->"+f.mult(3,5));
	System.out.println("O valor da subtra:->"+f.sub(3,5));
	System.out.println("O valor da divi:->"+f.dividir(3,5));
}
}