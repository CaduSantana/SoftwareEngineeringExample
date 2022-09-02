
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Materia {
	private String nome;
	// Matéria é responsável por armazenar competências e pesos, pois
	// a Fórmula de Avaliação é a mesma para qualquer aula dessa matéria.
	private String competencias[];
	private float pesos[];
	// Composição com Aula, Mensagem
	private List<Aula> aulas;
	private List<Mensagem> mensagens;

	public Materia(String nome) {
		super();
		this.nome = nome;
		this.aulas = new ArrayList<Aula>();
		this.mensagens = new ArrayList<Mensagem>();
	}

	public ArrayList<Aluno> getAlunos() {
		return null;
	}

	public Materia getMensagem() {
		return null;
	}

	public boolean agendarAula(LocalDate localDate, int minutosAula) {
		// TODO Este método futuramente terá um tratamento para verificar se a aula
		// agendada é válida.
		// O que será verificado: localDate é válido? minutosAula é um inteiro positivo?
		aulas.add(new Aula(localDate, minutosAula));
		return true;
	}

	public boolean enviarMensagem(String titulo, String conteudo) {
		// Este método futuramente terá um tratamento para verificar se a mensagem
		// enviada é válida.
		// O que será verificado: título e conteúdo possuem quantidade de caracteres
		// igual ou abaixo do limite?
		return mensagens.add(new Mensagem(titulo, conteudo, LocalDate.now()));
	}

	public ArrayList<Avaliacao> avaliacoesAluno(Aluno aluno) {
		// Retorna todas as avaliações de um determinado aluno inscrito nessa matéria
		// Classe Aula é responsável por retornar a avaliação do aluno naquela aula,
		// padrão especialista.
		// Caso o aluno não esteja inscrito em uma aula, deve ser pulado uma iteração no
		// loop abaixo.
		// Por ora, essa lógica não foi implementada: assume-se que cada aula possui
		// todos os alunos da matéria
		ArrayList<Avaliacao> avaliacoesComAluno = new ArrayList<Avaliacao>();
		for (Aula aula : aulas) {
			avaliacoesComAluno.add(aula.avaliacaoAluno(aluno));
		}
		return avaliacoesComAluno;
	}

}
