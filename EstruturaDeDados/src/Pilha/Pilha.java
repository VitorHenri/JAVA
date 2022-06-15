package Pilha;

import estruturadedados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		this.aumentaCapacidade();
		super.adiciona(elemento);
	}
	
	public T topo() {
		if(!(this.estaVazia()))
			return this.elementos[this.tamanho-1];
		else
			return null;
	}
	
	public T desempilha() {
		if(!(this.estaVazia())) {
		T elemento = this.elementos[tamanho-1];
		tamanho--;
		return elemento;
		}
		else
			return null;
	}

}

