import java.util.*;
public class BetaVercao{
	public static void main(String[]args){
	int a,b,c,e,f,g,h,i,j,k,n,x,y,z,p,d;
		Scanner Jogo=new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		System.out.println("       Escalha as opcoes!!!");
		System.out.print("");
		System.out.print("");
		//Inicio do JOGO
		///Primeiro JOGADOR
		System.out.println("Primeiro Jogador");
		a=Jogo.nextInt();
		if(a==1){
		System.out.println("                                 |    |      "); 
		System.out.println("                               X | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.print("                                   |    |      ");
		}
		
	if(a==2){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | X  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
	}
if(a==3){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
if(a==4){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
if(a==5){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | X  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
if(a==6){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | X   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
	if(a==7){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
	if(a==8){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | X  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		;
}
		if(a==9){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
	//Segundo JOGADOR
System.out.println("Jogador B");
b=Jogo.nextInt();

		if(b==1){
			System.out.println("                             |    |      "); 
		System.out.println("                               O | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
		}
	if(b==2){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | O  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
	}
if(b==3){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
if(b==4){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
if(b==5){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | O  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
if(b==6){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | O  ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
	if(b==7){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
	if(b==8){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | O  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
		if(b==9){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
}
	//Primeiro
System.out.println("Primeiro Jogador");
c=Jogo.nextInt();
	if(c==1){
			System.out.println("                             |    |      "); 
		System.out.println("                               X | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	if(c==2){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | X  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
	}else{
		
	}
if(c==3){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | 2  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(c==4){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(c==5){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | X  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(c==6){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | X   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(c==7){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(c==8){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | X  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
		if(c==9){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	//Segundo Jogador
	System.out.println("Segundo Jogador");
	d=Jogo.nextInt();
			if(b==1){
			System.out.println("                             |    |      "); 
		System.out.println("                               O | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	if(d==2){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | O  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
	}
if(d==3){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(d==4){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(d==5){  
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | O  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}else{
}
if(d==6){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | O  ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(d==7){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(d==8){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | O  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
		if(d==9){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	//Primero Jogador
	System.out.println("Primeiro Jogador");
	e=Jogo.nextInt();
		if(e==1){
			System.out.println("                             |    |      "); 
		System.out.println("                               X | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		
	if(e==2){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | X  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
	}
if(e==3){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(e==4){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(e==5){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | X  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(e==6){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | X   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}else{
	}
	if(e==7){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(e==8){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | X  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
		if(e==9){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | X   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	//Segundo Jogador
System.out.println("Segundo Jogador");
f=Jogo.nextInt();

	if(f==1){
			System.out.println("                             |    |      "); 
		System.out.println("                              O  | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}else{
				
	}
	if(f==2){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | O  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
	}
if(f==3){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(f==4){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(f==5){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | O  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(f==6){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | O   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(f==7){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(f==8){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | O  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
		if(f==9){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	//Primeiro JOGADOR
	System.out.println("Primeiro Jogador");
	g=Jogo.nextInt();
		if(e==1){
			System.out.println("                             |    |      "); 
		System.out.println("                               X | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	if(g==2){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | X  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
	}
if(g==3){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | X   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(g==4){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(g==5){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | X  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(g==6){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | X   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(g==7){   
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(g==8){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | X  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
		if(g==9){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
		//Segundo Jogador
System.out.println("Segundo Jogador");
h=Jogo.nextInt();
	if(h==1){
			System.out.println("                             |    |      "); 
		System.out.println("                               O | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	if(h==2){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | O  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
	}
if(h==3){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(h==4){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(h==5){
System.out.println("                                         |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | O  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(h==6){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | O   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(h==7){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(h==8){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | O  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
		if(h==9){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	//Primeiro JOGADOR
	System.out.println("Primeiro Jogador");
	i=Jogo.nextInt();
		if(i==1){
			System.out.println("                             |    |      "); 
		System.out.println("                               X | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	if(i==2){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | X  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
	}
if(i==3){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(i==4){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(i==5){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | X  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
if(i==6){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | X   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(i==7){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(i==8){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | X  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
		if(i==9){
	System.out.println("                                     |    |      "); 
		System.out.println("                               1 | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
}
	if(a==b){
		if (b==c){
	    System.out.println("                                 |    |      "); 
		System.out.println("                               X |  X | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}else{
	    System.out.println("                                 |    |      "); 
		System.out.println("                               O | O  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	}
	if(a==e){
		if(e==i){
	    System.out.println("                                 |    |      "); 
		System.out.println("                               X | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | X  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}else{
		System.out.println("                                 |    |      "); 
		System.out.println("                               O | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | O  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	}
	if(c==f){
		if(f==i){
		System.out.println("                                 |    |      "); 
		System.out.println("                               1 | 2  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | X   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}else{
			System.out.println("                             |    |      "); 
		System.out.println("                               1 | 2  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | 5  | O   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               7 | 8  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	}
	if(a==d){
		if(d==g){
		System.out.println("                                 |    |      "); 
		System.out.println("                               X | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               x | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               x | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
		else{
			System.out.println("                             |    |      "); 
		System.out.println("                               O | 2  | 3    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 5  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	}
	if(c==e){
		if(e==g){
			System.out.println("                             |    |      "); 
		System.out.println("                               1 | 2  | X    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | X  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               X | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}else{
			System.out.println("                             |    |      "); 
		System.out.println("                               1 | 2  | O    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               4 | O  | 6   ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                               O | 8  | 9    ");
		System.out.println("                             ----|----|----  ");
		System.out.println("                                 |    |      ");
		}
	}
	
	}
	}
	}
		
		
			