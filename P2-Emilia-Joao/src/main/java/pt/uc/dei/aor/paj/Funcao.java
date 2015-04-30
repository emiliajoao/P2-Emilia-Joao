package pt.uc.dei.aor.paj;


public class Funcao {
	private String operador;
	private String definicao;

	public Funcao(String operador, String definicao) {
		super();
		this.operador = operador;
		this.definicao = definicao;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public String getDefinicao() {
		return definicao;
	}

	public void setDefinicao(String definicao) {
		this.definicao = definicao;
	}

}
