
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Materia {

	private String nome;
	private String competencias[];
	private float pesos[];
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
		// TODO Este método futuramente terá um tratamento para verificar se a aula agendada é válida.
		aulas.add(new Aula(localDate, minutosAula));
		
		return true;
	}

	public void enviarMensagem(String string) {
		// TODO Auto-generated method stub
		mensagens.add(new Mensagem(string, LocalDate.now()));
		
	}
	
//	public ArrayList<Aula> aulasComAluno(Aluno aluno) {
//		ArrayList<Aula> aulasComAluno = new ArrayList<Aula>();
//		for (Aula aula : aulas) {
//			if (aula.alunosPresentes(aluno).contains(aluno)) {
//				aulasComAluno.add(aula);
//			}
//		}
//		
//		return aulasComAluno;
//	}

	public ArrayList<Avaliacao> avaliacoesAluno(Aluno aluno) {
		ArrayList<Avaliacao> avaliacoesComAluno = new ArrayList<Avaliacao>();
		for (Aula aula : aulas) {
			avaliacoesComAluno.add(aula.avaliacaoAluno(aluno));
			}
		return avaliacoesComAluno;
	}

}
