class teste {

    public String autenticar(String username, int senha, String nome[]) {

        for (String element : nome) {
            if (username.equals(element)) {
                return username;
            } else {
                return "erro";
            }
        }

        return "Error";

    }

    public String[] banco() {

        String nome[] = { "Samuel", "Sigia", "Ends?" };
        return nome;
    }
}

public class funcao {

    public static void main(String[] args) {
        teste f = new teste();
        System.out.print(f.autenticar("Samuel", 333, f.banco()));

    }
}
