import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String endereco;

	public Usuario() {
		// Construtor vazio para facilitar o uso de métodos que precisam de uma
		// instância de Usuário
	}

	public Usuario(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public boolean login(String email, String senha) {
		return false;
		// A lógica de autenticação não é implementada por ora, sendo necessário
		// maior conhecimento na área de Segurança da Informação, criptografia
		// e um banco de dados para armazenar as informações de autenticação de cada
		// usuário que realize o cadastro no sistema.
	}
}
