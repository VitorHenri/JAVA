package fila;

import estruturadedados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	
	public void enfileira(T elemento) {
		this.elementos[this.tamanho++] = elemento;
	}
	
	public T espiar() {
		return this.elementos[0];
	}
	
	public T desenfileira() {
		for(int i=0;i<tamanho;i++) {
			this.elementos[i] = this.elementos[i+1];
		
		}
		tamanho--;
		return this.elementos[0];
	}

}
