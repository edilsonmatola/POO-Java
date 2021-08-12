/*1.CRIAR UM CLASSE COM NOME CONVERCAO COM OS SEGUINTES METODOS...
1.1. RECEBER UMA STRING(VALOR BINARIO) E RETORNAR UM N DECIMAL..
1.2. RECEBER UM INTEIRO COMVERTER PARA OCTAL...
1.3. RECERBER UM INTEIRO ||        ||    HEXADECIMAL..
1.4. RECEBER UM INTEIRO CONVERTER PARA BINARIO*/

class conv{

	public static String converteDecimalParaHexadecimal(int valor) {
           char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
           int resto = -1;
           StringBuilder sb = new StringBuilder();

           if (valor == 0) {
              return "0";
           }

           // enquanto o resultado da divisão por 16 for maior que 0 adiciona o resto ao início da String de retorno
           while (valor > 0) {
              resto = valor % 16;
              valor = valor / 16;
              sb.insert(0, hexa[resto]);
           }

           return sb.toString();
    }

    public static String converteDecimalParaOctal(int valor) {
           int resto = -1;
           StringBuilder sb = new StringBuilder();

           if (valor == 0) {
              return "0";
           }

           // enquanto o resultado da divisão por 8 for maior que 0 adiciona o resto ao início da String de retorno
           while (valor > 0) {
              resto = valor % 8;
              valor = valor / 8;
              sb.insert(0, resto);
           }

           return sb.toString();
    }

    public static int converteBinarioParaDecimal(String valorBinario) {

       int valor = 0;

       // soma ao valor final o dígito binário da posição * 2 elevado ao contador da posição (começa em 0)
       for (int i=valorBinario.length(); i>0; i--) {
          valor += Integer.parseInt(valorBinario.charAt(i-1)+"")*Math.pow(2, (valorBinario.length()-i));
       }

       return valor;
        }

        public static void testar(){

          conv dd = new conv();

//          System.out.println("converte Binario ParaDecimal"+converteBinarioParaDecimal(1000));
          System.out.println("converte Decimal ParaOctal"+" "+converteDecimalParaOctal(10));
          System.out.println("converte Decimal ParaHexadecimal"+" "+converteDecimalParaHexadecimal(100));
        }

    }


public class converter{
	public static void main(String[]args){
		conv d = new conv();

    d.testar();

		
		
	}
}