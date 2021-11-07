package jdbc;

public class Pessoa {
	
	private String nome;
	private int codigo;
	
	public Pessoa(int cod, String nome) {
		super();
		this.codigo = cod;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCod() {
		return codigo;
	}
	public void setCod(int cod) {
		this.codigo = cod;
	}
	
	

}
