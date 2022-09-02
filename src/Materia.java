
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Materia {

	private String nome;
	private List<Aula> aulas;

	public Materia(String nome) {
		super();
		this.nome = nome;
		this.aulas = new ArrayList<Aula>();
	}

	public void enviaMensagem(char conteudo) {

	}

	public ArrayList getAlunos() {
		return null;
	}

	public Materia getMensagem() {
		return null;
	}
	
	public boolean agendarAula(LocalDate localDate, int minutosAula) {
		// Este método futuramente terá um tratamento para verificar se a aula agendada é válida.
		aulas.add(new Aula(localDate, minutosAula));
		
		return true;
	}

}
