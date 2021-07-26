package telasFarmacia;

import company.*;

import java.util.Date;

public class Correr {
    public static void main(String[] args) {
        //seed();
        //new Login();
        new Welcome();
        //new MenuPrincipal();
        //new RegistroCliente();
        //new RegistraFornecedor();
        //new RegistroProdutos();
        //new Login();
        //new RegistroArmazem();
        //new MenuPrincipal();
        //new VendaProdutos();
    }
    public static void seed(){
        Date hoje = new Date();

        //Cliente
        RegistroCliente.clientes.adicionarCliente(new StringBuffer("Delton"), 'M',new StringBuffer("1"));
        Clientes.adicionarCliente(new StringBuffer("Jonas"), 'M',new StringBuffer("2"));
        Clientes.adicionarCliente(new StringBuffer("Palma"), 'M',new StringBuffer("3"));
        //Fornecedor
        RegistraFornecedor.fornecedores.adicionarFornecedor(new StringBuffer("1"), new StringBuffer("Zema"), new StringBuffer("uit09876345"));
        Fornecedores.adicionarFornecedor(new StringBuffer("2"), new StringBuffer("Acores"), new StringBuffer("uit6572934"));
        Fornecedores.adicionarFornecedor(new StringBuffer("3"), new StringBuffer("Amil"), new StringBuffer("uit763684924"));
        //Armazem
        RegistroArmazem.armazens.adicionarArmazem(1, new StringBuffer("AZCosta"));
        Armazens.adicionarArmazem(2, new StringBuffer("AZEste"));
        Armazens.adicionarArmazem(3, new StringBuffer("AZOceania"));
        //Produtos
        Produtos.adicionarProduto(new StringBuffer("1"),new StringBuffer("Gotas de vista"),new StringBuffer("AZCosta"),
                1,true,3,new StringBuffer("Acores"), new StringBuffer("2"),
                890, hoje, new StringBuffer("Oftalmologia"));
        Produtos.adicionarProduto(new StringBuffer("2"),new StringBuffer("Creme de pele"),new StringBuffer("AZEste"),
                2,false,30,new StringBuffer("Zema"), new StringBuffer("2"),
                400, hoje, new StringBuffer("Dermatologia"));
        Produtos.adicionarProduto(new StringBuffer("3"),new StringBuffer("Relaxante de vista"),new StringBuffer("AZOceania"),
                3,false,25,new StringBuffer("Amil"), new StringBuffer("3"),
                300, hoje, new StringBuffer("Dermatologia"));
        Produtos.adicionarProduto(new StringBuffer("4"),new StringBuffer("Paracetamol"),new StringBuffer("AZOceania"),
                3,false,25,new StringBuffer("Amil"), new StringBuffer("3"),
                300, hoje, new StringBuffer("Todos"));
        Produtos.adicionarProduto(new StringBuffer("5"),new StringBuffer("Multi-vitamina"),new StringBuffer("AZOceania"),
                3,false,25,new StringBuffer("Amil"), new StringBuffer("3"),
                300, hoje, new StringBuffer("Todos"));
    Produtos.adicionarProduto(new StringBuffer("6"),new StringBuffer("Relaxante de timpanos"),new StringBuffer("AZOceania"),
                3,false,25,new StringBuffer("Amil"), new StringBuffer("3"),
                300, hoje, new StringBuffer("Otorrinolaringologista"));

    }
}
