//Chelsea Manjate I11
//Imprimi um array na ordem crescente

public class OrdenaArray{
       public static void main(String [] args){

	    int [] num = {40,10,50,30,5,8};
		int k;
		
		for(int i = 0 ; i<num.length ; i++){
		   for(int j = i+1; j<num.length;j++){
		    if(num[i]>num[j]){
			   k = num[j];
			   num [j]= num[i];
			   num[i]=k;
			}
		   }
		}
       	for(int l=0 ;l<num.length ; l++){
		  System.out.print(" "+num[l]);
	    }
	}
}