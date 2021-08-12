import java.util.*;

public class stringstk{
    public static void main(String[]args){
        
        String example = "Samuel 1999 200 true";

        StringTokenizer stk = new StringTokenizer(example);

        String string1 = stk.nextToken();
        int zipcode = Integer.parseInt(stk.nextToken());
        int zipcod = Integer.parseInt(stk.nextToken());

        boolean validity = Boolean.parseBoolean(stk.nextToken());

        int valor [] = {zipcod};

        if(validity){

            for(int i = 0; i < valor.length; i++){
                System.out.println(valor[i]);
            }
        }else{
            System.out.println("Invalid string");
        }

    }
}