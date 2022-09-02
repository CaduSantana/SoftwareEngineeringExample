import java.time.LocalDate;
import java.util.Date;

public class Aula {

	private LocalDate data_aula;

	private int duracao;

	public Aula(LocalDate localDate, int duracao) {
		this.data_aula = localDate;
		this.duracao = duracao;
	}

	public void concretizarAvaliacao(Aluno aluno) {

	}

	public void corrigirAvaliacao(int notas, Aluno aluno) {

	}

	public void criarAvaliacao(int notas, Aluno aluno) {

	}

}
