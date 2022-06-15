package Array;

public class Vetor<T> {
	private T[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = (T[])new Object[capacidade];
		this.tamanho=0;
	}
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(tamanho < elementos.length) {
			this.elementos[tamanho]=elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adiciona(T elemento,int posicao) {
		this.aumentaCapacidade();
		if(!(posicao<=tamanho && posicao>0)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for(int i=tamanho-1;i>=posicao;i--) {
			this.elementos[i+1]=this.elementos[i];
		}
		elementos[posicao]=elemento;
		this.tamanho++;
		
		return true;
	}
	
	public boolean remove(int posicao) {
		for(int i=posicao;i<tamanho-1;i++) {
			elementos[i]=elementos[i+1];
		}
		elementos[tamanho-1]=null;
		this.tamanho--;
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho==this.elementos.length) {
			T[] elementosNovos = (T[])new Object[this.elementos.length*2];
			for(int i=0;i<this.elementos.length;i++) {
				elementosNovos[i]=this.elementos[i];
			}
			this.elementos= elementosNovos;
		}
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i=0;i<tamanho;i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		s.append("]");
		return s.toString();
	}
	
	public Object busca(int posicao) {
		if(posicao<=tamanho && posicao>0) {
			return elementos[posicao];
		}
		throw new IllegalArgumentException("Posição não existe");
		
	}
	
	public Boolean busca(T elemento) {
		for(int i=0;i<tamanho;i++) {
			if(elementos[i].equals(elemento)) {
				return true;
			}
			
		}
		return false;
	}
}
