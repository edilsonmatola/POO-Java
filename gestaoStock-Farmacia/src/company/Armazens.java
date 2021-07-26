package company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Armazens {

    static ArrayList<Armazem> armazens = new ArrayList<>();

    Date hoje = new Date();
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

    public Armazens(){
        armazens = new ArrayList<>();
    }

    public static ArrayList<Armazem> getArmazens() {
        return armazens;
    }

    public static boolean adicionarArmazem(int numero, StringBuffer nome){
        if (encontrarArmazem(nome) == null){
            armazens.add(new Armazem(numero, nome));
            return true;
        }
        return false;
    }


    public boolean actualizarArmazem(int numero, StringBuffer nomeNovo){
        Armazem armazemEncontrado = encontrarArmazem(numero);
        if (armazemEncontrado != null){
            armazemEncontrado.setNome(nomeNovo);
            return true;
        }
        return false;
    }


    //Remove
    public boolean removerArmazem(int numero){
        if (encontrarArmazem(numero) != null){
            Armazem armazemEncontrado = encontrarArmazem(numero);
            armazens.remove(armazemEncontrado);
            return true;
        }
        return false;
    }



    public static Armazem encontrarArmazem(int numero){
        Armazem armazemEncontrado;

        if (!armazens.isEmpty()){
            for (int i = 0; i< armazens.size(); i++){ ;
                armazemEncontrado = armazens.get(i);
                int idArmazemEncontrado = armazemEncontrado.getNumero();

                if (idArmazemEncontrado==numero){
                    return armazemEncontrado;
                }
            }
        }
        return null;
    }

    public static Armazem encontrarArmazem(StringBuffer nome){
        Armazem armazemEncontrado;

        if (!armazens.isEmpty()){
            for (int i = 0; i< armazens.size(); i++){ ;
                armazemEncontrado = armazens.get(i);

                String idArmazemEncontrado = armazemEncontrado.getNome().toString();
                String idProcurado = nome.toString();

                if (idArmazemEncontrado.equals(idProcurado)){
                    return armazemEncontrado;
                }
            }
        }
        return null;
    }

    public static void setArmazens(ArrayList<Armazem> armazens) {
        Armazens.armazens = armazens;
    }

    public Date getHoje() {
        return hoje;
    }

    public void setHoje(Date hoje) {
        this.hoje = hoje;
    }

    public SimpleDateFormat getFormatarData() {
        return formatarData;
    }

    public void setFormatarData(SimpleDateFormat formatarData) {
        this.formatarData = formatarData;
    }
}
