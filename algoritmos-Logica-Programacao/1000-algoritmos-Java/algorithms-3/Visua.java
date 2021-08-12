public class Visua{
	public static void metodo1(){
		System.out.println("Chamada do primeiro metodo1");
	}
	public static void metodo2(){
		System.out.println("Chamada do segundo metodo2");
	}
	public static int metodo3(){
		int x=10;
		return x;
	}
	public static void main (String[]args){
		
		metodo3();
		metodo1();
		metodo2();
		metodo3();
	}
}

	