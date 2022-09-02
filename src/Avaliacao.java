
public class Avaliacao {
	private float notas[];
	private boolean estaConcretizado;

	public Avaliacao(float[] notas) {
		this.notas = notas;
		this.estaConcretizado = false;
		// Avaliação é inicialmente NÃO concretizada, para permitir que o
		// professor responsável corrija possíveis erros realizados na hora de inserir
		// os valores.
	}

	public void concretizar() {
		this.estaConcretizado = true;
	}
}
