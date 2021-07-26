//Zenildo Nhabomba  I12
//Imprimi uma progressao Geometrica de um intervalo de 0-7, calculando o quadrado de cada 'n', no caso, 'i'
public class ProgressaoGeometrica{
	public static void main(String[] args){
		double PG;
		//Intervalo de 1-7
		for(int i=0;i<=7;++i){
			PG=Math.pow(i,2);
	System.out.println("Numero:" + PG);
		}
	}
}