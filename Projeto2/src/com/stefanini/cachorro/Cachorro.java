package com.stefanini.cachorro;

public class Cachorro {
	private String nome;
	private Integer idade;
	
	public Cachorro () {
		super();
	}
	public Cachorro (String nome, Integer idade) {
		super();
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome () {
		return this.nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public Integer getIdade () {
		return this.idade;
	}
	public void setIdade (Integer idade) {
		this.idade = idade;
	}

}
