import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Usuario {

	private String nome;
	private LocalDate data_nascimento;
	private String endereco;

	public boolean login(String email, String senha) {
		return false;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.data_nascimento = LocalDate.now();
	}

	
	
}
