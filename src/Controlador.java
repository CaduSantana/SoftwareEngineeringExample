
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Controlador {
	private Aluno alunoAtual;
	private Usuario usuarioAtual;
//	private Aula aulaAtual;
	private Avaliacao avAtual;

	
	public Controlador() {
		this.setAlunoAtual(new Aluno());
		this.usuarioAtual = new Usuario();
//		this.aulaAtual = new Aula();
		this.avAtual = new Avaliacao();
	}
	
	public float estimarProgressao(ArrayList historico) {
		return 0;
	}

	public void mostrarAvaliacao(Avaliacao avaliacao) {

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

	public Avaliacao getAvAtual() {
		return avAtual;
	}

	public void setAvAtual(Avaliacao avAtual) {
		this.avAtual = avAtual;
	}
	
	public boolean agendarAula(LocalDate localDate, int minutosAula, Materia materia) {
		return materia.agendarAula(localDate, minutosAula);
		
	}

}
