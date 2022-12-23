class teste {

    public double autenticar(String username, int senha, String nome[][]) {

        for (int i = 0; i < nome.length; i++) {
            for (int o = 0; o < nome.length;) {
                if (username.equals(nome[i][o])) {
                    double senhaa = Double.parseDouble(nome[i][2]) - 100;

                    return senhaa;
                } else {
                    return 1;
                }
            }
        }

        return 2;

    }

    public String[][] banco() {

        String nome[][] = { { "Samuel", "111", "500" }, { "Sigia", "000", "400" } };
        return nome;
    }

}

public class testea {

    public static void main(String[] args) {
        teste f = new teste();
        System.out.print(f.autenticar("Samuel", 333, f.banco()));

    }
}
