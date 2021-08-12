
/*
Crie um Programa em java, que imprime a seguinte mensagem, 
o resultado de 5<10 e true. o resultado de 5<10 
e false e 20>10 true  e 20<10 false 
NB: Use o conceito de extruturas de seleccao Simples.
O programa deve imprimir a mensagem se e somente se a condicao for verdadeira.

Zenildo Nhabomba I12
*/
public class TestaIFSimples{

	public static void main(String[]args){

		int var1=5;
		int var2=15;
		int var3=10;
		boolean condicaoA=(var1<var2);
		boolean condicaoB=(var1>var2);
		boolean condicaoC=(var3<var2);
		boolean condicaoD=(var3>var2);
		String textoA=var1+"<"+var2;
		String textoB=var1+">"+var2;
		String textoC=var3+"<"+var2;
		String textoD=var3+"<"+var2;

		if(condicaoA==true){
			System.out.println("O resultado de "+textoA+" e "+condicaoA);
		}else{
			if(condicaoB==true){
				System.out.println("O resultado de "+textoB+" e "+condicaoB);
			}
		}
				if(condicaoC==true){
			System.out.println("O resultado de "+textoC+" e "+condicaoC);
		}else{
			if(condicaoD==true){
				System.out.println("O resultado de "+textoD+" e "+condicaoD);
			}
		}

	}
}