package company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Fornecedores {

    static ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    Date hoje = new Date();
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

    public Fornecedores(){
        fornecedores = new ArrayList<>();
    }

    public static ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public static boolean adicionarFornecedor(StringBuffer codigo, StringBuffer nome, StringBuffer nuit){
        if (encontrarFornecedor(codigo) == null){
                fornecedores.add(new Fornecedor(codigo, nome, nuit));
                return true;
        }
        return false;
    }


    public boolean actualizarFornecedor(StringBuffer codigo, StringBuffer nomeNovo, StringBuffer nuitNovo){
        Fornecedor fornecedorEncontrado = encontrarFornecedor(codigo);
        if (fornecedorEncontrado != null){
            fornecedorEncontrado.setNome(nomeNovo);
            fornecedorEncontrado.setNuit(nuitNovo);
            return true;
        }
        return false;
    }


    //Remove
    public boolean removerFornecedor(StringBuffer codigo){
        if (encontrarFornecedor(codigo) != null){
            Fornecedor fornecedorEncontrado = encontrarFornecedor(codigo);
            fornecedores.remove(fornecedorEncontrado);
            return true;
        }
        return false;
    }



    public static Fornecedor encontrarFornecedor(StringBuffer codigo){
        Fornecedor fornecedorEncontrado;

        if (!fornecedores.isEmpty()){
            for (int i=0; i<fornecedores.size();i++){ ;
                fornecedorEncontrado = fornecedores.get(i);

                String idFornecedorEncontrado = fornecedorEncontrado.getCodigo().toString();
                String idProdutoProcurado = codigo.toString();

                if (idFornecedorEncontrado.equals(idProdutoProcurado)){
                    return fornecedorEncontrado;
                }
            }
        }
        return null;
    }
    public boolean encontrarFornecedor1(StringBuffer codigo){
        Fornecedor fornecedorEncontrado;

        if (!fornecedores.isEmpty()){
            for (int i=0; i<fornecedores.size();i++){ ;
                fornecedorEncontrado = fornecedores.get(i);

                String idFornecedorEncontrado = fornecedorEncontrado.getCodigo().toString();
                String idProdutoProcurado = codigo.toString();

                if (idFornecedorEncontrado.equals(idProdutoProcurado)){
                    return true;
                }
            }
        }
        return false;
    }

}
