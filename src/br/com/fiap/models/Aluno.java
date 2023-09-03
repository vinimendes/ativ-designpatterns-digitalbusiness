package br.com.fiap.models;

import java.util.ArrayList;
import java.util.List;

public class Aluno{
	
	private int id;
	private String nome;
	
	List<Livro> livros = new ArrayList<Livro>();
	
	
	
	public Aluno(int id, String nome) {
		this.setId(id);
		this.setNome(nome);
		
	}
	
	
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public List<Livro> getLivros() {
		return livros;
	}



	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}






	
	
	
	
}
