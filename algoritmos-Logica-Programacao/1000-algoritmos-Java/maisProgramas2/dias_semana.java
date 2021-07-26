
class bd{
    public static void bdarray(String diasemana[]){
        
        for(int i=0;i<diasemana.length;i++){

            System.out.println(diasemana[i]);
        }   
    }

    public static void bdarrayMes(String diames[]){
        
        for(int i=0;i<diames.length;i++){

            System.out.println(diames[i]);
        }   
    }
}
public class dias_semana{
    public static void main(String[]args){

    String diasemana [] = {"Dom","Seg","Terca","Quarta","Quinta","Sexta","Sabado"};

    String diames [] = {"Janeiro","Fev","Marco","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

    int maix [][] = new int[3][4];

    bd f = new bd();

    f.bdarray(diasemana);
    System.out.println("__________________________________");
    f.bdarrayMes(diames);

    for(int i=1;i<=3;i++){
        for(int j=1;j<=4;j++){
            System.out.println(maix[i][j]);
        }
    }
    
    }
}