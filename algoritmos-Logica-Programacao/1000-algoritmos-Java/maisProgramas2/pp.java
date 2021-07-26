import java.util.*;
public class pp{
public static void main(String[]args){
	System.out.println(".........Processado..........");
Scanner ent=new Scanner(System.in);
int a,x,y,s,p;
System.out.println("Introduza a Nota do Primeiro texte");
a=ent.nextInt();
System.out.println("Introduza a Nota do segundo texte");
	x=ent.nextInt();
	System.out.println("Introduza a Nota do terceiro texte");
	s=ent.nextInt();
	y=a+x+s;
	p=y/3;
	System.out.println("-----|----------|---------");
	System.out.println("-----|-------|--------------");
	System.out.println("------|------|------------");
	System.out.println("       Media="+p);
	System.out.println("------|------|---------------");
	System.out.println("-----|--------|-----------");
	System.out.println("----|----------|-------------");
	if(p<9){
		System.out.println("Reprovado");
	}
	else{
		System.out.println("Aprovado");
	}
	int d=5;
	System.out.println(x==5);
}
}