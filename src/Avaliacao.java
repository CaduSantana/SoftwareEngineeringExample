
public class Avaliacao {
	private float notas[];
	private boolean estaConcretizado;

	public void concretizar() {
		this.estaConcretizado = true;
	}

	public void corrigir(int notas) {

	}

	public void criar(int notas, Aluno aluno) {

	}

	public Avaliacao(float[] notas) {
		this.notas = notas;
		this.estaConcretizado = false;
	}

	
	
}
