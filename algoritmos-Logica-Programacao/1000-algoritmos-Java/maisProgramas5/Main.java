    public class Main
    {
    public static void main(String []args)
        {
           String arr[]=new String [5];       
    	 	arr[0]="Eu jemisse"; 
           	arr[1]="estou a programar";
            arr[2]="para";
            arr[3]="ser um bom programador:";
			System.out.print("---------------------");
            arr[4]="Muito Obrigado";
            String str="";
            for(int i=0;i<arr.length;i++)
                str+=arr[i]+" ";
            System.out.println(str);   
    	 }
    }