import java.time.LocalDate;

public class Mensagem {
	private String titulo;
	private String conteudo;

	private LocalDate dataEnvio;

	public String getConteudo() {
		return conteudo;
	}

	public Mensagem(String titulo, String conteudo, LocalDate dataEnvio) {
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.dataEnvio = dataEnvio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(LocalDate dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
