package br.com.fiap.models;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	
	private String titulo;
	private String autor;
	private long ISBN;
	private int qtdeDisponivel;
	private boolean status;
	private Aluno aluno;
	
	private List<ILivroObserver> observers = new ArrayList<ILivroObserver>();
	
	public Livro(String titulo, String autor, int qtdeDisponivel, boolean status) {
		setTitulo(titulo);
		setAutor(autor);
		setQtdeDisponivel(qtdeDisponivel);
		setStatus(status);
		
	}
	
	
	public void addObserver(ILivroObserver obs) {
		this.observers.add(obs);
	}
	
	
	public void removeObserver(ILivroObserver obs) {
		this.observers.remove(obs);
	}
	
	// Notificacao do livro disponivel
	public void notificarObservadores() {
		for (ILivroObserver lo : observers) {
			lo.update(getTitulo(), getAutor());
		}
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public long getISBN() {
		return ISBN;
	}


	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}


	public int getQtdeDisponivel() {
		return qtdeDisponivel;
	}


	public void setQtdeDisponivel(int qtdeDisponivel) {
		this.qtdeDisponivel = qtdeDisponivel;
	}


	public List<ILivroObserver> getObservers() {
		return observers;
	}


	public void setObservers(List<ILivroObserver> observers) {
		this.observers = observers;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	
	
}
