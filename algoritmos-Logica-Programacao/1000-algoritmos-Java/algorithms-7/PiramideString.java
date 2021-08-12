//import java.util.*;
public class PiramideString{
	public static void main(String[]args){
		//Scanner in=new Scanner
		String nome="java";
		String temp="";
		for(int i=0;i<2;i++){
			if(i==0){
				for(int j=0;j<nome.length();j++) {
					if(j==0) {
						temp=nome.substring(0,j+1);
						System.out.println(temp);
					}else{
						temp=temp+nome.substring(j,j+1);
						System.out.println(temp);
					}
				}
			}else{
				for(int k=nome.length()-1;k>0;k--) {
					temp=nome.substring(0,k);
					System.out.println(temp);
				}
			}
		}
	}
}