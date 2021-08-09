package numero7;


public class Jogador {

//	Atributos do jogador
	private  String nome;
	private int score;
	
	public Jogador(){}

	//	Gets and Sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + ", Score: " + getScore() + "\n";
	}
	
	
}
