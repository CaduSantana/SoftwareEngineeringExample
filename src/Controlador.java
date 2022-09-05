
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Controlador {
	private Aluno alunoAtual;
	private Usuario usuarioAtual;
//	private Aula aulaAtual;
	private Avaliacao avAtual;

	
	public Controlador() {
		this.setAlunoAtual(new Aluno());
		this.usuarioAtual = new Usuario();
//		this.aulaAtual = new Aula();
//		this.avAtual = new Avaliacao();
	}
	
	public float estimarProgressao(ArrayList historico) {
		return 0;
	}


	public Aluno getAlunoAtual() {
		return alunoAtual;
	}

	public void setAlunoAtual(Aluno alunoAtual) {
		this.alunoAtual = alunoAtual;
	}

	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}

	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}

//	public Aula getAulaAtual() {
//		return aulaAtual;
//	}
//
//	public void setAulaAtual(Aula aulaAtual) {
//		this.aulaAtual = aulaAtual;
//	}

//	public Avaliacao getAvAtual() {
//		return avAtual;
//	}
//
//	public void setAvAtual(Avaliacao avAtual) {
//		this.avAtual = avAtual;
//	}
//	
	public boolean agendarAula(LocalDate localDate, int minutosAula, Materia materia) {
		return materia.agendarAula(localDate, minutosAula);
		
	}

	public boolean enviarMensagem(String titulo, String conteudo, Materia materia) {
		materia.enviarMensagem(titulo, conteudo);
		
		return true;
	}
	
	public boolean adicionarAvaliacao(Aula aula, Aluno aluno, float notas[]) {
		aula.criarAvaliacao(notas, aluno);
		 return true;
	}

	public ArrayList<Avaliacao> historicoAluno(Materia materia, Aluno aluno) {
		return materia.avaliacoesAluno(aluno);
	}
	
	public Map<Aluno, ArrayList<Avaliacao>> historicosAlunoMateria(Materia materia){
		Map<Aluno, ArrayList<Avaliacao>> historicos = new HashMap<Aluno, ArrayList<Avaliacao>>();
		for (Aluno aluno : materia.getAlunos()) {
			historicos.put(aluno, materia.avaliacoesAluno(aluno));
		}
		
		return historicos;
	}

	public String[] lerMensagem(Mensagem mensagem) {
		return new String[] {mensagem.getTitulo(), mensagem.getConteudo()};
		
	}

	public void concretizarAvaliacao(Avaliacao avaliacao) {
		avaliacao.concretizar();
		
	}

	public boolean corrigirAvaliacao(Aula aula, Aluno aluno, float[] notas) {
		return aula.corrigirAvaliacao(notas, aluno);
		
	}

}
