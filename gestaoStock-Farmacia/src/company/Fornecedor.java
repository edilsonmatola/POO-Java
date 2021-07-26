package company;

public class Fornecedor {
    private StringBuffer codigo;
    private StringBuffer nome;
    private StringBuffer nuit;

    public Fornecedor(StringBuffer codigo, StringBuffer nome, StringBuffer nuit) {
        this.codigo = codigo;
        this.nome = nome;
        this.nuit = nuit;
    }

    public StringBuffer getCodigo() {
        return codigo;
    }

    public void setCodigo(StringBuffer codigo) {
        this.codigo = codigo;
    }

    public StringBuffer getNome() {
        return nome;
    }

    public void setNome(StringBuffer nome) {
        this.nome = nome;
    }

    public StringBuffer getNuit() {
        return nuit;
    }

    public void setNuit(StringBuffer nuit) {
        this.nuit = nuit;
    }
}
