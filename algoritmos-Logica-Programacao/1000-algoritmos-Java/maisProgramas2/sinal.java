
/*
programacao modular


Modularização em tecnologia da informação é um conceito onde o sistema ou software é dividido 
em partes distintas. Compõe o ferramental necessário para um programa mais legível com uma melhor 
manutenção e melhor desempenho por meio da programação estruturada. 

As vantagens do uso dos métodos são: 
mais respeito à vontade dos envolvidos, mais controle sobre o procedimento
 (que pode ser suspenso e retomado), privacidade, cumprimento espontâneo das 
 4combinações ajustadas, mais satisfação e, por consequência, rapidez e economia. 
 Até mesmo quando não é celebrado um acordo imediatamente, o uso do meio consensual
  propicia vantagens como a preservação da relação, a melhor compreensão da disputa e o
   estreitamento de pontos que depois poderão ser submetidos a uma decisão.
   
Global e local

Uma variável pode ser global ou local.
Quando uma variável é declarada como um atributo da classe, 
ela é global. Isso significa que ela pode ser usada em qualquer
 parte do código da classe, inclusive nos seus métodos:

Já uma variável local, é aquela que é declarada dentro de um método.
 Desta forma, só aquele método pode acessar e modificar o seu conteúdo:


*/

class  sinalentrada {
	public  String entrada(int f){
		if(f == 0){
			return "Igual a 0";
		}else{
		if (f>0) {
			return "positivo";
		}else{
			return "negativo";
		}

		}
	}
	
}

public class sinal{
	public static void main(String[]args){

		sinalentrada d = new sinalentrada();
		System.out.println(d.entrada(0));
	}
}