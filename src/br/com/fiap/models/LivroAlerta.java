package br.com.fiap.models;

public class LivroAlerta implements ILivroObserver{

	@Override
	public void update(String titulo, String autor) {
		System.out.println(
				"Noticia boa! O livro %s do autor %s estah disponivel"
				.formatted(titulo, autor));
		
	}
	
}
