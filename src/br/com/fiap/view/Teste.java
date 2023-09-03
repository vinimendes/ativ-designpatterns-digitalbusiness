package br.com.fiap.view;

import br.com.fiap.models.Aluno;
import br.com.fiap.models.Biblioteca;
import br.com.fiap.models.Livro;
import br.com.fiap.models.LivroAlerta;

public class Teste {
	
	public static void main(String[] args) {
		Biblioteca bibli = new Biblioteca();
		Aluno aluno1 = new Aluno(1, "Vinicius");
		Livro livr1 = new Livro("Livro A", "John", 2, true);
		livr1.addObserver(new LivroAlerta());
		
		bibli.registro(livr1);
		bibli.devolucao(livr1);
		
		System.out.println(aluno1.getNome());
		
	}
	
	
}
