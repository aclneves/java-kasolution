package br.com.softtek.dominio;

public abstract class Funcionario implements Pagavel { // so pode ser herdada, nunca instanciada(new)
	
	private String nome;
	private String sobrenome;
	private String cpf;
	
	// ctrl + espaço
	
	public Funcionario() {

	}

	public Funcionario(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	//ctrl + 3 + ggas

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// ctrl + 3 - overr
	
	@Override
	public String toString() {
		String info = "Nome: " + nome + "\n";
		info += "Sobrenome: " + sobrenome + "\n";
		info += "CPF: " + cpf + "\n";
		return info;
	}
	
	public abstract double calculaValorPagamento();  // todos vao implementar obrigatoriamente
													// so pode ser implementado em classe abastrata
	


}
