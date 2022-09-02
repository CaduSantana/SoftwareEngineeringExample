import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Aula {

	private LocalDate data_aula;
	private int duracao;
	private Map<Aluno, Avaliacao> avaliacoes;

	public Aula(LocalDate localDate, int duracao) {
		this.data_aula = localDate;
		this.duracao = duracao;
		this.avaliacoes = new LinkedHashMap<Aluno, Avaliacao>();
	}

	public void concretizarAvaliacao(Aluno aluno) {

	}

	public void corrigirAvaliacao(int notas, Aluno aluno) {

	}

	public void criarAvaliacao(float[] notas, Aluno aluno) {
		avaliacoes.put(aluno, new Avaliacao(notas));
	}
	
	public Avaliacao avaliacaoAluno(Aluno aluno){
		return this.avaliacoes.get(aluno); // TODO Haverá verificação para aluno não presente.
		
	}

}
