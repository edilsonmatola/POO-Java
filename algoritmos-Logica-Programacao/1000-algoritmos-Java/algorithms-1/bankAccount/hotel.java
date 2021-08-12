import java.util.*;

class info{
    Scanner ler = new Scanner(System.in);
    // Iniciar(mostar o menu ate que o user queira sair)
    public void iniciar(){
        int opcao;

        do{
            mostarMenu();
            opcao = ler.nextInt();
            escolher_opcao(opcao);
        }while(opcao!=4);
    }
    /// funcao do menu
    public void mostarMenu(){

    	System.out.println("");
        System.out.println("\t Escolha a opcao que deseja realizar");
        System.out.println("1 - CadastrarString");
        System.out.println("2 - MostrarStrings fazios");
        System.out.println("3 - Ver todosStrings");
        System.out.println("5 - Apagar alguem doString");
        System.out.print("Coloque a Opcao: ");

    }
    /// funcao que coloc o menu a funcionar atraves do switch case
    public void escolher_opcao(int opcao){
        

        switch(opcao){
            case 1:    
            System.out.print("Por favor digite o valor a sacar: ");
            case 2: 
            System.out.print("Por favor digite o valor a sacar: ");
                    break;

            case 3:
            System.out.print("Por favor digite o valor a sacar: ");
                    break;

            case 4: 
            System.out.print("Por favor digite o valor a sacar: ");
                    break;


            default:
                    System.out.println("Opcaoo invalida, Por favor tente novamente");
        }
    }

   public static void ind(String[] meuhotel) {
        for (int x = 0; x < meuhotel.length; x++) {
            meuhotel[x] = "nobody";
        }
    }
   public void view(String [] meuhotel){

    for (int i=0;i<10 ;i++ ) {
        System.out.println(meuhotel[i]);
    }
   }

    public  void escolher_quarto(String []  meuhotel,String mun,String[] nome) {
        String roomName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter room number (1-10):");
        roomNum = input.nextInt() - 1;
        System.out.println("Enter name for room " + (roomNum + 1) + " :");
        roomName = input.next();
        myHotel[roomNum].setName(roomName);
    }

}

public class hotel{
    public static void main(String[]args){
        String[] meuhotel = new String[10];
        String[] nome = new String[10];
        info f = new info();
        
        int Num = 0;
        f.ind(meuhotel);
        f.view(meuhotel);

        Scanner ler = new Scanner(System.in);
        

        f.iniciar();
    }
}