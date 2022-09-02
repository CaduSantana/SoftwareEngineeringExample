import java.time.LocalDate;

public class Aluno extends Usuario {
	// LocalDate -> Data, sem horário e sem timezone
	// Apenas o necessário para representar uma data de nascimento
	private LocalDate data_nascimento;

	public Aluno() {
		// Construtor vazio, útil para testar métodos que utilizam uma instância de
		// Aluno
	}

	public Aluno(LocalDate data_nascimento) {
		super();
		this.data_nascimento = data_nascimento;
	}
}
