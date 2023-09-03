package br.com.fiap.models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private String nome;
	
	List<Livro> livros = new ArrayList<Livro>();
	
	
	public void registro(Livro livro) {
		livros.add(livro);
	}
	
	public void emprestimo(Livro livro) {
		
	}
	
	
	public void devolucao(Livro livro) {
		
		livros.add(livro);
		
		if (livro.getQtdeDisponivel() > 0 && livro.isStatus()) {
			// Envia notificacao 
			livro.notificarObservadores();
		}
	}
	
	
}
