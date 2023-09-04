package br.com.fiap.models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private String nome;
	
	// Registro dos emprestimos
	private List<Livro> cadastros = new ArrayList<Livro>();
	
	
	// Singleton
	private static Biblioteca bibUnica;
	
	List<Livro> livros = new ArrayList<Livro>();
	
	private Biblioteca(String nome) {
		setNome(nome);
	}
	
	// Garantia de uma unica biblioteca
	public static Biblioteca getInstance(String nome) {
		if (bibUnica == null) {
			bibUnica = new Biblioteca(nome);
		}
		return bibUnica;
	}
	
	
	public void registro(Livro livro) {
		livros.add(livro);
	}
	
	public void emprestimo(Livro livro, Aluno aluno) {
		
		livro.setAluno(aluno);
		cadastros.add(livro);
	}
	
	
	public void devolucao(Livro livro) {
		
		livro.setAluno(null);
		cadastros.remove(livro);
		
		livros.add(livro);
		
		// Notificacao do Observer
		if (livro.getQtdeDisponivel() > 0 && livro.isStatus()) {
			// Envia notificacao 
			livro.notificarObservadores();
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
