
import java.util.Scanner; // IMPORTANDO O SCANNER PARA ENTRADA DE DADOS
import javax.swing.*;
import java.io.*;



class class_hotel{

	public String login(String [] users, String nome){
    
    
	for(int p=0;p<users.length;p++){
			if(users[p].equals(nome)){

				menuCliente();
			}
		}
		return "not log";
    }
    
	public static void menuCliente(){
        int i,v,io;
        int nomeop ;
        String n,dataentrada,datasaida;
        int quartos[] = new int[20];
        String nome [] = new String [20];
        String data_entrada [] = new String[20];
        String data_saida [] = new String[20];
        String tipo_Apartamento []  = new String[20];

    	do{
            nomeop = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de Cliente\n\n"
            +"----------------------------------------------------------------\n\n"
            +"1- Registrar \n"
            +"2- Visualizar\n"
            +"3- Remover\n"
            +"4- Remover todos \n"
            +"5- Actualizar\n"
            +"6 - Sair \n"
            +"----------------------------------------------------------------\n\n"
            +"Escolha a Sua Opcao:","Menu de opcoes"));
            
            
            
            switch(nomeop)
            {
            case 1: // opcao de cadastro de usuario
                //i = Integer.parseInt((JOptionPane.showInputDialog(null,"ECOLAA"));
                i = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o quarto"));
                n = JOptionPane.showInputDialog(null,"Digite o nome do Clinte");
                Object[] tipos={"Quarto Duplo Standard","Quarto Twin Room","Quarto Suite ","Quarto Duplo","Quarto Queen Standard","Quarto Junior Suite", "Quarto Run of House", "Quarto Single Room", ""};
                String tipo=(String)JOptionPane.showInputDialog(null,"Escolha o Tipo","Apartamento",-1,null,tipos,"Padrao");
                dataentrada = JOptionPane.showInputDialog(null,"Digite a data de entrada");
                datasaida = JOptionPane.showInputDialog(null,"Digite a data saida");
                if (i <20){
                    if (quartos[i]== 0) // caso o quarto esteja desocupado ... 
                    {
                        JOptionPane.showMessageDialog(null, "O Sir"+n+" "+"registrado com sucesso no quarto %d\n"+" "+i);
                        quartos[i]= 1; // quarto esta agora ocupado
                        nome [i] = n;
                        tipo_Apartamento [i] = tipo;
                        data_entrada [i] = dataentrada;
                        data_saida [i] = datasaida;
                        try {
                            File ficheiro = new File("teste.txt");
                            FileWriter fw = new FileWriter(ficheiro,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                
                            // if file doesnt exists, then create it
                            if (!ficheiro.exists()) {
                                ficheiro.createNewFile();
                            }
                            bw.write(i);
                            bw.write(n);
                            bw.write(tipo);
                            bw.write(dataentrada);
                            bw.write(dataentrada);
                            bw.write( datasaida);
                            //bw.nextLine();
                            bw.close();
                            JOptionPane.showMessageDialog(null,"OBRIGADO");
                        } catch (Exception e) {
                            //TODO: handle exception
                            JOptionPane.showMessageDialog(null,"erro");
                        }
                        
                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Quarto Ocupado!");
                        System.out.println(""); // caso quarto ja esteja ocupado informe o usuario disso
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Quarto Inexistente");
                    //System.out.println("Quarto Inexistente");
                }
            break;
            case 2: // opcao de cadastro de usuario
           // System.out.println("Listagem de quartos!"); // exibindo uma lista de todos os quartos.. c
                for (i=0;i<quartos.length;i++)
                {
                    if (quartos[i]==0) // verifica se esta vazio(o quarto)
                    { 
                        JOptionPane.showMessageDialog(null,"Quarto:"+i+ " "+" : ----Livre\n");
                        //System.out.printf();// exibie quarto vazio 
                    }else
                    {
                        JOptionPane.showMessageDialog(null,"Quarto: %d: ----Ocupado\n"+i+nome[i]+" "+tipo_Apartamento[i]);
                        //System.out.printf(); // quarto ocupado 
                    }
                }
                
            break;
            case 3: // opcao de cadastro de usuario
                i = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o quarto"));
                if (quartos[i]== 0)// se o quarto estiver vazio
                {
                    JOptionPane.showMessageDialog(null,"Quarto: "+i+" "+"encontra-se vazio no momento!\n");
                    System.out.printf("", i); // informe que o quarto ja esta vazio e nao tem ninguem para ser removido
                }else // senao
                {
                    JOptionPane.showMessageDialog(null, "Hóspede removido do quarto com sucesso!"+i);// remova o hospedo do quarto
                    quartos[i]= 0; // quarto agora esta vazio
                }
                JOptionPane.showMessageDialog(null,nomeop+"b");
            break;
            case 4: // opcao remover todos cadsatros
                JOptionPane.showMessageDialog(null,nomeop+"Todos hóspedes removidos com sucesso"); // removendo toodos os hospedes de uma soh vez
                for(v=0;v<20;v++)
                {
                    quartos[v]= 0; // todos os quartos agora estao vazios
                }
                
            break;
            case 5: // opcao de cadastro de usuario
               JOptionPane.showMessageDialog(null,"Quarto %d encontra-se vazio no momento!\n");
            break;
            
            case 6: // opcao de cadastro de usuario
                JOptionPane.showMessageDialog(null,nomeop+"e");
            break;
                    
            default:
                System.out.println("Opcao invalida"); // tratando uma excessao 
            }
            
        }while(nomeop!=5);
        
    }
	


}
public class hotelp {

		public static void main(String args[]) 
		{
            class_hotel h= new class_hotel();

            String users [] = {"Salomao", "Reginaldo", "Elisio", "Sumbane","sam"};
            String nomeuser = JOptionPane.showInputDialog(null,"Digite o nome do utilizador");

			class_hotel hotel_class = new class_hotel();
			System.out.println(hotel_class.login(users, nomeuser));		
		}
}