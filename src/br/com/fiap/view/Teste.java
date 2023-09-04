package br.com.fiap.view;

import br.com.fiap.models.Aluno;
import br.com.fiap.models.Biblioteca;
import br.com.fiap.models.Livro;
import br.com.fiap.models.LivroAlerta;

public class Teste {
	
	public static void main(String[] args) {
		
		Biblioteca bibli = Biblioteca.getInstance("FIAP Biblioteca");
		Aluno aluno1 = new Aluno(1, "Vinicius");
		Livro livr1 = new Livro("Poemas de Alvaro de Campos", "Fernando Pessoa", 2, true);
		livr1.addObserver(new LivroAlerta());
		
		bibli.registro(livr1);
		bibli.devolucao(livr1);
		
		
	}
	
}
