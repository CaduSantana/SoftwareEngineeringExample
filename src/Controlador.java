import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Controlador {
	public Controlador() {
		// Controlador é a classe responsável por realizar a comunicação
		// entre a lógica contida na camada Model e a camada View (interface).
		// Futuramente será melhor incrementada, apresentado informações da sessão
		// isto é, o usuário logado (Professor OU Aluno). Por ora isso não foi
		// implementado.
	}

	public float estimarProgressao(ArrayList<Avaliacao> historico) {
		// Função que utiliza de um algoritmo estatístico para realizar predição
		// de progressão do aluno, com base nas avaliações anteriores do mesmo.
		return 0;
	}

	public boolean agendarAula(LocalDate localDate, int minutosAula, Materia materia) {
		return materia.agendarAula(localDate, minutosAula);
	}

	public boolean enviarMensagem(String titulo, String conteudo, Materia materia) {
		materia.enviarMensagem(titulo, conteudo);
		return true;
		// Deve verificar se a mensagem foi enviada com sucesso, isto é, se o título e o
		// conteúdo
		// não ultrapassa o número de caracteres especificados e se a mensagem foi
		// enviada com sucesso.
		// Por enquanto, assume-se que a mensagem sempre será enviada com sucesso.
	}

	public boolean adicionarAvaliacao(Aula aula, Aluno aluno, float notas[]) {
		aula.criarAvaliacao(notas, aluno);
		return true;
		// Deve verificar se a avaliação inclusa é válida, isto é, estão entre 0 e 10 e
		// de acordo
		// com a fórmula de avaliação da Matéria em si. Por enquanto assume-se que
		// sempre será correta.
	}

	public ArrayList<Avaliacao> historicoAluno(Materia materia, Aluno aluno) {
		return materia.avaliacoesAluno(aluno);
		// Histórico retornado a partir da matéria em que o aluno está inscrito.
	}

	public Map<Aluno, ArrayList<Avaliacao>> historicosAlunoMateria(Materia materia) {
		Map<Aluno, ArrayList<Avaliacao>> historicos = new HashMap<Aluno, ArrayList<Avaliacao>>();
		for (Aluno aluno : materia.getAlunos()) {
			historicos.put(aluno, materia.avaliacoesAluno(aluno));
		}

		return historicos;
		// Um histórico para CADA aluno na matéria especificada, onde cada entrada é uma
		// lista de
		// avaliações, isto é, todas as avaliações de cada aluno para a matéria
		// especificada.
	}

	public String[] lerMensagem(Mensagem mensagem) {
		return new String[] { mensagem.getTitulo(), mensagem.getConteudo() };
		// "Desempacota" o objeto mensagem em Título e Conteúdo.
	}

	public void concretizarAvaliacao(Avaliacao avaliacao) {
		avaliacao.concretizar();
		// PADRÃO ESPECIALISTA: Avaliação é responsável pelo seu próprio estado de
		// concretização
	}

	public boolean corrigirAvaliacao(Aula aula, Aluno aluno, float[] notas) {
		return aula.corrigirAvaliacao(notas, aluno);
		// Aula é responsável por corrigir a avaliação a partir da criação de uma nova
		// instância
		// de Avaliação, ao invés de setar cada nota na instância já presente. Por isso
		// quem possui
		// esse método é Aula, e não Avaliacao.
	}
}
