package br.com.sofftek.dominio;

public class Funcionario {
	
	//constante
	final private double MINIMO_SALARIO = 1_200.00;  
	
	static private int ultimoCodigo;
	
	// private so a classe funcionario tem acesso
	private int codigo;
	private String nome;
	private String cpf;
	private String setor;
	private double salario;
	
	/*
	 Regra de construtor
	 1- Toda classe Java precisa de um construtor
	 2 - Se nao for inserido manualmente nenhum construtor, o compilador Java fornece um
	 construtor em branco e sem argumentos:
	 
	 public Funcionario() { //construtor padrao(sem argumentos)
	 */

	
	public Funcionario(String nome, String cpf) { // metodo construtor
		this.codigo = ++ultimoCodigo; // pre incremento
		this.nome = nome;
		this.cpf = cpf;
		this.salario = MINIMO_SALARIO;
	}
	
	//sobrecargar de construtor (polimorfismo)
	public Funcionario(String nome, String cpf, double salario) {
		this.codigo = ++ultimoCodigo;
		this.nome = nome;
		this.cpf = cpf;
		if (salario < MINIMO_SALARIO) {
			this.salario = MINIMO_SALARIO;
		}
		else {
			this.salario = salario;
		}
	}

	// getters (permitem ler dados privados)
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getSetor() {
		return setor;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
