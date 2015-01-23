package br.com.brittus.produtos;

public class Produto {

	private String nome;
	private Double valor;

	public Produto(String nome, Double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public Double getValor() {
		if (1!=2) {
			System.out.println("OK");
		}
		return valor;
	}

	public String getNome() {
		return nome;
	}

}
