import java.time.LocalDate;
import java.util.Date;

public class Professor extends Usuario {
	private LocalDate data_contratacao;

	public Professor(LocalDate data_contratacao) {
		super();
		this.data_contratacao = data_contratacao;
	}
}
