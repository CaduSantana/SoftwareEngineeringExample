import java.time.LocalDate;
import java.util.Date;

public class Mensagem {
	private String titulo;
	private String conteudo;

	private Date dataEnvio;

	public String getConteudo() {
		return conteudo;
	}

	public Mensagem(String titulo, String conteudo, Date dataEnvio) {
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

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	

}
